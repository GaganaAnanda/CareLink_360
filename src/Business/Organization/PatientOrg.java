/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.PatientRole;
import Business.Role.Roles;
import java.util.ArrayList;
/**
 *
 * @author talha
 */
public class PatientOrg extends Organization {

   public PatientOrg() {
        super(Organization.Type.Patient.getValue());
    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new PatientRole());
        return roles;
    }
    
}
