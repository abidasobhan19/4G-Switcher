package com.example.a4g_only_trickload;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_4g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            btn_4g=findViewById(R.id.btn_4g);
            btn_4g.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==btn_4g){
            startActivity(new Intent(MainActivity.this, Subscribers.class));
        }
    }
}
