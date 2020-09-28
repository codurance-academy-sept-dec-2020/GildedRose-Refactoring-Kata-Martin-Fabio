package com.gildedrose

class GildedRose(val items: Array[Item]) {


  private val AGE_BRIE = "Aged Brie"
  private val BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert"
  private val SULFURAS = "Sulfuras, Hand of Ragnaros"

  def updateQuality() {
    for (i <- 0 until items.length) {

      if (items(i).name.equals(AGE_BRIE)) {
        if (items(i).quality < 50)
          increaseQuality(i)
      } else if (items(i).name.equals(BACKSTAGE_PASSES)) {

        if (items(i).quality < 50) {
          increaseQuality(i)
        }

        if (isSellinLessThan(i, 11)) {
          if (items(i).quality < 50) {
            increaseQuality(i)
          }
        }

        if (isSellinLessThan(i, 6)) {
          if (items(i).quality < 50) {
            increaseQuality(i)
          }
        }
      } else {
        if (items(i).quality > 0) {
          if (!items(i).name.equals(SULFURAS)) {
            decreaseQuality(i)
          }
        }
      }


    if (!items(i).name.equals(SULFURAS)) {
      items(i).sellIn = items(i).sellIn - 1
    }

    if (isSellinLessThan(i, 0)) {
      if (!items(i).name.equals(AGE_BRIE)) {
        if (!items(i).name.equals(BACKSTAGE_PASSES)) {
          if (items(i).quality > 0) {
            if (!items(i).name.equals(SULFURAS)) {
              decreaseQuality(i)
            }
          }
        } else {
          items(i).quality = items(i).quality - items(i).quality
        }
      } else {
        if (items(i).quality < 50) {
          increaseQuality(i)
        }
      }
    }
  }
}

private def isSellinLessThan (i: Int, sellIn: Int) = {
  items (i).sellIn < sellIn
}

  private def decreaseQuality (i: Int) = {
  items (i).quality = items (i).quality - 1
}

  private def increaseQuality (i: Int) = {
  items (i).quality = items (i).quality + 1
}
}