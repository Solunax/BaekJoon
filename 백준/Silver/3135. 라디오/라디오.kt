import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b) = br.readLine().split(" ").map { it.toInt() }
    val numberOfFavorite = br.readLine().toInt()
    val favorite = Array(numberOfFavorite){ 0 }

    for(i in 0 until numberOfFavorite)
        favorite[i] = br.readLine().toInt()

    var dif = abs(a - b)
    var flag = false

    for(i in favorite.indices){
        if(abs(favorite[i] - b) < dif){
            dif = abs(favorite[i] - b)
            flag = true
        }

    }
    
    if(flag)
        bw.write("${1 + dif}")
    else
        bw.write("$dif")
    
    bw.close()
    br.close()
}