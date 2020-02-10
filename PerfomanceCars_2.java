package taller3_1;

import java.util.Scanner;

public class PerfomanceCars_2 {
    
Scanner tx = new Scanner(System.in);
private int milage=0;
private int gal=0;
    
    public PerfomanceCars_2(){
    }
    public PerfomanceCars_2(int milageP, int galP){
        this.gal=gal+galP;
        this.milage=milage+milageP;
        
    } 
    
    public double execute(int milageP,int galP ){
        this.gal=gal+galP;
        this.milage=milage+milageP;
        double res=(milage/gal);
        return res;
    }
    
    public int getMilage(){
    return milage;
    }
    public int getGal(){
    return gal;
    }
    
    public int[] preguntar(){
    
    int s=1;
    
    
        do{
            
            System.out.println("Milage: ");
            int milage1=tx.nextInt();
            System.out.println("Gallons used: ");
            int gal1=tx.nextInt();
            
            /*PerfomanceCars(milage1, gal1);*/
            System.out.println("");
            System.out.println("0. for quitting adding  1. More trips");
            s=tx.nextInt();
            return  new int[]{milage1, gal1}; 
            
        } while(s==1);
    
    
    }

}
