package serializering;

public class Employee implements java.io.Serializable {
   String namn;
   String telefonnummer;
   String adress;
   String postnummer;
   
   public Employee(String namn,String tel,String adress,String postnummer){
        this.namn = namn;
        this.telefonnummer = tel;
        this.adress = adress;
        this.postnummer = postnummer;
   }
   
   public void empCheck() {
      System.out.println("Namn och telefon: " + namn + ", " + telefonnummer);
      System.out.println("Adress och postnummer: " + adress + ", " + postnummer);
   }
}
