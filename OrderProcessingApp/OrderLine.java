// Java program to demonstrate constuctors of Date
import java.util.*;

class OrderLine{
    //OrderLine: id, PRODUCT, qty
    private int id;
    private Product[] products;
    private int[] quantity;

    private static int idGenerator=0;
 public OrderLine(){
    
}
    public OrderLine(String[] productName){
        id = idGenerator++;
        // remember: this will create array of reference variables
        // of type Product. The actual objects have to be created
        // separately.
        products = new Product[productName.length];
        quantity = new int[productName.length];
        // Now the actual Product object is created
        // and its reference is stored in the reference
        // variable product[0]
        for(int i=0; i<productName.length; i++){
            products[i] = new Product(productName[i]);
            quantity[i] = 1;
        }


    }
    public Product[] getProducts(){
        return products;
    }
    // implement this method by first removing the statement
    // return products[0].getPrice();
    public double totalPrice(){
      
       double r=products[0].getDiscountPrice(10);
       double q=products[1].getDiscountPrice(10);
       double d=products[2].getDiscountPrice(10);
       double total=r+q+d;

       return total;
    }
}