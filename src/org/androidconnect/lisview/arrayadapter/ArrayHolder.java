package org.androidconnect.lisview.arrayadapter;

import org.androidconnect.lisview.R;
import org.androidconnect.lisview.Global.Global;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ArrayHolder extends ArrayAdapter<String>{
	Context ctx = null;
	
	public ArrayHolder(Context context) {
		super(context, R.layout.simple_item , Global.COUNTRIES);
		ctx = context;
	}

	public View getView(int pos, View convertView, ViewGroup parent){
		
		ViewHolder holder = null;
		View item = convertView;
		
        if (item == null || !( item.getTag() instanceof ViewHolder)) {
        	
        	 LayoutInflater mInflater = LayoutInflater.from(ctx);
        	 item = mInflater.inflate( R.layout.simple_item, null);
             // Creates a ViewHolder and store references to the two children views we want to bind data to.
             holder = new ViewHolder();
             holder.simpleText = (TextView) item.findViewById(R.id.text);
             //Save holder
             item.setTag(holder);
        }else{
            // Get the ViewHolder back 
            holder = (ViewHolder) item.getTag();
        }
        
        String country = Global.COUNTRIES[pos];
        
        holder.simpleText.setText(country);
        
        return item;
	}
	
	class ViewHolder{
		TextView simpleText;
	}
}
