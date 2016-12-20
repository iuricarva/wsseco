/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSSPack;

import Controller.OntoController;
import Model.CertificationModel;
import Model.IndividualModel;
import Model.PlatformModel;
import Model.ProductCertifiedQualityModel;
import Model.ProductModel;
import Model.ProductWithQualityAttModel;
import Model.QualityModel;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * REST Web Service
 *
 * @author icarv
 */
@Path("WSSecoRestful")
public class WSSeco {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of WSSeco
     */
    public WSSeco() {
    }

    /**
     * Retrieves representation of an instance of WSSPack.WSSeco
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getqualityexperiencetime")
    public List<ProductModel>getQualityExperienceTime() {
               
        return OntoController.ProductWithQualityExperienceTime();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getcertification")
    public List<CertificationModel> getCertification() {
               
        return OntoController.Certification();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getquality")
    public List<QualityModel> getQuality() {
        
        return OntoController.qualityProductCertification();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getproductwithqualityattribute")
    public List<ProductWithQualityAttModel> getProductWithQualityAttribute() {
        
        return OntoController.ProductWithQualityAttribute();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getcompanycertification/{company}")
    public List<CertificationModel> getCompanyCertification(@PathParam("company") String company) {
               
        return OntoController.CompanyCertification(company);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getqualitycertification")
    public List<ProductCertifiedQualityModel> getProductCertificationQuality() {
        
        return OntoController.productqualityCertification();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getheterogeneity")
    public List<IndividualModel> getHeterogeneity() {
        
        return OntoController.returnHeterogeneity();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getregenerationability")
    public List<IndividualModel> getRegenerationAbility() {
        
        return OntoController.returnRegenerationAbility();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("geteffortbalance")
    public List<IndividualModel> getEffortBalance() {
        
        return OntoController.returnEffortBalance();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getexpertisebalance")
    public List<IndividualModel> getExpertiseBalance() {
        
        return OntoController.returnExpertiseBalance();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getvisibility")
    public List<IndividualModel> getVisibility() {
        
        return OntoController.returnVisibility();
        
    }
    
       
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getsustainability")
    public List<IndividualModel> getSustainability() {
        
        return OntoController.returnSustainability();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("gethealth")
    public List<IndividualModel> getHealth() {
        
        return OntoController.returnHealth();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getproductivity")
    public List<PlatformModel> getProductivity() {
        
        return OntoController.returnProductivity();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getdiversity")
    public List<PlatformModel> getDiversity() {
        
        return OntoController.returnDiversity();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("getnichecreation")
    public List<PlatformModel> getNicheCreation() {
        
        return OntoController.returnNicheCreation();
        
    }

    /**
     * PUT method for updating or creating an instance of WSSeco
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
