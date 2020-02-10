package taller3_1;

import java.util.Scanner;

public class Taller3_1 {

    public static void main(String[] args) {

        Scanner tx = new Scanner(System.in);
        Invoice_1 invoice = new Invoice_1();
        InvoiceTest invoiTest = new InvoiceTest();
        PerfomanceCars_2 eje2 = new PerfomanceCars_2();
        NominaEmpresa_3 eje3_1 = new NominaEmpresa_3();
        NominaEmpresa_3 eje3_2 = new NominaEmpresa_3();
        NominaEmpresa_3 eje3_3 = new NominaEmpresa_3();
        TrianguloRec_4 eje_4= new TrianguloRec_4();
        Dibujar_5 eje_5 = new Dibujar_5();
        TablaMultiplicar_6 eje_6= new TablaMultiplicar_6();
        
        int num=0;
       do{
           
        System.out.println("1. VENTA");
        System.out.println("2. MILLAS POR GALON");
        System.out.println("3. SUELDO BRUTO");
        System.out.println("4. TRIANGULO");
        System.out.println("5. ESTRELLAS");
        System.out.println("6. TABLAS DE MULTIPLICAR");
        
        
        System.out.println("Ingrese numero del ejercicio: ");
        num = tx.nextInt();
        
           switch(num){
           
            case 1:
                  System.out.println("Ejercicio numero 1 seleccionado");
                  invoiTest.invoiceTest1();
                  invoice.preguntar();
                  System.out.println("********************************");
                  System.out.println("");
            break;
            case 2:
                  System.out.println("Ejercicio numero 2 seleccionado"); 
                  int result[] = eje2.preguntar();
                  double res=eje2.execute(result[0],result[1]);
                  System.out.println(eje2.getGal()+" Gallons in "+eje2.getMilage()+" Millas, you have an overage miles/gallons:  "+res);
                  System.out.println("********************************");
                  System.out.println("");
            break; 
            case 3:
                eje3_1.informacion();
                eje3_2.informacion();
                eje3_3.informacion();
                      
                eje3_1.calcularNomina();
                eje3_2.calcularNomina();
                eje3_3.calcularNomina();
                  
                  System.out.println("********************************");
                  System.out.println("");
            break;
            case 4:
                System.out.println("Ingrese 1 numero: ");
                int num1=tx.nextInt();
                System.out.println("Ingrese 2 numero: ");
                int num2=tx.nextInt();
                System.out.println("Ingrese 3 numero: ");
                int num3=tx.nextInt();
                eje_4.TrianguloRec_4(num1, num2, num3);
                eje_4.ejecutar();
                
                  System.out.println("********************************");
                  System.out.println("");
            break;
                
            case 5:
                eje_5.ejecutar();
            break;
            
            case 6:
                eje_6.ejecutar();
            break;
            default:   
                System.out.println("OPCION INCORRECTA, VUELVA A INTENTARLO");
            break;
           }
       
       }while(num<=6);
        
    }
    
    }
    

