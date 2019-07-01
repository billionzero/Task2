package chapter.android.aweme.ss.com.homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * 大作业:实现一个抖音消息页面,所需资源已放在res下面
 * 另有三个class：Item Jump ListViewBaseAdpter
 * 分别实现对一个item的记录，待跳转界面，
 * 继承ArrayAdapter并重写getView方法以便完成对ListView中的一项的绘制
 */
public class Exercises3 extends AppCompatActivity {
    private List<Item> itemList = new ArrayList<Item>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise3);
        Item item;
        item=new Item(R.drawable.session_system_notice,"1234",
                "eeer","41分钟前");
        itemList.add(item);
        item=new Item(R.drawable.session_stranger,"1234",
                "eeer","4分钟前");
        itemList.add(item);
        item=new Item(R.drawable.session_robot,"1234",
                "eeer","41分钟前");
        itemList.add(item);
        item=new Item(R.drawable.session_system_notice,"1234",
                "eeer","4分钟前");
        itemList.add(item);
        item=new Item(R.drawable.session_stranger,"1234",
                "eeer","4分钟前");
        itemList.add(item);
        item=new Item(R.drawable.session_robot,"1234",
                "eeer","14分钟前");
        itemList.add(item);
        item=new Item(R.drawable.session_system_notice,"1234",
                "eeer","4分钟前");
        itemList.add(item);
        item=new Item(R.drawable.session_robot,"1234",
                "eeer","42分钟前");
        itemList.add(item);
        item=new Item(R.drawable.session_system_notice,"1234",
                "eeer","44分钟前");
        itemList.add(item);
        item=new Item(R.drawable.session_stranger,"1234",
                "eeer","4分钟前");
        itemList.add(item);
        item=new Item(R.drawable.session_stranger,"1234",
                "eeer","45分钟前");
        itemList.add(item);
        item=new Item(R.drawable.session_robot,"1234",
                "eeer","54分钟前");
        itemList.add(item);
        item=new Item(R.drawable.session_system_notice,"1234",
                "eeer","14分钟前");
        itemList.add(item);
        item=new Item(R.drawable.session_stranger,"1234",
                "eeer","42分钟前");
        itemList.add(item);
        item=new Item(R.drawable.session_robot,"1234",
                "eeer","45分钟前");
        itemList.add(item);
        ListViewBaseAdapter listViewBaseAdapter=new ListViewBaseAdapter(this,R.layout.im_list_item,itemList);
        ListView listView=findViewById(R.id.list_view);
        listView.setAdapter(listViewBaseAdapter);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(Exercises3.this,Jump.class);
                intent.putExtra("st",1);
                startActivity(intent);
            }
        });
        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(Exercises3.this,Jump.class);
                intent.putExtra("st",4);
                startActivity(intent);
            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(Exercises3.this,Jump.class);
                intent.putExtra("st",2);
                startActivity(intent);
            }
        });
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(Exercises3.this,Jump.class);
                intent.putExtra("st",3);
                startActivity(intent);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(Exercises3.this,Chat.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });
    }

}
