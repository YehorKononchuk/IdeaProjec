package Voter;

import java.util.MissingFormatArgumentException;

public class Constructor {

    String name;

    String id_num;

    int age;

    @Override
    public String toString() {
        return "Constructor{" +
                "name='" + name + '\'' +
                ", id_num='" + id_num + '\'' +
                ", age=" + age +
                '}';
    }

    public Constructor(String name, String id_num, int age) {
        if (name.equals("")) {
            System.out.println("Имя не может быть пустым.");
        } else {
            this.name = name;
        }
        this.id_num = id_num;
        if (age > 16) {
            this.age = age;
            System.out.println("Сделай свой выбор");
        }
        else {
            System.out.println("Вы не достигли возраста ");
        }

    }
}


