/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InsuranceAgentOrg;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.InsuranceAgent.InsuranceAgentWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author gaganaananda
 */
public class InsuranceRepresentative extends Roles{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
     return new InsuranceAgentWorkAreaJPanel(userProcessContainer, account, (InsuranceAgentOrg)organization, enterprise);
    }
    
    
}
