
package Clases;

import java.util.Date;

/**
 *
 * @author quihu
 */
public class Order {
   
    private int id;
    private Date dateRealization;
    private boolean state;
    private int total;
    private Client client;
    private ProductLine productLine;

    public Order(int id, Date dateRealization, boolean state, int total, Client client, ProductLine productLine) {
        this.id = id;
        this.dateRealization = dateRealization;
        this.state = state;
        this.total = total;
        this.client = client;
        this.productLine = productLine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateRealization() {
        return dateRealization;
    }

    public void setDateRealization(Date dateRealization) {
        this.dateRealization = dateRealization;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
      public ProductLine getProductLine() {
        return productLine;
    }

    public void setProductLine(ProductLine productLine) {
        this.productLine = productLine;
    }
    
    
}
