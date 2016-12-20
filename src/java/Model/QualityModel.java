/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author icarv
 */
@XmlRootElement
public class QualityModel {
    private String product;
    private String developer;
    private String developerCompany;
    private String Certification;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getDeveloperCompany() {
        return developerCompany;
    }

    public void setDeveloperCompany(String developerCompany) {
        this.developerCompany = developerCompany;
    }

    public String getCertification() {
        return Certification;
    }

    public void setCertification(String Certification) {
        this.Certification = Certification;
    }
    
    
    
}
