package com.nathan.FindRoom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class listRoom extends AppCompatActivity {
    Button details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_room);

        takeIds();

        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(listRoom.this, DetailsSalle.class);

            }
        });

    }

    public void takeIds(){
        details = findViewById(R.id.details);
    }
}