public class Main {
    public static void main(String[] args) {
        System.out.println("Класс Телефон практикум");



       /* Phone myPhone1 = new Phone();

        myPhone1.phoneNumber = " +4915202362206";
        myPhone1.brand = "Samsung";
        myPhone1.model = " A 75";

        Phone myPhone2= new Phone();

        myPhone2.phoneNumber = " +4915202362210";
        myPhone2.brand = "Samsung";
        myPhone2.model = " A 53";

        Phone myPhone3= new Phone();

        myPhone3.phoneNumber = " +4915202362215";
        myPhone3.brand = "Samsung";
        myPhone3.model = " A 55";



        System.out.println(myPhone1.toString());
        System.out.println(myPhone2.toString());
        System.out.println(myPhone3.toString());

        myPhone1.receiveCall("Kent");

        System.out.println("Phone 1: "+myPhone1.getPhoneNumber());
        System.out.println("Phone 2: "+myPhone2.getPhoneNumber());
        System.out.println("Phone 3: "+myPhone3.getPhoneNumber());

        */


        Phone phone1 = new Phone
                ( "+4915202362206", "Samsung", "A 55");
        Phone phone2 = new Phone
                ( "+4915202362210", "Samsung", "A 53");
        Phone phone3 = new Phone
                ( "+4915202362215", "Samsung", "A 52");

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);








    }


}