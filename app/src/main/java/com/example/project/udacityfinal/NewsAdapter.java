package com.example.project.udacityfinal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mosta on 2/6/2019.
 */


public class NewsAdapter extends ArrayAdapter<News> {


    public NewsAdapter(@NonNull Context context, @NonNull List<News> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;


        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }
        final News current = getItem(position);

        TextView title = (TextView) listItemView.findViewById(R.id.title_text_view);
        title.setText(current.getTitle());

        TextView type = listItemView.findViewById(R.id.text_view_type);
        type.setText(current.getType());

        TextView date = listItemView.findViewById(R.id.date_text_view);
        date.setText(current.getDate());

        TextView section = listItemView.findViewById(R.id.section_text_view);
        section.setText(current.getSection());


        return listItemView;

    }

}