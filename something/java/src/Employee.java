public class Employee {
    String name;
    String post;
    String email;
    int telephone;
    int salary;
    int age;

    Employee(String name, String post, String email, int telephone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    void printInfo() {
        System.out.println(name + " " + post + " " + email + " " + telephone + " " + salary + " " + age);

    }


}