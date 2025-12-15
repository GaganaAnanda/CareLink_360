/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.Accountant;
import Business.Role.Roles;
import java.util.ArrayList;

/**
 *
 * @author talha
 */
public class AccountantOrg extends Organization {

    public AccountantOrg() {
        super(Organization.Type.Accountant.getValue());

    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new Accountant());
        return roles;
    }
    
}
