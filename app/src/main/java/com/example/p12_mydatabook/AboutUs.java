package com.example.p12_mydatabook;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class AboutUs extends AppCompatActivity {

    ActionBar ab;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        iv = findViewById(R.id.iv);

        String imageUrl = "https://res.cloudinary.com/petrescue/image/upload/a_0/c_crop,w_1499,h_1499,x_0,y_348/c_fill,w_500,h_500/v1557619933/gacyfbm9ujzccdykzmlg.jpg";
        Picasso
                .with(AboutUs.this)
                .load(imageUrl)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.error).into(iv);

    }
}
