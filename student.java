/**
 *
 * @author user
 */
public class Student {


    int studentID;
    
    double credithours, points,gradePointAve;
    
    
    Student(int id,double hours,double p)
    
    {
    
    studentID=id;
    
    credithours=hours;
    
    points=p;
    
    }
    
    
    void setStudentID(int id)
    
    {
    
    studentID=id;
    
    }
    
    void setCreditHours(double hours)
    
    {
    
    credithours=hours;
    
    }
    
    void setPointsEarned(double poEar)
    
    {
    
    points=poEar;
    
    }
    
    int getStudentID()
    
    {
    
    return studentID;
    
    }
    
    double getCreditHours()
    
    {
    
    return credithours;
    
    }
    
    double getPointsEarned()
    
    {
    
    return points;
    
    }
    
    
    double computeGradePointAverage()
    
    {
    
    return points/credithours;
    
    }
    
    
    void displayIDNumber()
    
    {
    
    System.out.println("ID Number:"+studentID);
    
    }
    
    void displayCreditHours()
    
    {
    
    System.out.println("Number of credit hours earned:"+credithours);
    
    }
    
    void displayPointsEarned()
    
    {
    
    System.out.println("Number of points earned:"+points);
    
    }
    
    }