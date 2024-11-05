import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        List<StudentClass> students = new ArrayList<StudentClass>();
        HashMap<SubjectsStudents, Integer> grades = new HashMap<>();
        grades.put(SubjectsStudents.GRAPHICS,2);
        grades.put(SubjectsStudents.ENGLISH,5);
        students.add( new StudentClass("Игнат",SpecializationStudents.ISTITPK, 2, grades));

        System.out.println(StudentClass.printStudents(students,2));

        students = StudentClass.sweepStudents(students);
        System.out.println(StudentClass.printStudents(students,3));

    }
}