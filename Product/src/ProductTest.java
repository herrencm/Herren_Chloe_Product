import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product p1, p2, p3, p4, p5, p6;
    @BeforeEach
void setUp(){
        p1 = new Product ("Sweet Tea","Gold Peak Sweet Tea","000001",2.00);
        p2 = new Product ("Eggs","Large White Eggs","000002",1.89);
        p3 = new Product ("Milk","Whole Milk","000003",3.00);
        p4 = new Product ("Butter","Unsalted Butter","000004",1.50);
        p5 = new Product ("Sliced Cheese","American Sliced Cheese","000005",2.25);
        p6 = new Product ("Whole Ham","Honey Smoked Ham","000006",10.99);
    }

    @org.junit.jupiter.api.Test
    void setName() { assertEquals("Sweet Tea", p1.getName());
    }

    @org.junit.jupiter.api.Test
    void setDescription() { assertEquals("Gold Peak Sweet Tea", p1.getDescription());
    }

    @org.junit.jupiter.api.Test
    void setCost() { assertEquals(2.00, p1.getCost());
    }
}