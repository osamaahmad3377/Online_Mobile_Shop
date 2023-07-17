// Java program to demonstrate constuctors of Date
import java.util.*;

class Employee{
    //Employee: id, fName, lName, email, jobTitle
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String jobTitle;

    Office office;

    private static int idGenerator=0;

    public Employee(Office office){
        id = idGenerator++;
        firstName = "Kamran";
        lastName = "Khan";
        email = "kkhan@owntrade.com";
        jobTitle = "Junior Sales Executive";
        //
        this.office = office;
    }
    
    public Employee(Office off, String firstN, String lastN, String emai, String jobTi){
        office = off;
        id = idGenerator++;
        firstName = firstN;
        lastName = lastN;
        email = emai;
        jobTitle = jobTi;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
    public String getEmail(){
        return email;
    }
    public String getJobTitle(){
        return jobTitle;
    }
}
