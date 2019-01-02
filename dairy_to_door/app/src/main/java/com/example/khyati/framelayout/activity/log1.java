package com.example.khyati.framelayout.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.khyati.framelayout.R;
import com.example.khyati.framelayout.main;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

import java.util.List;


public class log1 extends AppCompatActivity implements Validator.ValidationListener{
    Button btnSignIn,btnSignUp;
    EditText etLoginMobile,etdpass;
    TextView  tvForgotPassword;

    private String strMobile,strPass;
    Validator validator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log1);

        btnSignIn=findViewById(R.id.btnSignIn);
        btnSignUp=findViewById(R.id.btnSignUp);
        etLoginMobile=findViewById(R.id.etLoginMobile);
        etdpass=findViewById(R.id.etdpass);
        tvForgotPassword=findViewById(R.id.tvForgotPassword);




        validator=new Validator(this);
        validator.setValidationListener(this);



        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent=new Intent(log1.this,registration1.class);
                startActivity(intent);
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strMobile=etLoginMobile.getText().toString();
                strPass=etdpass.getText().toString();
                validator.validate();


            }
        });

        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent=new Intent(log1.this,forget_password.class);
                startActivity(intent);

            }
        });



    }



    @Override
    public void onValidationSucceeded() {
        Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
        Intent intent;
        intent=new Intent(log1.this,main.class);
        startActivity(intent);

    }

    @Override
    public void onValidationFailed(List<ValidationError> errors) {
        for(ValidationError error: errors){
            View view=error.getView();
            String message= error.getCollatedErrorMessage(this);

            if(view instanceof EditText){
                ((EditText)view).setError(message);
            }
            else{}
        }

    }
}
