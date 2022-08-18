
import ArtGallery.Artist;
import ArtGallery.Artwork;
import ArtGallery.Customer;
import ArtGallery.Gallery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {
    private Customer customer;
    private Artwork artwork;

//    @BeforeEach
//    public void setUp(){
//        Customer customer= new Customer();
//        artwork= new Artwork();
//    }


//    @Test
//    public void CanGetCustomers(){
//        String TestName = "A";
//        float TestWallet = 10;
//
//        Customer Customer = new Customer(TestName,TestWallet);
//        String ActuralCustomer = Customer.getCustomerName();
//        float ActuralWallet = Customer.getWallet();
//
//        assertThat(ActuralCustomer).isEqualTo(TestName);
//        assertThat(ActuralWallet).isEqualTo(TestWallet);
//    }

    @Test
    public void canPay4artwork(){

        String TestCustomer = "A";
        float TestWallet = 10;

        String TestGallery = "AA";
        float TestTill = 1;

        String TestTitle = "AAA";
        String TestNft = "0000000000";
        String TestArtist = "BBB";
        float TestPrice = 1;

        Customer customer = new Customer(TestCustomer,TestWallet);
        Gallery gallery = new Gallery(TestGallery,TestTill);
        Artwork artwork  = new Artwork(TestTitle,TestNft,TestPrice,new Artist(TestArtist));

        float actual = customer.payArtwork(gallery,artwork);
        float expect = 9;
        assertThat(actual).isEqualTo(expect);

    }



}

