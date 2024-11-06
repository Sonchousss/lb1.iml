import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Main {
    static public void printUsers(List<StudentClass> students)
    {
        for (StudentClass student : students)
            System.out.println(student);
        System.out.println();
    }
    public static void main(String[] args) {
        List<StudentClass> students = new ArrayList<StudentClass>();
        HashMap<SubjectsStudents, Integer> grades = new HashMap<>();
        grades.put(SubjectsStudents.GRAPHICS,2);
        grades.put(SubjectsStudents.ENGLISH,5);
        students.add( new StudentClass("Игнат",SpecializationStudents.ISTITPK, 2, new HashMap<SubjectsStudents, Integer>(grades)));
        grades.put(SubjectsStudents.ENGLISH,2);
        students.add( new StudentClass("Иван",SpecializationStudents.ISTITPK, 2, new HashMap<SubjectsStudents, Integer>(grades)));

        printUsers(students);
        System.out.println(StudentClass.printStudents(students,2));

        StudentClass.sweepStudents(students);
        System.out.println(StudentClass.printStudents(students,3));

    }
}