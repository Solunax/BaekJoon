import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var p = 13
    var k = 13
    var h = 13
    var t = 13

    val input = br.readLine()
    val card = HashSet<String>()
    var check = true

    for(i in input.indices step 3){
        val temp = input.substring(i, i + 3)

        if(!card.contains(temp))
            card.add(temp)
        else{
            check = false
            break
        }
    }

    if(!check)
        bw.write("GRESKA")
    else{
        card.forEach {
            when(it[0]){
                'P' -> p--
                'K' -> k--
                'H' -> h--
                'T' -> t--
            }
        }

        bw.write("$p $k $h $t")
    }

    bw.close()
    br.close()
}