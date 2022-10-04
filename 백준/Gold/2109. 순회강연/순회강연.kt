import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val array = ArrayList<Lecture>()

    repeat(br.readLine().toInt()){
        val input = br.readLine().split(" ").map{ it.toInt() }
        array.add(Lecture(input[0], input[1]))
    }

    val pq = PriorityQueue<Lecture>()
    for(i in array)
        pq.add(i)

    var result = 0
    val check = Array(10001){false}
    while(pq.isNotEmpty()){
        val value = pq.poll()

        for(i in value.day downTo 1){
            if(!check[i]){
                check[i] = true
                result += value.pay
                break
            }
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}

class Lecture(val pay : Int, val day : Int):Comparable<Lecture>{
    override fun compareTo(other: Lecture): Int {
        return if(this.pay == other.pay){
            this.day - other.day
        }else
            other.pay - this.pay
    }
}