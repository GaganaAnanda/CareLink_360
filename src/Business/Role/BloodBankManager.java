/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.BloodBankManager.BloodBankManagerDashboardJPanel;
import javax.swing.JPanel;
import UI.BloodBankManager.BloodBankManagerDashboardJPanel;

/**
 *
 * @author gaganaananda
 */
public class BloodBankManager extends Roles{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,
            Enterprise enterprise, Ecosystem ecosystem) {
        return new BloodBankManagerDashboardJPanel(userProcessContainer, account, organization, ecosystem);
    }
    
}
