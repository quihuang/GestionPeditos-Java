
package Clases;

import java.util.Date;

/**
 *
 * @author quihu
 */
public class ShoppingCart {
    
    private Date creationDate;
    private ProductLine productLine;
    
    public ShoppingCart(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    private void addProduct(){
        
    }
    
    private void validateExpiration(){
        
    }    

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public ProductLine getProductLine() {
        return productLine;
    }

    public void setProductLine(ProductLine productLine) {
        this.productLine = productLine;
    }
    
    
}
