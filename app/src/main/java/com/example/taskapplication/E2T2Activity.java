package com.example.taskapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class E2T2Activity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtnTask1,mBtnOne,mBtnTwo,mBtnThree,mBtnFour,mBtnFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e2_t2);

        mBtnTask1 = findViewById(R.id.btn_e2t1);
        mBtnOne = findViewById(R.id.btn_one);
        mBtnTwo = findViewById(R.id.btn_two);
        mBtnThree = findViewById(R.id.btn_three);
        mBtnFour = findViewById(R.id.btn_four);
        mBtnFive = findViewById(R.id.btn_five);

        mBtnTask1.setOnClickListener(new MyInnerOnClickListener());
        mBtnOne.setOnClickListener(this);
        mBtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(E2T2Activity.this, "anonymous Two", Toast.LENGTH_LONG).show();
            }
        });
        mBtnThree.setOnClickListener(new MyInnerOnClickListener());
        mBtnFour.setOnClickListener(new MyOuterOnClickListener());
    }
    public void showToast(View view) {
        Toast.makeText(this,"Layout Click",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Activity click", Toast.LENGTH_LONG).show();
    }
    class MyInnerOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch(view.getId()){
                case R.id.btn_e2t1:
                    intent = new Intent(E2T2Activity.this, Experiment2Activity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_three:
                    Toast.makeText(E2T2Activity.this,"Inner Three",Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}


class MyOuterOnClickListener implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn_three:
                Log.i("tag", "父类的onclick事件: ");
                break;
        }
    }
}

