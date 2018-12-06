package com.pottho.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParamedicServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paramedic_service);

        Button btn = (Button) findViewById(R.id.book_paramedic_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(ParamedicServiceActivity.this, ConfirmOrderActivity.class));
            }
        });
    }
}
