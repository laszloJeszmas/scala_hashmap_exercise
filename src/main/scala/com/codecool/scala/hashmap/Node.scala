package com.codecool.scala.hashmap

class Node[K, V] (var key: K, var value: V) {


  def getValue: V = this.value
  def getKey: K = this.key
}
