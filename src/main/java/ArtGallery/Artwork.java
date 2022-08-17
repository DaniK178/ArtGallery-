package ArtGallery;

import java.util.ArrayList;

public class Artwork {
    private String title;
    // artist
    private Artist artist;

    private String nft;
    private float price;
    private float payment;

    public Artwork(String title, String nft, float price,Artist artist){
        this.title= title;
        this.nft= nft;
        this.price = price;
        this.artist= artist;
    }

    public float getPrice() {
        return price;
    }

    public String getNft(){
        return nft;
    }

    public String getTitle(){
        return title;
    }
}
