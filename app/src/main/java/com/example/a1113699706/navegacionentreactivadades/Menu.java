package com.example.a1113699706.navegacionentreactivadades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Menu extends AppCompatActivity {
    private String usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Intent intento = getIntent();
        intento.getStringExtra(usuario);
                findViewById(R.id.tv_user_name);
                t.setText(usuario);


    }
}
