package com.example.taskapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Experiment3Activity extends AppCompatActivity {
    private RadioGroup mRgSex;
    private Button mBtnCommit;
    private CheckBox mCbPainting,mCbSinging,mCbSwimming,mCbDancing;
    private Boolean flagPainging,flagSinging,flagSwimming,flagDancing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment3);
        mRgSex = findViewById(R.id.rg_sex);
        mBtnCommit = findViewById(R.id.btn_commit);
        mCbPainting=findViewById(R.id.cb_painting);
        mCbSinging=findViewById(R.id.cb_singing);
        mCbSwimming=findViewById(R.id.cb_swimming);
        mCbDancing=findViewById(R.id.cb_dancing);
        flagPainging=false;
        flagSinging=false;
        flagSwimming=false;
        flagDancing=false;

        MyCheckBoxListener myCheckBoxListener = new MyCheckBoxListener();
        mCbPainting.setOnCheckedChangeListener(myCheckBoxListener);
        mCbSwimming.setOnCheckedChangeListener(myCheckBoxListener);
        mCbSinging.setOnCheckedChangeListener(myCheckBoxListener);
        mCbDancing.setOnCheckedChangeListener(myCheckBoxListener);

        mRgSex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = findViewById(i);
                Toast.makeText(Experiment3Activity.this,radioButton.getText(),Toast.LENGTH_LONG).show();
            }
        });


        mBtnCommit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Experiment3Activity.this,"the resume has commited!",Toast.LENGTH_LONG).show();
                startActivity(new Intent(Experiment3Activity.this,E3T2Activity.class));
            }
        });


    }
    private class MyCheckBoxListener implements CompoundButton.OnCheckedChangeListener{
        public void onCheckedChanged(CompoundButton buttonview, boolean isChecked){
            switch (buttonview.getId()){
                case R.id.cb_painting:
                    if(!flagPainging){
                        Toast.makeText(Experiment3Activity.this,buttonview.getText()+" clicked",Toast.LENGTH_LONG).show();
                        flagPainging = !flagPainging;
                    }else{
                        Toast.makeText(Experiment3Activity.this,buttonview.getText()+" unclicked",Toast.LENGTH_LONG).show();
                        flagPainging = !flagPainging;
                    }
                    break;
                case R.id.cb_singing:
                    if(!flagSinging){
                        Toast.makeText(Experiment3Activity.this,buttonview.getText()+" clicked",Toast.LENGTH_LONG).show();
                        flagSinging = !flagSinging;
                    }else{
                        Toast.makeText(Experiment3Activity.this,buttonview.getText()+" unclicked",Toast.LENGTH_LONG).show();
                        flagSinging = !flagSinging;
                    }
                    break;
                case R.id.cb_swimming:
                    if(!flagSwimming){
                        Toast.makeText(Experiment3Activity.this,buttonview.getText()+" clicked",Toast.LENGTH_LONG).show();
                        flagSwimming = !flagSwimming;
                    }else{
                        Toast.makeText(Experiment3Activity.this,buttonview.getText()+" unclicked",Toast.LENGTH_LONG).show();
                        flagSwimming = !flagSwimming;
                    }
                    break;
                case R.id.cb_dancing:
                    if(!flagDancing){
                        Toast.makeText(Experiment3Activity.this,buttonview.getText()+" clicked",Toast.LENGTH_LONG).show();
                        flagDancing = !flagDancing;
                    }else{
                        Toast.makeText(Experiment3Activity.this,buttonview.getText()+" unclicked",Toast.LENGTH_LONG).show();
                        flagDancing = !flagDancing;
                    }
                    break;
            }
        }

    }
}