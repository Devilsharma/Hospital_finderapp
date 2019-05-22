package com.example.hospital_finder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class entered_login_page extends Activity {

    Button docto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entered_login_page);

        docto=(Button)findViewById(R.id.emergency);


        docto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(entered_login_page.this,doctor.class);
                startActivity(intent);
            }
        });

    }
}
