import java.util.ArrayList;
import java.util.List;

public class Human {
    String firstName;
    String lastName;
    String FullName;
    String fullName(){
        return firstName + " " + lastName;
    }//////////////////////////////////////
    private Integer sysdate = TodayDate();
    private Integer TodayDate() {
        return 0;//change to method to get sysdate
    }
    private Integer sysdate() {
        return sysdate;//set sysdate to today's date //setter method
    }
    Integer DOB ;//Date of Birth
    Integer Age = TodayDate() - DOB;//use return value from sysdate method
}
 //don't need the course generic but ive added it anyway
 abstract class Client<course> extends Human{

    List<Courses> CoursesEnrolled = new ArrayList<Courses>();
    static Courses currentCourse;
    Sessions currentSession;
    Corporation Company;
    String Individual;
    DemographicForm extraInfo; //DemographicForm class extra info.

}//will change course to be defined soon just need the layout

class Consultant extends Client{
    //consultants have a list of clients.
    List<Courses> CoursesLed;//list of courses led by consultant

}