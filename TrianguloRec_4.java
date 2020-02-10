package taller3_1;

public class TrianguloRec_4 {
private int ca;
private int cb;
private int cc;
        
    
        public void TrianguloRec_4(){
        }
        
        public void TrianguloRec_4(int a, int b, int c){
            this.ca=a;
            this.cb=b;
            this.cc=c;
        }
        
        public void ejecutar(){
            
                int hipo=0;
                int cate1=0;
                int cate2=0;
            System.out.println("holoi");
           //Probando que exista hipotenusa
           if((ca > cb && ca > cc)){
                hipo=ca;
                cate1=cc;
                cate2=cb;
                System.out.println("1");
           } else if(cb>ca && cb>cc){
               hipo=cb;
               cate1=cc;
               cate2=ca;
               System.out.println("2");
           }else if(cc>ca && cc>cb){
               hipo=cc;
               cate1=ca;
               cate2=cb;
               System.out.println("3");
           }else{
               System.out.println("No existe Hipotenusa. No es un triangulo rectangulo");
               hipo=0;   
           }
           //Probando que la hipotenusa al cuadrado sea la suma de los catetos al cuadrado
            if( (hipo*hipo) == (cate1*cate1 + cate2*cate2)){
            System.out.println("Los valores ingresados pertenecen a los lados de un triangulo rectangulo");
            } else{
                System.out.println("No es un triangulo rectangulo porque no cumple la ley de Pitagoras");
            }
           
           
        }
        
}
    
