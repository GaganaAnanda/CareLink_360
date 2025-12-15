/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.Doctor;
import Business.Role.Roles;
import java.util.ArrayList;
/**
 *
 * @author talha
 */
public class DoctorOrg extends Organization{

    public DoctorOrg() {
        super(Organization.Type.Doctor.getValue());
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new Doctor());
        return roles;
    }

}
