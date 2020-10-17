package unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.Ticket;

public class TicketTest {
    @Test
    public void ticket_ageInfant_priceIsZero(){
        // Arrange - given
        Ticket infant = new Ticket(1000,1);

        // Act - when
        double price = infant.getPrice();

        // Assert - then
        Assert.assertEquals(price,0.0);
    }

    @Test
    public void ticket_ageChild_priceIs50percent(){
        // Arrange
        Ticket child = new Ticket(1000,5);

        // Act
        double price = child.getPrice();

        // Assert
        Assert.assertEquals(price,500.0);
    }

    @Test
    public void ticket_ageAdult_fullPrice(){
        // Arrange
        Ticket adult = new Ticket(1000,15);

        // Act
        double price = adult.getPrice();

        // Assert
        Assert.assertEquals(price, 1000.0);
    }

    @Test
    public void ticket_ageSenior_priceIs80percent(){
        // Arrange
        Ticket senior = new Ticket(1000, 70);

        // Act
        double price = senior.getPrice();

        // Assert
        Assert.assertEquals(price,800.0);
    }
    @Test
    public void justTicketTest(){
        Ticket adult = new Ticket(1000,25);

        double price = adult.getPrice();

        Assert.assertEquals(100,100);
    }
}
