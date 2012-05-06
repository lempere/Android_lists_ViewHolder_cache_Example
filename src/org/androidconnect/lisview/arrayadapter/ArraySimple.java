package org.androidconnect.lisview.arrayadapter;

import org.androidconnect.lisview.R;
import org.androidconnect.lisview.Global.Global;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ArraySimple extends ArrayAdapter<String>{
	Context ctx = null;
	
	public ArraySimple(Context context) {
		super(context, R.layout.simple_item , Global.COUNTRIES);
		ctx = context;
	}

	public View getView(int pos, View convertView, ViewGroup parent){
		
		View item = convertView;
		
    	 LayoutInflater mInflater = LayoutInflater.from(ctx);
    	 item = mInflater.inflate( R.layout.simple_item, null);
    	 TextView simpleText = (TextView) item.findViewById(R.id.text);
    	 
        String country = Global.COUNTRIES[pos];
        
        simpleText.setText(country);
        
        return item;
	}
}
