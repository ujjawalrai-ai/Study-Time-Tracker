package model;

public class StudySession {
    private Subject subject;
    private int duration;

    public StudySession(Subject subject, int duration) {
        this.subject = subject;
        this.duration = duration;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getDuration() {
        return duration;
    }
}