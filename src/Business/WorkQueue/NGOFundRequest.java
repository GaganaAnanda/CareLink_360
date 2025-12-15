/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author MALLESH
 */
public class NGOFundRequest extends WorkRequest{
    
    private String hospitalName;
    private String hospitalLocation;
    private int requestedFundAmount;

    public NGOFundRequest(String hospitalName, String hospitalLocation, int requestedFundAmount) {
        this.hospitalName = hospitalName;
        this.hospitalLocation = hospitalLocation;
        this.requestedFundAmount = requestedFundAmount;
    }

    @Override
    public String toString() {
        return hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalLocation() {
        return hospitalLocation;
    }

    public void setHospitalLocation(String hospitalLocation) {
        this.hospitalLocation = hospitalLocation;
    }

    public int getRequestedFundAmount() {
        return requestedFundAmount;
    }

    public void setRequestedFundAmount(int requestedFundAmount) {
        this.requestedFundAmount = requestedFundAmount;
    }
}