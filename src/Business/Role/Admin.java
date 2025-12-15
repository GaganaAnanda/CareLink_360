package Business.Role;
 
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.SystemAdmin.SystemAdminWorkAreaJPanel;   // use SystemAdmin panel
import javax.swing.JPanel;
 
public class Admin extends Roles {
 
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,
                                 UserAccount account,
                                 Organization organization,
                                 Enterprise enterprise,
                                 Ecosystem ecosystem) {
 
        // For system admin, we do not care about enterprise/organization
        return new SystemAdminWorkAreaJPanel(userProcessContainer, ecosystem);
    }
}