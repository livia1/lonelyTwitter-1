package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
public class TweetTooLongException extends Exception{

=======
/**
 * Created by livia1 on 1/17/17.
 */

/**
 * The exception class if the tweet is too long.
 */
public class TweetTooLongException extends Exception {
    public TweetTooLongException() { }

    public TweetTooLongException(String detailMessage) {
        super(detailMessage);
    }
>>>>>>> 7d3f8f9c07768fcbfc948c25f914a39fab0ebac5
}
