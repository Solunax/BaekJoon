import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (r, c) = br.readLine().split(" ").map { it.toInt() }
    val card = Array(2*r){Array(2*c){""}}
    var index = 1

    val design = Array(r){""}
    repeat(r){
        design[it] = br.readLine()
        design[it] += design[it].reversed()
    }

    for(i in 0 until 2*r){
        if(i < r){
            for(j in 0 until 2*c)
                card[i][j] = design[i][j].toString()
        }else{
            card[i] =  card[r - index].clone()
            index++
        }
    }

    val (errorX, errorY) = br.readLine().split(" ").map { it.toInt() - 1 }
    when(card[errorX][errorY]){
        "." -> {card[errorX][errorY] = "#"}
        "#" -> {card[errorX][errorY] = "."}
    }

    card.forEach {
        it.forEach { v ->
            bw.write(v)
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}
