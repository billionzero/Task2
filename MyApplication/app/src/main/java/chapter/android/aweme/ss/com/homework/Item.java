package chapter.android.aweme.ss.com.homework;

import android.widget.TextView;

import chapter.android.aweme.ss.com.homework.widget.CircleImageView;

public class Item {
    private int circleImageViewId;
    private String textView,textView1,textView2;

    public Item(int circleImageViewId, String textView,String textView1,String textView2) {
        this.circleImageViewId=circleImageViewId;
        this.textView=textView;
        this.textView1=textView1;
        this.textView2=textView2;
    }

    public int getCircleImageViewId(){
        return circleImageViewId;
    }

    public String getTextView(){
        return textView;
    }

    public String getTextView1() {
        return textView1;
    }

    public String getTextView2(){
        return textView2;
    }
}
