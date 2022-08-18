package ArtGallery;

import java.util.ArrayList;

public class Gallery {
    private String name;
    private float till;
    //Map/ArrayList
    private ArrayList<Artwork> stocks;
    private Customer customerName;
    private float stockValue;

    public Gallery(String name, float till) {
        this.name = name;
        this.till = till;
        this.stocks = new ArrayList<>(); //call the Artwork property (name from the Artwork Class)
    }

//    public Gallery(Customer customerName, float wallet, float till) {
//        this.stocks = new ArrayList<>();
////        this.customerName = new customerName;
////        this.wallet = wallet;
//        this.till = till;
//    }

    public void acceptPayment(Artwork artwork) {
        this.till += artwork.getPrice();
        this.stocks.remove(artwork);
    }

    public void addArtwork(Artwork artwork) {
        this.stocks.add(artwork);
    }

    public void removeArtwork(Artwork artwork) {
        this.stocks.remove(artwork);
    }

// extension 1
    public void sellArtwork(Artwork artwork){ //
        this.till += artwork.getPrice();
        this.stocks.remove(artwork);
    }

    public float currentTill(){
        float total = 0;
        for (Artwork artwork: this.stocks){
            total += artwork.getPrice();
        }
        return total;
    }


// extension 2
    public float stock_take() {
        float stockValue = 0;
        for (Artwork artwork : this.stocks) {
            stockValue += artwork.getPrice();
        }
        return stockValue;
    }



}





