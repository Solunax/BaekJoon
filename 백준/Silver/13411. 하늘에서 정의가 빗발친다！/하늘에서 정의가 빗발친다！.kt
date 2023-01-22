import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val arr = ArrayList<Robot>()
    repeat(br.readLine().toInt()){
        val (x, y, v) = br.readLine().split(" ").map { v -> v.toInt() }
        arr.add(Robot(it, x, y, v))
    }

    arr.sorted().forEach {
        bw.write("${it.num+1}\n")
    }

    br.close()
    bw.close()
}

class Robot(val num : Int, private val x : Int, private val y : Int, private val v : Int) : Comparable<Robot>{
    private val time = getDistance()

    private fun getDistance() : Double{
        return sqrt(x.toDouble().pow(2) + y.toDouble().pow(2)) / v
    }

    override fun compareTo(other: Robot): Int {
        return if(this.time == other.time)
            this.num.compareTo(other.num)
        else
            this.time.compareTo(other.time)
    }
}