import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val sc = Scanner(System.`in`)

    val (numberOfCards, dealerNumber) = Pair(sc.nextInt(), sc.nextInt())
    val cardNumber = ArrayList<Int>()

    for(i in 0 until numberOfCards)
        cardNumber.add(sc.nextInt())

    var result = 0
    var sum = 0

    for(i in 0 until cardNumber.size - 2){
        for(j in i + 1 until  cardNumber.size - 1){
            for(k in j + 1 until cardNumber.size){
                sum = cardNumber[i] + cardNumber[j] + cardNumber[k]

                if(result < sum && sum <= dealerNumber)
                    result = sum
            }
        }
    }
    println(result)
}