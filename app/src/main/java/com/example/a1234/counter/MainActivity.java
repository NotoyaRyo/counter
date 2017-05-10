package com.example.a1234.counter;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button button1;
    private Button button2;
    private TextView textView;
    private int counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.pushBtn);
        button2 = (Button) findViewById(R.id.resetBtn);
        textView = (TextView) findViewById(R.id.tv);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);



    }

    @Override
    public void onClick(View view){

        switch(view.getId()){
            case R.id.pushBtn:
                counter ++;
                break;
            case R.id.resetBtn:
                counter = 0;
                break;
        }

        textView.setText("" + counter);

    }
}
