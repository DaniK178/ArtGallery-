import ArtGallery.Artist;
import ArtGallery.Artwork;
import ArtGallery.Customer;
import ArtGallery.Gallery;

public class Main {
    public static void main(String[] args) {

        Artist SalvadorDali = new Artist("Salvador Dalí");
        Artwork PersistenceOfMemory = new Artwork("The Persistence of Memory", "927hhluk78", 1000000, SalvadorDali);
        Gallery GothamInCoventry = new Gallery("Gotham in Coventry", 300);

        GothamInCoventry.addArtwork(PersistenceOfMemory);

        System.out.println("The total value of all the gallery's artwork is " + GothamInCoventry.stock_take());

        Customer ying = new Customer("Yingying", 10000000);

        ying.payArtwork(GothamInCoventry, PersistenceOfMemory);

        System.out.println("The total value of all the gallery's artwork is " + GothamInCoventry.stock_take());



//       Method1 calling Gallery with Customer
        Customer customer1 = new Customer("David",11);
        Gallery gallery1 = new Gallery("Gallery1", 3);
        Artwork artwork1 = new Artwork("title1","sjk2ndjn",2,new Artist("artist1") );
        customer1.payArtwork(gallery1,artwork1);






    }





}
