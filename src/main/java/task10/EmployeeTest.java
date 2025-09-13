package task10;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Иванов Иван Иванович", "Manager", "ivanov@mail.com",
                "+79990001122", 80000, 45);
        employees[1] = new Employee("Петров Пётр Петрович", "Developer", "petrov@mail.com",
                "+79990002233", 70000, 38);
        employees[2] = new Employee("Сидоров Сидор Сидорович", "Designer", "sidorov@mail.com",
                "+79990003344", 60000, 50);
        employees[3] = new Employee("Кузнецов Алексей Алексеевич", "QA", "kuznetsov@mail.com",
                "+79990004455", 65000, 42);
        employees[4] = new Employee("Николаев Николай Николаевич", "Analyst", "nikolaev@mail.com",
                "+79990005566", 72000, 35);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }

    }
}
