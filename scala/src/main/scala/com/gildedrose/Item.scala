package com.gildedrose

class Item(val name: String, var sellIn: Int, var quality: Int) {

  override def toString: String =
    name +
      " sellIn : " + sellIn +
      " quality : " + quality
}