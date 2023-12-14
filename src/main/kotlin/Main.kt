import kotlin.random.Random
fun main(args: Array<String>) {

    // Задание 1
    println("Задание 1")
    val random = Random
    val history = random.nextInt(1, 10)
    val german = random.nextInt(1, 10)
    val mathematics = random.nextInt(1, 10)
    if (history < 5) {
        println("По истории: плохо")
    } else {
        println("По истории: хорошо")
    }
    if (german < 5)
        println("По немецкому: плохо")
    else
        println("По немецкому: хорошо")
    if (mathematics < 5)
        println("По математике: плохо")
    else
        println("По математике: хорошо")

    // Задание 2
    println("Задание 2")
    val random2 = Random
    val miss1 = random2.nextInt(0, 2)
    val miss2 = random2.nextInt(0, 2)
    val miss3 = random2.nextInt(0, 2)
    if (miss1 == 1) {
        println("Попадание")
    } else {
        println("Промах")
    }
    if (miss2 == 1)
        println("Попадание")
    else
        println("Промах")
    if (miss3 == 1)
        println("Попадание")
    else
        println("Промах")
    var result = miss1 + miss2 + miss3
    println("Общее количество попаданий: " + result)

    // Задание 3
    println("Задание 3")
    var population = 10.0
    var birthrate = 14.0
    var deathrate = 8.0
    for (year in 1..10) {
        birthrate -= 1
        deathrate -= 1

        if (birthrate < 7) birthrate = 7.0
        if (deathrate < 6) deathrate = 6.0

        population += (population * birthrate / 1000) - (population * deathrate / 1000)
    }

    println("Численность населения через 10 лет: $population миллионов")

    // Задание 4
    println("Задание 4")
    print("Введите сумму вклада: ")
    val amount: Double = readLine()!!.toDouble()
    print("Введите количество месяцев: ")
    val countmonths: Int = readLine()!!.toInt()

    var totalAmount = amount
    for (i in 1..countmonths) {
        totalAmount += totalAmount * 0.07
    }
    println("Итоговая сумма вклада через $countmonths месяцев: $totalAmount")

    // Задание 5
    println("Задание 5")
    print("Введите сумму вклада: ")
    val amount2: Double = readLine()!!.toDouble()
    print("Введите количество месяцев: ")
    val countmonths2: Int = readLine()!!.toInt()

    var totalAmount2 = amount2
    var i = 1
    while (i <= countmonths2) {
        totalAmount2 += totalAmount2 * 0.07
        i++
    }
    println("Итоговая сумма вклада через $countmonths2 месяцев: $totalAmount2")


    // Задание 6
    println("Задание 6")
    for (i in 1..9) {
        for (j in 1..9) {
            print("${i * j}\t")
        }
        println()
    }
}