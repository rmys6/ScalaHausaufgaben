object CharacterTree {

  @scala.annotation.tailrec
  def ende_baum(leer: Int, char: Char): Unit ={ // der Stamm vom Baum
    if(leer > 0){
      print(" ")
      ende_baum(leer = leer - 1, char)
    }else if(leer == 0){
      print(char)
      print("\n")
      None
    }
  }

  def print_tree(height: Int, anzahl_zeichen: Int, anzahl_leer: Int, current: Int, is_zeichen: Boolean) {
    print_tree_char(height, anzahl_zeichen, anzahl_leer, current, is_zeichen, '*');
  }


  @scala.annotation.tailrec
  def print_tree_char(height: Int, anzahl_zeichen: Int, anzahl_leer: Int, current: Int, is_zeichen: Boolean, char: Char) {
    if(is_zeichen){
      if(current > 0) {
        print(char)
        print_tree_char(height, anzahl_zeichen, anzahl_leer, current = current - 1, is_zeichen = true, char)
      } else if(anzahl_leer == 0 || height == 0){ // Wenn letzte Zeile endet
        print("\n")
        ende_baum(anzahl_zeichen / 2 +1, char)
        None
      }else {
        print("\n")
        print_tree_char(height = height - 1, anzahl_zeichen = anzahl_zeichen + 2, anzahl_leer, anzahl_leer, is_zeichen = false, char)
      }
    }else {
      if(current > 0) {
        print(" ")
        print_tree_char(height, anzahl_zeichen, anzahl_leer, current = current - 1, is_zeichen = false, char)
      }else if(anzahl_leer == 0 || height == 0){
        None
      }else {
        print_tree_char(height, anzahl_zeichen, anzahl_leer = anzahl_leer - 1, current = anzahl_zeichen, is_zeichen = true, char)
      }
    }
  }

  def main(args: Array[String]) {
    var foo: Int = 14
    print_tree(foo, 1, foo, foo, false)
    print_tree_char(foo, 1, foo, foo, false, 'o')
  }
}
