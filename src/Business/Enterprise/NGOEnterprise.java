/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;
import Business.Organization.Organization;
import Business.Role.Roles;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author talha
 */
public class NGOEnterprise extends Enterprise{

    public NGOEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.NGO);
    }
    
     @Override
    public ArrayList<Roles> getSupportedRole() {
        return null;
    }

    @Override
    public List<Organization.Type> getAllOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.NGOAdministrator);
        orgTypes.add(Organization.Type.Director);

        return orgTypes;
    }
    
}
