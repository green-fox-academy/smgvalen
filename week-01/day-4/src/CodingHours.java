public class CodingHours {

    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        int semester = 17;
        int codeHours = 6;
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        int workDays = 5;
        int averageHoursSemester = semester * workDays * codeHours;
        System.out.println("An average Green Fox attendee codes " +averageHoursSemester+" hours in a semester.");


        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        float aveWorkHours = 52;
        float workHoursInSemester = aveWorkHours * semester;



        System.out.println(averageHoursSemester / workHoursInSemester * 100 + "%") ;

    }
}
