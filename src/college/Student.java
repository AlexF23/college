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

    private final String studentName; //student name
    private final String studentNumber; //student number
    private final String program; //programm they are enrolled in 
    private final List<String> modulesEnrolled; //module they have
    private final Map<String, String> modulesCompleted; // Module completed by student
    private final List<String> modulesToRepeat; //modules student needs to repeat

    // Constructor
    public Student(String name, String studentNumber, String program, List<String> modulesEnrolled, Map<String, String> modulesCompleted, List<String> modulesToRepeat) {
        this.studentName = name; //s
        this.studentNumber = studentNumber;
        this.program = program;
        this.modulesEnrolled = modulesEnrolled;
        this.modulesCompleted = modulesCompleted;
        this.modulesToRepeat = modulesToRepeat;
    }
    //getters

    // Returns the name of the student.
    public String getName() {
        return studentName;
    }

    // Returns the student number.
    public String getStudentNumber() {
        return studentNumber;
    }

    // Returns the program in which the student is enrolled.
    public String getProgram() {
        return program;
    }

    // Returns the list of modules the student is currently enrolled in.
    public List<String> getModulesEnrolled() {
        return modulesEnrolled;
    }

    // Returns the map of completed modules and their corresponding grades.
    public Map<String, String> getModulesCompleted() {
        return modulesCompleted;
    }

    // Returns the list of modules the student needs to repeat.
    public List<String> getModulesToRepeat() {
        return modulesToRepeat;
    }
}
