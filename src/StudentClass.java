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

    private double avgGrades()
    {
        double avgGrades = 0;
        if (!grades.isEmpty()) {
            for (Integer grade : grades.values()) {
                avgGrades += grade;
            }
            avgGrades = avgGrades / grades.size();
        }
        return avgGrades;
    }
    static public void sweepStudents(List<StudentClass> students)
    {
        students.removeIf(s -> s.avgGrades()<3);
        for(StudentClass student: students) {
                student.course+=1;
        }
    }

    static public  String printStudents(List<StudentClass> students, int course)
    {
        String output = "";
        for(StudentClass student: students) {
            if (student.course == course) output += student.getName()+" ("+student.specialization+") , ";
        }
        return output;
    }

@Override
    public String toString()
{
    return name+" "+specialization+" "+course;
}





}

