package com.example.khyati.framelayout.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.khyati.framelayout.R;

public class login extends AppCompatActivity {
    EditText edt1,edt2;
    Button btn1;

    Context context;
    SharedPreferences sharedPreferences;
    public static final String mypref="mypref";
    public static final String username="username";
    public static final String pass="pass";
    private SharedPreferences.Editor editor;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        edt1=findViewById(R.id.username);
        edt2=findViewById(R.id.pass);
        btn1=findViewById(R.id.btn);
        context=this;
        sharedPreferences=context.getSharedPreferences("mypref", Context.MODE_PRIVATE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=edt1.getText().toString();
                String pass=edt2.getText().toString();
                String mail="@gmail.com";
                String name1=sharedPreferences.getString(username,"");
                String pass1=sharedPreferences.getString(pass,"");
                Toast.makeText(getApplication(),"name1:"+name,Toast.LENGTH_SHORT).show();

                if(name.length()==0){
                    Toast.makeText(context, "please enter valid username", Toast.LENGTH_SHORT).show();
                }
                else if(name.contains(mail)== false){
                    Toast.makeText(context, "please enter valid mail", Toast.LENGTH_SHORT).show();
                }
                else if(pass.length()<8){
                    Toast.makeText(context, "password must be greater than 8 characters", Toast.LENGTH_SHORT).show();

                }
                else if(name.matches(name1) && pass.matches(pass1) ){
                    //Intent i = new Intent(login.this, .class);
                    //  startActivity(i);
                    //finish();

                }

            }
        });
    }
}


