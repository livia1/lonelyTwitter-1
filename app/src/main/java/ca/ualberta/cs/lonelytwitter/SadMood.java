package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by livialee on 2017-01-18.
 */

public class SadMood extends Mood {
    public SadMood() {
        super(":(");
    }

    public SadMood(Date d) {
        super(":(", d);
    }

}
