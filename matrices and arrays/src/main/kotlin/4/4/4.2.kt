// Постановка задачи: Дана матрица. Вывести на экран первый и последний столбцы.
fun main() {
    println("Введите количество строк: ")
    val m = readLine() ?.toInt() ?: 0
    println("Введите количество столбцов: ")
    val n = readLine() ?.toInt() ?: 0
    val array2D = Array(m) {Array(n) {(1..20).random()} }  // создание массива m*n
    println("Новый массив:")
    for (i in 0 until array2D.size){
        for (j in 0 until array2D[i].size)
            print(String.format("%4d", array2D[i][j]))
        println()
    }
    println()
    println("Первый столбец ")
    for (i in 0 until array2D.size)  {
        for (j in 0 until array2D[i].size){
            if (j==0)
                print(String.format("%4d", array2D[i][j]))
        }
    }
    println()
    println("Второй столбец:")
    for (i in 0 until array2D.size)  {
        for (j in 0 until array2D[i].size){
            if (j==n-1)
                print(String.format("%4d", array2D[i][j]))
        }
    }

}