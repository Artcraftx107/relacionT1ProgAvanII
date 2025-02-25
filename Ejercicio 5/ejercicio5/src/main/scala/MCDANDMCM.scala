import scala.io.StdIn

object MCDANDMCM {
  def mcd(a: Int, b: Int): Int = {
    if(b==0){
      a
    }else{
      mcd(b, a%b)
    }
  }

  def mcm(a: Int, b: Int): Int = {
    (a/mcd(a, b))*b
  }

  def main(args: Array[String]): Unit = {
    print("Introduce el primer numero: ")
    val n1 = StdIn.readInt()

    print("Introduce el segundo numero: ")
    val n2 = StdIn.readInt()

    val resultMCD = mcd(n1, n2)
    val resultMCM = mcm(n1, n2)

    println(s"El maximo comun divisor de $n1 y $n2 es: $resultMCD")
    println(s"El minimo comun multiplo de $n1 y $n2 es: $resultMCM")
  }
}
