package io.github.mmirzakhani93.solid.dependencyinversion.violates;

import io.github.mmirzakhani93.solid.dependencyinversion.EmailNotification;

public class Employee {

    private EmailNotification emailNotification;

    public Employee(EmailNotification emailNotification) {
        this.emailNotification = emailNotification;
    }

    public void notifyUser(String message) {
        emailNotification.notify(message);
    }
}
