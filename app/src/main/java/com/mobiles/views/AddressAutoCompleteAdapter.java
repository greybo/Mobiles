package com.mobiles.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.mobiles.R;
import com.mobiles.entity.Mobiles;

import java.util.ArrayList;
import java.util.List;


public class AddressAutoCompleteAdapter extends BaseAdapter implements Filterable {

    private final static int MAX_RESULTS = 3;
    private final Context mContext;
    private List<Mobiles> mResults;
    private String name;

    public AddressAutoCompleteAdapter(Context context, String name) {
        mContext = context;
        mResults = new ArrayList<>();
        this.name = name;
    }

    @Override
    public int getCount() {
        return mResults.size();
    }

    @Override
    public Mobiles getItem(int index) {
        return mResults.get(index);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(R.layout.item_autocomplete, parent, false);
        }
        Mobiles mobiles = getItem(position);
        ((TextView) convertView.findViewById(R.id.text1)).setText("ttttt");
        return convertView;
    }

    @Override
    public Filter getFilter() {
        Filter filter = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults filterResults = new FilterResults();
                List<Mobiles> mobilesList = new ArrayList<>();
                if (constraint != null) {

                    Mobiles mobiles ;

                    // Assign the data to the FilterResults
                    filterResults.values = mobilesList;
                    filterResults.count = mobilesList.size();
                }
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                if (results != null && results.count > 0) {
                    mResults = (List<Mobiles>) results.values;
                    notifyDataSetChanged();
                } else {
                    notifyDataSetInvalidated();
                }
            }
        };

        return filter;
    }


}