package service;

import model.*;
import java.util.ArrayList;
import java.util.HashMap;

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
//
public void showSubjectWiseTime() {
    HashMap<String, Integer> map = new HashMap<>();

    for (StudySession s : sessions) {
        String subject = s.getSubject().getName();
        int time = s.getDuration();

        if (map.containsKey(subject)) {
            map.put(subject, map.get(subject) + time);
        } else {
            map.put(subject, time);
        }
    }

    for (String sub : map.keySet()) {
        System.out.println(sub + " -> " + map.get(sub) + " minutes");
    }
}
}