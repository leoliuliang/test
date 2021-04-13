package com.mxkj.demo01_daili;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et = findViewById(R.id.tvText);
        int len = et.getText().length();
        System.out.println(len);

        et.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
//                int end= et.getSelectionEnd();
//                System.out.println(end);
//                System.out.println(scrollX);
//                System.out.println(oldScrollX);
                float textLen = et.getPaint().measureText(et.getText().toString());
                int etWidth = et.getWidth();
                if(scrollX>(textLen-etWidth)){
                    System.out.println("隐藏");
                }else{
                    System.out.println("显示");
                }
            }
        });
    }
}