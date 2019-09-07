package com.example.manju.citimagic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText EMailId,Password;
    private TextView ForgotPw,Signup;
    Button Submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    //Identifying the UI fields created in xml into java
        EMailId = (EditText) findViewById(R.id.EmailId);
        Password = (EditText) findViewById(R.id.Password);
        ForgotPw = (TextView) findViewById(R.id.ForgotPw);
        Signup= (TextView) findViewById(R.id.Signup);
        Submit = (Button) findViewById(R.id.SubmitButton);

    //Validating the Email id
        final String email = EMailId.getText().toString().trim();
        final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    // Adding TextChangeListner to Keep Watch on Edit Text fields

        EMailId.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if(email.matches(emailPattern) && s.length() >0)
                {
                    Toast.makeText(getApplicationContext(),"valid email address",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"invalid email address",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }



}
