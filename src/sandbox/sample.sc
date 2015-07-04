val a: String = null

a match {
  case some: String => println(s"Match $some")
  case _ => println("not match")
}