/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author MALLESH
 */
public class NGODonorRequest extends WorkRequest{
    private String donorName;
    private String donorLocation;
    private int donationAmount;

    public NGODonorRequest(String donorName, String donorLocation, int donationAmount) {
        this.donorName = donorName;
        this.donorLocation = donorLocation;
        this.donationAmount = donationAmount;
    }

    @Override
    public String toString() {
        return donorName;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDonorLocation() {
        return donorLocation;
    }

    public void setDonorLocation(String donorLocation) {
        this.donorLocation = donorLocation;
    }

    public int getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(int donationAmount) {
        this.donationAmount = donationAmount;
    }
}