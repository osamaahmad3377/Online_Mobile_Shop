// Java program to demonstrate constuctors of Date
import java.util.*;

class Office{
    //Office: code, contact, address1, province, postcode, country
    private String code;
    private String contact;
    private String address;
    private String province;
    private String postcode;
    private String country;

    public Office(){
        code = "000-000-001";
        contact = "Green Electronics";
        address = "University Town, Peshawar";
        province = "Khyber Pakhtunkhwa";
        postcode = "25000";
        country = "Pakistan";
    }
    
    public Office(String cod,String cont, String add,String prov, String post , String contr){
        code = cod;
        contact = cont;
        address = add;
        province = prov;
        postcode = post;
        country = contr;
    }
}
