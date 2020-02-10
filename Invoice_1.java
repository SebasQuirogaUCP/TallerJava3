package taller3_1;

import java.util.Random;
import java.util.Scanner;

public class Invoice_1 {
Scanner tx = new Scanner(System.in);    
Random ran = new Random();
//InvoiceTest invoiceTest = new InvoiceTest();

private String partNum;
private String desc;
private int quantity;
private double price;
private double total;
    
    public void Invoice(){
    }
    
    public void Invoice(String partNum, String desc, int quantity, double price){
    
    this.partNum=partNum;
    this.desc=desc;
    this.quantity=quantity;
    this.price=price;
    }
    
    
    //SETTERS
    public void setPartNum(String partNum){
    this.partNum=partNum;
    }
    public void setDesc(String desc){
    this.desc=desc;
    }
    public void setQuantity(int q){
        if(q<0){
        this.quantity=0;
        }
        this.quantity=q;
    }
    
    public void setPrice(double price){
    
        if (0>price){
        this.price=0.0;
        }        
        this.price=price;
    }
   
    
    //GETTERS
    public String getPartNum(){
        return partNum;
    }
    
    public String getDesc(){
        return desc;
    }
    
    public int getQuantity(){
    return quantity;
    }
    
    public double getPrice(){
    return price;
    }
    
    public double getInvoceAmount(){
    total=quantity*price;
    return total;
    }
    
    public void preguntar(){
                  System.out.println("Reference Number: ");
                  setPartNum(tx.next());
                  
                  System.out.println("Quantity: ");
                  setQuantity(tx.nextInt());
                  
                  System.out.println("Price: ");
                  setPrice(tx.nextDouble());
                  
                  System.out.println("Product's Description: ");
                  setDesc(tx.next());
                  
                  System.out.println("Total: "+getInvoceAmount());
                  
    }
    

}
