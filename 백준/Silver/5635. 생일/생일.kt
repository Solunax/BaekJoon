import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = ArrayList<Peoples>()

    repeat(n){
        val (name, day, month, year) = br.readLine().split(" ")
        array.add(Peoples(name, year.toInt(), month.toInt(), day.toInt()))
    }

    array.sort()

    bw.write("${array.last().name}\n")
    bw.write(array.first().name)

    bw.close()
    br.close()
}

class Peoples(val name : String, private val year : Int, private val month : Int, private val day : Int):Comparable<Peoples>{
    override fun compareTo(other: Peoples): Int {
        return if(this.year == other.year){
            if(this.month == other.month)
                this.day - other.day
            else
                this.month - other.month
        }else
            this.year - other.year
    }
}

