import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val k = br.readLine().toInt()
val input = br.readLine().split(" ").map{ it.toInt() }

val resultArr = Array(k){ArrayList<Int>()}

fun main() {
    getResult(0, input.size-1, 0)

    resultArr.forEach {
        it.forEach { v ->
             bw.write("$v ")
        }
        bw.write("\n")
    }

    br.close()
    bw.close()
}

fun getResult(start : Int, end : Int, floor : Int){
    if(floor == k)
        return

    val center = (start+end)/2
    resultArr[floor].add(input[center])

    getResult(start, center-1, floor+1)
    getResult(center+1, end, floor+1)
}