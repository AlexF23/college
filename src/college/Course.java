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
    private final int id; //the course identification 
    private final String courseName; //name of the course
    private final String program; //the program the course belongs too
    private final int studentsEnrolled; //number of student enrolled
    private final String lecturerName; // lecturers name
    private final String room; // room where course takes place
    
     // Constructor for the course info from ther DB
    public Course(int id, String name, String program, int studentsEnrolled, String lecturerName, String room) {
        this.id = id;
        this.courseName = name;
        this.program = program;
        this.studentsEnrolled = studentsEnrolled;
        this.lecturerName = lecturerName;
        this.room = room;
    }

    String getName() {
       return courseName;
    }

    String getProgram() {
        return program;
    }

    int getStudentsEnrolled() {
        return studentsEnrolled;
    }

    String getLecturerName() {
        return lecturerName;
    }

    String getRoom() {
        return room;
    }
}
