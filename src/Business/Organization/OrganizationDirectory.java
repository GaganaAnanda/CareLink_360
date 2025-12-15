/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Organization.Organization.Type;
import static Business.Organization.Organization.Type.InsuranceFinanceOrganization;
import java.util.ArrayList;
/**
 *
 * @author talha
 */
public class OrganizationDirectory {
    private ArrayList<Organization> orgList;

    public OrganizationDirectory() {
        orgList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizations() {
        return orgList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;

        // Adding HealthCenter Organizations
        if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrg();
            orgList.add(organization);
        } else if (type.getValue().equals(Type.Lab.getValue())) {
            organization = new LabOrg();
            orgList.add(organization);
        }

        else if (type.getValue().equals(Type.Patient.getValue())) {
            organization = new PatientOrg();
            orgList.add(organization);

        }

        else if (type.getValue().equals(Type.Accountant.getValue())) {
            organization = new AccountantOrg();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.BloodBank.getValue())) {
            organization = new BloodBankManagerOrg();
            orgList.add(organization);

        }

        // Adding Government Organizations

        else if (type.getValue().equals(Type.HealthcareOfficer.getValue())) {
            organization = new HealthCareOfficerOrg();
            orgList.add(organization);

        }

        else if (type.getValue().equals(Type.Secretary.getValue())) {
            organization = new SecretaryOrg();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.Treasurer.getValue())) {
            organization = new TreasurerOrg();
            orgList.add(organization);

        }
        // Adding Insurance Organizations

        else if (type.getValue().equals(Type.InsuranceAgent.getValue())) {
            organization = new InsuranceAgentOrg();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.InsuranceFinanceOrganization.getValue())) {
            organization = new InsuranceFinanceOrg();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.InsurancePolicyPlanner.getValue())) {
            organization = new InsurancePolicyPlannerOrg();
            orgList.add(organization);

        }
        // Adding NGO Organizations

        else if (type.getValue().equals(Type.NGOAdministrator.getValue())) {
            organization = new AdminOrgNGO();
            orgList.add(organization);

        }

        else if (type.getValue().equals(Type.Director.getValue())) {
            organization = new DirectorOrgNGO();
            orgList.add(organization);

        }
        return organization;
    }
}
