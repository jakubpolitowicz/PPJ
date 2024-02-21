package UTP3.zad2;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        StringTask task = new StringTask("A", 70000);
        System.out.println("Task " + task.getState());
        task.start();
        if (args.length > 0 && args[0].equals("abort")) {
            // <- tu zapisać kod przerywający działanie tasku po sekundzie
            // i uruchomić go w odrębnym wątku
            Thread abortThread = new Thread(() -> {
                try {
                    Thread.sleep(1000); // przerwanie po sekundzie
                    task.abort();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            abortThread.start();
        }
        while (!Thread.interrupted() && !task.isDone()) {
            Thread.sleep(500);
            switch (task.getState()) {
                case RUNNING:
                    System.out.print("R.");
                    break;
                case ABORTED:
                    System.out.println(" ... aborted.");
                    break;
                case READY:
                    System.out.println(" ... ready.");
                    break;
                default:
                    System.out.println("unknown state");
            }
        }
        System.out.println("Task " + task.getState());
        System.out.println(task.getResult().length());
    }
}

enum TaskState {
    CREATED,
    RUNNING,
    ABORTED,
    READY
}

class StringTask implements Runnable {
    private final String input;
    private final int repetitions;
    private volatile String result;
    private volatile TaskState state;

    public StringTask(String input, int repetitions) {
        this.input = input;
        this.repetitions = repetitions;
        this.state = TaskState.CREATED;
    }

    public String getResult() {
        return result;
    }

    public TaskState getState() {
        return state;
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }

    public boolean isDone() {
        return state == TaskState.READY || state == TaskState.ABORTED;
    }

    public void abort() {
        if (state == TaskState.RUNNING) {
            state = TaskState.ABORTED;
        }
    }

    @Override
    public void run() {
        state = TaskState.RUNNING;
        StringBuilder concatenated = new StringBuilder();
        try {
            for (int i = 0; i < repetitions; i++) {
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                }
                concatenated.append(input);
            }
            result = concatenated.toString();
            state = TaskState.READY;
        } catch (InterruptedException e) {
            state = TaskState.ABORTED;
        }
    }
}