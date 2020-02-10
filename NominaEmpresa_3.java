package taller3_1;

import java.util.Scanner;

public class NominaEmpresa_3 {
    
Scanner tx = new Scanner(System.in);
private String nom;
private int horas;
private double salarioHora;

    public void NominaEmpresa(){
    }
    
    public void NominaEmpresa(String nom, int horas, double salarioHoras){
    this.horas=horas;
    this.nom=nom;
    this.salarioHora=salarioHoras;
    }
    public void calcularNomina(){
    
    if(horas>40){
    double res=horas*((salarioHora/2)+salarioHora);
        System.out.println("Salario bruto: "+res);
    }
    else if(horas<40){
    double res=horas*salarioHora;
    System.out.println("Salario bruto: "+res);
    }
    else {
        System.out.println("Exception Catched");
            }
        
    
    }
    public void informacion(){
    
                  System.out.println("Ejercicio numero 3 seleccionado"); 
                  System.out.println("Ingrese nombre del operario");
                  this.nom=tx.next();
                  
                  System.out.println("Ingrese numero de horas trabajadas: ");
                  this.horas=tx.nextInt();
                  
                  System.out.println("Sueldo de operario por horas: ");
                  this.salarioHora=tx.nextDouble();
                  
                    
    }
    
    
    
    
    
    
}
