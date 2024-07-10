package ciclos_06;
import java.util.Scanner;
public class Ciclos_06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n,nd,i,dig,sp=0,si=0;
        String num;
        System.out.print("Dame un numero: ");
        num=leer.nextLine();
        nd=num.length();
        n=Integer.parseInt(num);
        for(i=1;i<=nd;i++){
            dig=n%10;
            if((dig%2)==0){
                sp=sp+dig;
            }
            else{
                si=si+dig;
            }
            n=n/10;
        }
        if(sp==si){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    } 
}