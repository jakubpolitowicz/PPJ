package UTP3.zad3;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SwingTaskManager extends JFrame {

    private final JList<Task> taskList;
    private final DefaultListModel<Task> listModel;
    private final ExecutorService executorService;

    public SwingTaskManager() {
        setTitle("Swing Task Manager");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);

        JPanel buttonPanel = getButtonPanel();

        add(new JScrollPane(taskList), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        executorService = Executors.newFixedThreadPool(5);

        setVisible(true);
    }

    private JPanel getButtonPanel() {
        JButton addButton = new JButton("Add Task");
        addButton.addActionListener(e -> addTask());

        JButton cancelSelectedButton = new JButton("Cancel Selected Task");
        cancelSelectedButton.addActionListener(e -> cancelSelectedTask());

        JButton showResultButton = new JButton("Show Result");
        showResultButton.addActionListener(e -> showResult());

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(cancelSelectedButton);
        buttonPanel.add(showResultButton);
        return buttonPanel;
    }

    private void addTask() {
        String input = JOptionPane.showInputDialog("Enter task input:");
        int repetitions = Integer.parseInt(JOptionPane.showInputDialog("Enter number of repetitions:"));

        Task task = new Task(input, repetitions);
        listModel.addElement(task);

        Future<?> future = executorService.submit(task);
        task.setFuture(future);
    }

    private void cancelSelectedTask() {
        Task selectedTask = taskList.getSelectedValue();
        if (selectedTask != null) {
            selectedTask.cancel();
        }
    }

    private void showResult() {
        Task selectedTask = taskList.getSelectedValue();
        if (selectedTask != null) {
            String result = selectedTask.getResult();
            JOptionPane.showMessageDialog(this, "Task result: " + result);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingTaskManager::new);
    }
}

class Task implements Callable<String> {

    private final String input;
    private final int repetitions;
    private volatile Future<?> future;
    private volatile String result;

    public Task(String input, int repetitions) {
        this.input = input;
        this.repetitions = repetitions;
    }

    public void setFuture(Future<?> future) {
        this.future = future;
    }

    public void cancel() {
        if (future != null) {
            future.cancel(true);
        }
    }

    public String getResult() {
        return result;
    }

    @Override
    public String call() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < repetitions; i++) {
            if (Thread.currentThread().isInterrupted()) {
                result = "Task was cancelled";
                return result;
            }
            builder.append(input);
        }
        result = builder.toString();
        return result;
    }

    @Override
    public String toString() {
        return "Task: " + input + ", Repetitions: " + repetitions;
    }
}

