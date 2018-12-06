package com.pottho.android;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        Button buy_medicine_btn = (Button) findViewById(R.id.buy_medicine_button);
        buy_medicine_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, BuyMedicineActivity.class));
            }
        });


        Button need_paramedic_btn = (Button) findViewById(R.id.paramedical_service_button);
        need_paramedic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, ParamedicServiceActivity.class));
            }
        });


 /*
        Button need_blood_btn = (Button) findViewById(R.id.get_blood_button);
        need_blood_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, NeedBloodActivity.class));
            }
        }); */


        Button update_profile_btn = (Button) findViewById(R.id.update_info_home_button);
        update_profile_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, UpdateProfileActivity.class));
            }
        });


        Button helpline_btn = (Button) findViewById(R.id.call_helpline_button);
        helpline_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, HelplineActivity.class));
            }
        });


        Button logout_btn = (Button) findViewById(R.id.logout_button);
        logout_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginActivity.mobile_no = null;
                LoginActivity.verification_code = null;
                startActivity(new Intent(HomeActivity.this, LoginActivity.class));
            }
        });
    }
}
