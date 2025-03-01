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
public class Lecturer {

    private final String LecturerName; //lecturer name 
    private final String role; //lecturers role
    private final List<String> canTeachTypes;
    private final Map<String, Integer> modulesTeaching; // Maps module name to the number of enrolled students

    // Constructor
    public Lecturer(String name, String role, List<String> canTeachTypes, Map<String, Integer> modulesTeaching) {
        this.LecturerName = name;
        this.role = role;
        this.canTeachTypes = canTeachTypes;
        this.modulesTeaching = modulesTeaching;
    }

    // Getters
    public String getName() { //returns lecturer name
        return LecturerName;
    }

    public String getRole() { //returns lecturer role
        return role;
    }

    public List<String> getCanTeachTypes() { // return whatlecturer can teach
        return canTeachTypes;
    }

    public Map<String, Integer> getModulesTeaching() { //return what they can teach
        return modulesTeaching;
    }

    CharSequence[] getTeachableClasses() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public class Module { //class for college modules

        private String LecturerName; //lecturer name    
        private int studentCount; //amount of students in module

        // Constructor
        public Module(String name, int studentCount) {
            this.LecturerName = name;
            this.studentCount = studentCount; 
        }

        // Getters
        public String getName() {
            return LecturerName;
        }

        public int getStudentCount() {
            return studentCount;

        }
    }
}
