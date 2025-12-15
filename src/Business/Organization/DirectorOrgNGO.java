/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.NGODirector;
import Business.Role.Roles;
import java.util.ArrayList;
/**
 *
 * @author talha
 */
public class DirectorOrgNGO extends Organization{
    public DirectorOrgNGO() {
        super(Organization.Type.Director.getValue());
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new NGODirector());
        return roles;
    }
    
}
