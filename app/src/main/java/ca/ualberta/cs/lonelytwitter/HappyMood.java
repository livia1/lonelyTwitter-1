package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by livialee on 2017-01-18.
 */


/**
 * The happyMood class that appends a :) at the end of the tweet
 */
public class HappyMood extends Mood {
    public HappyMood(String m) {
        super(m);
    }

    public HappyMood(String m, Date d) {
        super(m, d);
    }

    @Override
    public String getMood(){
        return super.getMood() + " :)";
    }
}
