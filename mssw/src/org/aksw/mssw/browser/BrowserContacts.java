package org.aksw.mssw.browser;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.aksw.mssw.Constants;
import org.aksw.mssw.MsswPreferenceActivity;
import org.aksw.mssw.R;

import android.app.ListActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.ResourceCursorAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class BrowserContacts extends ListActivity {

	private static final String TAG = "msswBrowserContacts";

	/**
	 * should be replaced by something saved in the Application Context to use it also in MeCard
	 * @deprecated
	 */
	private static String selectedWebID;
	
	private static ResourceCursorAdapter rca; 

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.browser_contacts);
		

		/**
		 * retrieve WebID first from savedInstanceState than from SharedPreferences
		 */
		if (selectedWebID == null) {
			SharedPreferences sharedPreferences = PreferenceManager
					.getDefaultSharedPreferences(getApplicationContext());
			selectedWebID = sharedPreferences.getString("me", Constants.EXAMPLE_webId);
		}

		try {
			String enc = "UTF-8";

			Uri contentUri = Uri.parse(Constants.FOAF_CONTENT_URI + "/person/friends/"
					+ URLEncoder.encode(selectedWebID, enc));

			Log.v(TAG, "Starting Query with uri: <" + contentUri.toString()
					+ ">.");

			Cursor rc = managedQuery(contentUri, null, null, null, null);
			
			String[] from = new String[]{"objectReadable", "predicatReadable"};
			int[] to = {R.id.firstLine,R.id.secondLine};
			rca = new SimpleCursorAdapter(getApplicationContext(), R.layout.contact_row, rc, from, to);
			
			ListView list = (ListView) this.findViewById(android.R.id.list);
			list.setAdapter(rca);

		} catch (UnsupportedEncodingException e) {
			Log.e(TAG,
					"Could not encode URI and so couldn't get Resource from "
							+ Constants.FOAF_AUTHORITY + ".", e);
			TextView empty = (TextView) this.findViewById(android.R.id.empty);
			empty.setText("Could not encode URI and so couldn't get Resource from "
					+ Constants.FOAF_AUTHORITY + ".");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.browser, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent i;
		switch (item.getItemId()) {
		case R.id.itemPref:
			i = new Intent(this, MsswPreferenceActivity.class);
			startActivity(i);
			return true;
		case R.id.itemMe:
			i = new Intent(this, BrowserMeCard.class);
			startActivity(i);
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
}
