package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by livialee on 2017-01-18.
 */

public class SadMood extends Mood {
    public SadMood(String m) {
        super(m);
    }

    public SadMood(String m, Date d) {
        super(m, d);
    }
    @Override
    public String getMood(){
        return super.getMood() + " :(";
    }

}
