import java.util.*

fun main(args: Array<String>){//main function
 feedFish()
}

fun feedFish() {
    val day = randomDay();
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    if(shouldChangeWater(day = day)) println("change the water today");
}
fun shouldChangeWater(temperature:Int=22, dirty:Int=20, day:String):Boolean {//change water function
    val isHot= temperature > 30;
    val isDirty= dirty > 30;
    val isSunday = day == "Sunday"

    return when {
        isHot->true
        isDirty->true
        isSunday-> true
        else -> false
    }
}
fun randomDay(): String {
    val daysOfTheWeek= listOf("Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")//daysOfTheWeek

    return daysOfTheWeek[Random().nextInt(7)]

}

fun fishFood(day:String): String{//fish food function
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