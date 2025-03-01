package com.example.yanproje;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {
Button btn1;
Button btn2;
Button btn3;
View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            btn1=(Button) findViewById(R.id.Sari);
            btn2=(Button) findViewById(R.id.Mavi);
            btn3=(Button) findViewById(R.id.Kirmizi);
            view=(View)findViewById(R.id.linearLayout);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
view.setBackgroundColor(Color.YELLOW);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    view.setBackgroundColor(Color.BLUE);
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    view.setBackgroundColor(Color.RED);
                }
            });

            return insets;
        });
    }
}