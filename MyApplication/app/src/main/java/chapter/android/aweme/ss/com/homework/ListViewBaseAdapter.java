package chapter.android.aweme.ss.com.homework;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import chapter.android.aweme.ss.com.homework.widget.CircleImageView;

public class ListViewBaseAdapter extends ArrayAdapter {
    private final int resourceId;

    public ListViewBaseAdapter(Context context, int textViewResourceId, List<Item> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        Item item=(Item)getItem(position);
        View view=LayoutInflater.from(getContext()).inflate(resourceId,null);
        CircleImageView circleImageViewimageView=view.findViewById(R.id.iv_avatar);
        TextView textView=view.findViewById(R.id.tv_title);
        TextView textView1=view.findViewById(R.id.tv_description);
        TextView textView2=view.findViewById(R.id.tv_time);
        circleImageViewimageView.setImageResource(item.getCircleImageViewId());
        textView.setText(item.getTextView());
        textView1.setText(item.getTextView1());
        textView2.setText(item.getTextView2());
        return view;
    }
}
