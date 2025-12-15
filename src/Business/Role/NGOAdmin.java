/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AdminOrgNGO;
import Business.Organization.DirectorOrgNGO;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.NGOAdmin.NGOAdminWAJPanel;
import UI.NGOAdmin.NGOAdminWAJPanel;
import javax.swing.JPanel;

/**
 *
 * @author gaganaananda
 */
public class NGOAdmin extends Roles{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new NGOAdminWAJPanel(userProcessContainer, account, (AdminOrgNGO)organization, enterprise);
    }
    
}
