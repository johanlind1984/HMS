package sample;

import java.util.ArrayList;
import java.util.List;

public class Patient {

    private final String firstName;
    private final String lastName;
    private final String patientNumber;
    private List<Drug> drugs;
    private Doctor doctor;

    public Patient(String firstName, String lastName, String patientNumber, Doctor doctor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patientNumber = patientNumber;
        this.drugs = new ArrayList<>();
        this.doctor = doctor;
    }

    public void addDrug(Drug drug) {
        drugs.add(drug);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    @Override
    public String toString() {
        String patientCard = "Name: " + firstName + " " + lastName + "\n";
        patientCard += "Patient number: " + patientNumber + "\n";
        patientCard += "Doctor: " + doctor.getFirstName() + " " + doctor.getLastName() + "\n";
        patientCard += "Drugs: ";

        for (Drug drug: drugs) {
            patientCard += "\t" + drug.getName() + ", ";
        }

        return patientCard;
    }
}
