package taller3_1;

public class Dibujar_5 {

    public void Dibujar_5()
    {
    }
    
    public void ejecutar(){
        for(int i=1; i<=8;i++){
                
            if(i%2==0){
                    for(int j=1;j<=8;j++){       
                    System.out.print("* ");
                    }
                    System.out.println("");
            } if(i%2==1){
                    System.out.print(" ");
                    for(int j=1;j<=8;j++){                   
                    System.out.print("* ");
                    }
                    System.out.println("");
            }
                
        }
    
    }
    
}
