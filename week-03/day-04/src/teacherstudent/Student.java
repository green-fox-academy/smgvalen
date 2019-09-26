package teacherstudent;

public class Student {

    public Student() {
    }
    public void learn(){
        System.out.println("Student is learning something new");
    }
    public void question(Teacher teacher){
        teacher.answer();
    }
}
/*  Student
learn() -> prints the student is learning something new
question(teacher) -> calls the teachers answer method  */
