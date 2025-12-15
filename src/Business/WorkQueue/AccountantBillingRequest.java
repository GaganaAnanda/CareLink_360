/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.Patient.Patient;


/**
 *
 * @author MALLESH
 */
public class AccountantBillingRequest extends WorkRequest {

    private double totalBillAmount;

    private boolean insuranceAvailable;
    private boolean insuranceClaimClosed;

    private Patient patientRecord;

    public double getTotalBillAmount() {
        return totalBillAmount;
    }

    public void setTotalBillAmount(double totalBillAmount) {
        this.totalBillAmount = totalBillAmount;
    }

    public Patient getPatientRecord() {
        return patientRecord;
    }

    public void setPatientRecord(Patient patientRecord) {
        this.patientRecord = patientRecord;
    }

    public boolean isInsuranceAvailable() {
        return insuranceAvailable;
    }

    public void setInsuranceAvailable(boolean insuranceAvailable) {
        this.insuranceAvailable = insuranceAvailable;
    }

    public boolean isInsuranceClaimClosed() {
        return insuranceClaimClosed;
    }

    public void setInsuranceClaimClosed(boolean insuranceClaimClosed) {
        this.insuranceClaimClosed = insuranceClaimClosed;
    }

    @Override
    public String toString() {
        return String.valueOf(totalBillAmount);
    }
}
