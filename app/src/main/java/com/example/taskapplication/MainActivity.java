package com.example.taskapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_e1,btn_e2,btn_e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_e1 = findViewById(R.id.btn_experi1);
        btn_e2 = findViewById(R.id.btn_experi2);
        btn_e3 = findViewById(R.id.btn_experi3);

        ClickListener clickListener = new ClickListener();

        btn_e1.setOnClickListener(clickListener);
        btn_e2.setOnClickListener(clickListener);
        btn_e3.setOnClickListener(clickListener);
    }

    class ClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.btn_experi1:
                    intent = new Intent(MainActivity.this, Experiment1Activity.class);
                    break;
                case R.id.btn_experi2:
                    intent = new Intent(MainActivity.this, E2T2Activity.class);
                    break;
                case R.id.btn_experi3:
                    intent = new Intent(MainActivity.this,Experiment3Activity.class);
                    break;
                default:
                    throw new IllegalArgumentException("null pointer");
            }
            startActivity(intent);
        }
    }
}