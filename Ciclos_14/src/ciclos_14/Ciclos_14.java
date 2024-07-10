package ciclos_14;
import java.util.Scanner;
public class Ciclos_14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,m,dig,may,men,nd,num1,i,sp,si;
        String num2;
        System.out.println("Dame los numeros de un rango");
        System.out.print("Dame el 1° Numero: ");
        n=leer.nextInt();
        System.out.print("Dame el 2° Numero: ");
        m=leer.nextInt();
        System.out.println("");
        may=Math.max(n,m);
        men=Math.min(n,m);
        while(men<=may){
            num2=String.valueOf(men);
            nd=num2.length();
            num1=Integer.parseInt(num2);
            for(i=1,sp=0,si=0;i<=nd;i++){
                dig=num1%10;
                num1=num1/10;
                if(dig%2==0){
                    sp=sp+dig;
                }
                else{
                    si=si+dig;
                }
            }
            if(sp==si){
                System.out.println(num2);
            }
            men++;
        }
    } 
}