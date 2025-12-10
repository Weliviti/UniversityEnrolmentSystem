public class Student extends Person{
    private String courseTitle;
    private int modulesEnrolled;

    public Student(String name,String surname){
        super(name,surname);    
    }
        public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setModulesEnrolled(int modulesEnrolled) {
        this.modulesEnrolled = modulesEnrolled;
    }

    public String getCourseTitle() {
        return this.courseTitle;
    }

    public int getModulesEnrolled() {
        return this.modulesEnrolled;
    }

    public String toString() {
    String var10000 = super.toString(); 
    return var10000 + " Student - Course Title: " + this.courseTitle + ", Modules Enrolled: " + this.modulesEnrolled;
    }
}