public class ThrowCourseException {
    public static void main(String[] args) {
        int numRecords=6;
        Course[] courses = new Course[numRecords];
        String[] depts = {"CIS", "ACC", "ENGLISH", "BB", "CSC", "CSC"};
        int[] courseNums = {110, 200, 100, 700, 4351, 3350};
        double[] credits ={3, 4, 7.5, 0, 100, 2.5};
        int x;

        for(x = 0; x <numRecords; ++x)
          courses[x] = new Course();

        for(x = 0; x < courses.length; ++x)
        // try catch when instaniation with "depts[x], coursNums[x], credits[x]"
          try{
            courses[x] = new Course(depts[x], courseNums[x], credits[x]);
          }
          catch(CourseException error){
            System.out.println("Error: " + error.getMessage());
          }
          // print each "course record values"
          finally{
          System.out.println(courses[x].toString());
          }

    
        
        
    }
}