package com.example.pc.bscitsyllabus;

import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class FYIT extends AppCompatActivity {

    Button fyobj,ipobj,deobj,osobj,dmobj,csobj,oopobj,maobj,wpobj,nsmobj,gcobj,send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyit);

        fyobj=(Button)findViewById(R.id.fys);
        //send=(Button)findViewById(R.id.send);
        ipobj=(Button)findViewById(R.id.ip);
        deobj=(Button)findViewById(R.id.de);
        osobj=(Button)findViewById(R.id.os);
        dmobj=(Button)findViewById(R.id.dm);
        csobj=(Button)findViewById(R.id.cs);
        oopobj=(Button)findViewById(R.id.oops);
        maobj=(Button)findViewById(R.id.ma);
        wpobj=(Button)findViewById(R.id.wp);
        nsmobj=(Button)findViewById(R.id.nsm);
        gcobj=(Button)findViewById(R.id.gc);

        Toolbar toolbar=(Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        fyobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(FYIT.this,Bjp.class);
                intent.putExtra("file","FYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",0);
                startActivity(intent);
            }
        });

        ipobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(FYIT.this,Bjp.class);
                intent.putExtra("file","FYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",8);
                startActivity(intent);
            }
        });

        deobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(FYIT.this,Bjp.class);
                intent.putExtra("file","FYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",12);
                startActivity(intent);
            }
        });

        osobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(FYIT.this,Bjp.class);
                intent.putExtra("file","FYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",16);
                startActivity(intent);
            }
        });

        dmobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(FYIT.this,Bjp.class);
                intent.putExtra("file","FYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",20);
                startActivity(intent);
            }
        });

        csobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(FYIT.this,Bjp.class);
                intent.putExtra("file","FYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",24);
                startActivity(intent);
            }
        });

        oopobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(FYIT.this,Bjp.class);
                intent.putExtra("file","FYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",30);
                startActivity(intent);
            }
        });

        maobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(FYIT.this,Bjp.class);
                intent.putExtra("file","FYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",34);
                startActivity(intent);
            }
        });

        wpobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(FYIT.this,Bjp.class);
                intent.putExtra("file","FYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",40);
                startActivity(intent);
            }
        });

        nsmobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(FYIT.this,Bjp.class);
                intent.putExtra("file","FYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",44);
                startActivity(intent);
            }
        });

        gcobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(FYIT.this,Bjp.class);
                intent.putExtra("file","FYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",48);
                startActivity(intent);
            }
        });
       /* send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                AssetManager am = getAssets();
                try {
                    InputStream is = am.open("FYBScIT-Syllabus.pdf");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                File f = createFileFromInputstream(is);
                intent.putExtra(Intent.EXTRA_STREAM, Uri.parse("android.resource://com.example.pc.bscitsyllabus/assets/FYBScIT-Syllabus.pdf"));
                intent.setType("application/pdf");
                intent.putExtra(Intent.EXTRA_SUBJECT,"shareing");
                intent.putExtra(Intent.EXTRA_TEXT,"send");
                startActivity(Intent.createChooser(intent,"choose app"));
            }
        });*/


    }
}
