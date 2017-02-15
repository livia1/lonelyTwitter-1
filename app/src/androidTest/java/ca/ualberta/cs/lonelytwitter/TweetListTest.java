package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by livialee on 2017-02-14.
 * git clone -b lab6-start --single-branch https://github.com/zholland/lonelytwitter
 */

public class TweetListTest extends ActivityInstrumentationTestCase2{

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));   // Will return green and 1 test passed
        //assertFalse(tweets.hasTweet(tweet));    // Will return red and 1 test failed
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");
        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
        //Both of these uncommented will return All 2 tests passed
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Last Tweet");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
        //makes sure that we are deleting from the arraylist and that we are actually deleting it
    }

    public void testStrings(){
        assertEquals("'test' should be 'test'", "test", "test");
        assertTrue("'test' should start with 't'", "test".startsWith("t"));
    }

    public void testDuplicate(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Duplicate tweet");
        Tweet tweetDup = new NormalTweet("Duplicate tweet");

        tweets.add(tweet);
        try {
            tweets.add(tweetDup);
        }catch (IllegalArgumentException e){

        }
    }
    public void testGetList(){
        ArrayList<Tweet> tweetlist = new ArrayList<Tweet>();
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet1");
        Tweet tweet2 = new NormalTweet("test tweet2");

        tweets.add(tweet);
        tweets.add(tweet2);
        tweetlist.add(tweet);
        tweetlist.add(tweet2);

        ArrayList<Tweet> returnedList = tweets.getTweets();

        assertEquals(tweetlist, returnedList);

    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Hello moto");
        Tweet tweet1 = new NormalTweet("Hello moto, I'm another tweet");

        tweets.add(tweet);
        tweets.add(tweet1);

        assertEquals(tweets.getCount(), 2);
    }
	public void testHasTweet(){
		TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Do I have this tweet");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
	}
}
