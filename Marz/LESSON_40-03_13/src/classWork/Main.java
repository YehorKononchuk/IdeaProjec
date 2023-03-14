package classWork;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {


        System.out.println("Человек и професии ");

        Human human = new Human("Victor","Victoria");
        Programmer programmer = new Programmer("Martin","Martina");
        Sportsmen sportsmen = new Sportsmen("Daniel","Daniella");
        Teacher teacher = new Teacher("Alex","Alexa");

        human.work();
        programmer.work();
        sportsmen.work();
        teacher.work();


        Human human1 = programmer;
        Human human2 = sportsmen;
        Human human3 = teacher;

        human1.work();
        human2.work();
        human3.work();



    }

}

