package cadenas_02;
import java.util.Scanner;
public class Cadenas_02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String numBin;
        int p,numDec,numDig,i,dig;
        double x;
        boolean ind;
        do{
            System.out.print("Dame una cadena de ceros y unos: ");
            numBin=leer.nextLine();
            numDig=numBin.length();
            for (i=0,ind=true;i<numDig;i++) {
                dig=Integer.parseInt(String.valueOf(numBin.charAt(i)));
                switch(dig){
                    case 0:
                    case 1:
                        break;
                    default: ind=false;
                        break;
                }
            }
            if(ind==true && (!(numBin.equalsIgnoreCase("")))){
                for(i=numDig-1,p=0,numDec=0;i>=0;i--,p++){
                    dig=Integer.parseInt(String.valueOf(numBin.charAt(i)));
                    x=(dig)*(Math.pow(2,p));
                    numDec=numDec+((int)x);
                }
                System.out.println("La cadena "+numBin+" representa "+ numDec + " en Sistema Decimal");
                }
            if(ind==false && (!(numBin.equalsIgnoreCase("")))){
                System.out.println("ERROR: Se requiere una cadena con solo ceros y unos");
            }
            System.out.println("");
        }while(!(numBin.equalsIgnoreCase("")));
    }
}