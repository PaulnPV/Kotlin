import kotlin.system.exitProcess

// Постановка задачи: Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов

// Переменные:
// - array  - двумерный массив целый чисел размерностью 5*5
// - tape - целочисленная переменная. Отвечает за номер выбранного пользователем действия (вводится с клавиатуры)
// - printMatrix (array: Array<Array<Int>>) - функция, отвечающая за вывод двумерного массива на экран
// - create2DArrayRandom(): Array<Array<Int>> - функция, задающая двумерный массив из целых чисел с клавиатуры
// - searchNegativeNumbers(array: Array<Array<Int>>) - функция, находящая сумму модулей всех отрицательных чисел массива

fun main() {
    var array = Array(5){Array(5){0} }              // Задание пустого двумерного массива оперделённой размерности
    println("Введите матрицу 5*5 или задайте рандомно")
    println("1. Задать матрицу самостоятельно")
    println("2. Использовать рандомайзер")
    println("3. Нажмите любую другую клавишу для завершения программы.")
    val tape = readLine()?.toInt()                          // выбор пользователем действия

    // аналог switch-case в других языках программирования
    when (tape){

        // пользователь вводит массив с клавитауры
        1-> {
            println("Введите значения массива ")
            for (i in 0 until 5){
                for (j in 0 until 5){
                    print("[$i][$j] элемент = ")
                    array[i][j] = readLine()?.toInt() ?: 0  // если введено число (изначально вводится в качестве строки)
                                                            // - преобразование введённой строки в число
                }
            }
            println("Новый массив")
            printMatrix(array)                              // вывод массива на экран
            searchNegativeNumbers(array)
        }

        // задание массива рандомно
        2->{
            array = create2DArrayRandom()                   // вызов функции, задающей рандомный массив чисел
            printMatrix(array)                              // вызов функции, выводящей массив на экран
            searchNegativeNumbers(array)
        }
    }
    exitProcess(0)
}

fun printMatrix (array: Array<Array<Int>>){
    for (i in 0 until 5){
        for (j in 0 until 5)
            print(String.format("%4d", array[i][j]))
        println()
    }
}

fun create2DArrayRandom(): Array<Array<Int>> {
    val array = Array(5) { Array(5) { (-20..20).random() } }
    return array
}

fun searchNegativeNumbers(array: Array<Array<Int>>){
    var summ = 0                                               // сумма модулей всех отрицательных чисел двумерного массива
    for (i in 0 until 5){
        for (j in 0 until 5){
            if (array[i][j]<0)
               summ  += Math.abs(array[i][j])
        }
    }
    println("Сумма модулей отрицательных чисел двумерного массива = $summ")
}



