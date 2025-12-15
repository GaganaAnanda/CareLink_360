/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author talha
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createtAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.HealthCare){
            enterprise=new HealthCareEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type == Enterprise.EnterpriseType.Government)
        {
            enterprise =  new GovtEnterprise(name);
            enterpriseList.add(enterprise);
            
        }
        
        
        else if(type == Enterprise.EnterpriseType.InsuranceCompany)
        {
            enterprise = new InsuranceEnterprise(name);
            enterpriseList.add(enterprise);
            
            
        }
        else if(type == Enterprise.EnterpriseType.NGO)
        {
            enterprise = new NGOEnterprise(name);
            enterpriseList.add(enterprise);
            
        }
        return enterprise;
    }
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
    Enterprise enterprise = null;

    if (type == Enterprise.EnterpriseType.HealthCare) {
        enterprise = new HealthCareEnterprise(name);
    } else if (type == Enterprise.EnterpriseType.InsuranceCompany) {
        enterprise = new InsuranceEnterprise(name);
    } else if (type == Enterprise.EnterpriseType.Government) {
        enterprise = new GovtEnterprise(name);
    } else if (type == Enterprise.EnterpriseType.NGO) {
        enterprise = new NGOEnterprise(name);
    }

    if (enterprise != null) {
        enterpriseList.add(enterprise);
    }

    return enterprise;
}
}
