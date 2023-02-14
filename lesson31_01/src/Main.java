public class Main {
    public static void main(String[] args) {



        // nested if вложеный
        /*

        int num = 61;

        if(num<50) {
            System.out.println("number is less than 50 ");


            if (num > 10) {
                System.out.println("number is greater than 10 ");

            } else {
                System.out.println("number is less than 10");
            }
        } else {
            System.out.println("number is greater than 50 ");}

         */

        // if - else - if  лестница
        /*
           if (condition)
              statement;
           else if (condition)
              statement
           else if (condition)
              statement
              .
              .
              .
           else
              statement
         */

        /*

        int x=0;

        if (x==1){
            System.out.println("x is one ");
        }else if (x == 2) {
            System.out.println("x is two ");
        }else if (x == 3) {
            System.out.println("x is three ");
        }else if (x == 4) {
            System.out.println("x is four ");
        }
        else {
            System.out.println("x is not between 1 and 4 ");
        }
        System.out.println("Finish");

         */

        // тернарный оператор  Ternary operator
        /*
        variable = Condition ? Expression1 : Expression2
         */

        /*

        int age = 21;

             String isAdult;

        if (age>=18) {
            isAdult= "can vote";
        }
        else {
            isAdult="too young";
        }
        System.out.println("isAdult1 for classical if else: "+isAdult);


        String isAdultTernary = age>=18 ? "can vote":"too young";
        System.out.println("isAdultTernary: "+isAdultTernary);
*/
        /*
        String caseWord = "uppercase";
        String name = caseWord.equals("uppercase")?"EVGENY":"evgeny";
        System.out.println(name);

         */

        /*

        int value3 = -10;
        int abs = value3>=0? value3:-value3;
        System.out.println("abs value of "+value3+" is "+abs);

         */

        //vivesti na ekran kolichestvo chisel v chisle esli ix ne bol shetriox
        // 3 > "it is a one digit number"
        // 10 > "it is a Two digit number"
        // 368 > "it is a Three digit number"
        // 6785 > "it is a Four digit number"
        // esli bolche 4x vivesti nadpis " the number is too big for me"

        /*

        int x=-345;

        if (x>0&&x<10){
            System.out.println("it is a one digit number ");
        }else
            if (x>=10&&x<100){
            System.out.println("it is a Two digit number ");
        }else
            if (x>=100&&x<1000) {
            System.out.println("it is a Three digit number ");
        }else
            if (x>=1000&&x<10000) {
            System.out.println("it is a Four digit number ");
        }
        else {
            System.out.println("the number is not between 0 snd 9999");
        }
        */
        /*

        int num1=10,num2=30,num3=1;

        if(num1>=num2&&num1>=num3)
            System.out.println(num1+" is a largest number");
        else if (num2>=num1&&num2>=num3)
            System.out.println(num2+" is a largest number");
        else
            System.out.println(num3+" is a largest number");


        // nested if

        if (num1>=num2){
            if (num1>=num3){
                System.out.println(num1+ "is the largest");
            }
            else {
                System.out.println(num3+ "is the largest");
            }

        }
        else {
            if (num2>=num3){
                System.out.println(num2+" is the largest");
            } else {
                System.out.println(num3+ " is the largest");
            }
        }

         */

        int num =-1;

        if (num>0){
            System.out.println("number is positive ");
        }
        else if (num<0){
            System.out.println(" number is negative ");
        }
        else{
            System.out.println("number is zero");
        }

        int x=5,y=5,z=0;

        if(x==y && x==z){
            System.out.println("all numbers are equal");
        }
        else if ((x==y)||(x==z)||(z==y)){
            System.out.println("some numbers are equal");
        }
        else {
            System.out.println("All numbers are different ");
        }














    }
}