package ArtGallery;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private float wallet;
    public ArrayList<Artwork> stocks;

    public Customer(String customerName, float wallet){
        this.customerName = customerName;
        this.wallet = wallet;
        this.stocks = new ArrayList<> ();
    }


    //getters
    public String getCustomerName(){
        return customerName;
    }
    public float getWallet() {
        return wallet;
    }

    //setters

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setWallet(float wallet){
        this.wallet = wallet;
    }

    public float payArtwork(Gallery gallery, Artwork artwork) {
        if (wallet >= artwork.getPrice()){  //checking the money inside wallet
            gallery.sellArtwork(artwork);
            this.wallet -= artwork.getPrice();//getPrice method in the Artwork Class
            this.stocks.add(artwork);
        }else
            System.out.println("Maybe next time.");

        return wallet;
    }




//do the fifth point in the Maic class
//    public float buyArtwork(){
//        for (Artwork artwork : this.artworks){
//            return wallet - price;
//        }
//        return 0;
//    }


    //    public Customer(String customerName, float wallet){
//        this.customerName = customerName;
//        this.wallet = wallet;
//        this.artworks = new ArrayList<>();
//    }

}
