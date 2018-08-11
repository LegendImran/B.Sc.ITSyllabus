package com.example.pc.bscitsyllabus;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register_user extends AppCompatActivity implements View.OnClickListener {

    private Button register;
    private EditText email,pass,mpass;
    private TextView gotosignin;
    private ProgressBar progressBar;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        register=(Button) findViewById(R.id.signup);

        email=(EditText)findViewById(R.id.remail);
        pass=(EditText)findViewById(R.id.rpass);
        mpass=(EditText)findViewById(R.id.matchpass);


        gotosignin=(TextView)findViewById(R.id.goto_signin);
        progressBar=(ProgressBar) findViewById(R.id.progressbas);
        mAuth = FirebaseAuth.getInstance();
        register.setOnClickListener(this);
        gotosignin.setOnClickListener(this);
    }

    private void registerUser(){

        String emails=email.getText().toString().trim();
        String passs=pass.getText().toString().trim();
        String passm=mpass.getText().toString().trim();

        if(TextUtils.isEmpty(emails)){
            //email os empty
            Toast.makeText(Register_user.this,"Please Enter Email..!",Toast.LENGTH_SHORT).show();
            email.setError("Email is required");
            email.requestFocus();
            return;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(emails).matches()){

            email.setError("Please Enter valid Emil address..!");
            email.requestFocus();
            return;
        }

        if(TextUtils.isEmpty(passs)){
            //password is empty
            Toast.makeText(Register_user.this,"Please Enter Email..!",Toast.LENGTH_SHORT).show();
            pass.setError("Password is Required");
            pass.requestFocus();
            return;
        }

        if(passs.length()<6){

            pass.setError("Minimum length of password should be 6..!");
            pass.requestFocus();
            return;
        }
        if(!passs.equals(passm)){

            mpass.setError("Password did not match");
            mpass.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);

        mAuth.createUserWithEmailAndPassword(emails, passs)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(Register_user.this,"Ragistration Successfull",Toast.LENGTH_LONG).show();
                            progressBar.setVisibility(View.GONE);

                        }
                        else{
                            Toast.makeText(Register_user.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });
    }

    private void signin() {
        Intent intent = new Intent(getApplicationContext(),Sign_in.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {

        if(view == register){
            registerUser();
        }
        if(view == gotosignin){
            signin();
        }
    }


}
