/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Roles;
import java.util.ArrayList;
/**
 *
 * @author jayan
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList; // Changed from usrAccList

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>(); // Changed from usrAccList and added diamond operator
    }

    public ArrayList<UserAccount> getUserAccountList() { // Changed from getUsrAccList
        return userAccountList;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount userAccount : userAccountList) { // Changed iteration variable and list name
            if (userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password)) { // Changed method calls to align with UserAccount refactoring
                return userAccount;
            }
        }

        return null;
    }

    public UserAccount createUserAccount(String username, String password, Employee employee, Roles role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username); // Changed method call
        userAccount.setPassword(password); // Changed method call
        userAccount.setEmployee(employee); // Changed method call
        userAccount.setUserRole(role); // Changed method call
        userAccountList.add(userAccount);
        return userAccount;
    }

    public UserAccount createUserAccount(String username, String password, Employee employee, Roles role, String accountType) { // Changed parameter name
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username); // Changed method call
        userAccount.setPassword(password); // Changed method call
        userAccount.setEmployee(employee); // Changed method call
        userAccount.setUserRole(role); // Changed method call
        userAccount.setAccountType(accountType); // Changed method call
        userAccountList.add(userAccount);
        return userAccount;
    }

    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount userAccount : userAccountList) { // Changed iteration variable and list name
            if (userAccount.getUsername().equals(username)) { // Changed method call
                return false;
            }
        }
        return true;
    }
}
