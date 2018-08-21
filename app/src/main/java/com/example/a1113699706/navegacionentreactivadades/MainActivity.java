package com.example.a1113699706.navegacionentreactivadades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnIrMenu;
    private EditText edtUserName;
    String nombreUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnIrMenu = findViewById(R.id.btn_irMenu);
        btnIrMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(getApplicationContext(),Menu.class);

             nombreUsuario = edtUserName.getText().toString();
             intento.putExtra();


                startActivity(intento);
            }
        });

    }
    //comentario
}




