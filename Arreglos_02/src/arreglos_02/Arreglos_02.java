package arreglos_02;
public class Arreglos_02 {
    public static void main(String[] args) {
        char fig1[][]=new char[9][9];
        char fig2[][]=new char[5][9];
        char fig3[][]=new char[5][9];
        char fig4[][]=new char[9][5];
        char fig5[][]=new char[9][5];
        char fig6[][]=new char[7][7];
        char fig7[][]=new char[11][18];
        int fil,col,esp,ast,ce,ca;
        //Figura 1
        System.out.println("Figura 1");
        for (fil=0,esp=4,ast=1;fil<fig1.length/2+1;fil++,esp--,ast+=2) {
            for (col=0,ce=1;ce<=esp;ce++,col++) {
                fig1[fil][col]='\t';
                System.out.print(fig1[fil][col]);
            }
            for (ca=1;ca<=ast;ca++,col++) {
                fig1[fil][col]='*';
                System.out.print(fig1[fil][col]+"\t");
            }
            System.out.println("");
        }
        for (esp=1,ast=7;fil<fig1.length;fil++,esp++,ast-=2) {
            for (col=0,ce=1;ce<=esp;ce++,col++) {
                fig1[fil][col]='\t';
                System.out.print(fig1[fil][col]);
            }
            for (ca=1;ca<=ast;ca++,col++) {
                fig1[fil][col]='*';
                System.out.print(fig1[fil][col]+"\t");
            }
            System.out.println("");
        }
        //Figura 2
        System.out.println("\n\nFigura 2");
        for (fil=0,esp=4,ast=1;fil<fig2.length;fil++,esp--,ast+=2) {
            for (col=0,ce=1;ce<=esp;ce++,col++) {
                fig2[fil][col]='\t';
                System.out.print(fig2[fil][col]);
            }
            for (ca=1;ca<=ast;ca++,col++) {
                fig2[fil][col]='*';
                System.out.print(fig2[fil][col]+"\t");
            }
            System.out.println("");
        }
        //Figura 3
        System.out.println("\n\nFigura 3");
        for (fil=0,esp=0,ast=9;fil<fig3.length;fil++,esp++,ast-=2) {
            for (col=0,ce=1;ce<=esp;ce++,col++) {
                fig3[fil][col]='\t';
                System.out.print(fig3[fil][col]);
            }
            for (ca=1;ca<=ast;ca++,col++) {
                fig3[fil][col]='*';
                System.out.print(fig3[fil][col]+"\t");
            }
            System.out.println("");
        }
        //Figura 4
        System.out.println("\n\nFigura 4");
        for (fil=0,esp=4,ast=1;fil<fig4.length/2+1;fil++,esp--,ast++) {
            for (col=0,ce=1;ce<=esp;ce++,col++) {
                fig4[fil][col]='\t';
                System.out.print(fig4[fil][col]);
            }
            for (ca=1;ca<=ast;ca++,col++) {
                fig4[fil][col]='*';
                System.out.print(fig4[fil][col]+"\t");
            }
            System.out.println("");
        }
        for (esp=1,ast=4;fil<fig4.length;fil++,esp++,ast--) {
            for (col=0,ce=1;ce<=esp;ce++,col++) {
                fig4[fil][col]='\t';
                System.out.print(fig4[fil][col]);
            }
            for (ca=1;ca<=ast;ca++,col++) {
                fig4[fil][col]='*';
                System.out.print(fig4[fil][col]+"\t");
            }
            System.out.println("");
        }
        //Figura 5
        System.out.println("\n\nFigura 5");
        for (fil=0,ast=1;fil<fig5.length/2+1;fil++,ast++) {
            for (ca=1,col=0;ca<=ast;ca++,col++) {
                fig5[fil][col]='*';
                System.out.print(fig5[fil][col]+"\t");
            }
            System.out.println("");
        }
        for (ast=4;fil<fig5.length;fil++,ast--) {
            for (ca=1,col=0;ca<=ast;ca++,col++) {
                fig5[fil][col]='*';
                System.out.print(fig5[fil][col]+"\t");
            }
            System.out.println("");
        }
        //Figura 6
        System.out.println("\n\nFigura 6");
        for (fil=0,esp=0,ast=7;fil<fig6.length/2+1;fil++,esp++,ast-=2) {
            for (col=0,ce=1;ce<=esp;ce++,col++) {
                fig6[fil][col]='\t';
                System.out.print(fig6[fil][col]);
            }
            for (ca=1;ca<=ast;ca++,col++) {
                fig6[fil][col]='*';
                System.out.print(fig6[fil][col]+"\t");
            }
            System.out.println("");
        }
        for (esp=2,ast=3;fil<fig6.length;fil++,esp--,ast+=2) {
            for (col=0,ce=1;ce<=esp;ce++,col++) {
                fig6[fil][col]='\t';
                System.out.print(fig6[fil][col]);
            }
            for (ca=1;ca<=ast;ca++,col++) {
                fig6[fil][col]='*';
                System.out.print(fig6[fil][col]+"\t");
            }
            System.out.println("");
        }
        //Figura 7
        System.out.println("\n\nFigura7");
        for (fil=0,esp=0,ast=8;fil<fig7.length/2+1;fil++,esp+=2) {
            for (col=0,ce=1;ce<=esp;ce++,col++) {
                fig7[fil][col]='\t';
                System.out.print(fig7[fil][col]);
            }
            for (ca=1;ca<=ast;ca++,col++) {
                fig7[fil][col]='*';
                System.out.print(fig7[fil][col]+"\t");
            }
            System.out.println("");
        }
        for (esp=8,ast=8;fil<fig7.length;fil++,esp-=2) {
            for (col=0,ce=1;ce<=esp;ce++,col++) {
                fig7[fil][col]='\t';
                System.out.print(fig7[fil][col]);
            }
            for (ca=1;ca<=ast;ca++,col++) {
                fig7[fil][col]='*';
                System.out.print(fig7[fil][col]+"\t");
            }
            System.out.println("");
        }
    }
}