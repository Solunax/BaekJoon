import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val array = ArrayList<School>()

        repeat(br.readLine().toInt()){
            val (name, consume) = br.readLine().split(" ")
            array.add(School(name, consume.toInt()))
        }

        array.sortDescending()
        bw.write("${array.first().name}\n")
    }

    bw.close()
    br.close()
}

class School(val name : String, val consume : Int):Comparable<School>{
    override fun compareTo(other: School): Int {
        return this.consume - other.consume
    }
}