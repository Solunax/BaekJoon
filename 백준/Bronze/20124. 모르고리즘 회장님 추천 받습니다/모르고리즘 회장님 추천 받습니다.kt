import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val candidate = ArrayList<Candidate>()

    repeat(br.readLine().toInt()){
        val (name, score) = br.readLine().split(" ")

        candidate.add(Candidate(name, score.toInt()))
    }
    candidate.sort()

    bw.write(candidate.first().name)

    bw.close()
    br.close()
}

class Candidate(val name : String, private val score : Int) : Comparable<Candidate>{
    override fun compareTo(other: Candidate): Int {
        return if(score == other.score)
            name.compareTo(other.name)
        else
            other.score - score
    }
}