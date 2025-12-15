package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.InsuranceEnterprise;
import Business.Network.Network;
import Business.Organization.*;
import Business.Role.*;
import Business.UserAccount.UserAccount;
import com.github.javafaker.Faker;
import Business.Insurance.Insurance;
import java.util.Random;


public class SystemConfiguration {

    public static Ecosystem configure() {

        Ecosystem ecosystem = Ecosystem.getInstance();

        // ------------------------------------------------
        // 1. Create Networks
        // ------------------------------------------------
        Network gaganaNet = ecosystem.createAndAddNetwork("Gagana Network");
        Network jayanthNet = ecosystem.createAndAddNetwork("Jayanth Network");
        Network hameedNet = ecosystem.createAndAddNetwork("Hameed Network");
        Network malleshNet = ecosystem.createAndAddNetwork("Mallesh Network");

        // ------------------------------------------------
        // 2. Create Enterprises
        // ------------------------------------------------
        Enterprise gaganaEnt = gaganaNet.getEnterpriseDirectory()
                .createAndAddEnterprise("Gagana Enterprise", Enterprise.EnterpriseType.HealthCare);

        Enterprise jayanthEnt = jayanthNet.getEnterpriseDirectory()
                .createAndAddEnterprise("Jayanth Enterprise", Enterprise.EnterpriseType.InsuranceCompany);

        Enterprise hameedEnt = hameedNet.getEnterpriseDirectory()
                .createAndAddEnterprise("Hameed Enterprise", Enterprise.EnterpriseType.Government);

        Enterprise malleshEnt = malleshNet.getEnterpriseDirectory()
                .createAndAddEnterprise("Mallesh Enterprise", Enterprise.EnterpriseType.NGO);
        
        
        //------------------------------------------------------------
//  ADD 10 FAKE INSURANCE POLICIES USING FAKER
//------------------------------------------------------------
com.github.javafaker.Faker faker = new com.github.javafaker.Faker();

InsuranceEnterprise insEnt = (InsuranceEnterprise) jayanthEnt;  // Jayanth Enterprise only

for (int i = 1; i <= 10; i++) {

    String policyName = faker.company().buzzword() + " Plan";
    String insuranceCompany = "Jayanth Enterprise";
    double coverage = faker.number().numberBetween(50, 90);   // 50%–90%

    Insurance policy = new Insurance(policyName, insuranceCompany, coverage);

    policy.setMonthlyPremium(faker.number().numberBetween(100, 500));
    policy.setPolicyTermsAndConditions("Auto-generated policy terms for " + policyName);

    // ADD INTO DIRECTORY
    insEnt.getInsPlcyDir().getPolicies().add(policy);
}


        // ------------------------------------------------
        // 3. Create Enterprise Admin Users
        // ------------------------------------------------

        // ----- GAGANA -----
        Employee gaganaAdminEmp = gaganaEnt.getEmployeeDirectory().createEmployee("Gagana Hospital");
        gaganaEnt.getUserAccountDirectory()
                .createUserAccount("gaganaentr", "Gagana$123", gaganaAdminEmp, new EnterpriseAdmin());

        // ----- JAYANTH -----
        Employee jayanthAdminEmp = jayanthEnt.getEmployeeDirectory().createEmployee("Jayanth Insurance Company");
        jayanthEnt.getUserAccountDirectory()
                .createUserAccount("jayanthentr", "Jayanth$123", jayanthAdminEmp, new EnterpriseAdmin());

        // ----- HAMEED -----
        Employee hameedAdminEmp = hameedEnt.getEmployeeDirectory().createEmployee("Hameed Government");
        hameedEnt.getUserAccountDirectory()
                .createUserAccount("hameedentr", "Hameed$123", hameedAdminEmp, new EnterpriseAdmin());

        // ----- MALLESH -----
        Employee malleshAdminEmp = malleshEnt.getEmployeeDirectory().createEmployee("Mallesh NGO");
        malleshEnt.getUserAccountDirectory()
                .createUserAccount("malleshentr", "Mallesh$123", malleshAdminEmp, new EnterpriseAdmin());


        // ============================================================
        // 4. Create ORGANIZATION EMPLOYEES + USER ACCOUNTS
        // ============================================================

        // ------------------------------------------------
        // GAGANA ENTERPRISE (HealthCare)
        // ------------------------------------------------
        DoctorOrg gaganaDocOrg = (DoctorOrg) gaganaEnt.getOrganizationDirectory()
                .createOrganization(Organization.Type.Doctor);
        LabOrg gaganaLabOrg = (LabOrg) gaganaEnt.getOrganizationDirectory()
                .createOrganization(Organization.Type.Lab);
        AccountantOrg gaganaAccOrg = (AccountantOrg) gaganaEnt.getOrganizationDirectory()
                .createOrganization(Organization.Type.Accountant);

        // Doctor
        Employee docEmp = gaganaDocOrg.getEmployeeDirectory().createEmployee("Doctor Gagana");
        gaganaDocOrg.getUserAccountDirectory()
                .createUserAccount("drgagana", "Gagana$123", docEmp, new Doctor());

        // Lab
        Employee labEmp = gaganaLabOrg.getEmployeeDirectory().createEmployee("Lab Assistant Gagana");
        gaganaLabOrg.getUserAccountDirectory()
                .createUserAccount("labgagana", "Gagana$123", labEmp, new LabAssistant());

       // Blood Bank Manager
        BloodBankManagerOrg bbOrg =(BloodBankManagerOrg) gaganaEnt.getOrganizationDirectory().createOrganization(Organization.Type.BloodBank);
        Employee bbEmp = bbOrg.getEmployeeDirectory().createEmployee("Blood Bank Manager Gagana");
        bbOrg.getUserAccountDirectory().createUserAccount("bbgagana", "Gagana$123", bbEmp, new BloodBankManager());
   
        
        // Accountant
        Employee accEmp = gaganaAccOrg.getEmployeeDirectory().createEmployee("Accountant Gagana");
        gaganaAccOrg.getUserAccountDirectory()
                .createUserAccount("accgagana", "Gagana$123", accEmp, new Accountant());


        // ------------------------------------------------
        // JAYANTH ENTERPRISE (Insurance)
        // ------------------------------------------------
        InsuranceAgentOrg repOrg = (InsuranceAgentOrg) jayanthEnt.getOrganizationDirectory()
                .createOrganization(Organization.Type.InsuranceAgent);

        InsurancePolicyPlannerOrg policyOrg = (InsurancePolicyPlannerOrg) jayanthEnt.getOrganizationDirectory()
                .createOrganization(Organization.Type.InsurancePolicyPlanner);

        InsuranceFinanceOrg financeOrg = (InsuranceFinanceOrg) jayanthEnt.getOrganizationDirectory()
                .createOrganization(Organization.Type.InsuranceFinanceOrganization);

        // Representative
        Employee repEmp = repOrg.getEmployeeDirectory().createEmployee("Insurance Representative Jayanth");
        repOrg.getUserAccountDirectory()
                .createUserAccount("jayanthiao", "Jayanth$123", repEmp, new InsuranceRepresentative());

        // Policy Planner
        Employee policyEmp = policyOrg.getEmployeeDirectory().createEmployee("Insurance Policy Manager Jayanth");
        policyOrg.getUserAccountDirectory()
                .createUserAccount("jayanthpp", "Jayanth$123", policyEmp, new InsurancePolicyManager());

        // Finance Supervisor
        Employee finEmp = financeOrg.getEmployeeDirectory().createEmployee("Insurance Finance Supervisor Jayanth");
        financeOrg.getUserAccountDirectory()
                .createUserAccount("jayanthfo", "Jayanth$123", finEmp, new InsuranceFinanceSupervisor());


        // ------------------------------------------------
        // HAMEED ENTERPRISE (Government)
        // ------------------------------------------------
        HealthCareOfficerOrg healthOrg = (HealthCareOfficerOrg) hameedEnt.getOrganizationDirectory()
                .createOrganization(Organization.Type.HealthcareOfficer);

        TreasurerOrg treasurerOrg = (TreasurerOrg) hameedEnt.getOrganizationDirectory()
                .createOrganization(Organization.Type.Treasurer);

        SecretaryOrg secOrg = (SecretaryOrg) hameedEnt.getOrganizationDirectory()
                .createOrganization(Organization.Type.Secretary);

        // Health Officer
        Employee hoEmp = healthOrg.getEmployeeDirectory().createEmployee("Health Officer Hameed");
        healthOrg.getUserAccountDirectory()
                .createUserAccount("hameedho", "Hameed$123", hoEmp, new PublicHealthOfficer());

        // Treasurer
        Employee trEmp = treasurerOrg.getEmployeeDirectory().createEmployee("Treasurer Hameed");
        treasurerOrg.getUserAccountDirectory()
                .createUserAccount("hameedto", "Hameed$123", trEmp, new PublicTreasurer());

        // Secretary
        Employee secEmp = secOrg.getEmployeeDirectory().createEmployee("Secretaries Hameed");
        secOrg.getUserAccountDirectory()
                .createUserAccount("hameedso", "Hameed$123", secEmp, new PublicSecretaries());


        // ------------------------------------------------
        // MALLESH ENTERPRISE (NGO)
        // ------------------------------------------------
        AdminOrgNGO adminNGO = (AdminOrgNGO) malleshEnt.getOrganizationDirectory()
                .createOrganization(Organization.Type.NGOAdministrator);

        DirectorOrgNGO dirNGO = (DirectorOrgNGO) malleshEnt.getOrganizationDirectory()
                .createOrganization(Organization.Type.Director);

        // NGO Admin
        Employee ngoAdminEmp = adminNGO.getEmployeeDirectory().createEmployee("NGO Admin Mallesh");
        adminNGO.getUserAccountDirectory()
                .createUserAccount("malleshao", "Mallesh$123", ngoAdminEmp, new NGOAdmin());

        // NGO Director
        Employee ngoDirectorEmp = dirNGO.getEmployeeDirectory().createEmployee("NGO Director Mallesh");
        dirNGO.getUserAccountDirectory()
                .createUserAccount("malleshdo", "Mallesh$123", ngoDirectorEmp, new NGODirector());


        
        
        // ------------------------------------------------
        // 5. SYSTEM ADMIN
        // ------------------------------------------------
        Employee sysAdmin = ecosystem.getEmployeeDirectory().createEmployee("admin");
        ecosystem.getUserAccountDirectory()
                .createUserAccount("admin", "admin", sysAdmin, new Admin());

        return ecosystem;
    }
}
