package UTP3.zad4;

class Author implements Runnable {
    private final String[] messages;

    public Author(String[] messages) {
        this.messages = messages;
    }

    public String[] getMessages() {
        return messages;
    }

    @Override
    public void run() {
        try {
            for (String message : messages) {
                Thread.sleep(1000); // Oczekiwanie 1 sekundy przed kolejnym dodaniem wiadomości
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Writer implements Runnable {
    private final Author author;

    public Writer(Author author) {
        this.author = author;
    }

    @Override
    public void run() {
        String[] messages = author.getMessages();
        for (String message : messages) {
            System.out.println("Writer received: " + message);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Author author = new Author(args);
        new Thread(author).start();
        new Thread(new Writer(author)).start();
    }
}