package condicional_26;
import java.util.Scanner;
public class Condicional_26 {
    public static void main(String[] args) {
        int comA,comB,comC,silCom;
        float pagA,pagB,pagC,pagTot;
        Scanner leer = new Scanner(System.in);
        System.out.print("Cuantas sillas compradas son del tipo A: ");
        comA=leer.nextInt();
        System.out.print("Cuantas sillas compradas son del tipo B: ");
        comB=leer.nextInt();
        System.out.print("Cuantas sillas compradas son del tipo C: ");
        comC=leer.nextInt();
        System.out.println("____________________________________________________");
        if (comA/10>=1) {
            pagA=(float)((int)((comA/10)*10)*117.00);
            pagA=(float) (pagA*0.97);
            pagA+=(comA%10)*117.00;
        }
        else{
            pagA=(float)(comA*117.00);
        }
        if (comB/10>=1) {
            pagB=(float)((int)((comB/10)*10)*115.00);
            pagB=(float) (pagB*0.95);
            System.out.println(pagB);
            pagB+=(comB%10)*117.00;
        }
        else{
            pagB=(float)(comB*117.00);
        }
        if (comC/10>=1) {
            pagC=(float)((int)((comC/10)*10)*117.00);
            pagC=(float) (pagC*0.93);
            pagC+=(comC%10)*117.00;
        }
        else{
            pagC=(float)(comC*117.00);
        }
        silCom=comA+comB+comC;
        pagTot=pagA+pagB+pagC;
        System.out.println("El numero de sillas compadas es: "+silCom);
        System.out.printf("El pago neto de las sillas A es: %4.2f $\n",pagA);
        System.out.printf("El pago neto de las sillas B es: %4.2f $\n",pagB);
        System.out.printf("El pago neto de las sillas C es: %4.2f $\n",pagC);
        System.out.printf("El pago total es: %4.2f $\n",pagTot);
    }
}