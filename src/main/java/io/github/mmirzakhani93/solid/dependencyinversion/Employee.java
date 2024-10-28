package io.github.mmirzakhani93.solid.dependencyinversion;

public class Employee {

    private Notification notification;

    public Employee(Notification notification) {
        this.notification = notification;
    }

    public void notifyUser(String message) {
        notification.notify(message);
    }
}
