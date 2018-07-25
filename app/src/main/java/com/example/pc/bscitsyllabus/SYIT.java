package com.example.pc.bscitsyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SYIT extends AppCompatActivity {

    Button fsy,pp,ds,cn,am,dbms,cj,es,cost,se,cg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syit);

        Toolbar toolbar=(Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        fsy=(Button)findViewById(R.id.syfull);
        pp=(Button)findViewById(R.id.pp);
        ds=(Button)findViewById(R.id.ds);
        cn=(Button)findViewById(R.id.cn);
        am=(Button)findViewById(R.id.am);
        dbms=(Button)findViewById(R.id.dbms);
        cj=(Button)findViewById(R.id.cj);
        es=(Button)findViewById(R.id.es);
        cost=(Button)findViewById(R.id.cost);
        se=(Button)findViewById(R.id.se);
        cg=(Button)findViewById(R.id.cg);

        fsy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(SYIT.this,Bjp.class);
                intent.putExtra("file","SYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",0);
                startActivity(intent);
            }
        });

        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(SYIT.this,Bjp.class);
                intent.putExtra("file","SYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",3);
                startActivity(intent);
            }
        });

        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(SYIT.this,Bjp.class);
                intent.putExtra("file","SYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",5);
                startActivity(intent);
            }
        });

        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(SYIT.this,Bjp.class);
                intent.putExtra("file","SYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",7);
                startActivity(intent);
            }
        });

        dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(SYIT.this,Bjp.class);
                intent.putExtra("file","SYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",9);
                startActivity(intent);
            }
        });

        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(SYIT.this,Bjp.class);
                intent.putExtra("file","SYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",11);
                startActivity(intent);
            }
        });



        cj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(SYIT.this,Bjp.class);
                intent.putExtra("file","SYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",24);
                startActivity(intent);
            }
        });

        es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(SYIT.this,Bjp.class);
                intent.putExtra("file","SYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",26);
                startActivity(intent);
            }
        });

        cost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(SYIT.this,Bjp.class);
                intent.putExtra("file","SYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",28);
                startActivity(intent);
            }
        });

        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(SYIT.this,Bjp.class);
                intent.putExtra("file","SYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",31);
                startActivity(intent);
            }
        });

        cg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(SYIT.this,Bjp.class);
                intent.putExtra("file","SYBScIT-Syllabus.pdf");
                intent.putExtra("pg_no",34);
                startActivity(intent);
            }
        });


    }
}
