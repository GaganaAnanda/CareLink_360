/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.InsuranceRepresentative;
import Business.Role.Roles;
import java.util.ArrayList;
/**
 *
 * @author talha
 */
public class InsuranceAgentOrg extends Organization {

    public InsuranceAgentOrg() {
        super(Organization.Type.InsuranceAgent.getValue());
    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList();
        roles.add(new InsuranceRepresentative());
        return roles;
    }
    
}
