package coursedetails;


public class CourseDetails {
    public static void main(String[] args) {

        Course csa = new Course("AP Computer Science A", "AP CSA", 100, "Mr. Nelson");
        System.out.println(csa);
        
        System.out.println();
        Course phys = new Course("AP Physics C");
        phys.setCourseCode("APC");
        phys.setPointsTotal(100);
        phys.setInstructorName("Ms. Rafie");
        System.out.println(phys);
    }
}

class Course {
    private String courseTitle = "";
    private String courseCode = "";
    private int pointsTotal;
    private String instructorName = "";

    
    public Course(String name, String code, int points, String iName) {
        courseTitle = name;
        courseCode = code;
        pointsTotal = points;
        instructorName = iName;
    }
    
    public Course(String name){
        courseTitle = name;
        courseCode = "";
        pointsTotal = 0;
        instructorName = "";
    }

    public void setCourseTitle(String inTitle){
        courseTitle = inTitle;
    }
    
    public String getCourseTitle(){
        return courseTitle;
    }
    
    public void setCourseCode(String inCode) {
        courseCode = inCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    
    public void setPointsTotal(int inPoints) {
        pointsTotal = inPoints;
    }

    public int getPointsTotal() {
        return pointsTotal;
    }

    
    public void setInstructorName(String inTname) {
        instructorName = inTname;
    }

    public String getInstructorName() {
        return instructorName;
    }

    

    
    @Override
    public String toString() {
        return "The course name is: " + courseTitle
            + "\nThe course's code is: " + courseCode
            + "\nThe total points are: " + pointsTotal 
            + "\nThe instructor's name is: " + instructorName;
    }
}
