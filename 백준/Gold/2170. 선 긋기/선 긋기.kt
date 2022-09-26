import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val array = ArrayList<Line>()

    repeat(br.readLine().toInt()){
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        array.add(Line(x, y))
    }

    array.sort()
    var result = array[0].y - array[0].x
    var previous = array[0].y
    for(line in array){
        if(previous >= line.y)
            continue
        else if(previous > line.x){
            result += line.y - previous
            previous = line.y
        }else{
            result += line.y - line.x
            previous = line.y
        }
    }

    bw.write("$result")
    bw.close()
    br.close()
}

class Line(val x : Int, val y : Int):Comparable<Line>{
    override fun compareTo(other: Line): Int {
        return if(this.x == other.x)
             this.y - other.y
        else
            this.x - other.x
    }
}