/**
 *
 * @author Jere
 */
public class Student {
    private String name;
    private String studentNumber;
    
    public Student(String name, String stuNumber){
        this.name = name;
        this.studentNumber = stuNumber;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }
    
    @Override
    public String toString(){
        return this.name+" ("+this.studentNumber+")";
    }
}
