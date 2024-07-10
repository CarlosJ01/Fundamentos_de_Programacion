package ciclos_20;
import java.util.Scanner;
public class Ciclos_20 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String x;
        int p,nd,i,dig,num,sd=0;
        double numCap;
        System.out.print("Dame un numero entero: ");
        x=leer.nextLine();
        System.out.print("Dame una potencia: ");
        p=leer.nextInt();
        nd=x.length();
        num=Integer.parseInt(x);
        for(i=1;i<=nd;i++){
            dig=num%10;
            sd=sd+dig;
            num=num/10;
        }
        numCap=Math.pow(sd,p);
        if(numCap == Integer.parseInt(x)){
            System.out.println("El numero " + x + " es caprichoso en la potencia " + p);
        }
        else{
            System.out.println("EL NUMERO NO ES CAPRICHOSO");
        }
    }  
}