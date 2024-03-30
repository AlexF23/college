/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alexander
 */
public class Student {
    
  private String name;
    private String studentNumber;
    private String program;
    private List<String> modulesEnrolled;
    private Map<String, String> modulesCompleted; // Module name to grade mapping
    private List<String> modulesToRepeat;

    // Constructor
    public Student(String name, String studentNumber, String program, List<String> modulesEnrolled, Map<String, String> modulesCompleted, List<String> modulesToRepeat) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.program = program;
        this.modulesEnrolled = modulesEnrolled;
        this.modulesCompleted = modulesCompleted;
        this.modulesToRepeat = modulesToRepeat;
    }

}

