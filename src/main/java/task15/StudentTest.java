package task15;

public class StudentTest {

    public static void main(String[] args) {
        Student[] students = {
                new Student("Андрей", 20, 7.5),
                new Student("Виктория", 21, 9.1),
                new Student("Дмитрий", 19, 8.7),
                new Student("Мария", 22, 6.9),
                new Student("Иван", 20, 8.2)
        };

        Student.sortByScoreAndPrint(students);
        System.out.println();
        Student.sortByNameAndPrint(students);
        System.out.println();
        Student.printHighestScore(students, 8);
    }

}
