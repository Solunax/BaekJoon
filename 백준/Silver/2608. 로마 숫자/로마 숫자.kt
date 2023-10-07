import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val rome = HashMap<String, Int>()

fun main() {
    rome["I"] = 1
    rome["IV"] = 4
    rome["V"] = 5
    rome["IX"] = 9
    rome["X"] = 10
    rome["XL"] = 40
    rome["L"] = 50
    rome["XC"] = 90
    rome["C"] = 100
    rome["CD"] = 400
    rome["D"] = 500
    rome["CM"] = 900
    rome["M"] = 1000

    val num1 = changeToNumber(br.readLine().split("").filter { it.isNotEmpty() })
    val num2 = changeToNumber(br.readLine().split("").filter { it.isNotEmpty() })

    bw.write("${num1 + num2}\n${changeToRome(num1 + num2)}")

    bw.close()
    br.close()
}

fun changeToNumber(str : List<String>) : Int{
    var index = 0
    var number = 0

    while(index < str.size){
        val c = str[index]

        if((c == "I" || c == "X" || c == "C") && index < str.size - 1){
            val temp = str[index] + str[index + 1]

            if(rome.containsKey(temp)){
                number += rome[temp]!!
                index += 2
                continue
            }
        }

        number += rome[c]!!
        index++
    }

    return number
}

fun changeToRome(input : Int) : String{
    var num = input
    val sb = StringBuilder()
    val romeSorted = LinkedList(rome.entries).sortedByDescending { it.value }
    var count : Int

    while(num != 0){
        for(n in romeSorted){
            count = num / n.value

            if(count != 0){
                repeat(count){
                    sb.append(n.key)
                }
                num %= n.value
            }
        }
    }

    return sb.toString()
}