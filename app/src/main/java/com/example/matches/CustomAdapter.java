package com.example.matches;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflter;
    String[] countries={"Brazil","Argentina","Germany","England","US"};
    int images[] = {R.drawable.brazil,R.drawable.germany, R.drawable.argentina, R.drawable.england, R.drawable.us };

    public CustomAdapter(Context applicationContext, int[] flags, String[] fruit) {
        this.context = applicationContext;
        this.images = images;
        this.countries = countries;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.spinner_custom_layout, null);
        ImageView icon = (ImageView) view.findViewById(R.id.imageView);
        TextView names = (TextView) view.findViewById(R.id.textView);
        icon.setImageResource(images[i]);
        names.setText(images[i]);
        return view;
    }
}
