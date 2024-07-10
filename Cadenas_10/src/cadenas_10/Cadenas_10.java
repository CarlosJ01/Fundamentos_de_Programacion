package cadenas_10;
import java.util.Scanner;
public class Cadenas_10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        byte opc;
        int cc,ce,cl,esp,car;
        String fig="";
        boolean ind=true;
        do{
            System.out.println("\n\t  MENU DE FIGURAS");
            System.out.println("\tNumero\t\tOpcion");
            System.out.println("\t  1)\tRombo");
            System.out.println("\t  2)\tTriangulo");
            System.out.println("\t  3)\tTriangulo Hacia Abajo");
            System.out.println("\t  4)\tTriangulo Hacia la Izquierda");
            System.out.println("\t  5)\tTriangulo Hacia la Derecha");
            System.out.println("\t  6)\tReloj de Arena");
            System.out.println("\t  7)\tFlecha");
            System.out.println("\t  8)\tSalir");
            System.out.print("\nSelecciona una opcion: ");
            opc=leer.nextByte();
            System.out.println("");
            switch(opc){
        case 1://---------------------------------------------------------------
        for(cl=1,esp=4,car=1;cl<=5;cl++,esp-=1,car+=2){
            for(ce=1;ce<=esp;ce++){
                fig=fig.concat("\t");
                }
            for(cc=1;cc<=car;cc++){
                fig=fig.concat("*\t");
            }
            fig=fig.concat("\n");
        }
        for(cl=1,esp=1,car=7;cl<=4;cl++,esp+=1,car-=2){
            for(ce=1;ce<=esp;ce++){
                fig=fig.concat("\t");
            }
            for(cc=1;cc<=car;cc++){
                fig=fig.concat("*\t");
            }
            fig=fig.concat("\n");
        }
        break;
        case 2://---------------------------------------------------------------
        for(cl=1,esp=4,car=1;cl<=5;cl++,esp-=1,car+=2){
            for(ce=1;ce<=esp;ce++){
                fig=fig.concat("\t");
            }
            for(cc=1;cc<=car;cc++){
                fig=fig.concat("*\t");
            }
            fig=fig.concat("\n");
        }
        break;
        case 3://---------------------------------------------------------------
        for(cl=1,esp=0,car=9;cl<=5;cl++,esp+=1,car-=2){
            for(ce=1;ce<=esp;ce++){
                fig=fig.concat("\t");
            }
            for(cc=1;cc<=car;cc++){
               fig=fig.concat("*\t");
            }
            fig=fig.concat("\n");
        }
        break;
        case 4://--------------------------------------------------------------- 
        for(cl=1,esp=4,car=1;cl<=5;cl++,esp-=1,car+=1){
            for(ce=1;ce<=esp;ce++){
                fig=fig.concat("\t");
            }
            for(cc=1;cc<=car;cc++){
                fig=fig.concat("*\t");
            }
            fig=fig.concat("\n");     
        }
        for(cl=1,esp=1,car=4;cl<=4;cl++,esp+=1,car-=1){
            for(ce=1;ce<=esp;ce++){
                fig=fig.concat("\t");
            }
            for(cc=1;cc<=car;cc++){
                fig=fig.concat("*\t");
            }
            fig=fig.concat("\n");
        }
        break;
        case 5://--------------------------------------------------------------- 
        for(cl=1,car=1;cl<=5;cl++,car+=1){
            for(cc=1;cc<=car;cc++){
                fig=fig.concat("*\t");
            }
            fig=fig.concat("\n");
            }
        for(cl=1,car=4;cl<=4;cl++,car-=1){
            for(cc=1;cc<=car;cc++){
                fig=fig.concat("*\t");
            }
            fig=fig.concat("\n");
        }
        break;
        case 6://---------------------------------------------------------------
        for(cl=1,esp=0,car=7;cl<=4;cl++,esp+=1,car-=2){
            for(ce=1;ce<=esp;ce++){
                fig=fig.concat("\t");
            }
            for(cc=1;cc<=car;cc++){
                fig=fig.concat("*\t");
            }
            fig=fig.concat("\n");
        }
        for(cl=1,esp=2,car=3;cl<=3;cl++,esp-=1,car+=2){
            for(ce=1;ce<=esp;ce++){
                fig=fig.concat("\t");
            }
            for(cc=1;cc<=car;cc++){
                fig=fig.concat("*\t");
            }
            fig=fig.concat("\n");
        }
        break;
        case 7://--------------------------------------------------------------- 
        for(cl=1,esp=0,car=8;cl<=6;cl++,esp+=2){
            for(ce=1;ce<=esp;ce++){
                fig=fig.concat("\t");
            }
            for(cc=1;cc<=car;cc++){
                fig=fig.concat("*\t");
            }
            fig=fig.concat("\n");
        }
        for(cl=1,esp=8,car=8;cl<=5;cl++,esp-=2){
            for(ce=1;ce<=esp;ce++){
                fig=fig.concat("\t");
            }
            for(cc=1;cc<=car;cc++){
                fig=fig.concat("*\t");
            }
            fig=fig.concat("\n");
            }
        break;
        case 8://---------------------------------------------------------------
            ind=false;
        break;
        }
        System.out.println(fig);
        fig="";
        }while(ind==true);
    }
}