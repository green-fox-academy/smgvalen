package teacherstudent;

public class Teacher {
    public Teacher(){
    }
    public void answer(){
        System.out.println("The teacher is answering a question");
    }
    public void teach(Student student){
        student.learn();
    }
}

/* Teacher
teach(student) -> calls the students learn method
answer() -> prints the teacher is answering a question  */
