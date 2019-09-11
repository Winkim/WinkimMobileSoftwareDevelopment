package com.example.casper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

public class TextViewMainActivity extends AppCompatActivity {

    private TextView textViewHelloWorld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_main);

        textViewHelloWorld=findViewById(R.id.textViewHelloWorld);
        textViewHelloWorld.setText("你好，编程实现的Hello world！");

        textViewHelloWorld.setText(R.string.hello_world2);    //直接设置字符串资源id

        //通过资源名称获得字符串，如何通过“hello_world”获得R.string.hello_world
        Context context=this.getApplicationContext();
        String resName="hello_world";
        int helloworldId=context.getResources().getIdentifier(resName,"string",context.getPackageName());
        textViewHelloWorld.setText(this.getString(helloworldId));
    }
}
