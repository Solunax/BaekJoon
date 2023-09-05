import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = ArrayList<String>()

    repeat(3){
        input.add(br.readLine())
    }

    for(i in 0 until 3){
        if(input[i] !in listOf("Fizz", "Buzz", "FizzBuzz")){
            val num = input[i].toInt() + 3 - i

            if(num % 3 == 0 && num % 5 == 0)
                bw.write("FizzBuzz")
            else if(num % 3 == 0)
                bw.write("Fizz")
            else if(num % 5 == 0)
                bw.write("Buzz")
            else
                bw.write("$num")

            break
        }
    }

    bw.close()
    br.close()
}