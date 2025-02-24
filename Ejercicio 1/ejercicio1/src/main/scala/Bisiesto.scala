object Bisiesto {
  def esBisiesto(anyo: Int): Boolean = {
    (anyo%4 == 0 && anyo%100!=0)||(anyo%400==0)
  }

  def main(args: Array[String]): Unit = {
    println(s"Introduzca el año a comprobar: ")
    val anyo = scala.io.StdIn.readInt()
    if(esBisiesto(anyo))
      println(s"$anyo es un año bisiesto")
    else
      println(s"$anyo no es un año bisiesto")
  }
}
