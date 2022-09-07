package com.nathan.FindRoom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class listRoom extends AppCompatActivity {
    Button detail_de_la_salle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_room);

        detail_de_la_salle = (Button) findViewById(R.id.detailsalle);
        detail_de_la_salle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(listRoom.this,"Bonjour le monde", Toast.LENGTH_LONG).show();

                Intent intent1 =  new Intent(listRoom.this, Details.class);
                startActivity(intent1);
            }
        });
    }

    private void takeIds() {
        detail_de_la_salle = (Button) findViewById(R.id.detailsalle);
    }


}