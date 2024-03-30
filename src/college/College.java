/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package college;

/**
 *
 * @author Alexander
 */
public class College {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //this will generate a report of courses from the database
        CourseReportGenerator reportGenerator = new CourseReportGenerator();
        List<Course> courses = reportGenerator.generateReport();
        for (Course course : courses) {
            //this will print out a report for the follwing DB data using getters
            System.out.println("Course Name: " + course.getName() + //get students name
                               ", Program: " + course.getProgram() + //getthe program
                               ", Enrolled: " + course.getStudentsEnrolled() + //get the students enrolled
                               ", Lecturer: " + course.getLecturerName() + //get the naame of the lecturer
                               ", Room: " + course.getRoom()); // get the room of the course
    }
    }
}
