package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
public class NormalTweet extends Tweet {

    public NormalTweet(String message) {
        super(message);
    }

    @Override
=======
import java.util.Date;

/**
 * Created by livia1 on 1/17/17.
 */
public class NormalTweet extends Tweet {
    /**
     * Instantiates a new Normal tweet.
     *
     * @param date    the date
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public NormalTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public NormalTweet(String message) throws TweetTooLongException {
        super(message);
    }

>>>>>>> 7d3f8f9c07768fcbfc948c25f914a39fab0ebac5
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
<<<<<<< HEAD
=======


>>>>>>> 7d3f8f9c07768fcbfc948c25f914a39fab0ebac5
