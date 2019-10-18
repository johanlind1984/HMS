package sample;

import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Employee {

    private List<Patient> patients;

    public Doctor(String firstName, String lastName, String employeNumber) {
        super(firstName, lastName, employeNumber, "Doctor");
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void deletePatient(Patient patient) {
        patients.remove(patient);
    }

    public boolean patientExist(Patient patient) {
        if(patients.indexOf(patient) >= 0) {
            return true;
        }

        return false;
    }


}
