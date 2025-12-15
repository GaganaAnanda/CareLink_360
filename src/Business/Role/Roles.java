/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author gaganaananda
 */
public abstract class Roles {
    
    public enum RoleType {
        Admin("Admin"),
        Doctor("Doctor"),
        Patient("Patient"),
        LabAssistant("Lab Assistant"),
        Accountant("Accountant"),
        InsuranceRepresentative("Insurance Representative"),
        InsurancePolicyManager("Insurance Policy Manager"),
        InsuranceFinanceSupervisor("Insurance Finance Supervisor"),
        PublicHealthOfficer("Public Health Officer"),
        PublicTreasurer("Public Treasure"),
        PublicSecretaries("Public Secretaries"),
        BloodBankManager("Blood Bank Manager"),
        NGOAdmin("NGO Admin"),
        NGODirector("NGO Director");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            Ecosystem ecosystem);

    @Override
    public String toString() {

        return this.getClass().getSimpleName();
    }
    
    
}
