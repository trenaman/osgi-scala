package org.adehaus.osgi_scala.dict.impl

import org.adehaus.osgi_scala.dict.Dict

class DictImpl extends Dict {

  val words = Set[String]("I", "wandered", "lonely", "as", "a", "cloud", "gilt")

  println("Initialized the dictionary with %s".format(words.mkString(",")))

  def checkWord(word: String): Boolean = {
    words.contains(word)
  }
}
