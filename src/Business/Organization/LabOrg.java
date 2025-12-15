/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.LabAssistant;
import Business.Role.Roles;
import java.util.ArrayList;
/**
 *
 * @author talha
 */
public class LabOrg extends Organization{

    public LabOrg() {
        super(Organization.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new LabAssistant());
        return roles;
    }
    
}
