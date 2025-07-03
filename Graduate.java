/*
Description of the class: this class stores the degree the student is pursuing, 
overrides eligibleForHonorSociety method and checks if a student is 
eligible for honor society, overrides toString to return the student's name, GPA,
and the degree the student is pursuing.
*/

public class Graduate extends Student{
    private String collegeDegree;
    
    public Graduate(String studentName, double creditHours, double qualityPoints,
            String collegeDegree){
        super(studentName, creditHours, qualityPoints);
        this.collegeDegree = collegeDegree;
        
    }
    
    @Override
    public String toString(){
        return getStudentName() + ", " + gpa() + collegeDegree;
     
        
    }
            
    @Override  
            
    public boolean eligibleForHonorSociety(){
        return (collegeDegree.equals("Master's Degree")) && super.eligibleForHonorSociety();
    }
}