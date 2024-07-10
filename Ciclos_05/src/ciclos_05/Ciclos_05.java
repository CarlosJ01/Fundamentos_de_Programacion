package ciclos_05;
import java.util.Scanner;
public class Ciclos_05 {
    public static void main(String[] args) {
        int n1,n2,may,men,maxcd=0,mincd=0,c;
        Scanner leer = new Scanner(System.in);
        do{
        System.out.print("Dame un numero(Entero Poitivo): ");
        n1=leer.nextInt();   
        }while(n1<=0);        
        do{
        System.out.print("Dame otro numero(Entero Poitivo): ");
        n2=leer.nextInt();   
        }while(n2<=0);
        may=Math.max(n1,n2);
        men=Math.min(n1,n2);
        for(c=2;c<=may;c++){
            if((n1%c)==0 && (n2%c)==0){
                if(c>=maxcd)
                    maxcd=c;
                if(mincd==0)
                    mincd=maxcd;
                if(c<=mincd && c!=1){
                     mincd=c;      
                } 
            }
        }
        System.out.println("");
        if(maxcd==0 && mincd==0){
        System.out.println("No existe el Minimo Comun Divisor");
        System.out.println("No existe el Maximo Comun Divisor");
        }
        else{
        System.out.println("El Minimo Comun Divisor es: "+mincd);
        System.out.println("El Maximo Comun Divisor es: "+maxcd);   
        }
    }  
}