package unitTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tickets.Ticket;

public class TicketTestParametrization {
    @DataProvider(name = "Ages")
    public Object[][] createData() {
        return new Object[][]{
                {1,1000,0.0},
                {6,1000,500.0},
                {25,1000,1000.0},
                {75,1000,800.0}
        };
    }
    @Test(dataProvider = "Ages")
    public void testTicketCalculation(int age, int basePrice, double outputPrice) {
        // Arrange
        Ticket person = new Ticket(basePrice, age);

        // Act
        double price = person.getPrice();

        // Assert
        Assert.assertEquals(price, outputPrice);
    }
}
