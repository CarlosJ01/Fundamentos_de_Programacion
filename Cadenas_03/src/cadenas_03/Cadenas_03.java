package cadenas_03;
import java.util.Scanner;
public class Cadenas_03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nom,fech,cad,rfc,dig;
        int i,cont,j;
        boolean ind,ind2=false;
        System.out.print("Dame el nombre completo: ");
        nom=leer.nextLine();
        System.out.print("Dame tu fecha de nacimiento: ");
        fech=leer.nextLine();
        nom=nom.trim();
        fech=fech.trim();
        for (i=0,cad="",cont=1,ind=false,rfc="";i<nom.length();i++) {
            if (nom.charAt(i)!=' ')
                cad=cad+nom.charAt(i);
            if ((nom.charAt(i)==' ' && !(cad.equalsIgnoreCase(""))) || i==nom.length()-1)
                ind=true;
            if (ind==true && cont==1) {
                rfc+=cad.charAt(0);
                for (j=1;ind2==false;j++) {
                    if (cad.charAt(j)=='a' || cad.charAt(j)=='e'|| cad.charAt(j)=='i'|| cad.charAt(j)=='o'|| cad.charAt(j)=='u'|| cad.charAt(j)=='A'|| cad.charAt(j)=='E'|| cad.charAt(j)=='I'|| cad.charAt(j)=='O'|| cad.charAt(j)=='U') {
                        rfc+=cad.charAt(j);
                        ind2=true;
                    }
                }
                cad="";
                ind=false;
                cont++;
            }
            if (ind==true && cont==2) {
                rfc+=cad.charAt(0);
                cad="";
                ind=false;
                cont++;
            }
            if (ind==true && cont==3) {
                rfc+=cad.charAt(0);
                cad="";
                ind=false;
                cont++;
            }
        }
        rfc+="-";
        for (i=fech.length()-1,dig="";i>=0;i--) {
            if (fech.charAt(i)!='/') {
                dig+=fech.charAt(i);
            }
            if (fech.charAt(i)=='/' || i==0) {
                StringBuilder inv = new StringBuilder(dig);
                dig=inv.reverse().toString();
                rfc=rfc+dig;
                dig="";
            }
        }
        System.out.print("Su RFC es: "+rfc.toUpperCase()+"\n");
    }
}