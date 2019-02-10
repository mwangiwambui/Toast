package com.example.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int myCount=0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount= (TextView)findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }


    public void countUp(View view) {
        myCount++;
        if (mShowCount!=null){
            mShowCount.setText(Integer.toString(myCount));
        }


    }

    public void resetIt(View view) {
        myCount=0;
        mShowCount.setText(Integer.toString(myCount));
    }
}
