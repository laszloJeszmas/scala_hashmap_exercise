package com.codecool.scala.hashmap

object Main {

  def main(args: Array[String]): Unit = {
    val hashmap: HashMap[String, String] = new HashMap[String, String]
    hashmap.set("Béla", "2")
    hashmap.set("5", "petárda")
    hashmap.set("ppp", "abcd")
    hashmap.set("ppppv", "abcdsdaf")
    hashmap.set("ppppb", "abcdsdaf")
    hashmap.set("ppppn", "abcdsdaf")
    hashmap.set("pppph", "abcdsdaf")
    hashmap.set("pppp1", "abcdsdaf")
    hashmap.set("pppp2", "abcdsdaf")
    hashmap.set("pppp3", "abcdsdaf")
    hashmap.set("pppp4", "abcdsdaf")
    val hashmap2: HashMap[Integer, Char] = new HashMap[Integer, Char]

    hashmap2.set(21, 'c')
    hashmap2.set(74, 'p')
    hashmap2.set(26, 'd')

    println(hashmap.get("Béla"))
    println(hashmap.get("5"))
    println(hashmap.get("ppp"))
    println(hashmap.get("Bélaaa"))


  }
}
