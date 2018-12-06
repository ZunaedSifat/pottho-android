package com.pottho.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NeedBloodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_need_blood);


        final Button search_blood_btn = (Button) findViewById(R.id.search_blood_button);
        search_blood_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search_blood_btn.setText("Searching for blood...");
            }
        });
    }
}
