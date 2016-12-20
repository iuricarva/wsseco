/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CertificationModel;
import Model.IndividualModel;
import Model.PlatformModel;
import Model.ProductCertifiedQualityModel;
import Model.ProductModel;
import Model.ProductWithQualityAttModel;
import Model.QualityModel;
import OntoDAO.OntoDAO;
import java.util.ArrayList;

/**
 *
 * @author icarv
 */
public class OntoController {
    
    public static ArrayList<QualityModel> qualityProductCertification(){
        ArrayList<QualityModel> Dados = OntoDAO.qualityProductCertificationDAO();
        return Dados;    
    }
    
    public static ArrayList<CertificationModel> Certification(){
        ArrayList<CertificationModel> Dados = OntoDAO.CertificationDAO(); ;       
        return Dados;
    }
    
    public static ArrayList<ProductWithQualityAttModel> ProductWithQualityAttribute(){
        ArrayList<ProductWithQualityAttModel> Dados = OntoDAO.ProductWithQualityAttributeDAO();        
        return Dados;
    }
    
    public static ArrayList<ProductModel> ProductWithQualityExperienceTime(){
        ArrayList<ProductModel> Dados = OntoDAO.ProductWithQualityExperienceTimeDAO();        
        return Dados;
    }
    
    public static ArrayList<CertificationModel> CompanyCertification(String company){
        ArrayList<CertificationModel> Dados = OntoDAO.CompanyCertificationDAO(company); ;       
        return Dados;
    }
    
    public static ArrayList<ProductCertifiedQualityModel> productqualityCertification(){
        ArrayList<ProductCertifiedQualityModel> Dados = OntoDAO.productQualityCertificationDAO();
        return Dados;    
    }
    
    public static ArrayList<IndividualModel> returnHeterogeneity(){
        return OntoDAO.returnHeterogeneity();
    }
    
    public static ArrayList<IndividualModel> returnRegenerationAbility(){
        return OntoDAO.returnRegenerationAbility();
    }
    
    public static ArrayList<IndividualModel> returnEffortBalance(){
        return OntoDAO.returnEffortBalance();
    }
    
    public static ArrayList<IndividualModel> returnExpertiseBalance(){
        return OntoDAO.returnExpertiseBalance();
    }
    
    public static ArrayList<IndividualModel> returnVisibility(){
        return OntoDAO.returnVisibility();
    }
    
    public static ArrayList<IndividualModel> returnSustainability(){
        return OntoDAO.returnSustainability();
    }
    
    public static ArrayList<IndividualModel> returnHealth(){
        return OntoDAO.returnHealth();
    }
    
    public static ArrayList<PlatformModel> returnProductivity(){
        return OntoDAO.returnProductivity();
    }
    
    public static ArrayList<PlatformModel> returnDiversity(){
        return OntoDAO.returnDiversity();
    }
    
     public static ArrayList<PlatformModel> returnNicheCreation(){
        return OntoDAO.returnNicheCreation();
    }
    
}
