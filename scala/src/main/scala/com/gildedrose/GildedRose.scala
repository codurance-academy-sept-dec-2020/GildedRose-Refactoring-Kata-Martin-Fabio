package com.gildedrose

class GildedRose(val items: Array[Item]) {


  private val AGE_BRIE = "Aged Brie"
  private val BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert"
  private val SULFURAS = "Sulfuras, Hand of Ragnaros"

  def updateQuality() {
    for (i <- 0 until items.length) {

      if (items(i).name.equals(AGE_BRIE)) {
        ageBrieBehaviour(i)
      } else if (items(i).name.equals(BACKSTAGE_PASSES)) {
        backstagePassBehaviour(i)
      } else if (!items(i).name.equals(SULFURAS)) {
        normalItemBehaviour(i)
      }


    }
  }

  private def normalItemBehaviour(i: Int) = {
    decreaseSellin(i)
    if (items(i).quality > 0) {
      decreaseQuality(i)
    }
    if (isSellinLessThan(i, 0)) {
      if (items(i).quality > 0) {
        decreaseQuality(i)
      }
    }
  }

  private def backstagePassBehaviour(i: Int) = {
    decreaseSellin(i)
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

    if (isSellinLessThan(i, 0)) {
      items(i).quality = items(i).quality - items(i).quality
    }
  }

  private def ageBrieBehaviour(i: Int) = {
    decreaseSellin(i)
    if (items(i).quality < 50)
      increaseQuality(i)
    if (isSellinLessThan(i, 0))
      increaseQuality(i)
  }

  private def decreaseSellin(i: Int) = {
    items(i).sellIn = items(i).sellIn - 1
  }

  private def isSellinLessThan(i: Int, sellIn: Int) = {
    items(i).sellIn < sellIn
  }

  private def decreaseQuality(i: Int) = {
    items(i).quality = items(i).quality - 1
  }

  private def increaseQuality(i: Int) = {
    items(i).quality = items(i).quality + 1
  }
}