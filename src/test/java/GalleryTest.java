import ArtGallery.Artist;
import ArtGallery.Artwork;
import ArtGallery.Customer;
import ArtGallery.Gallery;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {
    private Gallery gallery;
    private Artwork artwork;

    @Test
    public void canAcceptPayment(){
        
        String TestCustomer = "A";
        float TestWallet = 10;

        String TestGallery = "AA";
        float TestTill = 1;

        String TestTitle = "AAA";
        String TestNft = "0000000000";
        String TestArtist = "BBB";
        float TestPrice = 1;

        Customer customer = new Customer(TestCustomer,TestWallet);
//        Gallery gallery = new Gallery(TestGallery,TestTill);
        Artwork artwork  = new Artwork(TestTitle,TestNft,TestPrice,new Artist(TestArtist));
        gallery.sellArtwork(artwork);
        gallery.addArtwork(artwork);

        float actual = gallery.currentTill();
        float expect = TestTill+TestPrice;
        assertThat(actual).isEqualTo(expect);
    }
}
