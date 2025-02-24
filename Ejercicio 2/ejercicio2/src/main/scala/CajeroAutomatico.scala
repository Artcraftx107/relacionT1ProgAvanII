import scala.io.StdIn
object CajeroAutomatico {
  var saldo: Double = 1000.0 //Saldo inicial

  def mostrarMenu(): Unit = {
    println("\n=== Cajero Automatico ===")
    println("1. Consultar saldo")
    println("2. Depositar dinero")
    println("3. Retirar dinero")
    println("4. Salir")
    println("Seleccione una opcion: ")
  }

  def consultarSaldo(): Unit = {
    println(s"\nSu saldo actual es: $$${saldo}")
  }

  def deposit(): Unit = {
    print("\nIngrese el monto a depositar: ")
    val monto = StdIn.readDouble()
    if (monto > 0) {
      saldo += monto
      println(s"Deposito exitoso. Su nuevo saldo es: $$${saldo}")
    } else {
      println("Monto invalido. Vuelvalo a intentar")
    }
  }

  def withdraw(): Unit = {
    print("\nIngerese el monto a retirar: ")
    val monto = StdIn.readDouble()
    if (monto > saldo) {
      println("El monto ingresado es mayor al saldo disponible")
    } else {
      saldo -= monto
      println(s"\nEl nuevo saldo es: $$${saldo}")
    }
  }

  def main(args: Array[String]): Unit = {
    var opcion = 0
    while (opcion != 4) {
      mostrarMenu()
      opcion = StdIn.readInt()
      opcion match
        case 1 => consultarSaldo()
        case 2 => deposit()
        case 3 => withdraw()
        case 4 => println("Operaciones finalizadas")
        case _ => println("Opcion no valida. Vuelvalo a intentar")
    }
  }
}