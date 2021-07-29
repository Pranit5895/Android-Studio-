package com.example.fbloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button reg =findViewById(R.id.reg);
        reg.setOnClickListner(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(createPackageContext: MainActivity.this,RegisterActivity.class);
                
                startActivity(intent);
            }
        }
    }
}