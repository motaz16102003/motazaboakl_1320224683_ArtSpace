package com.example.artspace;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ArtworkDetailsActivity extends AppCompatActivity {

    public static final String EXTRA_TITLE = "extra_title";
    public static final String EXTRA_ARTIST = "extra_artist";
    public static final String EXTRA_YEAR = "extra_year";
    public static final String EXTRA_URL = "extra_url";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artwork_details);

        Intent intent = getIntent();
        String title = intent.getStringExtra(EXTRA_TITLE);
        String artist = intent.getStringExtra(EXTRA_ARTIST);
        String year = intent.getStringExtra(EXTRA_YEAR);
        String url = intent.getStringExtra(EXTRA_URL);

        ((TextView) findViewById(R.id.details_title)).setText(title);
        ((TextView) findViewById(R.id.details_artist)).setText(artist);
        ((TextView) findViewById(R.id.details_year)).setText(year);

        findViewById(R.id.button_back).setOnClickListener(v -> finish());

        findViewById(R.id.button_visit).setOnClickListener(v -> {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            try {
                startActivity(webIntent);
            } catch (ActivityNotFoundException e) {
                Toast.makeText(this, R.string.no_browser, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
