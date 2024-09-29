package com.example.gridview;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;


    private int[] images = {
            R.drawable.image1, R.drawable.image2, R.drawable.image3,
            R.drawable.image4, R.drawable.image5, R.drawable.image6,R.drawable.image7,R.drawable.image8,R.drawable.image9
    };

    private String[] names = {
            "Camera", "Camera Roll", "Featured",
            "My Videos", "Like", "Watch Later","Stats","Subscription","Help",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        ImageAdapter adapter = new ImageAdapter(this, images, names);
        gridView.setAdapter(adapter);
    }
}