object Main {
  
  def flatten2(coolList: List[Any]): List[Any] = {
    //TODO: This function should flatten Lists of depth 2
    flatten(coolList)// Benutzung von HINT
    //HINT: You can also first implement flatten and then call it here, so you won't have to implement it twice
  }

  def flatten(coolList: List[Any]): List[Any] = coolList match {
    //TODO: This function should flatten Lists of any depth
    case Nil => Nil
    case (x1 : List[_]) :: x2 => flatten(x1) ++ flatten(x2)
    case x1 :: (x2 : List[_]) => x1 :: flatten(x2)
  }

  def main(Args: Array[String]): Unit = {
    val lager = List("Pale Lager", "Dark Lager")
    val pale_ale = List("India Pale Ale", "Amercian Pale Ale", "West Coast Pale Ale", "Island Pale Ale")
    val ales = List("Brown ale", "Scotch ale", pale_ale)
    val beers = List(ales, lager, "Pilsner")

    println(beers)
    println(flatten(beers))

  }
}
