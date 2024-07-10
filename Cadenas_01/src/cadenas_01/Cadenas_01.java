package cadenas_01;
import java.util.Scanner;
public class Cadenas_01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,cnum,res;
        String bin="";
        do{
            do{
                System.out.print("Dame un numero entero: ");
                num=leer.nextInt();
            }while(num<0);
            cnum=num;
            while(cnum!=0){
                res=cnum%2;
                cnum/=2;
                bin=String.valueOf(res) + bin;
            }
        if(num!=0){
        System.out.println(num + " en binario es: " + bin + "\n");
        bin="";
        }
        }while(num!=0);
    }   
}