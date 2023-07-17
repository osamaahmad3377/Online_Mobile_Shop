// Java program to demonstrate constuctors of Date
import java.util.*;

class ProductCatalog{

    static Hashtable<String, String> catalog = new Hashtable<String, String>();
    public static void initCatalog(){
        // name, scale, vendor, price, category
        catalog.put("Galaxy Z Fold 3", "Large,Samsung,314999.0,Smart Phone");
        catalog.put("Galaxy S22 Ultra", "Large,Samsung,285999,Smart Phone");
        catalog.put("Galaxy S21 Ultra", "Large,Samsung, 219999,Smart Phone");
        catalog.put("Galaxy Note 2 Ultra", "Large,Samsung,219999,Smart Phone");
        catalog.put("Galaxy Z Flip 3", "Large,Samsung,199999,Smart Phone");
        // Adding new 5 products
        catalog.put("Iphone 7 plus", "Large,Apple,149999,Smart Phone");
        catalog.put("nokia 3310", "small,nokia,2000, Phone");
        catalog.put("Oppo F21 ", "Large,Oppo,80000,Smart Phone");
        catalog.put("Redmi Note 10S", "Large,Xiaomi,40000,Smarts Phone");
        catalog.put("Samsung S10", "Large,Samsung,1000,Smart Phone");
    }
    public static String getProduct(String name){
        return catalog.get(name);
    }
}

public class Product{
    //Product: id, name, scale, vendor, price, category

    private int id;
    private String name;
    private String scale; //Small, Medium, Large
    private String vendor;
    private double price;
    private String category;
    private double percentDiscount;

    private static int idGenerator=0;

    public Product(){
        id = idGenerator++;
        name = "Galaxy Z Fold 3";
        scale = "Small";
        vendor = "Samsung";
        price = 314999.0;
        category = "Smart Phone";
        
    }
    public Product(String name){
        id = idGenerator++;
        String productString = ProductCatalog.getProduct(name);
        if(productString != null){
            String[] productArray = productString.split(",");
            this.name = name;
            scale = productArray[0];
            vendor = productArray[1];
            price = Double.parseDouble(productArray[2]);
            category = productArray[3];
        }else{
            System.out.println("The product category does not exist!");
        }
    }
    public double setDiscount (double discount){
       percentDiscount= discount;
       return percentDiscount;
    }
   
    public String getName(){
        return name;
    }
    public String getScale(){
        return scale;
    }
    public String getVendor(){
        return vendor;
    }
    public double getPrice(){
        return price;
    }
    public String getCategory(){
        return category;
    }
    // implement this method by first removing the statement
    // return price;
    public double getDiscountPrice(double percentDiscount){
         double discountPrice;
        discountPrice = price - (price*percentDiscount/100);
        return discountPrice;
    }
}
