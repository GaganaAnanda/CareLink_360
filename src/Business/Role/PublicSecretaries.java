/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SecretaryOrg;
import Business.UserAccount.UserAccount;
import UI.GovernmentSecretary.SecretaryDashboardJPanel;
import javax.swing.JPanel;

/**
 *
 * @author gaganaananda
 */
public class PublicSecretaries extends Roles{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new SecretaryDashboardJPanel(userProcessContainer, userAccount, (SecretaryOrg)organization, enterprise);
    }
    
}
