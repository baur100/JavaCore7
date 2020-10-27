package unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.Ticket;

public class TicketTest1 {
    @Test
    public void Ticket_ageInfant_priceIsZero(){
        // Arrange - given
        Ticket infant = new Ticket(1000, 1);

        // Act - when
        double price = infant.getPrice();

        // Assert - then
        Assert.assertEquals(0.0, price);
    }

    @Test
    public void ticket_ageChild_priceIs50percent(){
        Ticket child = new Ticket(1000, 5);
        double price = child.getPrice();
        Assert.assertEquals(500.0, price);
    }

    @Test
    public void ticket_ageAdult_fullPrice(){
        Ticket adult = new Ticket(1000, 25);
        double price = adult.getPrice();
        Assert.assertEquals(1000.0, price);
    }

    @Test
    public void ticket_ageSenior_priceIs80percent(){
        Ticket senior = new Ticket(1000, 70);
        double price = senior.getPrice();
        Assert.assertEquals(price, 800.0);
    }

}
