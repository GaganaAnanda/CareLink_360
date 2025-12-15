package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Roles;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

public abstract class Organization {

    private String organizationName;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationId;
    private static int counter = 0;

    public enum Type {

        // Health Center Organization Types
        Admin("Admin Organization"),
        Doctor("Doctor Organization"),
        Lab("Lab Organization"),
        Patient("Patient Organization"),
        Accountant("Accountant Organization"),
        BloodBank("BloodBank Manager Organization"),

        // Insurance Organization Types
        InsuranceAgent("Insurance Agent Organization"),
        InsurancePolicyPlanner("Insurance Policy Planning Organization"),
        InsuranceFinanceOrganization("Insurance Finance Organization"),

        // Government Organization Types
        Treasurer("Treasurer Organization"),
        Secretary("Secretary Organization"),
        HealthcareOfficer("Healthcare Officer Organization"),

        // NGO Organization Types
        NGOAdministrator("Administrator Organization"),
        Director("Director Organization");

        private final String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.organizationName = name;
        this.workQueue = new WorkQueue();
        this.employeeDirectory = new EmployeeDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        this.organizationId = counter;
        counter++;
    }

    public abstract ArrayList<Roles> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setOrganizationName(String name) {
        this.organizationName = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return organizationName;
    }
}
