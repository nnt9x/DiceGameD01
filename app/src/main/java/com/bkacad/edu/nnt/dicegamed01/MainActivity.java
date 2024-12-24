package com.bkacad.edu.nnt.dicegamed01;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageView imgDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Bind id
        imgDice = findViewById(R.id.imgDice);
    }

    public void randomDice(View view) {
        // Khi bam vao button dice -> ham nay se chay
        int randomNum = (int) (Math.random() * 6) + 1;
        // Dua vao gia tri => set hinh
        switch (randomNum) {
            case 1:
                imgDice.setImageDrawable(getDrawable(R.drawable.dice1));
                break;
            case 2:
                imgDice.setImageDrawable(getDrawable(R.drawable.dice2));
                break;
            case 3:
                imgDice.setImageDrawable(getDrawable(R.drawable.dice3));
                break;
            case 4:
                imgDice.setImageDrawable(getDrawable(R.drawable.dice4));
                break;
            case 5:
                imgDice.setImageDrawable(getDrawable(R.drawable.dice5));
                break;
            case 6:
                imgDice.setImageDrawable(getDrawable(R.drawable.dice6));
                break;
        }
    }

}