
package Clases;

/**
 *
 * @author quihu
 */
public class Client {

   private int id;
   private String addres;
   private String phoneNumber;
   private String email;
   private NaturalPerson natutalPerson;
   private LegalEntity legalEntity;
   
   public Client(){
       
   }

    public Client(int id, String addres, String phoneNumber, String email) {
        this.id = id;
        this.addres = addres;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public NaturalPerson getNatutalPerson() {
        return natutalPerson;
    }

    public void setNatutalPerson(NaturalPerson natutalPerson) {
        this.natutalPerson = natutalPerson;
    }

    public LegalEntity getLegalEntity() {
        return legalEntity;
    }

    public void setLegalEntity(LegalEntity legalEntity) {
        this.legalEntity = legalEntity;
    }
   
}
