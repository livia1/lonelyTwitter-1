package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by livia1 on 1/17/17.
 */
public abstract class Tweet implements Tweetable{
    private Date date;
    private String message;
    //private ArrayList<Mood> moods;

    public abstract Boolean isImportant();

    public Tweet(Date date, String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = date;
        //this.moods = new ArrayList<Mood>();
    }
    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date(); // current time and date
        //this.moods = new ArrayList<Mood>();
    }

    /*
    public void addMood(Mood m) {
        moods.add(m);
    }*/


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
