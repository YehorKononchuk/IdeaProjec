
public class consultation {
    public static void main(String[] args) {

int[] roullete = new int[36]; // Инициализируем массив на 36 значений

        for (int i = 0; i < roullete.length; i++) {   // в цикле for происходит заполнение массива значениями от 1 до 36.
        roullete[i] = i + 1;
  //                System.out.print(roullete[i] + " | "); // можем их напечатать
        }
        System.out.println();

        for (int j = 0; j < 20; j++) {
        int result = (int) (Math.random()*(36-1+1)+1); // происходит имитация 20 вращений рулетки
                int color1 = (int) (Math.random()*(1-0+1)+0);
        // nechetnie chernie | chetnie krasnie

        String color;
        String isEven;

        if (result%2==0){
        isEven = "Chetnoe";
        }else {
        isEven = "NeChetnoe";
        }
        if (color1 == 0) {
                color = "red";
        } else {
                color = "black";
        }
                System.out.println(" | " + result+ " | "+ color+" | "+isEven);

        }

        }
    }
