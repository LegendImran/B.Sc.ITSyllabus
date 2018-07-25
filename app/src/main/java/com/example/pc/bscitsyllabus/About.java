package com.example.pc.bscitsyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class About extends AppCompatActivity {

    TextView h,t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        h=(TextView)findViewById(R.id.head1);
        t=(TextView)findViewById(R.id.text1);

        Toolbar toolbar=(Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        Intent intent=getIntent();
        h.setText(intent.getStringExtra("head"));
        t.setText(intent.getStringExtra("text"));
    }
}
