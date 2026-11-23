package com.example.artspace;

public class Artwork {

    private final int imageRes;
    private final String title;
    private final String artist;
    private final String year;
    private final String url;

    public Artwork(int imageRes, String title, String artist, String year, String url) {
        this.imageRes = imageRes;
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.url = url;
    }

    public int getImageRes() {
        return imageRes;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getYear() {
        return year;
    }

    public String getUrl() {
        return url;
    }

    public static Artwork[] getAll() {
        return new Artwork[]{
                new Artwork(R.drawable.art_1, "Deep Field Stellar Deaths", "Smacs Carin", "2021", "https://www.nasa.gov"),
                new Artwork(R.drawable.art_2, "Stellar Nursery", "Lina Moray", "2020", "https://www.esa.int"),
                new Artwork(R.drawable.art_3, "Nebula Drift", "Omar Veltis", "2018", "https://webbtelescope.org"),
                new Artwork(R.drawable.art_4, "Ringed Giant", "Maya Ortelli", "2022", "https://science.nasa.gov"),
                new Artwork(R.drawable.art_5, "Silent Orbit", "Karim Delano", "2017", "https://www.spacetelescope.org"),
                new Artwork(R.drawable.art_6, "Hubble Ngc Flat Final", "Sonay Billan", "2019", "https://www.jpl.nasa.gov")
        };
    }
}
