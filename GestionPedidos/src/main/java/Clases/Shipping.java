
package Clases;

import java.util.Date;

/**
 *
 * @author quihu
 */
public class Shipping {
    
    private int id;
    private String addressShipping;
    private boolean completed;
    private Date dateShipping;
    private String company;
    private Payment payment;
    private Order order;

    public Shipping(int id, String addressShipping, boolean completed, Date dateShipping, String company, Payment payment, Order order) {
        this.id = id;
        this.addressShipping = addressShipping;
        this.completed = completed;
        this.dateShipping = dateShipping;
        this.company = company;
        this.payment = payment;
        this.order = order;
    }
    
    private void dispatchOrder(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddressShipping() {
        return addressShipping;
    }

    public void setAddressShipping(String addressShipping) {
        this.addressShipping = addressShipping;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Date getDateShipping() {
        return dateShipping;
    }

    public void setDateShipping(Date dateShipping) {
        this.dateShipping = dateShipping;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    
}
