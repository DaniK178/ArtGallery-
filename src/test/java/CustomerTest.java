
import ArtGallery.Artwork;
import ArtGallery.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {
    private Customer customer;
    private Artwork artwork;

    @BeforeEach
    public void setUp(){
        customer= new Customer();
        artwork= new Artwork();
    }

    @Test
    public void CanGetCustomers(){
        String TestName = "A";
        float TestWallet = 10;

        Customer Customer = new Customer(TestName,TestWallet);
        String ActuralCustomer = Customer.getCustomerName();
        float ActuralWallet = Customer.getWallet();

        assertThat(ActuralCustomer).isEqualTo(TestName);
        assertThat(ActuralWallet).isEqualTo(TestWallet);
    }

    @Test
    public void canPay4artwork(){

        String TestTitle = "A";
        String TestArtist = "B";
        String TestNft = "0000000000";
        float TestPrice = 1;


        Customer payout = new Customer();
        float acutal = payout.

    }



}

