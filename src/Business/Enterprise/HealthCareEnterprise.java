/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;
import Business.Organization.Organization;
import Business.Patient.PatientDirectory;
import Business.Role.Roles;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author talha
 */
public class HealthCareEnterprise extends Enterprise {

    private PatientDirectory patientDir;

    public HealthCareEnterprise(String name) {
        super(name, EnterpriseType.HealthCare);
        patientDir = new PatientDirectory();
    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
        return null;
    }

    public List<Organization.Type> getAllOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.Doctor);
        orgTypes.add(Organization.Type.Lab);
        orgTypes.add(Organization.Type.Accountant);
        orgTypes.add(Organization.Type.BloodBank);
        return orgTypes;

    }

    @Override
    public String toString() {
        return this.getName();
    }

    public PatientDirectory getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(PatientDirectory patientDir) {
        this.patientDir = patientDir;
    }
    
}
