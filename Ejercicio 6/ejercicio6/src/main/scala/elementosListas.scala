object elementosListas {
  def segundoMasGrande(lista: List[Int]): Option[Int] = {
    if(lista.length < 2){
      return None
    }

    var max1 = Int.MinValue
    var max2 = Int.MinValue

    for(num <- lista){
      if(num > max1){
        max2=max1
        max1=num
      }else if (num > max2 && num != max1){
        max2 = num
      }
    }

    if(max2 == Int.MinValue){
      None
    }else{
      Some(max2)
    }
  }

  def main(args: Array[String]): Unit = {
    //Testeo de uso
    val testeo = List(10, 5, 8, 20, 20, 15, 8)
    val result = segundoMasGrande(testeo)
    result match {
      case Some(valor) => println(s"El segundo mas grande es: $valor")
      case None => println("No hay suficientes elementos diferentes en la lista")
    }
  }
}
