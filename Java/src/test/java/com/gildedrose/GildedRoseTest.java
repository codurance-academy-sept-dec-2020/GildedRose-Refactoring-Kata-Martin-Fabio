package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void should_decrease_the_quality_and_the_sellIn_once_for_normal_item() {
        Item[] items = new Item[] { new Item("Frijolitos", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Frijolitos, 9, 9", app.items[0].toString());
    }

}
