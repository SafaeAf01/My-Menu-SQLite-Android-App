package com.example.applicationsqlite;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etLogin, etPassword;

    Button bLogin, bSignUp;

    Client client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLogin = findViewById(R.id.etLogin);
        etPassword = findViewById(R.id.etPassword);
        bLogin = findViewById(R.id.bLogin);
        bSignUp = findViewById(R.id.bSignUp);

        DatabaseHandler db = new DatabaseHandler(this);
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // client = db.getClient(etLogin.toString());
             //   Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_LONG).show();

                 startActivity(new Intent(MainActivity.this, MainActivityAffichage.class));
            }
        });
        bSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivitySignUp.class));
            }
    });
    }
}
