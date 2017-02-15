package ca.ualberta.cs.lonelytwitter;

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
//    public ImportantTweet(Date date, String message) throws TweetTooLongException {
//        super(date, message);
//    }
    public boolean isImportant(){
        return true;
    }
    @Override
    public String getMessage(){
        return super.getMessage() + " !!!";
    }
}
