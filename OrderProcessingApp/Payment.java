// Java program to demonstrate constuctors of Date
import java.util.*;

public class Payment{
    //Payment: id, createDate, amount

    private int id;
    private Date createDate;
    private double amount;
     
    private static int idGenerator=0;

    public Payment(){
        id = idGenerator++;
        createDate = new Date();
        amount = 0.0;
    }
    public Payment(Date date, double amnt){
        id = idGenerator++;
        createDate = date;
        amount = amnt;
    }
    public Date getDate(){
        return createDate;
    }
    public double getAmount(double a,double b,double c){
       amount=a+b+c;
        return amount;
    }
}
