/*
Description of the class: this class accesses a text document that contains student names,
GPAs, and prints the names of the students' who are eligible for honor society.
*/


import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;



public class Project2 {
    public static void main (String[] args) {
        ArrayList<Student> students = studentsFile("students.txt");
        if(students.isEmpty()){
            System.out.println("The file does not exist");
            return;
           
        }
         
    

    
    double studentGpa = 0.0;
    for (Student student:students){
        studentGpa += student.gpa();
    }    
    
    double studentAverageGpa = studentGpa/students.size();
    Student.setGpaThreshold((studentAverageGpa + 4.0)/2);
    
    System.out.println("Student(s) eligible for Honor Society: ");
    for (Student student:students){
        if (student.eligibleForHonorSociety()){
            System.out.println(student);
                   
        }
    
    }
}       

    private static ArrayList<Student> studentsFile(String studentsFile){
        ArrayList<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner (new File(studentsFile))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                String [] parts = line.split(" ");
                String studentName = parts[0] + " " + parts[1];
                double creditHours = Double.parseDouble(parts[2].trim());
                double qualityPoints = Double.parseDouble(parts[3].trim());
                String collegeYear = parts[4].trim();
                String collegeDegree = parts[4].trim();
            
                if (collegeYear.equals("Junior") || collegeYear.equals("Senior")){
                    students.add(new Undergraduate(studentName, creditHours, qualityPoints,
                            collegeYear));
                }else { 
                    students.add(new Graduate(studentName, creditHours, qualityPoints,
                            collegeDegree));
                }
            }
        }catch (FileNotFoundException ex) {
            System.out.println("The file does not exist");
        }
    
        return students;
    }
}   



