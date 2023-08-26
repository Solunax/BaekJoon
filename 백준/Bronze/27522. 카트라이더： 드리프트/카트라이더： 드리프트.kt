import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var red = 0
    var blue = 0
    val arr = ArrayList<Score>()
    val rankScore = listOf(10, 8, 6, 5, 4, 3, 2, 1, 0)

    repeat(8){
        val (time, team) = br.readLine().split(" ")
        val (m, s, mils) = time.split(":").map { it.toInt() }
        arr.add(Score(m, s, mils, team))
    }

    arr.sortWith{ o1, o2 ->
        if(o1.m == o2.m){
            if(o1.s == o2.s)
                o1.mils - o2.mils
            else
                o1.s - o2.s
        }else
            o1.m - o2.m
    }

    repeat(8){
        when(arr[it].team){
            "R" -> red += rankScore[it]
            "B" -> blue += rankScore[it]
        }
    }

    if(red > blue)
        bw.write("Red")
    else
        bw.write("Blue")

    bw.close()
    br.close()
}

data class Score(val m : Int, val s : Int, val mils : Int, val team : String)