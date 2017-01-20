package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by livia1 on 1/17/17.
 */
public abstract class Tweet implements Tweetable{
    private Date date;
    private String message;

    public abstract Boolean isImportant();

    public Tweet(Date date, String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = date;
    }
    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date(); // current time and date
    }

    ArrayList<Mood> moodArrayList = new ArrayList<Mood>();

    public void addMoodHappy(Mood happy) {
        // Sets date to default
        Mood mood = new HappyMood(":D");
        HappyMood happyMood = new HappyMood("Feeling Happy");
        moodArrayList.add(happyMood);

    }

    public void addMoodHappy(Date date, Mood happy) {

        Mood mood = new HappyMood(":D");
        HappyMood happyMood = new HappyMood("Feeling Happy");
        moodArrayList.add(happyMood);
        this.date = date;
    }

    public void addMoodSad(Mood sad) {
        // Sets date to default
        Mood mood = new SadMood(":(");
        SadMood sadMood = new SadMood("Feeling Sad");
        moodArrayList.add(sadMood);
    }

    public void addMoodSad(Date date, Mood sad) {

        Mood mood = new SadMood(":(");
        SadMood sadMood = new SadMood("Feeling Sad");
        moodArrayList.add(sadMood);
        this.date = date;
    }

    // Getters and setters for Date
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    //Getters and setters for Message
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 144) {
            throw new TweetTooLongException();
        }
        else{
            this.message = message;
        }
    }
}
