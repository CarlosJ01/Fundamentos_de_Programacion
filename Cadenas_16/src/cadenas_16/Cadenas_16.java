package cadenas_16;
import java.util.Scanner;
public class Cadenas_16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cad,cadN,res,pal,palEli;
        boolean ind;
        int i,cp,nc,N;
        char car;
        do{
            pal="";
            cadN="";
            palEli="";
            System.out.print("Dame una cadena: ");
            cad=leer.nextLine();
            cad=cad.trim();
            nc=cad.length();
                for (i=0,cp=0,ind=false;i<nc;i++){
                    car=cad.charAt(i);
                    switch(car){
                        case ' ':   ind=true;
                            break;
                        default:    ind=false;
                            break;
                    }
                    if(ind==true && (cad.charAt(i-1))!=' '){
                        cp++;
                        ind=false;
                    }
                }
                if(ind==false && (cad.charAt(i-1)!=' ')){
                    cp++;
                }
                do{
                    N=(int)(Math.random()*(Math.pow(10,String.valueOf(cp).length())));
                }while(N>cp || N==0);
                for (i=0,cp=1,ind=false;i<nc;i++){
                    car=cad.charAt(i);
                    switch(car){
                        case ' ':   ind=true;
                            break;
                        default:    pal=pal.concat(String.valueOf(car));
                                    ind=false;
                            break;
                    }
                    if(ind==true && cp!=N && (cad.charAt(i-1))!=' '){
                        cadN=cadN.concat(pal+" ");
                        cp++;
                        ind=false;
                        pal="";
                    }
                    if(ind==true && cp==N && (cad.charAt(i-1))!=' '){
                        palEli=pal;
                        cp++;
                        ind=false;
                        pal="";
                    }
                }
                if(ind==false && cp!=N && (cad.charAt(i-1)!=' ')){
                    cadN=cadN.concat(pal);
                    cp++;
                }
                if(ind==false && cp==N && (cad.charAt(i-1)!=' ')){
                        palEli=pal;
                    }
                System.out.print("El numero aleatorio es: "+N+", la palabra eliminada es: "+palEli+", y La nueva cadena es: "+cadN.trim()+"\n");
                System.out.print("¿Deseas Continuar (Si/No)? : ");
                res=leer.nextLine();
                System.out.println("");
        }while (!(res.equalsIgnoreCase("No")));
    }
}