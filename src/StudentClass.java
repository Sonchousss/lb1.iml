import java.util.HashMap;
import java.util.List;

public class StudentClass {
    private String name;
    private SpecializationStudents specialization;
    private int course;
    private HashMap<SubjectsStudents, Integer> grades;

    public StudentClass(String name, SpecializationStudents specialization, int course, HashMap<SubjectsStudents, Integer> grades) {
        this.name = name;
        this.specialization = specialization;
        this.course = course;
        this.grades = grades;
    }

    public StudentClass(String name, SpecializationStudents specialization, int course) {
        this.name = name;
        this.specialization = specialization;
        this.course = course;
    }


    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public SpecializationStudents getGroup() {return specialization;}
    public void setGroup(SpecializationStudents group) {this.specialization = group;}

    public int getCourse() {return course;}
    public void setCourse(int course) {this.course = course;}

    public HashMap<SubjectsStudents, Integer> getGrades() {return grades;}
    public void setGrades(HashMap<SubjectsStudents, Integer> grades) {this.grades = grades;}


    static public List<StudentClass> sweepStudents(List<StudentClass> students)
    {
        for(StudentClass student: students) {
            double avgGrades = 0;
            if (!student.grades.isEmpty()) {
                for (Integer grade : student.grades.values()) {
                    avgGrades += grade;
                }
                avgGrades = avgGrades / student.grades.size();
            }

            if (avgGrades < 3) {
                students.remove(student);
            }
            else {
                student.course+=1;
            }
        }
        return students;
    }

    static public  String printStudents(List<StudentClass> students, int course)
    {
        String output = "";
        for(StudentClass student: students) {
            if (student.course == course) output += student.getName()+" ("+student.specialization+") , ";
        }
        return output;
    }







}

