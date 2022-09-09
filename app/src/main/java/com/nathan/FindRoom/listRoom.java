package com.nathan.FindRoom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class listRoom extends AppCompatActivity {
    Button detailbutton1;
    Button detailbutton2;
    Button detailbutton3;
    Button detailbutton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_room);




        //detailbutton1 = (Button) findViewById(R.id.detailsalle);

        takeIds();
        detailbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(listRoom.this,"Bonjour le monde", Toast.LENGTH_LONG).show();

                Intent intent1 =  new Intent(listRoom.this, Details.class);
                startActivity(intent1);
            }
        });

        detailbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(listRoom.this,"Bonjour le monde", Toast.LENGTH_LONG).show();

                Intent intent1 =  new Intent(listRoom.this, Details.class);
                startActivity(intent1);
            }
        });

        detailbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(listRoom.this,"Bonjour le monde", Toast.LENGTH_LONG).show();

                Intent intent1 =  new Intent(listRoom.this, Details.class);
                startActivity(intent1);
            }
        });

        detailbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(listRoom.this,"Bonjour le monde", Toast.LENGTH_LONG).show();

                Intent intent1 =  new Intent(listRoom.this, Details.class);
                startActivity(intent1);
            }
        });
    }

    private void takeIds() {
        detailbutton1 = (Button) findViewById(R.id.detailsalle);
        detailbutton2 = (Button) findViewById(R.id.button1);
        detailbutton3 = (Button) findViewById(R.id.button2);
        detailbutton4 = (Button) findViewById(R.id.button3);
    }


}