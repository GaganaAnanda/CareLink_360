/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;
import Business.Insurance.InsurancePolicyDirectory;
import Business.CustomerInsurance.CustomerInsuranceDirectory;
import Business.Organization.Organization;
import Business.Role.Roles;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author talha
 */
public class InsuranceEnterprise extends Enterprise {

    private CustomerInsuranceDirectory custInsDir;

    private InsurancePolicyDirectory insPlcyDir;

    public InsuranceEnterprise(String name) {
        super(name, EnterpriseType.InsuranceCompany);
        custInsDir = new CustomerInsuranceDirectory();
        insPlcyDir = new InsurancePolicyDirectory();

    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
        return null;
    }

    @Override
    public List<Organization.Type> getAllOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.InsuranceAgent);
        orgTypes.add(Organization.Type.InsurancePolicyPlanner);
        orgTypes.add(Organization.Type.InsuranceFinanceOrganization);

        return orgTypes;
    }

    public CustomerInsuranceDirectory getcustInsDir() {
        return custInsDir;
    }

    public void setcustInstDir(CustomerInsuranceDirectory custInsDir) {
        this.custInsDir = custInsDir;
    }

    public InsurancePolicyDirectory getInsPlcyDir() {
        return insPlcyDir;
    }

    public void setInsPlcyDir(InsurancePolicyDirectory insPlcyDir) {
        this.insPlcyDir = insPlcyDir;
    }
    
}
