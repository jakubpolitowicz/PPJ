package UTP3.zad1;
class Letters implements Runnable {
    private final String letters;
    private final Thread[] threads;

    public Letters(String letters) {
        this.letters = letters;
        this.threads = new Thread[letters.length()];
        initializeThreads();
    }

    private void initializeThreads() {
        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            threads[i] = new Thread(this, "Thread " + letter);
        }
    }

    public Thread[] getThreads() {
        return threads;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                letters.chars().forEach(ch -> System.out.print((char) ch));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Letters letters = new Letters("ABCD");
        for (Thread t : letters.getThreads()) System.out.println(t.getName());

        // Uruchomienie wszystkich wątków
        for (Thread t : letters.getThreads()) t.start();

        Thread.sleep(5000);

        // Zakończenie działania wszystkich wątków
        for (Thread t : letters.getThreads()) t.interrupt();

        // Oczekiwanie na zakończenie wszystkich wątków
        for (Thread t : letters.getThreads()) t.join();

        System.out.println("\nProgram skończył działanie");
    }
}
