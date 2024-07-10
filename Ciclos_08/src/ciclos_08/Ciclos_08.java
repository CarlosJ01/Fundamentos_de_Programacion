package ciclos_08;
import java.util.Scanner;
public class Ciclos_08 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N,M,coc,res;
        System.out.print("Dame un numero: ");
        N=leer.nextInt();
        System.out.print("Dame otro numero: ");
        M=leer.nextInt();
        res=N;
        if(M!=0){
            for(coc=0;res>=M;coc++){
                res=res-M;
            }
            System.out.println("El cociente de dividir "+N+" / "+M+" es: "+coc+" y Su residuo es: "+res );
        }
        else{
            System.out.println("Error: No es posible la division entre 0");
        }
    }
}