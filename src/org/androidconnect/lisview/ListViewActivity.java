package org.androidconnect.lisview;

import org.androidconnect.lisview.Global.Global;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewActivity extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Create new Adapter from the String Array Global.countries
        ArrayAdapter<String> countriesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Global.COUNTRIES);
        //Set Adapter to ListActivity
        setListAdapter(countriesAdapter);
        getListView().setTextFilterEnabled(true);
        //set listener onclick
        getListView().setOnItemClickListener(new OnCountriesClick() );
    }
    
	private class OnCountriesClick implements OnItemClickListener {

		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			TextView text_click = (TextView) arg1 ;
			Toast.makeText(getApplicationContext(), "Clicked: " + text_click.getText() +" position "+arg2 , Toast.LENGTH_SHORT).show();
		}
	}
}