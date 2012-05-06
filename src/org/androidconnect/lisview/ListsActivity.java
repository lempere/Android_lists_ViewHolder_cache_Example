package org.androidconnect.lisview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ListsActivity extends Activity{

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button bt_listview = (Button) findViewById(R.id.listview);  
        bt_listview.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), ListViewActivity.class);
				startActivity(intent);
			}
		});
        Button bt_listviewSimple = (Button) findViewById(R.id.listview_simple);  
        bt_listviewSimple.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), ListViewActivitySimple.class);
				startActivity(intent);
			}
		});
        Button bt_listviewHolder = (Button) findViewById(R.id.listview_holder);
        bt_listviewHolder.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), ListViewActivityHolder.class);
				startActivity(intent);
			}
		});
        Button bt_listviewCache = (Button) findViewById(R.id.listview_holdercache);
        bt_listviewCache.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), ListViewActivityCache.class);
				startActivity(intent);
			}
		});
    }
}
