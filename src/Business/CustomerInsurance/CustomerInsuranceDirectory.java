/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CustomerInsurance;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author talha
 */
public class CustomerInsuranceDirectory {

    private List<CustomerInsurance> insuranceCustomers = new ArrayList<>();

    public List<CustomerInsurance> getInsuranceCustomers() {
        return insuranceCustomers;
    }

    public void setInsuranceCustomers(List<CustomerInsurance> insuranceCustomers) {
        this.insuranceCustomers = insuranceCustomers;
    }

    @Override
    public String toString() {
        return "InsuranceCustomerDirectory{" +
                "insuranceCustomers=" + insuranceCustomers +
                '}';
    }
}



