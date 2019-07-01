package chapter.android.aweme.ss.com.homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Chat extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom);
        TextView textView=findViewById(R.id.tv_content_info);
        Intent intent=getIntent();
        textView.setText(""+intent.getIntExtra("position",-1));
    }
}
