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

    @Test
    void when_quality_is_0_should_not_decrease_the_quality_and_decrease_the_sellIn_once_for_normal_item() {
        Item[] items = new Item[] { new Item("Frijolitos", 10, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Frijolitos, 9, 0", app.items[0].toString());
    }

    @Test
    void should_increase_the_quality_twice_and_decrease_the_sellIn_for_an_aged_brie() {
        Item[] items = new Item[] { new Item("Aged Brie", 9, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie, 8, 11", app.items[0].toString());
    }

    @Test
    void when_the_quality_is_50_should_not_increase_the_quality_and_decrease_the_sellIn_for_an_aged_brie() {
        Item[] items = new Item[] { new Item("Aged Brie", 9, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie, 8, 50", app.items[0].toString());
    }



}
