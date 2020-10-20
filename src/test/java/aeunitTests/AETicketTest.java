package aeunitTests;

import aetickets.AETickets;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AETicketTest {

    //Unit test - tests functions/methods
    @Test //-test annotation
    public void ticket_ageInfant_priceIsZero(){ //class_condition_expected result
        //Arrange - given
        AETickets infant = new AETickets(1000,1);
        //Act - when
        double price = infant.getPrice();
        //Assert - then
        Assert.assertEquals(price, 0.0);
    }

    @Test
    public void ticket_ageChild_priceIs50percent(){
        //Arrange
        AETickets child = new AETickets(1000,5);
        //Act - run method
        double price = child.getPrice();
        //Assert - actual result vs expected result
        Assert.assertEquals(price, 500.0);
        //Assert.assertEquals(price, 600.0); //making the test to fail
    }
    @Test
    public void ticket_ageAdult_fullPrice() {
        //Arrange
        AETickets adult = new AETickets(1000, 30);
        //Act
        double price = adult.getPrice();
        //Assert
        Assert.assertEquals(price, 1000.0);
        //Assert.assertEquals(price, 10000.0);
    }
    @Test
    public void ticket_ageSenior_priceIs80Precent() {
        //Arrange
        AETickets senior = new AETickets(1000, 70);
        //Act
        double price = senior.getPrice();
        //Assert
        Assert.assertEquals(price, 800.0);
        //Assert.assertEquals(price, 10000.0);
    }

    @Test
    public void justTicketTest() {
        AETickets adult = new AETickets(1000, 40);

        double price = adult.getPrice();

        Assert.assertEquals(1000.0, 1000.0); //this assertion will be always true
        // always need to check a RED Phase for negative testing to verify that assertion work
    }
}
