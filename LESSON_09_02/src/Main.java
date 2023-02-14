public class Main {
    public static void main(String[] args) {

        //zapolneniue massiva arefmeticheskoi progresieii


        int [] a = new int[10];
        for (int i = 0; i < a.length; i++ ){
            a[i] = 15 + 7*(i);
            System.out.print(a[i]+ " | ");
        }

        // Zapolnenie slychainimi chislami s kybika s 6 graniamy


            // chto vvodim              nichego
            // chto na vchode           est' datchik chisel
            // chto nychno sdelat'      obratitsia k datchiky 20 ras s zaprosom chisel ot 1 do 6
            // kluchevoi algoritm       cikl "for" i zapolniaem massiv resultatami broskov kybika


        System.out.println();
        System.out.println();


        int [] happines = new int[20];
        for (int i = 0; i < happines.length; i++) {
            happines[i]=(int) ((Math.random()*(6-1+1)+1));
            System.out.print(happines[i] + " | ");


        }

        System.out.println("__________________________________________________________________");
        System.out.println();

        int [] moneys = new int[20];
        for (int i = 0; i < moneys.length; i++) {
            moneys[i]=(int) ((Math.random()*(2-1+1)+1));
            System.out.print(moneys[i] + " | ");


        }






















    }
}