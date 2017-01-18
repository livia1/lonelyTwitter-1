package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by livialee on 2017-01-18.
 */

public abstract class Mood {
    private Date date;
    private String mood;

    public Mood(String m) {
        mood = m;
        date = new Date();
    }

    public Mood(String m, Date d) {
        mood = m;
        date = d;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public String getMood() {
        return mood;
    }
    public void setMood(String mood) {
        this.mood = mood;
    }

}
