package com.gildedrose

object GoldenMaterFixture {
  def main(args: Array[String]): Unit = {

    val items: Array[Item] = Array(
      new Item("Croisant",10,15),
      new Item("Croisant",10,0),
      new Item("Croisant",0,10),
      new Item("Backstage passes to a TAFKAL80ETC concert", 15, 10),
      new Item("Backstage passes to a TAFKAL80ETC concert", 8, 10),
      new Item("Backstage passes to a TAFKAL80ETC concert", 2, 10),
      new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10),
      new Item("Aged Brie",-6,10),
      new Item("Aged Brie",1,10))
    val gildedRose = new GildedRose(items)

    for (item <- items) {
      println(item.toString)
    }
    println("\n -------------------")
    gildedRose.updateQuality()
    for (item <- items) {
      println(item.toString)
    }
  }
}
