package com.example.yanproje;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            spinner=(Spinner) findViewById(R.id.spinner2);

            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String string=parent.getItemAtPosition(position).toString();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            ArrayList<String> araylist= new ArrayList<>();
            araylist.add("hakanarslan@gmail.com");

            araylist.add("hakan123@gmail.com");
            ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,araylist);
            arrayAdapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
            spinner.setAdapter(arrayAdapter);
            return insets;
        });
    }
}