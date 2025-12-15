/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AccountantOrg;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.HealthcareAccountant.AccountantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author gaganaananda
 */
public class Accountant extends Roles{
    
    @Override
        public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem ecosystem) {
        return new AccountantWorkAreaJPanel(userProcessContainer, account, (AccountantOrg)organization, enterprise, ecosystem);
    }
    
}
