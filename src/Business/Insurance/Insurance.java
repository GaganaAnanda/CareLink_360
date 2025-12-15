/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Insurance;

/**
 *
 * @author talha
 */

public class Insurance {

    private String policyName;
    private String insuranceCompany;
    private double coverage;
    private String policyTermsAndConditions;
    private double monthlyPremium;

    // ✅ Final Correct Constructor
    public Insurance(String policyName, String insuranceCompany, double coverage) {
        this.policyName = policyName;
        this.insuranceCompany = insuranceCompany;  // ✔ CORRECT
        this.coverage = coverage;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    public String getPolicyTermsAndConditions() {
        return policyTermsAndConditions;
    }

    public void setPolicyTermsAndConditions(String policyTermsAndConditions) {
        this.policyTermsAndConditions = policyTermsAndConditions;
    }

    public double getMonthlyPremium() {
        return monthlyPremium;
    }

    public void setMonthlyPremium(double monthlyPremium) {
        this.monthlyPremium = monthlyPremium;
    }

    @Override
    public String toString() {
        return policyName;
    }
}
