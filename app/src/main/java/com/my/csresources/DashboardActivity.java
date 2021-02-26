package com.my.csresources;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.my.csresources.ui.main.ContactUs;

import Practicals.Practical;
import QuestionPaper.QuestionPaper;

public class DashboardActivity extends Activity {
private Button logout;
    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        getActionBar();
        logout = findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(DashboardActivity.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        });



    }public void OpenBooks(View v){
        Intent intent = new Intent(this,BooksActivity.class);
        startActivity(intent);
    }
    public void OpenChatActivity(View view){
        Intent intent = new Intent(this,ChatActivity.class);
        startActivity(intent);
    }
    public void OpenSyllabusActivity(View view){
        Intent intent = new Intent(this,SyllabusAcitvity.class);
        startActivity(intent);
    }
    public void openQpActivity(View view){
        Intent intent = new Intent(this, QuestionPaper.class);
        startActivity(intent);
    }
    public void OpenNoticeActivity(View view){
        Intent intent = new Intent(this, NoticeActivity.class);
        startActivity(intent);
    }
    public void OpenAddPracticalActivity(View view){
        Intent intent = new Intent(this, Practical.class);
        startActivity(intent);
    } public void ContactUs(View v){
        Intent intent = new Intent(this, ContactUs.class);
        startActivity(intent);
    }


}

