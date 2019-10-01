package cloning;

public class Student extends Person{

    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        super();
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }
    @Override
    protected Student clone() {
        return new Student(super.getName(), super.getAge(), super.getGender(), previousOrganization);
    }

}

