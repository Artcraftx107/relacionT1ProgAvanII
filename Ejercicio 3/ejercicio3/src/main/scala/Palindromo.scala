object Palindromo {
  def esPalindromo(valor: String): Boolean = {
    val aux = valor.toLowerCase().replaceAll("\\s", "") /*
    Esto lo que hace es almacenar el string recibido en minusculas*/

    aux == aux.reverse //devuelve si el string en minusculas es igual que el string invertido (mira si es palindromo)
  }

  def main(args: Array[String]): Unit ={
    print("Introduce una palabra/frase: ")
    val input = scala.io.StdIn.readLine()

    if(esPalindromo(input)){
      println(s"La palabra/frase <$input> es palindromo")
    }else{
      println(s"La palabra/frase <$input> NO es palindromo")
    }
  }
}
