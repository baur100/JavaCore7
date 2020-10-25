package unitTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.Ticket;

public class TicketTest {
    double basePrice = 1000;
    @Test
    public void ticket_ageInfant_priceIsZero() {
        // Arrange - Given
        Ticket infant = new Ticket(basePrice, 2);

        // Act - When
        double price = infant.getPrice();

        // Assert - Then
        Assert.assertEquals(price, 0.0);
    }

    @Test
    public void ticket_ageChild_priceIs50Percent() {
        // Arrange
        Ticket child = new Ticket(basePrice, 10);

        // Act
        double price = child.getPrice();

        // Assert
        Assert.assertEquals(price, 500.0);
    }

    @Test
    public void ticket_ageSenior_priceIs80Percent() {
        // Arrange
        Ticket senior = new Ticket(basePrice, 66);

        // Act
        double price = senior.getPrice();

        // Assert
        Assert.assertEquals(price, 800.0);

    }

    @Test
    public void ticket_ageAdult_priceIsBase() {
        // Arrange
        Ticket adult = new Ticket(basePrice, 40);

        // Act
        double price = adult.getPrice();

        // Assert
        Assert.assertEquals(price, 1000.0);
    }
}
