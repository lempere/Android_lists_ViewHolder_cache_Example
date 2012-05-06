package org.androidconnect.lisview;

import org.androidconnect.lisview.arrayadapter.ArrayCache;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewActivityCache extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Create new Adapter from the String Array Global.countries
        ArrayAdapter<String> countriesCacheAdapter = new ArrayCache(getApplicationContext());
        //Set Adapter to ListActivity
        setListAdapter(countriesCacheAdapter);
        getListView().setTextFilterEnabled(true);
        //set listener onclick
        getListView().setOnItemClickListener(new OnCountriesClick() );
    }
    
	private class OnCountriesClick implements OnItemClickListener {

		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			LinearLayout linear = (LinearLayout) arg1 ;
			String country = (String) ((TextView)linear.findViewById(R.id.text)).getText();
			Toast.makeText(getApplicationContext(), "Clicked: " + country +" position "+arg2 , Toast.LENGTH_SHORT).show();
		}
	}
}