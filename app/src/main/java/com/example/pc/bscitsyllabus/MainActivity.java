package com.example.pc.bscitsyllabus;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

import static com.example.pc.bscitsyllabus.R.color.heading;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{


    Button fy,sy,ty;
    private FirebaseAnalytics mFirebaseAnalytics;
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        fy=(Button)findViewById(R.id.fyit);
        sy=(Button)findViewById(R.id.syit);
        ty=(Button)findViewById(R.id.tyit);
        navigationView=(NavigationView)findViewById(R.id.nav);
        navigationView.setNavigationItemSelectedListener(this);
        toolbar=(Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,FYIT.class);
                startActivity(intent);
            }
        });
        sy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SYIT.class);
                startActivity(intent);
            }
        });
        ty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,TYIT.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Are you sure?").setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.super.onBackPressed();
            }
        }).setNegativeButton("cancel",null).setCancelable(false).setTitle("Really Exit?");
        AlertDialog alert= builder.create();
        alert.show();
    }

    @Override
   /* public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menus,menu);
        return true;
    }*/

   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.about:
                String t="This is made for Syllabus of B.Sc.I.T. Programm under Banner of 'ASIM'...";
                Intent intent=new Intent(MainActivity.this,About.class);
                intent.putExtra("head","About us");
                intent.putExtra("text",t);
                startActivity(intent);
                return true;
            case R.id.creator:
                t="Create By IMRAN KHAN";
                intent=new Intent(MainActivity.this,About.class);
                intent.putExtra("head","Creator");
                intent.putExtra("text",t);
                startActivity(intent);
                return true;
            case R.id.contact:
                t="imran7khan8@gmail.com";
                intent=new Intent(MainActivity.this,About.class);
                intent.putExtra("head","Contect us");
                intent.putExtra("text",t);
                startActivity(intent);
                return true;
            }
        return super.onOptionsItemSelected(item);
    }*/
   public boolean onOptionsItemSelected(MenuItem item) {
       if(toggle.onOptionsItemSelected(item)){

           return true;
       }
       return super.onOptionsItemSelected(item);
   }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.about){
            String t="This is made for Syllabus of B.Sc.I.T. Programm under Banner of 'ASIM'...";
            Intent intent=new Intent(MainActivity.this,About.class);
            intent.putExtra("head","About us");
            intent.putExtra("text",t);
            startActivity(intent);
        }
        if(id == R.id.creator){
            String t="Create By IMRAN KHAN";
            Intent intent=new Intent(MainActivity.this,About.class);
            intent.putExtra("head","Creator");
            intent.putExtra("text",t);
            startActivity(intent);
        }
        if(id == R.id.contact){
            String t="\t hey, this is IMRAN KHAN \n\n \t Contact: khanimran.in";
            Intent intent=new Intent(MainActivity.this,About.class);
            intent.putExtra("head","About us");
            intent.putExtra("text",t);
            startActivity(intent);
        }
        if(id == R.id.reference){
            Intent intent=new Intent(MainActivity.this,Books.class);
            startActivity(intent);
        }

        return false;
    }
}
