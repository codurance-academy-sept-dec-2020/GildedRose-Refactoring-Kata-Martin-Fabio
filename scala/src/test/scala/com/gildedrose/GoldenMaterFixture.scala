package com.gildedrose

object GoldenMaterFixture {
  def main(args: Array[String]): Unit = {

    val items: Array[Item] = Array(new Item("Aged Brie",1,10))
    val gildedRose = new GildedRose(items)
    println(items(0).toString)
    gildedRose.updateQuality()
    println(items(0).toString)

  }
}
