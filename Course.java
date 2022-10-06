public class Course {
    String department;
    int courseNumber;
    double credits;
    final int DEPT_LENGTH = 3;
    final int LOW_NUM = 100;
    final int HIGH_NUM = 499;
    final double LOW_CREDITS = 0.5;
    final double HIGH_CREDITS = 6;
    
    // constructor receives:
      // String department (for example, CIS)
      // int courseNumber (for example, 101)
      // int credits (for example, 3)
    public Course() {
      department = "";
      courseNumber = 0;
      credits = 0;
    }

    // throw a CourseException if: 
      // the department does not consist of three letters 
      // if the course number does not consist of three digits between 100 and 499 inclusive
      // if the credits are less than 0.5 or more than 6
    public Course(String dept, int num, double creditValue) throws CourseException {
      boolean isBad = false;
      String msg = "";
      department = dept;
      courseNumber = num;
      credits = creditValue;
      if(department.length() != DEPT_LENGTH){
        isBad = true;
        msg = "Improper department length";
      }else if(courseNumber < LOW_NUM || courseNumber > HIGH_NUM){
        isBad = true;
        msg = "Improper course number length";
      }else if(credits < LOW_CREDITS || credits > HIGH_CREDITS){
        isBad = true;
        msg = "Improper credit amount";
      }
      
      if(isBad)
        throw(new CourseException("Error with course #: " + num + " Error Type: " + msg));
    }
    public String toString() {
        return "Department: " + department + " Course Number: " + courseNumber + " Credits: " + credits;
    }
}
