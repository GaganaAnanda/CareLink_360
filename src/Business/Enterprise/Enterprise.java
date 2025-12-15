/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.util.List;
/**
 *
 * @author talha
 */
public abstract class Enterprise extends Organization {
    private EnterpriseType enterpriseType;
    private OrganizationDirectory orgDir;

    public OrganizationDirectory getOrgDir() {
        return orgDir;
    }
    
        public OrganizationDirectory getOrganizationDirectory() {
        return orgDir;
    }

    public String getName() {
        return super.getOrganizationName();
    }

    public enum EnterpriseType {

        HealthCare("HealthCare"),
        InsuranceCompany("InsuranceCompany"),
        Government("Government"),
        NGO("NGO");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        orgDir = new OrganizationDirectory();
    }
    
    public abstract List<Organization.Type> getAllOrganizationTypes();
}
