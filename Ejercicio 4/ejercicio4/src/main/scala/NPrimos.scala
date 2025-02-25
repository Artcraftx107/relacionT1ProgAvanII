object NPrimos {
  def esPrimo(valor: Int): Boolean = {
    if(valor<2) return false

    val limite = math.sqrt(valor).toInt
    for(i<-2 to limite){
      if(valor%i == 0){
        return false
      }
    }

    true
  }

  def primerosPrimos(n: Int): Unit = {
    var counter = 0
    var current_num = 2

    while(counter<n){
      if(esPrimo(current_num)){
        print(s"$current_num ")
        counter+=1
      }
      current_num+=1
    }
    println()
  }

  def main(args: Array[String]): Unit ={
    print("Introduce N: ")
    val n = scala.io.StdIn.readInt()

    if(n>0){
      println(s"Los primos $n numeros primos son: ")
      primerosPrimos(n)
    }else{
      println("Error, numero introducido < 2")
    }
  }
}
