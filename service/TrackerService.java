package service;

import model.*;
import java.util.ArrayList;

public class TrackerService {

    private ArrayList<StudySession> sessions = new ArrayList<>();

    public void addSession(StudySession session) {
        sessions.add(session);
    }
    public int getTotalStudyTime() {
    int total = 0;

    for (StudySession s : sessions) {
        total += s.getDuration();
    }

    return total;
}
// Added functionality to display all study sessions
public void showAllSessions() {
    for (StudySession s : sessions) {
        System.out.println(
            s.getSubject().getName() + " - " + s.getDuration() + " minutes"
        );
    }
}
}