package com.example.administrator.a001_dialognum;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*1.首先要找到EditText和Button控件*/
        final EditText et_performNum = (EditText) findViewById(R.id.et_performNum);
        final Button bt_dialogNum = (Button) findViewById(R.id.bt_dialogNum);



        /* 2.设置Button的监听器*/
        bt_dialogNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 /* 3.获取EditText中的电话号码*/
                String DialogNumer = et_performNum.getText().toString().trim();
                /* 4.拨打电话*/
                Intent Dialogintent = new Intent();
                Dialogintent.setAction(Intent.ACTION_CALL);
                //Dialogintent.setData(Uri.parse("tel:"+DialogNumer));
                Dialogintent.setData(Uri.parse("tel:"+DialogNumer));
                startActivity(Dialogintent);
            }
        });

    }
}
