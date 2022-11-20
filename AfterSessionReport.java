import java.util.HashMap;
import java.util.Map;

public class AfterSessionReport {
    public class TimeBlock{
        Integer TimeBlockIndex;
        Float brainLevel;
        Float brainFrequency;
    }//need to add getters and setters to all classes probably

    public static class Feedback{
        String Feedback;
        String FeedbackType;
        String FeedbackType(String FeedbackType) {
            return FeedbackType;
        }
        HashMap<String, String> FeedbackMap = new HashMap<String, String>();
        String FeedbackMap(String Feedback, String FeedbackType) {
            FeedbackMap.put("Feedback", Feedback);
            FeedbackMap.put("FeedbackType", FeedbackType);
            return FeedbackMap.toString();
        }
    }
    //OR THIS CLASS
    public class FeedbackOther<question,questionAnswer>{
        HashMap<question,questionAnswer> QuestionList = new HashMap<question,questionAnswer>((Map<? extends question, ? extends questionAnswer>) Client.currentCourse);
    }//change this most likely
}// each client needs to input data into this class after each session.


