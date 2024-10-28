package io.github.mmirzakhani93.solid.singleresponsibility.violated;

public class Employee {

    public String getDesignation(String employeeId) {

        return "getDesignation";
    }

    public void updateSalary(String employeeId, double salary) {

        // update salary for employee with employeeId
    }

    public void sendMail() {
        // send mail
    }
}
