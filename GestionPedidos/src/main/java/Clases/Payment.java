
package Clases;

import java.util.Date;

/**
 *
 * @author quihu
 */
public class Payment {
    
    private int id;
    private Date datePayment;
    private int pay;
    private Order order;

    public Payment(int id, Date datePayment, int pay, Order order) {
        this.id = id;
        this.datePayment = datePayment;
        this.pay = pay;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatePayment() {
        return datePayment;
    }

    public void setDatePayment(Date datePayment) {
        this.datePayment = datePayment;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    
    
}
