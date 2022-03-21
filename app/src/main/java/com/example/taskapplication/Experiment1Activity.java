package com.example.taskapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Experiment1Activity extends AppCompatActivity {

    private Button mBtnTask2,mBtnTask3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment1);

        mBtnTask2 = findViewById(R.id.btn_task2);
        mBtnTask3 = findViewById(R.id.btn_task3);

        MyInnerOnClickListener myInnerOnClickListener = new MyInnerOnClickListener();

        mBtnTask2.setOnClickListener(myInnerOnClickListener);
        mBtnTask2.setOnClickListener(myInnerOnClickListener);
    }

    class MyInnerOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.btn_task2:
                    intent = new Intent(Experiment1Activity.this,Task2_Activity.class);
                    break;
                case R.id.btn_task3:
                    intent = new Intent(Experiment1Activity.this,Task2_Activity.class);
                default:
                    throw new IllegalArgumentException("null pointer");
            }
            startActivity(intent);
        }
    }
}