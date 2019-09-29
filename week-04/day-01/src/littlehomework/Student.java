package littlehomework;

public class Student {
    String name;
    int age;
    String gender;
   String previousOrganization;
   int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization)
    {
        skippedDays = 0;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student()
    {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }

    public void introduce()
    {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + " days from the course already.");
    }

    public void getGoal()
    {
        System.out.println("Be a junior software developer.");
    }
    public void skipDays(int numberOfDays)
    {
        skippedDays += numberOfDays;
    }
}
