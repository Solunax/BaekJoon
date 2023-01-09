import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val arr = ArrayList<Candidate>()
    arr.add(Candidate(1))
    arr.add(Candidate(2))
    arr.add(Candidate(3))

    repeat(br.readLine().toInt()){
        var index = 0
        br.readLine().split(" ").map { it.toInt() }.forEach {
            arr[index].score += it
            when(it){
                1 -> arr[index].one++
                2 -> arr[index].two++
                3 -> arr[index].three++
            }

            index++
        }
    }
    arr.sort()

    var flag = true
    if(arr[0].score == arr[1].score){
        if(arr[0].three == arr[1].three){
            if(arr[0].two == arr[1].two)
                flag = false
        }
    }

    if(flag)
        bw.write("${arr[0].num} ${arr[0].score}")
    else
        bw.write("0 ${arr[0].score}")

    br.close()
    bw.close()
}

class Candidate ( val num : Int,
                  var score : Int = 0,
                  var three : Int = 0,
                  var two : Int = 0,
                  var one : Int = 0) : Comparable<Candidate>{
    override fun compareTo(other: Candidate): Int {
        return if(this.score == other.score){
            if(this.three == other.three)
                other.two - this.two
            else
                other.three - this.three
        }else
            other.score - this.score
    }
}