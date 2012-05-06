package org.androidconnect.lisview.arrayadapter;

import org.androidconnect.lisview.R;
import org.androidconnect.lisview.Global.Global;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ArrayCache extends ArrayAdapter<String>{
	Context ctx = null;
	
	public ArrayCache(Context context) {
		super(context, R.layout.add_item , Global.COUNTRIES);
		ctx = context;
	}

	public View getView(int pos, View convertView, ViewGroup parent){
		
		ViewHolder holder = null;
		View item = convertView;
		
        if (item == null || !(item.getTag() instanceof ViewHolder)) {
        	
        	 LayoutInflater mInflater = LayoutInflater.from(ctx);
        	 item = mInflater.inflate( R.layout.add_item, null);
             // Creates a ViewHolder and store references to the two children views we want to bind data to.
             holder = new ViewHolder();
             holder.image = (ImageView) item.findViewById(R.id.image);
             holder.simpleText = (TextView) item.findViewById(R.id.text);
             //Save holder
             item.setTag(holder);
        }else{
            // Get the ViewHolder back to get fast access to the TextView
            // and the ImageView.
            holder = (ViewHolder) item.getTag();
        }
        
        String country = Global.COUNTRIES[pos];
        
        holder.simpleText.setText(country);
        
        //Save image to cache
        if (Cache.add == null){
            Cache.add = ctx.getResources().getDrawable(R.drawable.plus);
        }
        holder.image.setBackgroundDrawable(Cache.add);
        return item;
	}
	
	class ViewHolder{
		TextView simpleText;
		ImageView image;
	}
	static class Cache{
		static Drawable add = null;
	}
}
