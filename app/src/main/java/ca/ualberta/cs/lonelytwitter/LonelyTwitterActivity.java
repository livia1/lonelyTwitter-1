package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by livia1 on 1/1/17
 *
 */

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * This class is the main view class of the projec. <br> In this class, user interaction
 * and file manipulation is performed.
 * All files are in teh form of "json" files that are stored in Emulator's accessible from Android
 * Device Monitor
 * <pre>
 *     pre-formatted text <br>
 *         	File Explorer -> data -> data -> ca.ualberta.cs.lonelytwitter -> files -> file.save
 * </pre>
 * <code> begin <br>
 * some pseudo code <br>
 * end.</code>
 * The file name is indicated in the &nbsp &nbsp &nbsp FILENAME constant
 * <ul>
 *     	<li> item 1 </li>
 *     	<li> item 2 </li>
 *     	<li> item 3 </li>
 * </ul>
 * <ol>
 *     	<li> item a </li>
 *     	<li> item b </li>
 *     	<li> item c </li>
 * </ol>
 * @author livialee
 * @version 1.0
 * @see Tweet
 * @since 0.5
 */
public class LonelyTwitterActivity extends Activity {
	/*
	* The file that all the tweets are saved there. The format of the file is JSON.
	* @see #loadFromFile()
	* @see #saveInFile()
	*/
	private static final String FILENAME = "file1.sav";
	private enum TweetListOrdering {DATE_ASCENDING, DATE_DESCENDING, TEXT_ASCENDING, TEXT_DESENDING}
	private EditText bodyText;
	private ListView oldTweetsList;

	private ArrayList<Tweet> tweetList;
	private ArrayAdapter<Tweet> adapter;


	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
        Button clearButton = (Button) findViewById(R.id.clear);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

		try {

			Tweet tweet = new NormalTweet ("First tweet");
			ImportantTweet importantTweet = new ImportantTweet("Very Important");
			NormalTweet normalTweet = new NormalTweet("im normal");
            importantTweet.getDate();

			ArrayList<Tweet> arrayList = new ArrayList<Tweet>();
			arrayList.add(tweet);
			arrayList.add(importantTweet);
			arrayList.add(normalTweet);

		} catch (TweetTooLongException e){
			e.printStackTrace();
		}

        clearButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                setResult(RESULT_OK);
                tweetList.clear();
                adapter.notifyDataSetChanged();
                saveInFile();
            }
        });

		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				String text = bodyText.getText().toString();

				text = trimExtraSpaces(text);
				Tweet tweet = new NormalTweet(text);
				throw TweetTooLongException;

				/**
                Tweet tweet = null;
                try {
                    tweet = new NormalTweet(text);
                } catch (TweetTooLongException e) {
                    e.printStackTrace();
                }*/

                tweetList.add(tweet);
                adapter.notifyDataSetChanged();
				saveInFile();
			}
		});
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();

		loadFromFile();

		adapter = new ArrayAdapter<Tweet>(this, R.layout.list_item, tweetList);
		oldTweetsList.setAdapter(adapter);
	}

	/**
	 * Trims extra spaces using regular expression
	 * @param inputString string that needs to be cleared of extra spaces
	 * @return resulting string without
     */

	private String trimExtraSpaces(String inputString) {
		inputString = inputString.replaceAll("\\s+", " ");
		return inputString;
	}

	/**
	 * This method sorts items in the tweet list and refreshes the adapter.
	 * @param ordering ordering to be used
     */
	private void sortTweetListItems(TweetListOrdering ordering){


	}

	/**
	 * Loads file from specified file.
	 *
	 * @throws TweetTooLongException if the text is too long.
	 * @exception FileNotFoundException if the file is not created first.
	 */
	private void loadFromFile() {
		ArrayList<String> tweets = new ArrayList<String>();
		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));

			Gson gson = new Gson();

			// Taken from http://stackoverflow.com/questions/12384064/gson-convert-from-json-to-a on Jan 24

			Type listType = new TypeToken<ArrayList<NormalTweet>>(){}.getType();
			tweetList = gson.fromJson(in, listType);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			tweetList = new ArrayList<Tweet>();
            throw new RuntimeException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}

	/**
	 * Saves tweets to a specified file in JSON format.
	 * @throws FileNotFoundException if file folder doesn't exist
	 */

	private void saveInFile() {
		try {
			FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));

			Gson gson = new Gson();
			gson.toJson(tweetList, out);
			out.flush();

			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}
}