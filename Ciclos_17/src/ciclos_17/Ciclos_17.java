package ciclos_17;
import java.io.IOException;
import java.util.Scanner;
public class Ciclos_17 {
    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in);
        byte opc;
        int cc,ce,cl,esp,car;
        char c;
        boolean ind=true;
        System.out.print("Con que caracter quieres iniciar: ");
        c=(char)System.in.read();
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
            System.out.println("\t  8)\tCambiar de caracter");
            System.out.println("\t  9)\tSalir");
            System.out.print("\nSelecciona una opcion: ");
            opc=leer.nextByte();
            System.out.println("");
            switch(opc){
                case 1: for(cl=1,esp=4,car=1;cl<=5;cl++,esp-=1,car+=2){
                            for(ce=1;ce<=esp;ce++){
                                System.out.print("\t");
                            }
                            for(cc=1;cc<=car;cc++){
                                System.out.print(c+"\t");
                            }
                            System.out.println("\n");
                        }
                        for(cl=1,esp=1,car=7;cl<=4;cl++,esp+=1,car-=2){
                            for(ce=1;ce<=esp;ce++){
                                System.out.print("\t");
                            }
                            for(cc=1;cc<=car;cc++){
                                System.out.print(c+"\t");
                            }
                            System.out.println("\n");
                        }
                    break;
                case 2: for(cl=1,esp=4,car=1;cl<=5;cl++,esp-=1,car+=2){
                            for(ce=1;ce<=esp;ce++){
                                System.out.print("\t");
                            }
                            for(cc=1;cc<=car;cc++){
                                System.out.print(c+"\t");
                            }
                            System.out.println("\n");
                        } 
                    break;
                case 3: for(cl=1,esp=0,car=9;cl<=5;cl++,esp+=1,car-=2){
                            for(ce=1;ce<=esp;ce++){
                                System.out.print("\t");
                            }
                            for(cc=1;cc<=car;cc++){
                                System.out.print(c+"\t");
                            }
                            System.out.println("\n");
                        }
                    break;
                case 4: for(cl=1,esp=4,car=1;cl<=5;cl++,esp-=1,car+=1){
                            for(ce=1;ce<=esp;ce++){
                                System.out.print("\t");
                            }
                            for(cc=1;cc<=car;cc++){
                                System.out.print(c+"\t");
                            }
                            System.out.println("\n");        
                        }
                        for(cl=1,esp=1,car=4;cl<=4;cl++,esp+=1,car-=1){
                            for(ce=1;ce<=esp;ce++){
                                System.out.print("\t");
                            }
                            for(cc=1;cc<=car;cc++){
                                System.out.print(c+"\t");
                            }
                            System.out.println("\n");
                        }
                    break;
                case 5: for(cl=1,car=1;cl<=5;cl++,car+=1){
                            for(cc=1;cc<=car;cc++){
                                System.out.print(c+"\t");
                            }
                            System.out.println("\n");
                            }
                        for(cl=1,car=4;cl<=4;cl++,car-=1){
                            for(cc=1;cc<=car;cc++){
                                System.out.print(c+"\t");
                            }
                            System.out.println("\n");
                        }
                    break;
                case 6: for(cl=1,esp=0,car=7;cl<=4;cl++,esp+=1,car-=2){
                            for(ce=1;ce<=esp;ce++){
                                System.out.print("\t");
                            }
                            for(cc=1;cc<=car;cc++){
                                System.out.print(c+"\t");
                            }
                            System.out.println("\n");
                        }
                        for(cl=1,esp=2,car=3;cl<=3;cl++,esp-=1,car+=2){
                            for(ce=1;ce<=esp;ce++){
                                System.out.print("\t");
                            }
                            for(cc=1;cc<=car;cc++){
                                System.out.print(c+"\t");
                            }
                            System.out.println("\n");
                        }
                    break;
                case 7: for(cl=1,esp=0,car=8;cl<=6;cl++,esp+=2){
                            for(ce=1;ce<=esp;ce++){
                                System.out.print("\t");
                            }
                            for(cc=1;cc<=car;cc++){
                                System.out.print(c+"\t");
                            }
                            System.out.println("\n");
                        }
                        for(cl=1,esp=8,car=8;cl<=5;cl++,esp-=2){
                            for(ce=1;ce<=esp;ce++){
                                System.out.print("\t");
                            }
                            for(cc=1;cc<=car;cc++){
                                System.out.print(c+"\t");
                            }
                            System.out.println("\n");
                        }
                    break;
                case 8: System.out.print("Por cual caracter lo quieres cambiar: ");
                        c=(char)System.in.read();
                    break;
                case 9: ind=false;
                    break;
                default:System.out.println("\t\tOPCION NO VALIDA");
                        System.out.println("\t\tSELECCIONA OTRA OPCION");
                    break;
                         
            }
            System.out.println("______________________________________________________________________________________");
        }while(ind==true);
    }
}