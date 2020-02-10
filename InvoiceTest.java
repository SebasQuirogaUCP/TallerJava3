package taller3_1;

import java.util.Random;

public class InvoiceTest {
    
    
    public void InvoiceTest(){
    }
    
    
    public void invoiceTest1(){
        Invoice_1 invoi = new Invoice_1();
        Random ran = new Random();
    
        System.out.println("INVOICE TEST");
        System.out.println("RefereceNumber: ");
        int r = ran.nextInt();
        System.out.println(r);
        
        System.out.println("Quantity: ");
        int q1 = ran.nextInt(10);
        System.out.println(q1);
        
        System.out.println("Price: ");
        double priceT=ran.nextDouble();
        System.out.println(priceT);
        
        System.out.println("COMPUTING TOTAL PRICE: ");
        invoi.setPrice(priceT);
        invoi.setQuantity(q1);
        double res=invoi.getInvoceAmount();
        
        
        System.out.println("Total for " +q1+ " products  is: "+res);
        
    }
}
    
