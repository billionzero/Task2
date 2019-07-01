package chapter.android.aweme.ss.com.homework;

import android.content.Context;
import android.nfc.Tag;
import android.nfc.tech.TagTechnology;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.security.spec.ECField;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
/**
 * 可以分析出这个问题可看做是树的遍历，使用地柜较为方便
 * 每次进入下次递归前，先判定是否有子层，若有则递归；若没有，count加1
 * 递归结束时，第一个textview的内容即为结果
 */
public class Exercises2 extends AppCompatActivity {
    private static final String TAG = "Exercises2";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise1);
        TextView textView=findViewById(R.id.textView2);
        textView.setText(""+getViewCount(findViewById(R.id.iop)));
    }

    public static int getViewCount(View view) {
        //todo 补全你的代码
        ViewGroup viewGroup;
        try {
            viewGroup = (ViewGroup) view;
        }
        catch (Exception e){
            Log.e(TAG, "getViewCount: ",e );
            return 1;
        }
        int v_count=viewGroup.getChildCount();
        int count=0;
        for (int i=0;i<v_count;i=i+1){
            count=count+getViewCount(viewGroup.getChildAt(i));
        }
        return count;
    }
}
