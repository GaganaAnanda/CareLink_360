/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HealthCareOfficerOrg;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.HealthcareOfficer.OfficerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author gaganaananda
 */
public class PublicHealthOfficer extends Roles{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new OfficerWorkAreaJPanel(userProcessContainer, userAccount, (HealthCareOfficerOrg)organization, enterprise);
    }
    
}
