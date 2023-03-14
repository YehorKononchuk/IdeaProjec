package Lektion;

public class Main {
    public static void main(String[] args) {

        System.out.println("Работник и зарплата.");
        // Нужно иметь "систему", в которой есть "Сотрудники", их "Зарплаты" и надо
        // уметь отправлять им письма по e-mail с информацией об их зарплате


        // Так создать экземаляр нельзя
        /*Lektion.Employee emp1 = new Lektion.Employee("Конончук","yehorkononchuk14@gmail.coom","0001");
        emp1.mailPaySlip();

         */

        Salary s1 = new Salary("Конончук ","yehorkononchuk14@gmail.coom",001,60000);
        s1.mailPaySlip();
        System.out.println();
        Salary s2 = new Salary("Конончук ","yehorkononchuk14@gmail.coom",001,60000);
        s2.mailPaySlip();
        System.out.println();

        s2.setSalary(98765);
        s2.mailPaySlip();









    }
}