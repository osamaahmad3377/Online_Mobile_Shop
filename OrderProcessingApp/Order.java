// Java program to demonstrate constuctors of Date
import java.util.*;

class Order{
    //Order: id, createDate, requestDate, shipmentDate, state, comments
    private int id;
    private Date createDate;
    private Date requestDate;
    private Date shipmentDate;
    private int state;
    private String comments;
    //
     OrderLine orderLine;
     Employee employee;

    private static int idGenerator=0;
    public Order(Employee employee, String[] productName){
        id = idGenerator++;
        createDate = new Date();
        requestDate = new Date();
        shipmentDate = new Date();
        state = 0;
        comments = "This is an empty order.";
        // pass on the information here
        orderLine = new OrderLine(productName);
        this.employee = employee;
    }
    public OrderLine getOrderLine(){
        return orderLine;
    }
    public Employee getEmployee(){
        return employee;
    }
}
