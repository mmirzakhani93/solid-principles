package io.github.mmirzakhani93.solid.dependencyinversion;

public class EmailNotification implements Notification {

    @Override
    public void notify(String message) {
        System.out.println("sending email to " + message);
    }
}
