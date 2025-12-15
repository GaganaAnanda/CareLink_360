/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Enterprise.InsuranceEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Roles;
import Business.Role.Admin;
import java.util.ArrayList;

/**
 *
 * @author talha
 */
public class Ecosystem extends Organization{
    private static Ecosystem ecosystem;
    private ArrayList<Network> networks;
    public static Ecosystem getInstance(){
        if(ecosystem==null){
            ecosystem=new Ecosystem();
        }
        return ecosystem;
    }
    
    public Network createAddNetworks(){
        Network network=new Network();
        networks.add(network);
        return network;
    }
    
    public Network createAndAddNetwork(String name) {
    Network network = new Network();
    network.setNetworkName(name);   // must exist inside Network class
    networks.add(network);
    return network;
}
    
    // ❗ FIXED — your old version used n.getName() (does NOT exist!)
    public Network getNetworkByName(String name) {
        for (Network n : networks) {
            if (n.getNetworkName() != null &&
                n.getNetworkName().equalsIgnoreCase(name)) {
                return n;
            }
        }
        return null;
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roleList=new ArrayList<Roles>();
        roleList.add(new Admin());
        return roleList;
    }
    private Ecosystem(){
        super(null);
        networks=new ArrayList<>();
    }

    public ArrayList<Network> getNetworks() {
        return networks;
    }

    public void setNetworkName(ArrayList<Network> networks) {
        this.networks = networks;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network : networks){
            
        }
        return true;
    }
public InsuranceEnterprise findInsuranceEnterpriseByName(String name) {
    if (name == null) return null;

    for (Network n : networks) {
        for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
            if (e instanceof InsuranceEnterprise &&
                e.getName().equalsIgnoreCase(name)) {
                return (InsuranceEnterprise) e;
            }
        }
    }
    return null;
}
}
