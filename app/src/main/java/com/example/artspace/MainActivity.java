package com.example.artspace;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String KEY_INDEX = "artwork_index";

    private final Artwork[] mArtworks = Artwork.getAll();
    private int mIndex = 0;

    private TextView mCounter;
    private ImageView mImage;
    private TextView mTitle;
    private TextView mArtistYear;
    private Button mPrevious;
    private Button mNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCounter = findViewById(R.id.text_counter);
        mImage = findViewById(R.id.image_artwork);
        mTitle = findViewById(R.id.text_title);
        mArtistYear = findViewById(R.id.text_artist_year);
        mPrevious = findViewById(R.id.button_previous);
        mNext = findViewById(R.id.button_next);

        if (savedInstanceState != null) {
            mIndex = savedInstanceState.getInt(KEY_INDEX, 0);
        }

        mPrevious.setOnClickListener(v -> {
            if (mIndex > 0) {
                mIndex--;
                updateUi();
            }
        });

        mNext.setOnClickListener(v -> {
            if (mIndex < mArtworks.length - 1) {
                mIndex++;
                updateUi();
            }
        });

        mImage.setOnClickListener(v -> openDetails());

        updateUi();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_INDEX, mIndex);
    }

    private void updateUi() {
        Artwork artwork = mArtworks[mIndex];
        mImage.setImageResource(artwork.getImageRes());
        mTitle.setText(artwork.getTitle());
        mArtistYear.setText(getString(R.string.artist_year_format, artwork.getArtist(), artwork.getYear()));
        mCounter.setText(getString(R.string.counter_format, mIndex + 1, mArtworks.length));
        mPrevious.setEnabled(mIndex > 0);
        mNext.setEnabled(mIndex < mArtworks.length - 1);
    }

    private void openDetails() {
        Artwork artwork = mArtworks[mIndex];
        Intent intent = new Intent(this, ArtworkDetailsActivity.class);
        intent.putExtra(ArtworkDetailsActivity.EXTRA_TITLE, artwork.getTitle());
        intent.putExtra(ArtworkDetailsActivity.EXTRA_ARTIST, artwork.getArtist());
        intent.putExtra(ArtworkDetailsActivity.EXTRA_YEAR, artwork.getYear());
        intent.putExtra(ArtworkDetailsActivity.EXTRA_URL, artwork.getUrl());
        startActivity(intent);
    }
}
