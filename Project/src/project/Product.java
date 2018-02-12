/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.List;

/**
 *
 * @author roope
 */
public class Product {
    
    public static String PRODUCT_START_LINE = "PRODUCT";
    public static String NAME_HEADER = "Name:";
    public static String PRICE_HEADER = "Price:";
    public static String ID_HEADER = "Id:";
    public static String TOTAL_HEADER = "Total:";
    public static String QUANTITY_HEADER = "Quantity:";
    public static String LOCATION_HEADER = "Location:";
    public static String SUBTOTAL_HEADER = "Subtotal:";
    public static String VAT_HEADER = "Vat:";
    
   
        public int id;
        public String name;
        public int price;
        public double total;
        public int quantity;
        
        public String location;
        public double subtotal;
        public int vat;
        
        public Product(int ID,String NAME,int PRICE,double TOTAL,int QUANTITY,String LOCATION,int VAT,double SUBTOTAL){
            this.id = ID;
            this.name = NAME;
            this.price = PRICE;
            this.total = TOTAL;
            this.quantity = QUANTITY;
            
            this.location = LOCATION;
            this.vat = VAT;
            this.subtotal = SUBTOTAL;
            
                               
        }
        public Product(){

            this.name = null;
            this.price = 0;
            this.id = 0;
            this.total = 0.0;
            this.quantity = 0;
            this.location = null;
            this.vat = 0;
            this.subtotal = 0.0;
            //this.currency = 0;
                               
        }
            public String getName() {
                return name;
            }
            public String getLocation() {
                return location;
            }
       
            public int getPrice() {
                return price;
            }
            public int getId() {
                return id;
            }
            public double getTotal() {
                return total;
            }
            public double getSubTotal() {
                return subtotal;
            }
            public int getVat() {
                return vat;
            }
            public int getQuantity() {
                return quantity;
            }
             public void setName(String Name) {
                    this.name = Name;
            }
            public void setVat(int Vat) {
                    this.vat = Vat;
            }
             public void setLocation(String Location) {
                    this.location = Location;
            }
             public void setPrice(int Price) {
                    this.price = Price;
            }
             public void setId(int id) {
                    this.id = id;
            }
             public void setTotal(double total) {
                    this.total = total;
            }
            public void setQuantity(int Quantity) {
                    this.quantity = Quantity;
            }
            public void setSubTotal(double Subtotal) {
                    this.subtotal = Subtotal;
            }

            
        
    
    
    
}
