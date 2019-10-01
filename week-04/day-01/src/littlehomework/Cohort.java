package littlehomework;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    String name;
    ArrayList<Student> students;
    ArrayList<Mentor> mentors;



    public void addStudent (Student student) {
        students.add(student);

    }
}
