// Java program to demonstrate constuctors of Date
import java.util.*;

public class OrderProcessingApp{

    public static void main(String[] args){
        System.out.println("Welcome to Green Electronics Order Processing Application");

        // Create an office *******************************************************************
        Office office = new Office();
        // Create an employee and assign an office to him/her
        Employee employee = new Employee(office, "khan", "Akbar", "kAkbar1123@gmail.com","shop keeper");
        // Create a product catalog
        ProductCatalog.initCatalog();
        // Create a customer and let him/her place an order*************************************************************

        Customer customer = new Customer("osama","89918","Osama","Ahmad","03459527616", "chail road madyan", "swat", "kpk",
        "25000", "Pakistan");
        Order order = customer.createOrder(employee, new String[]{"Galaxy Note 2 Ultra","Galaxy S21 Ultra","Samsung S10"});
        //customer.createOrder(employee, new String[]{"Galaxy Note 2 Ultra ","Galaxy S21 Ultra",Samsung s10});
        // Get the list of products in the customer order
       // Product product=new product("");
        Product[] products = order.getOrderLine().getProducts();
        // Get the employee who served the order.
        Employee orderProcessingEmployee = order.getEmployee();

        // Now, let the customer pay the bill
        Payment payment = customer.makePayment(order.getOrderLine().totalPrice());
      
       //***********************************************************************************************************************************
       //     first product
     
        // clear the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
        // Display summary on screen
        System.out.println("\n\n\t\t--| Order Details |--\n\n");
        System.out.println("Customer Details: ");
        System.out.println("\tName: " + customer.getcname());
        System.out.println("Product Details: ");
        System.out.println("\tName: " + products[0].getName());
        System.out.println("\tScale: " + products[0].getScale());
        System.out.println("\tPrice: PKR " + products[0].getPrice());
      
        System.out.println("\tVendor: " + products[0].getVendor());
        System.out.println("\tCategory: " + products[0].getCategory());
        System.out.println("Order Serving Employee: ");
        System.out.println("\t" + orderProcessingEmployee.getFullName());
        System.out.println("\t" + orderProcessingEmployee.getEmail());
        System.out.println("\t" + orderProcessingEmployee.getJobTitle());
        System.out.println("Payment Details: ");
        System.out.println("discount price "+products[0].getDiscountPrice(10));
       
        
        //***********************************************************************************************8
         // second product

        System.out.println("Product Details: ");
        System.out.println("\tName: " + products[1].getName());
        System.out.println("\tScale: " + products[1].getScale());
        System.out.println("\tPrice: PKR " + products[1].getPrice());
      
        System.out.println("\tVendor: " + products[1].getVendor());
        System.out.println("\tCategory: " + products[1].getCategory());
        System.out.println("discount price  "+products[1].getDiscountPrice(10));
       // System.out.println("total price "+products[0].getPrice() +products[1].getPrice() );
         System.out.println("Product 3 Details: ");
         //**********************************************************************************************

       // third product

        System.out.println("\tName: " + products[2].getName());
        System.out.println("\tScale: " + products[2].getScale());
        System.out.println("\tPrice: PKR " + products[2].getPrice());
     
        System.out.println("\tVendor: " + products[2].getVendor());
        System.out.println("\tCategory: " + products[2].getCategory());
        System.out.println("discount price  "+products[2].getDiscountPrice(10));
//********************************************************************************************************
// payment after discount 

        double p;
        double a;
        double k;
        p=products[0].getDiscountPrice(2);
        a=products[1].getDiscountPrice(4);
        k=products[2].getDiscountPrice(4);
         System.out.println("\tAmount Paid: " + payment.getAmount(p,a,k));////////
         System.out.println("\tPayment Date: " + payment.getDate());
        System.out.println("\n\n\t\t--| ************** |--\n\n");
    }
}
