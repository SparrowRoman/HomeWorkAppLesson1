package Lesson5;

public class Employee {

    private String name;
    private String post;
    private String email;
    private long phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String post, String email, long phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getPost() {
        return this.post;
    }

    public String getEmail() {
        return this.email;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getAge() {
        return this.age;
    }

    public Employee(String name, String post, String email) {
        this.name = name;
        this.post = post;
        this.email = email;
    }
    public void setPost(String post){
        this.post=post;
    }

}
