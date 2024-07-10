package ciclos_13;
public class Ciclos_13 {
    public static void main(String[] args) {
        int n3,i=1,nmay=60,nmen=500,c,cnmay,cnmen;
        double n1,n2;
        System.out.println("10 Numeros enteros aleatorios entre 60 y 500 \n");
        while(i<=10){
            n1=Math.random();
            n2=n1*1000;
            n3=(int)n2;
            if(n3>=60 && n3<=500){
                System.out.println(i+"\t"+n3);
                if(n3>=nmay){
                    nmay=n3;
                }
                if(n3<=nmen){
                    nmen=n3;
                }
                i++;
            }
        }
        System.out.println("");
        cnmay=nmay;
        cnmen=nmen;
        for(c=0;cnmay>=nmen;c++){
            cnmay=cnmay-cnmen;
        }
        System.out.println("El cociente de la divicion del mayor "+nmay+" entre el menor "+nmen+" es: "+c);
        System.out.println("El residuo de la divicion del mayor "+nmay+" entre el menor "+nmen+" es: "+cnmay);
        System.out.println("");   
    }
}