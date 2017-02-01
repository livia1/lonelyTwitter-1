package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by livialee on 2017-01-18.
 */

/**
 * Created a mood class that gets and sets the mood.
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

    // Getters and setters for Date
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    // Getters and setters for Mood
    public String getMood() {
        return mood;
    }
    public void setMood(String mood) {
        this.mood = mood;
    }

}
