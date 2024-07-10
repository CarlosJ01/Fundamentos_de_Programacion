package ciclos_03;
import java.util.Scanner;
public class Ciclos_03 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n,l,d,y,c=1;
        double x;
        String num;
        System.out.print("Dame un numero: ");
        num=leer.nextLine();
        l=num.length();
        n=Integer.parseInt(num);
        x=Math.pow(10,(l-1));
        y=(int)x;
        do{
        d=n/y;
        if(c==l)
            System.out.println(d);
        else
            System.out.print(d+",");
        n=n%y;
        y=y/10;
        c++;
    }
        while(c<=l);
        System.out.println("");
    }
}