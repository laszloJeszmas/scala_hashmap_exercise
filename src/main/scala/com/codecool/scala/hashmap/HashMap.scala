package com.codecool.scala.hashmap

import java.util

class HashMap[K, V] {

  private var size: Int = 10
  private val array = Array.fill(10)(new util.LinkedList[Node[K, V]])
  private val getIndex = (k: K) => Math.abs(k.hashCode() % size)

  def set(key: K, value: V) = {
    val index: Int = getIndex apply key
    for (x <- 0 until array(index).size() if array(index).get(x).getKey.equals(key)) throw new IllegalArgumentException
    array(index).add(new Node(key, value))
  }

  def get(key: K): V = {
    val index: Int = getIndex apply key
    for (x <- 0 until array(index).size() if array(index).get(x).getKey.equals(key)) return array(index).get(x).getValue
    throw new NoSuchElementException
  }

  def remove(key: K): Unit = {
    val index: Int = getIndex apply key
    for (x <- 0 until array(index).size() if array(index).get(x).getKey.equals(key)) array(index).remove(x)
    throw new NoSuchElementException
  }

  def getSize: Int = size

}
