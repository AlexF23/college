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
        CourseReportGenerator reportGenerator = new CourseReportGenerator();
        List<Course> courses = reportGenerator.generateReport();
        for (Course course : courses) {
            System.out.println("Course Name: " + course.getName() +
                               ", Program: " + course.getProgram() +
                               ", Enrolled: " + course.getStudentsEnrolled() +
                               ", Lecturer: " + course.getLecturerName() +
                               ", Room: " + course.getRoom());
    }
    }
}
