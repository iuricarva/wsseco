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
public class ProductWithQualityAttModel {
    private String Product;
    private String QualityAttribute;

    public String getProduct() {
        return Product;
    }

    public void setProduct(String Product) {
        this.Product = Product;
    }

    public String getQualityAttribute() {
        return QualityAttribute;
    }

    public void setQualityAttribute(String QualityAttribute) {
        this.QualityAttribute = QualityAttribute;
    }
    
    
    
}
