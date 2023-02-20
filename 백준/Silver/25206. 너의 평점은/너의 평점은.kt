import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val rank = HashMap<String, Double>()

fun main() {
    initializeRank()
    var total = 0.0
    var sum = 0.0

    repeat(20){
        val (_, num, r) = br.readLine().split(" ")

        if(r != "P"){
            total += num.toDouble()
            sum += num.toDouble() * rank[r]!!
        }
    }
    bw.write("%.6f".format(sum / total))


    br.close()
    bw.close()
}

fun initializeRank(){
    rank["A+"] = 4.5
    rank["A0"] = 4.0
    rank["B+"] = 3.5
    rank["B0"] = 3.0
    rank["C+"] = 2.5
    rank["C0"] = 2.0
    rank["D+"] = 1.5
    rank["D0"] = 1.0
    rank["F"] = 0.0
}