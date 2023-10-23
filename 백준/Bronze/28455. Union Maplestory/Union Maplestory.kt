import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val character = Array(n){0}
    var total = 0
    var stat = 0

    repeat(n){
        character[it] = br.readLine().toInt()
    }
    character.sortDescending()

    val m = if(n <= 42){
        n
    } else {
        42
    }

    for(i in 0 until m){
        total += character[i]

        stat += if(character[i] >= 250){
            5
        } else if(character[i] >= 200){
            4
        } else if(character[i] >= 140){
            3
        } else if(character[i] >= 100){
            2
        } else if(character[i] >= 60){
            1
        } else {
            0
        }
    }
    bw.write("$total $stat")

    bw.close()
    br.close()
}