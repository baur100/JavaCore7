package unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.Ticket;

public class TicketTest {
    @Test
    public void ticket_ageInfant_priceIsZero(){
        Ticket infant = new Ticket(1000,1);
        double price = infant.getPrice();
        Assert.assertEquals(price,0.0);
    }

    @Test
    public void ticket_ageInfant_priceIsZero1(){
        Ticket infant = new Ticket(1000,1);
        double price = infant.getPrice();
        Assert.assertEquals(price,0.0);
    }
    @Test
    public void ticket_ageChild_priceIs50percent(){
        Ticket child = new Ticket(1000,5);
        double price = child.getPrice();
        Assert.assertEquals(price,500.0);
    }

    @Test
    public void ticket_ageAdult_fullPrice(){
        Ticket adult = new Ticket(1000,15);
        double price = adult.getPrice();
        Assert.assertEquals(price, 1000.0);
    }

    @Test
    public void ticket_ageSenior_priceIs80percent(){
        Ticket senior = new Ticket(1000, 70);
        double price = senior.getPrice();
        Assert.assertEquals(price,800.0);
    }
    @Test
    public void justTicketTest(){
        Ticket adult = new Ticket(1000,25);
        double price = adult.getPrice();
        Assert.assertEquals(100,100);
    }
}
