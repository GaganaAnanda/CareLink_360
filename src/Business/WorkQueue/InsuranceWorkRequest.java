/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.CustomerInsurance.CustomerInsurance;

/**
 *
 * @author MALLESH
 */
public class InsuranceWorkRequest extends WorkRequest {

    private String policyNumber;
    private String patientSsn;
    private String policyName;
    private String insuranceProvider;
    private double claimAmount;
    private String insuranceAgent;
    private String claimApprover;
    private double treatmentBill;
    private CustomerInsurance insuredPatient;
    private String medicalCenter;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPatientSsn() {
        return patientSsn;
    }

    public void setPatientSsn(String patientSsn) {
        this.patientSsn = patientSsn;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    public void setInsuranceProvider(String insuranceProvider) {
        this.insuranceProvider = insuranceProvider;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    @Override
    public String toString() {
        return policyNumber;
    }

    public String getInsuranceAgent() {
        return insuranceAgent;
    }

    public void setInsuranceAgent(String insuranceAgent) {
        this.insuranceAgent = insuranceAgent;
    }

    public String getClaimApprover() {
        return claimApprover;
    }

    public void setClaimApprover(String claimApprover) {
        this.claimApprover = claimApprover;
    }

    public double getTreatmentBill() {
        return treatmentBill;
    }

    public void setTreatmentBill(double treatmentBill) {
        this.treatmentBill = treatmentBill;
    }

    public CustomerInsurance getInsuredPatient() {
        return insuredPatient;
    }

    public void setInsuredPatient(CustomerInsurance insuredPatient) {
        this.insuredPatient = insuredPatient;
    }

    public String getMedicalCenter() {
        return medicalCenter;
    }

    public void setMedicalCenter(String medicalCenter) {
        this.medicalCenter = medicalCenter;
    }
}
