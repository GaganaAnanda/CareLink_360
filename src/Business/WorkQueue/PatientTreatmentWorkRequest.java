/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;
import Business.UserAccount.UserAccount;

/**
 *
 * @author MALLESH
 */
public class PatientTreatmentWorkRequest extends WorkRequest {

     private String registrationDate;
    private String visitReason;
    private Patient patientInfo;
    private String testType;
    private String testResult;
    private UserAccount labTechnician;
    private String labNotes;
    private String prescribedMedication;
    private double totalBill;
    private UserAccount assignedDoctor;
    private int requiredBloodUnits;
    private String bloodBankNotes;
    private UserAccount bloodBankOfficer;

    public PatientTreatmentWorkRequest(String registrationDate, String visitReason, Patient patientInfo) {
        this.registrationDate = registrationDate;
        this.visitReason = visitReason;
        this.patientInfo = patientInfo;
    }

    public UserAccount getBloodBankOfficer() {
        return bloodBankOfficer;
    }

    public void setBloodBankOfficer(UserAccount bloodBankOfficer) {
        this.bloodBankOfficer = bloodBankOfficer;
    }

    public int getRequiredBloodUnits() {
        return requiredBloodUnits;
    }

    public void setRequiredBloodUnits(int requiredBloodUnits) {
        this.requiredBloodUnits = requiredBloodUnits;
    }

    public String getBloodBankNotes() {
        return bloodBankNotes;
    }

    public void setBloodBankNotes(String bloodBankNotes) {
        this.bloodBankNotes = bloodBankNotes;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getVisitReason() {
        return visitReason;
    }

    public void setVisitReason(String visitReason) {
        this.visitReason = visitReason;
    }

    public Patient getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(Patient patientInfo) {
        this.patientInfo = patientInfo;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public UserAccount getLabTechnician() {
        return labTechnician;
    }

    public void setLabTechnician(UserAccount labTechnician) {
        this.labTechnician = labTechnician;
    }

    public String getLabNotes() {
        return labNotes;
    }

    public void setLabNotes(String labNotes) {
        this.labNotes = labNotes;
    }

    public String getPrescribedMedication() {
        return prescribedMedication;
    }

    public void setPrescribedMedication(String prescribedMedication) {
        this.prescribedMedication = prescribedMedication;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public UserAccount getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(UserAccount assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    @Override
    public String toString() {
        return visitReason;
    }
}