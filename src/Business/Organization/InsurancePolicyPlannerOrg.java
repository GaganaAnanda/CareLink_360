/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.InsurancePolicyManager;
import Business.Role.Roles;
import java.util.ArrayList;
/**
 *
 * @author talha
 */
public class InsurancePolicyPlannerOrg extends Organization {

    public InsurancePolicyPlannerOrg() {
        super(Organization.Type.InsurancePolicyPlanner.getValue());
    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new InsurancePolicyManager());
        return roles;
    }
    
}
