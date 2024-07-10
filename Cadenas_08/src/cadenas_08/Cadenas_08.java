package cadenas_08;
import java.util.Scanner;
public class Cadenas_08 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cad1,cad2,ccad1="",ccad2="";
        int r,i1,i2;
        char car1,car2;
        boolean ind=true;
        do{
            System.out.print("Ingrese la 1° cadena: ");
            cad1=leer.nextLine();
            System.out.print("Ingrese la 2° cadena: ");
            cad2=leer.nextLine();
            r=cad1.indexOf(cad2);
            if(r!=-1){
                for(i1=r,i2=0;ind==true;i1++,i2++){
                    if(i1<=(cad1.length()-1) && i2<=(cad2.length()-1)){
                        car1=cad1.charAt(i1);
                        ccad1=ccad1+String.valueOf(car1);
                        car2=cad2.charAt(i2);
                        ccad2=ccad2+String.valueOf(car2);
                        if(car1!=car2){
                            ind=false;
                        }
                    }
                    else{
                        ind=false;
                    }
                }
            }
            if(!(cad1.equalsIgnoreCase("ADIOS")) && !(cad2.equalsIgnoreCase("ADIOS"))){
                if(ccad1.equals(ccad2) && ind==false){
                    System.out.println("La cadena "+cad2+" SI esta contenida en la primera cadena");
                }
                else{
                    System.out.println("La cadena "+cad2+" NO esta contenida en la primera cadena");
                }
            }
            ccad1="";
            ccad2="";
            System.out.println("");
        }while(!(cad1.equalsIgnoreCase("ADIOS")) && !(cad2.equalsIgnoreCase("ADIOS")));
    }
}