package cadenas_13;
import java.util.Scanner;
public class Cadenas_13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cad,num,res;
        int n1=1,n2=1,d1=1,d2=1,nd,i,n,nr=1,dr=1,men,mcd,ent;
        char dig,ope;
        boolean indNum;
        do{
            mcd=1;
            indNum=false;
            n=0;
            num="";
            ope=' ';
            System.out.print("Dame una operacion de fracciones (+,-,*,/) : ");
            cad=leer.nextLine();
            cad=cad.trim();
            nd=cad.length();
            if(!(cad.equals("//"))){
                for (i=0;i<nd;i++){
                    dig=cad.charAt(i);
                    switch(dig){
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':   num=num.concat(String.valueOf(dig));
                                    indNum=false;
                            break;
                        case '+':
                        case '-':
                        case '*':   ope=dig;
                                    indNum=true;
                            break;
                        case '/':   indNum=true;
                            break;
                    }
                    if(indNum==true){
                        n++;
                        if(n==1){
                            n1=Integer.parseInt(num);
                            num="";
                        }
                        if(n==2){
                            d1=Integer.parseInt(num);
                            num="";
                        }
                        if(n==3){
                            n2=Integer.parseInt(num);
                            num="";
                        }
                        indNum=false;
                    }
                }
                if(indNum==false){
                    d2=Integer.parseInt(num);
                }
                if(ope==' '){
                    ope='/';
                }
                switch(ope){
                    case'+':    nr=(n1*d2)+(d1*n2);
                                dr=d1*d2;
                        break;
                    case'-':    nr=(n1*d2)-(d1*n2);
                                dr=d1*d2;
                        break;
                    case'*':    nr=n1*n2;
                                dr=d1*d2;
                        break;
                    case'/':    nr=n1*d2;
                                dr=d1*n2;
                        break;
                }
                men=Math.min(nr,dr);
                if(men<0){
                    men=men*-1;
                }
                for (i=1;i<=men;i++){
                    if(nr%i==0 && dr%i==0){
                        mcd=i;
                    }
                }
                nr=nr/mcd;
                dr=dr/mcd;
                if (nr/dr != 0){
                    ent=nr/dr;
                    nr=nr%dr;
                    if(nr==0){
                        res=cad.concat(" = ");
                        res=res.concat(String.valueOf(ent));
                    }
                    else{
                        res=cad.concat(" = ");
                        res=res.concat(String.valueOf(ent)).concat(" ").concat(String.valueOf(nr)).concat("/").concat(String.valueOf(dr));
                    }
                }
                else{
                    if(nr==0){
                        res=cad.concat(" = ");
                        res=res.concat("0");
                    }
                    else{
                        res=cad.concat(" = ");
                        res=res.concat(String.valueOf(nr)).concat("/").concat(String.valueOf(dr));
                    }
                }
                System.out.print("Resultado: " + res);
                System.out.println("\n");
            }
        }while(!(cad.equals("//")));
    }
}