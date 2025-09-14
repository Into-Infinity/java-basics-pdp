package task15;

import java.util.Arrays;
import java.util.Comparator;

// Написать класс Студент с полями имя, возраст, AVG балл аттестата. Создать массив Студентов.
// Выполнить сортировку:
// по оценке;
// по имени.
// Вывести на консоль студентов, у которых средний бал выше 8.
public class Student {
    private String name;
    private int age;
    private double avgScore;

    public Student(String name, int age, double avgScore) {
        this.name = name;
        this.age = age;
        this.avgScore = avgScore;
    }

    public String toString() {
        return "Студент [имя: " + name + ", возраст: " + age + ", средний балл: " + avgScore + "]";
    }

    public static void sortByScoreAndPrint(Student[] students) {
        Arrays.sort(students, Comparator.comparingDouble(s -> s.avgScore));
        System.out.println("Сортировка по среднему баллу:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void sortByNameAndPrint(Student[] students) {
        Arrays.sort(students, Comparator.comparing(s -> s.name));
        System.out.println("Сортировка по имени:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void printHighestScore(Student[] students, double threshold) {
        System.out.println("Студенты со средним баллом выше " + threshold + ":");
        for (Student student : students) {
            if (student.avgScore > threshold) {
                System.out.println(student);
            }
        }
    }
}
