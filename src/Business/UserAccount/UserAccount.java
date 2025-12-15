/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Roles;
import Business.WorkQueue.WorkQueue;
import java.util.List;
/**
 *
 * @author jayan
 */
public class UserAccount {

    private String username; // Changed from uname
    private String password; // Changed from pwd
    private Employee employee; // Changed from emp
    private Roles userRole; // Changed from role
    private WorkQueue workQueue; // Changed from wrkQ
    private String accountType; // Changed from type

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public UserAccount() {
        workQueue = new WorkQueue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getUserRole() {
        return userRole;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setUserRole(Roles userRole) {
        this.userRole = userRole;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    @Override
    public String toString() {
        return username;
    }

}
