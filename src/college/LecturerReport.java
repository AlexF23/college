/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college;

/**
 *
 * @author Alexander
 */
public class LecturerReport {
    
    public static void main(String[] args) {
        // Example: Generate report for a lecturer named ""
        Lecturer lecturer = DatabaseUtility.getLecturerReport("");
        
        if (lecturer != null) {
            
            System.out.println("Lecturer Name: " + lecturer.getName());
            System.out.println("Role: " + lecturer.getRole());
            
        } else {
            System.out.println("Lecturer not found.");
        }
    }
}
