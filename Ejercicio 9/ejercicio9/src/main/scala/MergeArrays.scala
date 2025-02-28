object MergeArrays {
  // Función para ordenar un array
  def insertionSort(arr: Array[Int]): Array[Int] = {
    for (i <- 1 until arr.length) {
      val key = arr(i)
      var j = i - 1
      while (j >= 0 && arr(j) > key) {
        arr(j + 1) = arr(j)
        j -= 1
      }
      arr(j + 1) = key
    }
    arr
  }

  // Función para fusionar dos arrays (ordenado)
  def mergeArrays(arr1: Array[Int], arr2: Array[Int]): Array[Int] = {
    val sortedArr1 = insertionSort(arr1.clone()) // Ordenamos antes de fusionar
    val sortedArr2 = insertionSort(arr2.clone())

    val merged = new Array[Int](sortedArr1.length + sortedArr2.length)
    var i = 0
    var j = 0
    var k = 0

    while (i < sortedArr1.length && j < sortedArr2.length) {
      if (sortedArr1(i) <= sortedArr2(j)) {
        merged(k) = sortedArr1(i)
        i += 1
      } else {
        merged(k) = sortedArr2(j)
        j += 1
      }
      k += 1
    }

    while (i < sortedArr1.length) {
      merged(k) = sortedArr1(i)
      i += 1
      k += 1
    }

    while (j < sortedArr2.length) {
      merged(k) = sortedArr2(j)
      j += 1
      k += 1
    }

    merged
  }

  def main(args: Array[String]): Unit = {
    val arr1 = Array(1, 2, 7, 5)
    val arr2 = Array(4, 3, 6, 8)

    val mergedArray = mergeArrays(arr1, arr2)

    println("Arrays combinados y ordenado:")
    println(mergedArray.mkString(", "))
  }
}