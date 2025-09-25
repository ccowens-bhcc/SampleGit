public class Students {
    static String[] allStudents = {
        "Student McStudentFace", // fake names to get started
        "Student Number17",
        "Student Number07"
    };
    
    public static void printAll() {
        for (String student : allStudents) {
            System.out.println (student);
        }
    }
    
}
