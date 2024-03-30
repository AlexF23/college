/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Alexander
 */
public class StudentReport {
      
    public void generateReport() {
        // Placeholder for database connection
        try (Connection connection = DBConnector.getConnection()) {
            String query = "SELECT * FROM Students"; 
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                
                List<String> modulesEnrolled = fetchModulesEnrolled(resultSet.getString("studentNumber"));
                Map<String, String> modulesCompleted = fetchModulesCompleted(resultSet.getString("studentNumber"));
                List<String> modulesToRepeat = fetchModulesToRepeat(resultSet.getString("studentNumber"));

                Student student = new Student(
                        resultSet.getString("name"),
                        resultSet.getString("studentNumber"),
                        resultSet.getString("program"),
                        modulesEnrolled,
                        modulesCompleted,
                        modulesToRepeat
                );

                // Display or process the report data as required
                displayStudentReport(student);
            }
        } catch (Exception e) {
        }
    }

    private void displayStudentReport(Student student) {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Number: " + student.getStudentNumber());
        System.out.println("Program: " + student.getProgram());
        System.out.println("Modules Enrolled: " + String.join(", ", student.getModulesEnrolled()));
        System.out.println("Modules Completed with Grades: ");
        student.getModulesCompleted().forEach((module, grade) -> System.out.println(module + ": " + grade));
        System.out.println("Modules to Repeat: " + String.join(", ", student.getModulesToRepeat()));
    }

    // Placeholder methods to fetch modules data
    private List<String> fetchModulesEnrolled(String studentNumber) {
        
        return new ArrayList<>();
    }

    private Map<String, String> fetchModulesCompleted(String studentNumber) {
        
        return new HashMap<>();
    }

    private List<String> fetchModulesToRepeat(String studentNumber) {
        
        return new ArrayList<>();
    }
}
