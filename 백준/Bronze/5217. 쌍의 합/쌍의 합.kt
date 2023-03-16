import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val n = br.readLine().toInt()
        bw.write("Pairs for $n: ")
        val result = getPair(n)

        for(i in 0 until result.size){
            if(i != result.size - 1)
                bw.write("${result[i].first} ${result[i].second}, ")
            else
                bw.write("${result[i].first} ${result[i].second}")
        }
        bw.write("\n")
    }

    br.close()
    bw.close()
}

fun getPair(n : Int) : ArrayList<Pair<Int, Int>>{
    val arr  = ArrayList<Pair<Int, Int>>()
    for(i in 1 .. n){
        for(j in i + 1 .. n){
            if(i + j == n)
                arr.add(Pair(i, j))
        }
    }

    return arr
}