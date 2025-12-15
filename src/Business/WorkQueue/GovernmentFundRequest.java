/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author MALLESH
 */
public class GovernmentFundRequest extends WorkRequest {

    private String regionName;     
    private int patientCount;       
    private double requiredFunding; 

    public GovernmentFundRequest(String regionName, int patientCount, double requiredFunding) {
        this.regionName = regionName;
        this.patientCount = patientCount;
        this.requiredFunding = requiredFunding;
    }

    @Override
    public String toString() {
        return regionName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public int getPatientCount() {
        return patientCount;
    }

    public void setPatientCount(int patientCount) {
        this.patientCount = patientCount;
    }

    public double getRequiredFunding() {
        return requiredFunding;
    }

    public void setRequiredFunding(double requiredFunding) {
        this.requiredFunding = requiredFunding;
    }
}
