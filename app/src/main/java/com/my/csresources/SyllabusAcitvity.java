package com.my.csresources;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SyllabusAcitvity extends AppCompatActivity {
    private Button b1, b2 ,b3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus_acitvity);




    }

    public void firstYear(View v){
        String url ="https://drive.google.com/file/d/1-_85qVNy9EFOcHpyezyXrIhKiYq5S9x0/view?usp=sharing";
        Intent intent =new Intent(SyllabusAcitvity.this,WebviewActivity.class);
        intent.putExtra("url",url);
        startActivity(intent);

    }
    public void SecondtYear(View v){
        String url ="https://drive.google.com/file/d/1MMRrVESlGIsvroNcLKP1HMTQn1wUyO-w/view?usp=sharing";
        Intent intent =new Intent(SyllabusAcitvity.this,WebviewActivity.class);
        intent.putExtra("url",url);
        startActivity(intent);

    }
    public void ThirdYear(View v){
        String url ="https://drive.google.com/file/d/1tS1AaAEsCbM7F2UsW1FFcQfaW9rOYm1h/view?usp=sharing";
        Intent intent =new Intent(SyllabusAcitvity.this,WebviewActivity.class);
        intent.putExtra("url",url);
        startActivity(intent);

    }

}