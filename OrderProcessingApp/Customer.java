import java.util.*;
//
class Customer{

    //Customer: id, name, pwd, fName, lName, phone,
    //address, city, province, postcode, country
    private int id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String city;
    private String province;
    private String postcode;
    private String country;

    private static int idGenerator=1;
    
    Customer(String user, String pass, String firstN, String lastN, String phoneN, String add,
            String cit, String prov, String post, String contr){
        id = idGenerator++;
     userName=user;
     password=pass;
     firstName=firstN;
     lastName=lastN;
     phoneNumber=phoneN;
     address=add;
     city=cit;
     province=prov;
     postcode=post;
     country=contr;
    }
    
    public Customer(){
        id = idGenerator++;
        userName = "syousaf";
        password = "1212131300";
        firstName = "Suhail";
        lastName = "Yousaf";
        phoneNumber = "03361111111";
        address = "University Campus";
        city = "Peshawar";
        province = "Khyber Pakhtunkhwa";
        postcode = "25000";
        country = "Pakistan";
    }
    // createOrder()
    public Order createOrder(Employee employee, String[] productName){
        return new Order(employee, productName);
    }
    // makePayment()
    public Payment makePayment(double price){
        return new Payment(new Date(), price);
    }
    
    public String getcname (){
        return firstName + " " + lastName ;
    }
}
