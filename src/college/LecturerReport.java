/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Alexander
 */
public class LecturerReport {
     public void generateReport() {
        List<Lecturer> lecturers = fetchLecturersFromDatabase();

        for (Lecturer lecturer : lecturers) {
            System.out.println("Lecturer Name: " + lecturer.getName());
            System.out.println("Role: " + lecturer.getRole());
            System.out.println("Modules Teaching This Semester:");
            for (Module module : lecturer.getModulesTeaching()) {
                System.out.println(" - " + module.getName() + " (Students Enrolled: " + module.getStudentCount() + ")");
            }
            System.out.println("Teachable Classes: " + String.join(", ", lecturer.getTeachableClasses()));
            System.out.println();
        }
    }

    private List<Lecturer> fetchLecturersFromDatabase() {
        List<Lecturer> lecturers = new ArrayList<>();
        try (Connection conn = DBConnector.connect();
             PreparedStatement stmt = conn.prepareStatement(
                     "SELECT l.name, l.role, m.name AS moduleName, m.student_count, l.teachable_classes " +
                     "FROM Lecturers l " +
                     "JOIN Modules m ON l.id = m.lecturer_id")) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                
                String name = rs.getString("name");
                String role = rs.getString("role");
                List<Module> modulesTeaching = List.of(new Module(rs.getString("moduleName"), rs.getInt("student_count")));
                List<String> teachableClasses = List.of(rs.getString("teachable_classes").split(", ")); 

                lecturers.add(new Lecturer(name, role, modulesTeaching, teachableClasses));
            }
        } catch (Exception e) {
        }

        return lecturers;
    }
   
}
