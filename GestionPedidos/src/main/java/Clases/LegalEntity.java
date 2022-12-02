/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author quihu
 */
public class LegalEntity {
    
    private String companyName;
    private String NIT;
    
    public LegalEntity() {
     
    }

    public LegalEntity(String companyName, String NIT) {
        this.companyName = companyName;
        this.NIT = NIT;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
    
}
