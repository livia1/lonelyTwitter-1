package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
import java.util.Date;

import io.searchbox.annotations.JestId;

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    @JestId
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    @Override
    public String toString(){
        return message;
    }

    public abstract Boolean isImportant();


    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            //Do Something!
            throw new TweetTooLongException();
        }
        this.message = message;
    }

=======
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by livia1 on 1/17/17.
 */

/**
 * This class is the abstract base class that will get get the date and message
 *
 */

public abstract class Tweet implements Tweetable{
    private Date date;
    private String message;

    /**
     * Takes the tweet message and date and saves it
     * @param date
     * @param message
     * @throws TweetTooLongException
     */
    public Tweet(Date date, String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = date;
    }

    /**
     * Take the tweet message and sets it. The date is automatically set.
     * @param message
     * @throws TweetTooLongException
     */
    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date(); // current time and date
    }
    /*
    public ArrayList<Mood> moodArrayList = new ArrayList<Mood>();

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
    }*/

    /**
     * Gets the current date and returns it
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Take the date from the string and set it as the date
     * @param date
     */
>>>>>>> 7d3f8f9c07768fcbfc948c25f914a39fab0ebac5
    public void setDate(Date date) {
        this.date = date;
    }

<<<<<<< HEAD
=======
    /**
     * Gets the message from the string and returns it
     * @return message
     */
>>>>>>> 7d3f8f9c07768fcbfc948c25f914a39fab0ebac5
    public String getMessage() {
        return message;
    }

<<<<<<< HEAD
    public Date getDate() {
        return date;
    }
}
=======
    /**
     * Takes the message from the string and if it too long call TweetTooLongException
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 144) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }
    public abstract Boolean isImportant();


    /**
     * Overrides the original string and returns it in a readable form
     * @return
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;

    }
}
>>>>>>> 7d3f8f9c07768fcbfc948c25f914a39fab0ebac5
