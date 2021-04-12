import com.learnreactivespring.Coach;

public class TrackCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "I am in Track";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
