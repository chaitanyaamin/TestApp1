package com.testApp.github;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by chaitanya on 27/3/16.
 */
class MyAdapter extends ArrayAdapter<String> {

    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View theView = theInflater.inflate(R.layout.row_layout, parent, false);

        String tvShow = getItem(position);

        TextView theTextView = (TextView) theView.findViewById(R.id.textView1);

        theTextView.setText(tvShow);

        ImageView theImageView = (ImageView) theView.findViewById((R.id.imageView1));

        switch (position) {
            case 1:
                theImageView.setImageResource(R.drawable.apple);
                break;
            case 2:
                theImageView.setImageResource(R.drawable.circle);
                break;
            case 3:
                theImageView.setImageResource(R.drawable.photo);
                break;
            case 4:
                theImageView.setImageResource(R.drawable.info);
                break;
            default:
                theImageView.setImageResource(R.drawable.dot);
        }


        return theView;
    }
}
