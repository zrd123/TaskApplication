package com.example.taskapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class E3T2Activity extends AppCompatActivity {
    private ImageView imageView;
    private RadioButton mRbCat,mRbDog,mRbParrot,mRbHamster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e3_t2);
        mRbCat = findViewById(R.id.rb_cat);
        mRbParrot = findViewById(R.id.rb_parrot);
        mRbDog = findViewById(R.id.rb_dog);
        mRbHamster = findViewById(R.id.rb_hamster);
        imageView = findViewById(R.id.iv_picture);

        MyOnClickListener myOnClickListener = new MyOnClickListener();
        mRbCat.setOnClickListener(myOnClickListener);
        mRbParrot.setOnClickListener(myOnClickListener);
        mRbDog.setOnClickListener(myOnClickListener);
        mRbHamster.setOnClickListener(myOnClickListener);
    }

    private class MyOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.rb_cat:
                    imageView.setImageResource(R.mipmap.cat);
                    break;
                case R.id.rb_dog:
                    imageView.setImageResource(R.mipmap.dog);
                    break;
                case R.id.rb_parrot:
                    imageView.setImageResource(R.mipmap.parrot);
                    break;
                case R.id.rb_hamster:
                    imageView.setImageResource(R.mipmap.hamster);
                    break;
            }
        }
    }
}