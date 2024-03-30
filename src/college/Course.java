/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college;

/**
 *
 * @author Alexander
 */
public class Course { //created srings for the courses info we need from the DB
    private int id;
    private String name;
    private String program;
    private int studentsEnrolled;
    private String lecturerName;
    private String room;
    
     // Constructor for the course info from ther DB
    public Course(int id, String name, String program, int studentsEnrolled, String lecturerName, String room) {
        this.id = id;
        this.name = name;
        this.program = program;
        this.studentsEnrolled = studentsEnrolled;
        this.lecturerName = lecturerName;
        this.room = room;
    }
}
