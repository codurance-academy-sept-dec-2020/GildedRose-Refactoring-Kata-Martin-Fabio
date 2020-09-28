package com.gildedrose

object GoldenMaterFixture {
  def main(args: Array[String]): Unit = {

    val GOLDEN_MASTER_OUTPUT = "Croisant sellIn : 9 quality : 14\n" +
      "Croisant sellIn : 9 quality : 0\n" +
      "Croisant sellIn : -1 quality : 8\n" +
      "Backstage passes to a TAFKAL80ETC concert sellIn : 14 quality : 11\n" +
      "Backstage passes to a TAFKAL80ETC concert sellIn : 7 quality : 12\n" +
      "Backstage passes to a TAFKAL80ETC concert sellIn : 1 quality : 13\n" +
      "Backstage passes to a TAFKAL80ETC concert sellIn : -1 quality : 0\n" +
      "Aged Brie sellIn : -7 quality : 12\n" +
      "Aged Brie sellIn : 0 quality : 11"

    val items: Array[Item] = Array(
      new Item("Croisant", 10, 15),
      new Item("Croisant", 10, 0),
      new Item("Croisant", 0, 10),
      new Item("Backstage passes to a TAFKAL80ETC concert", 15, 10),
      new Item("Backstage passes to a TAFKAL80ETC concert", 8, 10),
      new Item("Backstage passes to a TAFKAL80ETC concert", 2, 10),
      new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10),
      new Item("Aged Brie", -6, 10),
      new Item("Aged Brie", 1, 10))
    val gildedRose = new GildedRose(items)

    gildedRose.updateQuality()
    for (item <- items) {
      println(item.toString)
    }

  }
}
