package com.pottho.android;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    public static String mobile_no;
    public static String verification_code;

    static {
        mobile_no = "111";
        verification_code = "222";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        boolean is_phone_number_retrieved = false;


        final EditText mob_no_edit_text = (EditText) findViewById(R.id.mobile_number_edit_text);
        final EditText ver_code_edit_text = (EditText) findViewById(R.id.verification_code_edit_text);

        final Button get_code_btn = (Button) findViewById(R.id.get_code_button);
        get_code_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mob_no_edit_text.getText() == null)
                    return;

                get_code_btn.setText("Resend Code");
                mobile_no = mob_no_edit_text.getText().toString();
            }
        });




        final Button button = (Button) findViewById(R.id.verify_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verification_code = ver_code_edit_text.getText().toString();

                if (mobile_no.equals("123456789") && verification_code.equals("222222"))

                    startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                else if (mobile_no != null && verification_code.equals("111111"));
                    startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
    }
}
