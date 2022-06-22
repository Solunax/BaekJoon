import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val array = Array(1000001){ true }

    array[0] = false
    array[1] = false

    for(i in 2 .. 1000000){
        if(array[i]){
            for(j in i * 2 .. 1000000 step(i))
                array[j] = false
        }
    }

    while(true){
        val input = br.readLine().toInt()
        if(input == 0)
            break

        var exist = false

        for(i in 3 .. input){
            if(array[i] && array[input - i]){
                bw.write("$input = $i + ${input - i}\n")
                exist = true
                break
            }
        }

        if(!exist)
            bw.write("Goldbach's conjecture is wrong.\n")
    }

    bw.close()
    br.close()
}