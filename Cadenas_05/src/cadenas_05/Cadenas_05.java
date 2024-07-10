package cadenas_05;
public class Cadenas_05 {
    public static void main(String[] args) {
        String cad="";
        int i,N,c,x;
        char car;
        boolean ind1,indV,indC;
        for (i=1,ind1=true,indV=false,indC=false;i<=10;i++,ind1=true,indV=false,indC=false,cad=""){
            do{
                N=(int)(Math.random()*100);   
            }while(N<3 || N>12);
            for (c=1;c<=N;){
                x=(int)(Math.random()*100);
                car=(char)x;
                if(x>=65 && x<=90){
                    if((car!='A' && car!='E' && car!='I' && car!='O' && car!='U') && ind1==true){
                        cad=cad.concat(String.valueOf(car));
                        c++;
                        ind1=false;
                        indC=true;
                        indV=false;
                    }
                    if((car=='A' || car=='E' || car=='I' || car=='O' || car=='U') && indC==true){
                        cad=cad.concat(String.valueOf(car));
                        c++;
                        indV=true;
                        indC=false;
                    }
                    if((car!='A' && car!='E' && car!='I' && car!='O' && car!='U') && indV==true){
                        cad=cad.concat(String.valueOf(car));
                        c++;
                        indV=false;
                        indC=true;
                    }
                }
            }
            System.out.println(i+"\t"+cad);
        }
    }
}