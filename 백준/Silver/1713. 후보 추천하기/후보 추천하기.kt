import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val maximum = br.readLine().toInt()
    val picture = ArrayList<Candidate>()
    val n = br.readLine().toInt()
    val input = br.readLine().split(" ").map { it.toInt() }

    for(i in 0 until n) {
        val number = input[i]

        var searchFlag = false

        for (j in picture) {
            if (j.number == number) {
                j.suggestion++
                searchFlag = true
                break
            }
        }


        if (!searchFlag) {
            if (picture.size >= maximum){
                picture.sort()
                picture.removeFirst()
            }

            picture.add(Candidate(number, 1, i))
        }
    }

    val numbers = ArrayList<Int>()
    picture.forEach {
        numbers.add(it.number)
    }

    numbers.sorted().forEach {
        bw.write("$it ")
    }


    br.close()
    bw.close()
}

class Candidate(val number : Int, var suggestion :Int = 0, val index : Int) : Comparable<Candidate>{
    override fun compareTo(other: Candidate): Int {
        return if(this.suggestion == other.suggestion)
            this.index - other.index
        else if(this.suggestion > other.suggestion)
            1
        else
            -1
    }
}