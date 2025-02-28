object DeleteDuplicateMatriz {
  def deleteDuplicates(matriz: Array[Array[Int]]): Array[Array[Int]] = {
    val filas = matriz.length
    val columnas = matriz(0).length
    val encontrados = scala.collection.mutable.Set[Int]() // Rastreo de valores únicos
    val valoresUnicos = scala.collection.mutable.ArrayBuffer[Int]() // Lista de valores únicos

    // Recorrer la matriz y almacenar solo valores únicos
    for (fila <- matriz; num <- fila) {
      if (!encontrados.contains(num)) {
        encontrados.add(num)
        valoresUnicos.append(num)
      }
    }

    // Crear la nueva matriz vacía
    val resultado = Array.ofDim[Int](filas, columnas)
    var index = 0

    // Llenar la nueva matriz con los valores únicos
    for (fila <- 0 until filas; columna <- 0 until columnas) {
      if (index < valoresUnicos.length) {
        resultado(fila)(columna) = valoresUnicos(index)
        index += 1
      } else {
        resultado(fila)(columna) = 0 // Rellenar con ceros si no hay más valores únicos
      }
    }

    resultado
  }

  def main(args: Array[String]): Unit = {
    val matriz = Array(
      Array(1, 2, 3, 4),
      Array(5, 6, 3, 7),
      Array(8, 1, 9, 2)
    )

    val matrizSinDuplicados = deleteDuplicates(matriz)

    println("Matriz original:")
    for (fila <- matriz) println(fila.mkString(", "))

    println("\nMatriz sin duplicados:")
    for (fila <- matrizSinDuplicados) println(fila.mkString(", "))
  }
}
