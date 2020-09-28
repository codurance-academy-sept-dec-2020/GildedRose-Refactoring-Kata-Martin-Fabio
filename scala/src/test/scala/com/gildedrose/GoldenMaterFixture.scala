package com.gildedrose

object GoldenMaterFixture {
  def main(args: Array[String]): Unit = {

    val items: Array[Item] = Array(
      new Item("Croisant",10,15),
      new Item("Croisant",10,0),
      new Item("Croisant",0,10),

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
