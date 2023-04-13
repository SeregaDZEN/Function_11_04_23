fun main() {
    agoToText(11000)
    val person = Transfer()
    println(person.commission(sumTransfer = 500))

}

fun agoToText(second: Int): String {

    val day = 86400

    when {
        second < 60 -> println("был(а) только что")
        second in 60..3599 -> {
            val minute = second / 60
            changeMinute(minute)

        }
        second in 3600 until day -> {
            val hour = second / 3600
            changeHours(hour)
        }

        second in day until day * 2 -> println("был(а) вчера")

        second > day * 2 && second < day * 3 -> println("был(а) позавчера")

        second >= day * 3 -> println("был(а) давно")
    }
    return "1"
}

fun changeMinute(minute: Int) {
    when {
        minute % 10 == 1 && minute != 11 -> println("был(а) $minute минуту назад")
        minute % 10 in 2 until 5  -> println("был(а) $minute минуты назад")
        else -> println("был(а) $minute минут назад")
    }
}
fun changeHours(hour : Int){
    when {
        hour % 10 == 1 && hour != 11 -> println("был(а)$hour час назад")
        hour % 10 in 2 until 5  -> println("был(а) $hour часа назад")
        else -> println("был(а) $hour часов назад")
    }
}


