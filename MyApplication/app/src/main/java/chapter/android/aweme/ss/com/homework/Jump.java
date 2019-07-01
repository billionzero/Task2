package chapter.android.aweme.ss.com.homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DialogTitle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Jump extends AppCompatActivity {
    private static final String TAG = "Jump";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jump);
        Log.d(TAG, "onCreate: 12333");
        Button button=findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                switch (intent.getIntExtra("st",-1)){
                    case 1:
                        Toast.makeText(Jump.this,"粉丝",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(Jump.this,"赞",Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(Jump.this,"@我的",Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(Jump.this,"评论",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
