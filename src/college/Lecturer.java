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
    private String name; //lecturer name 
    private String role; //lecturers role
    private List<String> canTeachTypes;
    private Map<String, Integer> modulesTeaching; // Maps module name to the number of enrolled students

    // Constructor
    public Lecturer(String name, String role, List<String> canTeachTypes, Map<String, Integer> modulesTeaching) {
        this.name = name;
        this.role = role;
        this.canTeachTypes = canTeachTypes;
        this.modulesTeaching = modulesTeaching;
    }

    // Getters
    public String getName() { //returns lecturer name
        return name;
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
}
