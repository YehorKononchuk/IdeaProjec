public class Main {
    public static void main(String[] args) {
        // Задача 1. Создайте массив из всех нечётных чисел от 1 до 99,
        // выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку,
        // но в обратном порядке (99 97 95 93 … 7 5 3 1).

        // chto vvodim              vvoda net
        // chto na vchode           masiv i cikle
        // chto nychno sdelat'      vivesti na konsol resultat
        // kluchevoi algoritm       cikle "for" i zapolnenie masiva dannymi
        //                            vivod v kosol

        int[] mas = new int[50];
        for (int i = 0, n = 1; i < mas.length; n = n + 2, i++) {
            mas[i] = n; // yacheika massiva
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");       // vivod ot men#chego
        }
        // output
        //   1 3 5 7 9 11 13 15 17 19 21 23 25 27 29
        //   31 33 35 37 39 41 43 45 47 49 51 53 55 57 59
        //   61 63 65 67 69 71 73 75 77 79 81 83 85 87 89
        //   91 93 95 97 99



        System.out.println();// slychebnaia stroka

        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");     // vivod ot bolschego
        }
        // output
        // 99 97 95 93 91 89 87 85 83 81 79 77 75 73 71
        // 69 67 65 63 61 59 57 55 53 51 49 47 45 43 41
        // 39 37 35 33 31 29 27 25 23 21 19 17 15 13 11
        // 9 7 5 3 1


       System.out.println();

        System.out.println("_____________________________________________________________________________");


        // Задача 2. Запустить "Рулетку" 20 раз. В "Рулетке" на круге 36 ячеек,
        // куда может попасть шарик, и два цвета - красный, черный.
        // Результат попытки вывести так: "Выиграл номер NN, четное или нечетное, цвет"

        // chto vvodim          net vvoda
        // chto na vhode        36 yacheek, 2 cveta ,20 ras
        // chto sdelat          opredelit pobedniy nomer i pobedniy cvet i chetnost´
        // kluchevoi algoritm   sozdaem massiv ot 1 do 36 v slych por
        //                        cikle kotoriy ego zapolnit
        //                              cikle kotoriy otberet pobed znach (ruletka)
        //                                      vivod znacheniy


        int[] roullete = new int[36];

        for (int i = 0; i < roullete.length; i++) {
            roullete[i] = i + 1;
  //         System.out.print(roullete[i] + " | ");
        }
        System.out.println();

            for (int j = 0; j < 20; j++) {
               int result = (int) (Math.random()*(36-1+1)+1);

                // nechetnie chernie | chetnie krasnie
                String color;
                String isEven;
                if (result%2==0){
                    color = "red";
                    isEven = "Chetnoe";
                }else {
                    color = "black";
                    isEven = "NeChetnoe";
                }

                System.out.println(" | " + result+ " | "+ color+" | "+isEven);
            }

            // output
   /*     | 36 | red | Chetnoe
                | 3 | black | NeChetnoe
                | 28 | red | Chetnoe
                | 8 | red | Chetnoe
                | 15 | black | NeChetnoe
                | 35 | black | NeChetnoe
                | 36 | red | Chetnoe
                | 20 | red | Chetnoe
                | 31 | black | NeChetnoe
                | 12 | red | Chetnoe
                | 8 | red | Chetnoe
                | 14 | red | Chetnoe
                | 9 | black | NeChetnoe
                | 35 | black | NeChetnoe
                | 19 | black | NeChetnoe
                | 11 | black | NeChetnoe
                | 30 | red | Chetnoe
                | 31 | black | NeChetnoe
                | 8 | red | Chetnoe
                | 14 | red | Chetnoe

    */

            // Задача 4. Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
        // Первый и второй члены последовательности Фибоначчи равны единицам,
        // а каждый следующий — сумме двух предыдущих.

        int [] fibonacci = new int[20];

        for (int i = 0; i < fibonacci.length ; i++) {
            if (i==0){
                fibonacci[i]=1;
            } else if (i==1) {
                fibonacci[i]=1;
            }else {
                fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
            }

            System.out.print(" |"+fibonacci[i]+"| ");
        }

        // pout put
    //     |1|  |1|  |2|  |3|  |5|  |8|  |13|  |21|  |34|  |55|  |89|  |144|  |233|
        //     |377|  |610|  |987|  |1597|  |2584|  |4181|  |6765|







    }
    }
