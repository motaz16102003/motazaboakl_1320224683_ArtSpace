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
                new Artwork(R.drawable.deep_field_stellar_deaths, "Deep Field Stellar Deaths", "Smacs Carin", "2021",
                        "https://science.nasa.gov/asset/webb/webbs-first-deep-field-nircam-image"),
                new Artwork(R.drawable.cosmic_cliffs_carina, "Cosmic Cliffs Carina", "James Webb", "2022",
                        "https://science.nasa.gov/missions/webb/nasas-webb-reveals-cosmic-cliffs-glittering-landscape-of-star-birth/"),
                new Artwork(R.drawable.pillars_of_creation, "Pillars of Creation", "Eagle Nebula", "2022",
                        "https://science.nasa.gov/asset/hubble/eagle-nebula-pillars-of-creation"),
                new Artwork(R.drawable.southern_ring_nebula, "Southern Ring Nebula", "Vela Constellation", "2022",
                        "https://science.nasa.gov/universe/nebulae/nasas-webb-captures-dying-stars-final-performance-in-fine-detail"),
                new Artwork(R.drawable.stephans_quintet, "Stephan's Quintet", "Pegasus Group", "2022",
                        "https://science.nasa.gov/missions/webb/nasas-webb-sheds-light-on-galaxy-evolution-black-holes/"),
                new Artwork(R.drawable.hubble_ngc_flat_final, "Hubble Ngc Flat Final", "Sonay Billan", "2019",
                        "https://science.nasa.gov/missions/hubble/hubble-views-a-galactic-marvel/")
        };
    }
}
