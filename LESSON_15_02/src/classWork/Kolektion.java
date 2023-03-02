package classWork;
import java.util.ArrayList;
import java.util.Collections;

public class Kolektion {
    public static void main(String[] args) {

        ArrayList<String> brandlist = new ArrayList<>();

        // Dannie lista
        brandlist.add("BMW");
        brandlist.add("Mercedes");
        brandlist.add("vw");
        brandlist.add("Ford");
        brandlist.add("Fiat");
        brandlist.add("Opel");
        System.out.println(brandlist);

        //Razmer Lista
        int size = brandlist.size();
        System.out.println("Size brand list: "+size);

        // Nomer pozii v spiske
        int index = brandlist.indexOf("Fiat");
        System.out.println("Number "+" Fiat"+" in the list: "+index);

        // Ydalenie iz spiska
        brandlist.remove(4);
        System.out.println(brandlist);// pechat' posle ydalenia

        // Proverka na nalichie
        boolean brandPresent = brandlist.contains("Opel");
        System.out.println(brandPresent);

        // dobavit kotorogo net
        if (brandlist.contains("Opel")==false){
            brandlist.add("Opel");
        }
        System.out.println(brandlist);

        // dobavit kotorogo net
        if (brandlist.contains("Audi")==false) {
            brandlist.add("Audi");
        }
        System.out.println(brandlist);

        // pechat' s indeksami
        for (int i = 0; i < brandlist.size(); i++) {
            System.out.print(i +" "+brandlist.get(i)+" | ");

        }
        System.out.println();

        // Sortirovka
        Collections.sort(brandlist); // algoritm sortirovki

        System.out.print(brandlist);
        System.out.println();
        for (int i = 0; i < brandlist.size(); i++) {
            System.out.print(i + " " + brandlist.get(i) + " | ");
        }

















    }
}