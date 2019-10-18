package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.util.List;

import javafx.scene.control.*;
import javafx.scene.text.Text;

import static javafx.collections.FXCollections.observableArrayList;

public class Controller {

    // ADD DOCTOR FXML //
    @FXML
    TextField txtDoctorFirstName = new TextField();
    @FXML
    TextField txtDoctorLastName = new TextField();
    @FXML
    TextField txtDoctorEmployeeNumber = new TextField();
    @FXML
    CheckBox boxMRIDoctor = new CheckBox();
    @FXML
    CheckBox boxRecoveryDoctor = new CheckBox();
    @FXML
    CheckBox boxSurgeryDoctor = new CheckBox();
    @FXML
    CheckBox boxMorgueDoctor = new CheckBox();
    @FXML
    Label labelDoctorSuccess = new Label();
    @FXML
    TextArea textAreaAddDoctor = new TextArea();

    // ADD NURSE FXML //
    @FXML
    TextField txtNurseFirstName = new TextField();
    @FXML
    TextField txtNurseLastName = new TextField();
    @FXML
    TextField txtNurseEmployeeNumber = new TextField();
    @FXML
    CheckBox boxMRINurse = new CheckBox();
    @FXML
    CheckBox boxRecoveryNurse = new CheckBox();
    @FXML
    CheckBox boxSurgeryNurse = new CheckBox();
    @FXML
    CheckBox boxMorgueNurse = new CheckBox();
    @FXML
    Label labelNurseSuccess = new Label();
    @FXML
    TextArea textAreaAddNurse = new TextArea();


    @FXML
    ListView<Employee> listviewEmployees = new ListView<>();
    @FXML
    TextField textRemoveEmployee = new TextField();
    @FXML
    Text removeemployeeSuccess = new Text();



    ObservableList<Employee> employees = observableArrayList();
    ObservableList<Patient> patients = observableArrayList();
    ObservableList<Drug> drugs = observableArrayList();
    ObservableList<Facility> facilities = observableArrayList();

    @FXML
    public void addDoctor(ActionEvent event){

        System.out.println("In Add Employee");
        Doctor tempDoc = new Doctor(txtDoctorFirstName.getText(), txtDoctorLastName.getText(), txtDoctorEmployeeNumber.getText());

        if(boxMRIDoctor.isSelected()) {
            tempDoc.addAuthority("MRI");
        }

        if(boxRecoveryDoctor.isSelected()) {
            tempDoc.addAuthority("Recovery");
        }

        if(boxSurgeryDoctor.isSelected()) {
            tempDoc.addAuthority("Surgery");
        }

        if(boxMorgueDoctor.isSelected()) {
            tempDoc.addAuthority("Morgue");
        }

        employees.add(tempDoc);
        labelDoctorSuccess.setText("Successfully added" + tempDoc.getFirstName() + " " + tempDoc.getLastName());

        txtDoctorFirstName.clear();
        txtDoctorLastName.clear();
        txtDoctorEmployeeNumber.clear();
        boxMRIDoctor.setSelected(false);
        boxRecoveryDoctor.setSelected(false);
        boxSurgeryDoctor.setSelected(false);
        boxMorgueDoctor.setSelected(false);

        String stringToTextField = "Fist Name: " + tempDoc.getFirstName() + "\n" + "Last Name: " + tempDoc.getLastName()
                + "\n" + "Employee Number: " + tempDoc.getEmployeNumber() + "\n" + "Authorities: ";

        for (String auth: tempDoc.getAuthority()) {
            stringToTextField += auth + ", ";
        }

        textAreaAddDoctor.setText(stringToTextField);

    }

    @FXML
    public void addNurse(ActionEvent event){

        System.out.println("In Add Employee");
        Nurse tempNurse = new Nurse(txtNurseFirstName.getText(), txtNurseLastName.getText(), txtNurseEmployeeNumber.getText());

        if(boxMRINurse.isSelected()) {
            tempNurse.addAuthority("MRI");
        }

        if(boxRecoveryNurse.isSelected()) {
            tempNurse.addAuthority("Recovery");
        }

        if(boxSurgeryNurse.isSelected()) {
            tempNurse.addAuthority("Surgery");
        }

        if(boxMorgueNurse.isSelected()) {
            tempNurse.addAuthority("Morgue");
        }

        employees.add(tempNurse);
        labelNurseSuccess.setText("Successfully added" + tempNurse.getFirstName() + " " + tempNurse.getLastName());

        txtNurseFirstName.clear();
        txtNurseLastName.clear();
        txtNurseEmployeeNumber.clear();
        boxMRINurse.setSelected(false);
        boxRecoveryNurse.setSelected(false);
        boxSurgeryNurse.setSelected(false);
        boxMorgueNurse.setSelected(false);

        String stringToTextField = "Fist Name: " + tempNurse.getFirstName() + "\n" + "Last Name: " + tempNurse.getLastName()
                + "\n" + "Employee Number: " + tempNurse.getEmployeNumber() + "\n" + "Authorities: ";

        for (String auth: tempNurse.getAuthority()) {
            stringToTextField += auth + ", ";
        }

        textAreaAddNurse.setText(stringToTextField);

    }

    @FXML
    public void addPatient(){
        String firstName;
        String lastName;
        String patientNumber;
        List<Drug> drugs;
        Doctor doctor;

    }

    @FXML
    public void addDrug(){

        String name;
        String manufacturer;
        int inStock;

    }

    @FXML
    public void addFacility(){

        String name;
        String type;
        String facilityNumber;
        String authorityRequired;

    }

    @FXML
    public void removeEmployee(ActionEvent event){

        String employeNumber = textRemoveEmployee.getText();
        boolean employeeRemoved = false;

        for (int i=0; i < employees.size();i++) {
            if(employees.get(i).getEmployeNumber().equals(employeNumber)) {
                employees.remove(i);
                employeeRemoved = true;
            }
        }

        if(employeeRemoved) {
            removeemployeeSuccess.setText("SUCCESS");
        } else
            removeemployeeSuccess.setText("FAILED");

    }

    @FXML
    public void deletePatient(){

        String patientNumber;

    }

    @FXML
    public void deleteFacility(){

        String facilityNumber;

    }

    @FXML
    public void updateEmployee(){
//        To be implemented

    }

    @FXML
    public void updatePatient(){
//        To be implemented

    }

    @FXML
    public void updateDrug(){
//        To be implemented

    }

    @FXML
    public void updateFacility(){
//        To be implemented

    }
    @FXML
    public void getEmployees() {
            listviewEmployees.setItems(employees);
    }

    @FXML
    public void getPatients() {
        for (Patient patient : patients) {
            System.out.println("Patient name: " + patient.getFirstName() + " " + patient.getLastName() +
                    "\n\t Patient Number: " + patient.getPatientNumber());
        }


    }
    @FXML
    public void getDrugs() {
        System.out.println("Working");

    }

    @FXML
    public void getFacilities() {
        System.out.println("Working");

    }
}
