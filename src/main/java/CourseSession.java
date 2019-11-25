import java.util.*;

public class CourseSession {
    private String department;
    private String number;
    private int numberOfStudents=0;
    private ArrayList<Student> students=new ArrayList<Student>();
    public CourseSession(String department,String number){
        this.department=department;
        this.number=number;

    }
    public String getDepartment(){
        return department;
    }
    public String getNumber(){
        return number;
    }
    public int getNumberOfStudents(){
        return  numberOfStudents;
    }
    public void enroll(Student student){
        numberOfStudents+=1;
        students.add(student);
    }
    public ArrayList<Student> getAllStudents(){
        return students;
    }

}
