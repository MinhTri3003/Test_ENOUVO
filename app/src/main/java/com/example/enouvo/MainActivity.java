package com.example.enouvo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.time.Instant;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private Button btnAdd;
    private Button btnshowDefault;
    private Button btnshowTransfer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R .layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout);
        btnAdd = findViewById(R.id.add_new);

        //btnshowDefault = findViewById(R.id.ShowListDefault);
        //btnshowTransfer = findViewById(R.id.ShowListTransfer);

        btnAdd.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AddInfor.class );
            startActivity(intent);
        });
        CardView cardItem1 = findViewById(R.id.card_view_item_1);
        cardItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.inforitem);
            }
        });
        /*btnshowDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Show Default" , Toast.LENGTH_SHORT).show();
            }
        });
        btnshowTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Show Transfer" , Toast.LENGTH_SHORT).show();
            }
        });*/
    }




}