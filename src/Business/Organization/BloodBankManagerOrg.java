/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.BloodBankManager;
import Business.Role.Roles;
import java.util.ArrayList;
/**
 *
 * @author talha
 */
public class BloodBankManagerOrg extends Organization{
    
    public BloodBankManagerOrg() {
        super(Organization.Type.BloodBank.getValue());
    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new BloodBankManager());
        return roles;
    }
    
}
