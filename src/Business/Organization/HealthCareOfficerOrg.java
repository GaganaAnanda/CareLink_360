/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.PublicHealthOfficer;
import Business.Role.LabAssistant;
import Business.Role.Roles;
import java.util.ArrayList;
/**
 *
 * @author talha
 */
public class HealthCareOfficerOrg extends Organization {

    public HealthCareOfficerOrg() {
        super(Organization.Type.HealthcareOfficer.getValue());
    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new PublicHealthOfficer());
        return roles;
    }

    
}
