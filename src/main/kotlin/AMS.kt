import java.util.*

fun main(args: Array<String>){//main function
 feedFish()
}

fun feedFish() {
    val day = randomDay();
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {
    val daysOfTheWeek= listOf("Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return daysOfTheWeek[Random().nextInt(7)]

}

fun fishFood(day:String): String{
    return when (day){//switch statement
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "Granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }

}