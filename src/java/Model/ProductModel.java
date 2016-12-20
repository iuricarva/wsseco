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
public class ProductModel {
    private String Product;

    public String getProduct() {
        return Product;
    }

    public void setProduct(String Product) {
        this.Product = Product;
    }
   
}
