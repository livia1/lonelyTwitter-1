package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by livialee on 2017-01-18.
 */

public class HappyMood extends Mood {
    public HappyMood() {
        super(":) ");
    }

    public HappyMood(Date d) {
        super(":)", d);
    }

}
