package Test;

import MicropaymentManagementSystem.MicroPaymentManagementSystem;
import BeenzManagement.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMicroPaymenSystem {
    
    public TestMicroPaymenSystem() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
         @Test
    public void testRequestInvoked() throws Exception {

        MicroPaymentManagementSystem micropaymentSystem = new MicroPaymentManagementSystem();
        
        System.out.println("-----Testing onRedeem on MicropaymentSystem for Bonus-----");

        Bonus bonus = new Bonus();
        Request redeemBonusCommand = new CollectBonus(bonus);
        micropaymentSystem.onRedeem(redeemBonusCommand);
        
        System.out.println("-----Testing onCollect on MicropaymentSystem for Bonus-----");
        
        Request collectBonusCommand = new RedeemBonus(bonus);
        micropaymentSystem.onCollect(collectBonusCommand);
        
        System.out.println("-----Testing undoRequest() on MicropaymentSystem for Bonus-----");
        
        micropaymentSystem.undoRequest();
       
        }
    }