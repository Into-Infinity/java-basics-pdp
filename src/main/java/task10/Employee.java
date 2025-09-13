package task10;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        String info = String.format("%s | %s | %s | %s | Salary: %.2f | Age: %d",
                fullName, position, email, phone, salary, age);
        System.out.println(info);
    }

    public int getAge() {
        return age;
    }
}
