package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
public class ImportantTweet extends Tweet{

    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }


=======
import java.util.Date;

/**
 * Created by livia1 on 1/17/17.
 */

/**
 *
 */
public class ImportantTweet extends Tweet {
    public ImportantTweet(String message) throws TweetTooLongException {
        super(message);
    }
    public ImportantTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
    @Override
    public String getMessage(){
        return super.getMessage() + " !!!";
    }
>>>>>>> 7d3f8f9c07768fcbfc948c25f914a39fab0ebac5
}
