/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Patient;

import Business.CustomerInsurance.CustomerInsurance;

/**
 *
 * @author gaganaananda
 */
public class Patient {
    
    
    private String patientId;
    private String patientFirstName;
    private String patientLastName;
    private String patientAge;
    private String patientEmail;
    private String contactNo;
    private String address;
    private String gender;
    private String ssn;
    private boolean isTreatmentDone;
    private String dateOfAppoitment;
    private String typeOfDoctor;
    private CustomerInsurance customerInsurance;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public boolean isIsTreatmentDone() {
        return isTreatmentDone;
    }

    public void setIsTreatmentDone(boolean isTreatmentDone) {
        this.isTreatmentDone = isTreatmentDone;
    }

    public String getDateOfAppoitment() {
        return dateOfAppoitment;
    }

    public void setDateOfAppoitment(String dateOfAppoitment) {
        this.dateOfAppoitment = dateOfAppoitment;
    }

    public String getTypeOfDoctor() {
        return typeOfDoctor;
    }

    public void setTypeOfDoctor(String typeOfDoctor) {
        this.typeOfDoctor = typeOfDoctor;
    }

    public CustomerInsurance getCustomerInsurance() {
        return customerInsurance;
    }

    public void setCustomerInsurance(CustomerInsurance customerInsurance) {
        this.customerInsurance = customerInsurance;
    }

    @Override
    public String toString() {
        return patientId;
    }

    
    
    
    
}
