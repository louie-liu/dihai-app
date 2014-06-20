package com.Gaia.dihai.adapter;
import android.widget.BaseAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import java.util.List;
import android.widget.TextView;
import com.Gaia.dihai.R;

import com.Gaia.dihai.dummy.DummyContent;

public class KindListAdapter<T> extends ArrayAdapter {
    private static int[]  kinds_background_id=
        new int[]{
            R.drawable.ic_home_background,
            R.drawable.ic_mylist_background,
            R.drawable.ic_friends_background,
            R.drawable.ic_devices_background,
            R.drawable.ic_settings_background    
        };
    private LayoutInflater mInflater;

    public KindListAdapter(Context context, int resource, int textViewResourceId, List<T> objects){
        super(context, resource, textViewResourceId, objects);
        mInflater = LayoutInflater.from(context);

    }

    private class ViewHolder {
        TextView text;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.kind_list_layout, null);
            holder = new ViewHolder();
            holder.text = (TextView)convertView.findViewById(R.id.kind_item);
            holder.text.setBackgroundResource(kinds_background_id[pos]);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder)convertView.getTag();
        }
        
        
        return convertView;
        
        }


    
}
