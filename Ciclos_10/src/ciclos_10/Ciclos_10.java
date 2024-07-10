package ciclos_10;
import java.util.Scanner;
public class Ciclos_10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,x,y,z,i,s;
        String cad="";
        System.out.print("Cuantos numeros quieres ver: ");
        n=leer.nextInt();
        x=0;
        y=1;
        if(n>2){
            cad=(String.valueOf(x))+","+(String.valueOf(y));
            for(i=2;i!=n;i++){
                s=x+y;
                x=y;
                y=s;
                cad=cad+","+(String.valueOf(s));
            }
        }
        else{
            switch(n){
                case 0: cad="";
                    break;
                case 1: cad=String.valueOf(x);
                    break;
                case 2: cad=(String.valueOf(x))+","+(String.valueOf(y));
                    break;
            }
        }
        System.out.println("");
        System.out.println("La dadena es: \n"+cad+"\n");
    }
}