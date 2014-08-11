package com.example.ratingbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;

public class MainActivity extends Activity {
    private ImageView image;
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        image = (ImageView)findViewById(R.id.image);
        
        ratingBar = (RatingBar)findViewById(R.id.ratingbar);
        ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            
            @SuppressWarnings("deprecation")
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating,
                    boolean fromUser) {
                image.setAlpha((int) (rating * 255 / 5));
                
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
