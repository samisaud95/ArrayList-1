import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creo un arraylist con n elementi
       ArrayList<Student> students= new ArrayList<>();

       // Aggiungiamo gli students

        students.add(new Student("Juan", 15));
        students.add(new Student("Maria", 10));
        students.add(new Student("Pedro", 12));
        students.add(new Student("Alejandra", 16));

        System.out.println("Students Prima Parte:");
        printStudentTutti(students);
        System.out.println();

        // Aggiunggiamo 4 studente alla collezione
        students.add(new Student("Hector", 11));
        students.add(new Student("Genesis", 13));
        students.add(new Student("Mariangel", 18));
        students.add(new Student("Angelo", 14));

        System.out.println("Students Seconda Parte:");
        printStudentTutti(students);
        System.out.println();

    }
// Facendo un ciclo for possiamo stampanre tutti elementi dell array
    private static void printStudentTutti(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }

    }
}