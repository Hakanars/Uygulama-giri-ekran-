package com.example.yanproje;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
ImageButton imageButton;
AlertDialog.Builder builder;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            button=(Button)findViewById(R.id.button5);
            builder= new AlertDialog.Builder(this);
            imageButton=(ImageButton) findViewById(R.id.imageButton);
            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    builder.setTitle("Uyarı!!1")
                            .setMessage("a...z,A...Z,0...9  sadece bunları kullanmanız yeterli özel karakter kullanmayınız.Hakan1907")
                            .setPositiveButton("tamam", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                             dialog.cancel();
                                }
                            }).show();
                    //
                }
            });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity2.this, "Kayıt İşlemi Başarılı", Toast.LENGTH_LONG).show();
                }
            });
            return insets;
        });
    }
}