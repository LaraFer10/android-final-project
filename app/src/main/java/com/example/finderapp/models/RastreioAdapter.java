package com.example.finderapp.models;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.finderapp.R;

import java.util.List;

public class RastreioAdapter extends BaseAdapter {
    private final List<Event> events;
    private final Activity act;

    public RastreioAdapter(List<Event> events, Activity act) {
        this.events = events;
        this.act = act;
    }

    @Override
    public int getCount() {
        return events.size();
    }

    @Override
    public Object getItem(int position) {
        return events.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.activit_status_list, parent, false);
        Event event = events.get(position);

        TextView title = view.findViewById(R.id.text1);
        TextView date = view.findViewById(R.id.text2);
        TextView status = view.findViewById(R.id.text3);

        title.setText(event.getStatus());
        date.setText(event.getDate() + " - " + event.getHour());
        status.setText(event.getSubStatus().get(0));

        return view;
    }

}
