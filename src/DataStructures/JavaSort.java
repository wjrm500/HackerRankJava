package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaSort {
    public static class Student {
        private int id;
        private String fname;
        private double cgpa;

        public Student(int id, String fname, double cgpa) {
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }

        public int getId() {
            return id;
        }

        public String getFname() {
            return fname;
        }

        public double getCgpa() {
            return cgpa;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            String fname = scanner.next();
            double cgpa = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character
            students.add(new Student(id, fname, cgpa));
        }
        students.sort(
                Comparator
                        .comparing(Student::getCgpa).reversed()
                        .thenComparing(Student::getFname)
                        .thenComparing(Student::getId)
        );
        for (Student student : students) {
            System.out.println(student.getFname());
        }
    }
}
