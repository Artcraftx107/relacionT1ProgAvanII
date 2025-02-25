object listaHandler {
  def rotar(lista: List[Int], k: Int): List[Int] = {
    if(lista.isEmpty){
      return lista //Devuelve la lista si esta vacia
    }

    val n = lista.length
    val rotations = k%n

    val(izquierda, derecha) = lista.splitAt(n-rotations)
    derecha++izquierda
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    val k=4
    val result = rotar(list, k)

    println(s"Lista original: $list")
    println(s"Lista rotada $k posiciones: $result")
  }
}
