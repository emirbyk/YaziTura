package com.example.yazitura;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView img;
    TextView txt;

    @SuppressLint("WrongViewCast")
    @Override
    protected  void onCreate(Bundle savedInstnceState){
    super.onCreate(savedInstnceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageView);
        img = findViewById(R.id.imageView2);
        img = findViewById(R.id.button);
        txt = (TextView) findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int val = random.nextInt(2);
                if (val == 1){
                    img.setImageResource(R.drawable.tura);
                    txt.setText("TURA");
                }

                else {
                    img.setImageResource(R.drawable.yazi);
                    txt.setText("YAZI");

                }
            }
        });


    }

}