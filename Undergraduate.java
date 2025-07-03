/*
Description of the class: this class stores the year student is attending, 
overrides eligibleForHonorSociety method and checks if a student is 
eligible for honor society, overrides toString to return the student's name, GPA,
and the year of college.
*/

public class Undergraduate extends Student{
    public String collegeYear;
    
    public Undergraduate(String studentName, double creditHours, double qualityPoints,
            String collegeYear){
        super(studentName, creditHours, qualityPoints);
        this.collegeYear = collegeYear;
        
    }
    
    @Override
    public String toString(){
        return getStudentName() + ", " + gpa() + collegeYear;
     
    }
        
    @Override  
            
    public boolean eligibleForHonorSociety(){
        return (collegeYear.equals("Junior") || collegeYear.equals("Senior")) && 
                super.eligibleForHonorSociety();
    }
}  