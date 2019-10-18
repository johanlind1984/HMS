package sample;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String employeNumber;
    private List<String> authority;
    private String title;

    public Employee(String firstName, String lastName, String employeNumber, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = "0";
        this.employeNumber = employeNumber;
        this.authority = new ArrayList<>();
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmployeNumber() {
        return employeNumber;
    }

    public List<String> getAuthority() {
        return authority;
    }

    public boolean addAuthority(String auth) {
        // TESTED AND WORKING
        // This method checks if the authority already exists, if not the authority is added and returns true.
        // Returns false if authority already exists.

        if(!haveAuthority(auth)) {
            authority.add(auth);
            return true;
        }

        System.out.println("Authority already exists");
        return false;
    }

    public boolean haveAuthority(String auth) {
        // TESTED AND WORKING
        // RETURN TRUE IF EMPLOYEE HAS AUTHORITY
        for (int i= 0; i < authority.size(); i++) {
            if(auth.equals(authority.get(i))) {
                return true;
            }

        }
        return false;
    }

    @Override
    public String toString() {
        // Returns a contactCard as a string to be printed.
        String employeeCard = "Name: " + firstName + " " + lastName + "\n";
        employeeCard += "Title: " + title + "\n";
        employeeCard += "Employee number: " + employeNumber + "\n";
        employeeCard += "Phone number: " + phoneNumber + "\n";
        employeeCard += "Autority: ";

        for (int i=0; i < authority.size(); i++) {
            employeeCard += authority.get(i) + ", ";
        }

        return employeeCard;
    }
}
