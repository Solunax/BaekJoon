import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val arr = ArrayList<Competitor>()
    repeat(br.readLine().toInt()){
        val (score, submit, lastUpload) = br.readLine().split(" ").map { v -> v.toInt() }
        arr.add(Competitor(it + 1, score, submit, lastUpload))
    }

    arr.sort()
    bw.write("${arr[0].num}")


    bw.close()
    br.close()
}

class Competitor(val num : Int, private val score : Int, private val submit : Int, private val lastUpload : Int) : Comparable<Competitor>{
    override fun compareTo(other: Competitor): Int {
        return if(this.score == other.score){
            if(this.submit == other.submit)
                this.lastUpload - other.lastUpload
            else
                this.submit - other.submit
        }else
            other.score - this.score
    }
}