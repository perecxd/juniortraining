import java.util.Locale;

public class Student {

   private String name;
    private String SSN;
    private String takeclass ="";
    private String email;
   private static String ID = "CIG42";
   private String UID ;
   private double balance;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMegye() {
        return megye;
    }

    public void setMegye(String megye) {
        this.megye = megye;
    }
   private String phone;
   private String city;
   private String megye;

   Student(String name,String SSN){
    this.name = name;
    email=name.toLowerCase()+"@schoolmail.net"  ;
    int random = (int)(Math.random()*1000);
    UID =ID+" "+random + SSN.substring(SSN.length()-4,SSN.length());
   }
 @Override
   public String toString(){
       return "[Name: "+name+"]\n[Email: "+email+"]\n[UID: "+UID+"]\n[City :"+this.getCity()+"]\n[Megye: "+this.getMegye()+"]\n[Phone:"+this.getPhone()+"]";
   }

   public void enroll(String whatclass){
       if (takeclass.length()==0){
           takeclass=whatclass+"; ";
       }else {
           takeclass = takeclass + whatclass + "; ";
       }
       System.out.println(name+" successfully enrolled in "+whatclass+".");
   }

   public void deposit(int amount){
       balance = balance+amount;
       System.out.println("Successfully deposited:"+amount+" Ft.");
       System.out.println("Current balance is: "+balance+" Ft.");
   }

   public void pay(int amount){
       balance = balance - amount;
       System.out.println("Successfully paid:"+amount+" Ft.");
       System.out.println("Current balance is: "+balance+" Ft.");
   }

   public void showCourses(){
       System.out.println(name+" is currently enrolled in: "+takeclass);
   }

   public void checkBalance(){
       System.out.println("Current balance of "+name+" is: "+balance+" Ft.");
   }
}
