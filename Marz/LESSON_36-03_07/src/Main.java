public class Main {
    public static void main(String[] args) {

        Wine myWine1 = new Wine ();
        myWine1.name = "vino";
        myWine1.sort = "kaberne";
        myWine1.year = 1994;

        Wine myWine2 = new Wine ();
        myWine2.name = "vino2";
        myWine2.sort = "kaberne12";
        myWine2.year = 1997;

        Wine myWine3 = new Wine ();
        myWine3.name = "vino3";
        myWine3.sort = "kaberne13";
        myWine3.year = 1996;

        System.out.println(myWine1.name);
        System.out.println(myWine2.name);
        System.out.println(myWine3.name);

        System.out.println(myWine1.sort);
        System.out.println(myWine2.sort);
        System.out.println(myWine3.sort);

        System.out.println(myWine1.year);
        System.out.println(myWine2.year);
        System.out.println(myWine3.year);



    }

}