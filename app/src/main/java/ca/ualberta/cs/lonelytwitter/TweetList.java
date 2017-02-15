package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

import static junit.framework.Assert.assertTrue;

/**
 * Created by livialee on 2017-02-14.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    //addTweet() -- should throw an IllegalArgumentException when one tries to add a duplicate tweet

    public void add(Tweet tweet){
        if (tweets.contains(tweet)) {
            throw new IllegalArgumentException("Already has that tweet");
        } else {
            tweets.add(tweet);
        }
    };

    //hasTweet() -- should return true if there is a tweet that equals() another tweet
    public boolean hasTweet(Tweet tweet){

        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    //getTweets() -- should return a list of tweets in chronological order
    public Tweet getTweet(int index){
        return tweets.get(index);
    }
    //getCount() -- should accurately count up the tweets
    public int getCount(){
        return tweets.size();
    }

}
