package com.utel.edu.mx.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);

        Button ingresar = (Button) findViewById(R.id.ingresar);
        final EditText email_matricula = (EditText) findViewById(R.id.matriculaOemail);
        final EditText password = (EditText) findViewById(R.id.password);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email_matricula.getText().toString().equals("admin.admisiones@utel.edu.mx") &&
                        password.getText().toString().equals("_admin123.")){
                    SharedPreferences prefs =
                            getSharedPreferences("UTELPreferences", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefs.edit();
                    editor.putBoolean("logged", true);
                    editor.putString("email_matricula", email_matricula.getText().toString());
                    editor.commit();

                    startActivity(new Intent().setClass(getApplicationContext(), HomeUTEL.class));
                    finish();
                }

            }
        });

    }




}
