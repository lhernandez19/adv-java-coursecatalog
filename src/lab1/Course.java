package lab1;

public abstract class Course {
    String courseNumber;
    String courseName;
    double credits;

    public abstract String getCourseNumber();
    public abstract void setCourseNumber(String courseNumber);
    public abstract double getCredits();
    public abstract void setCredits(double credits);

}
