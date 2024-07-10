package cadenas_04;
public class Cadenas_04 {
    public static void main(String[] args) {
        String plac="";
        char car=' ';
        int i,cp,x;
        boolean ind;
        System.out.println("10 NUMEROS DE PLACAS");
        for (cp=1;cp<=10;cp++,plac=""){
            for (i=1;i<=2;){
                x=(int)(Math.random()*100);
                car=(char)x;
                if((x>=65 && x<=90) && car!='A' && car!='E' && car!='I' && car!='O' && car!='U'){
                    plac=plac.concat(String.valueOf(car));
                    i++;
                }
            }
            for (i=1,ind=true;i<=2;){
                x=(int)(Math.random()*100);
                car=(char)x;
                if((x>=65 && x<=90) && (car=='A' || car=='E' || car=='I' || car=='O' || car=='U')){
                    if(ind==true){
                        plac=plac.concat(String.valueOf(car));
                        ind=false;
                    }
                    i++;
                }
            }
            plac=plac.concat("-");
            for (i=1;i<=3;){
                x=(int)(Math.random()*100);
                if(x>=0 && x<=9){
                    plac=plac.concat(String.valueOf(x));
                    i++;
                }
            }
            plac=plac.concat(String.valueOf("-"+car));
            System.out.println(cp+"\t"+plac);
        }
    }
}