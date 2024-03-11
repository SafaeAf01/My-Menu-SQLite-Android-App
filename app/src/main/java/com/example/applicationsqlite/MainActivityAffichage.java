package com.example.applicationsqlite;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
public class MainActivityAffichage extends AppCompatActivity {
    TextView tvAffichage;
Button bRetour;
    DatabaseHandler db;
    String  dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
                 super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_affichage);
            tvAffichage = findViewById(R.id.tvAffichage);
            bRetour=findViewById(R.id.bRetour);

        db = new DatabaseHandler(this);

        List<Client> clientList = db.getAllClients();
        dataList="";
        for (Client client: clientList) {
                dataList += client.toString();
        }

        tvAffichage.setText(dataList);

bRetour.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivityAffichage.this, MainActivity.class));

    }
});


    }
    }
