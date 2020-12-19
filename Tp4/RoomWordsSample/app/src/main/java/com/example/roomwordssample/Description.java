package com.example.roomwordssample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class Description extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        img=findViewById(R.id.img);
        Bundle extras=getIntent().getExtras();
        String element=extras.getString("decription");

    if(element.equals("cobra")){

        //set image in recycleView
        Drawable myDrawable = getResources().getDrawable(R.drawable.cobra);
        img.setImageDrawable(myDrawable);
    }
}
}