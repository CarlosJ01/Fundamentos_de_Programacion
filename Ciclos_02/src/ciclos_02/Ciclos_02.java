package ciclos_02;
import java.util.Scanner;
public class Ciclos_02 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int L,N,C,D;
        String Num;
        System.out.print("Dame un numero: ");
        Num=leer.nextLine();
        L=Num.length();
        N=Integer.parseInt(Num);
        for(C=1;C<=L;C++){
            D=N%10;
            N=N/10;
            if(C==L)
                System.out.printf(D+"\n");
            else
            System.out.print(D+",");
        }
    } 
}