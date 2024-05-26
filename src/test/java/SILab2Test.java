import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<Item> createList(Item... items){
        return new ArrayList<>(Arrays.asList(items));
    }
    @Test
    void MultipleConditionsTest() {
        List<Item> items = createList(new Item("item1","0785446", 410, 0.1f));
        assertTrue(SILab2.checkCart(items, 600));

        List<Item> items2 = createList(new Item("item2","0284695", 350, 0.0f));
        assertFalse(SILab2.checkCart(items2, 300));

        List<Item> items3 = createList(new Item("item3","784512", 500, 0.5f));
        assertFalse(SILab2.checkCart(items3, 40));

        List<Item> items4 = createList(new Item("item4","563218", 100, 0.0f));
        assertFalse(SILab2.checkCart(items4, 95));
    }

    @Test
    void EveryBranchTest(){
        RuntimeException ex;

        Item item1 = new Item("item1",null, 100, 0.1f);
        List<Item> items2 = createList(item1);
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items2, 500));
        assertTrue(ex.getMessage().contains("No barcode!"));

        Item noname = new Item("", "a58e7d5", 400, 0.0f);
        List<Item> items = createList(noname);
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items, 500));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));

        Item it1 = new Item("it1","12456", 100, 0.1f); //sum > payment
        Item it2 = new Item("it2", "012423", 550, 0.12f);
        Item it3 = new Item("it3","457816", 200, 0.0f);
        List<Item> items3 = createList(it1, it2, it3);
        assertFalse(SILab2.checkCart(items3,220));

        List<Item> items4 = createList(it1, it2, it3);  //sum < payment
        assertTrue(SILab2.checkCart(items4,2300));

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 500));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));
    }
}