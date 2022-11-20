import java.util.List;
import java.util.TreeMap;

public class Courses<Consultant,Clients> {
    private TreeMap<String, Consultant> consultants = new TreeMap<String, Consultant>();//Consultant datatype is not defined yet.
    String CourseName;
    Integer CourseLength;
    Float CoursePrice;
    TreeMap<String, String> CoursePath = new TreeMap<String, String>();

    List<Clients> ClientsList; //still need to define Client generic..


    public void addConsultant(String name, Consultant consultant) {
        consultants.put(name, consultant);
    }//getters and setters for dynamic adding of data to the class.

    String CoursePath(String CourseName) {
        return CoursePath.get(CourseName);
    }


    //method for adding courses
    String courses() {
        CoursePath.put("CourseName", CourseName);
        CoursePath.put("CourseLength", CourseLength.toString());
        CoursePath.put("CoursePrice", CoursePrice.toString());
        return CoursePath.toString();
    }
}//session extends courses as a subclass
class Sessions extends Courses {
    Integer SessionIndex;
    String SessionName;
    String SessionInfo;
}
