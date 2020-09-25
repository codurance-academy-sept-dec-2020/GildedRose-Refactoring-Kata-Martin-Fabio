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
    void should_lose_quality_twice_as_fast_for_normal_expired_item() {
        Item[] items = new Item[] { new Item("Frijolitos", 0, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Frijolitos, -1, 48", app.items[0].toString());
    }

    @Test
    void when_quality_is_0_should_not_decrease_the_quality_and_decrease_the_sellIn_once_for_normal_item() {
        Item[] items = new Item[] { new Item("Frijolitos", 10, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Frijolitos, 9, 0", app.items[0].toString());
    }

    @Test
    void should_increase_the_quality_once_and_decrease_the_sellIn_for_an_aged_brie() {
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

    @Test
    void keep_quality_and_sellin_with_same_value() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 40) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros, 10, 40", app.items[0].toString());
    }

    @Test
    void should_increase_quality_twice_when_selling_is_less_than_ten() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 40) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 42", app.items[0].toString());
    }

    @Test
    void should_increase_quality_three_times_when_selling_is_less_than_five() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 4, 40) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 3, 43", app.items[0].toString());
    }

    @Test
    void should_decrease_quality_to_zero_when_selling_is_zero() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 40) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", app.items[0].toString());
    }
}
