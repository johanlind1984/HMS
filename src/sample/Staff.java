package sample;

import java.util.ArrayList;

public class Staff {

    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Nurse> nurses = new ArrayList<Nurse>();

    public void addDoctor(Doctor doctor) {

        boolean doctorExist = false;

        for (Doctor tempDoctor: doctors) {
            if(tempDoctor.getFirstName().equals(doctor.getFirstName()) && tempDoctor.getLastName().equals(doctor.getLastName())) {
                doctorExist = true;
                break;
            }
        }

        if(!doctorExist) {
            doctors.add(doctor);
        } else {
            // doctor exists in list and does not need to be added once more.
        }

    }
}
