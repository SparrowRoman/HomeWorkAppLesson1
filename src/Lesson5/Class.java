package Lesson5;

public class Class {
    public static void main(String[] agrs) {

        Employee employee1 = new Employee("Bob", "manager", "bob@gmail.com", 88004440077L, 10000, 35);
        System.out.println(employee1.getName());
        System.out.println(employee1.getPost());
        System.out.println(employee1.getEmail());
        System.out.println(employee1.getPhoneNumber());
        System.out.println(employee1.getSalary());
        System.out.println(employee1.getAge());
        System.out.println("Сотруднику " + employee1.getPost() + "  " + employee1.getName() + "  выплатили премию в размере ЗП " + employee1.getSalary());

        Employee employee2 = new Employee("Alex", "сварщик", "alex@gmail.ru");
    employee2.setPost("Кабельщик ");
        System.out.println("Сотрудник " + employee2.getName() + " сменил профессию на " + employee2.getPost());
    }

}