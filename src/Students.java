public class Students {
    static String[] allStudents = {
        "Student McStudentFace", 
        "Student Number27",
        "Student Number07",
        "Student Number08",
        "Student Number09",
        "Chris Owens",
        "Student 317"
    };
    
    public static void printAll() {
        System.out.println("There are " + allStudents.length + " students ");
        for (int i=1; i<allStudents.length; i++) {
            System.out.println ("Student " + i +": " + allStudents[i]);
        }
    }
    
}
