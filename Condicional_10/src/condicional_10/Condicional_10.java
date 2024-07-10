package condicional_10;
import java.util.Scanner;
public class Condicional_10 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int l;
        float c,le;
        System.out.print("Dame los litros de agua gastados: ");
        l=leer.nextInt();
        if(l<=50){
            c=60;
        }
        else{
            if(l>50 && l<=200){
               le=(l-50)*(0.5f);
               c=60+le;
            }
            else{
               le=(l-200)*0.8f;
               c=60+75+le;
            }
        }
        System.out.println("");
        System.out.println("El cobro por el agua es: "+c);
    }
}