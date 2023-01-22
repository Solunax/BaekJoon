import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map{ it.toInt() }
    val score = br.readLine().split(" ").map { it.toInt() }
    val studentArr = ArrayList<Student>()

    repeat(m){
        val input = br.readLine().split(" ")
        var sum = 0
        for(i in 0 until n){
            if(input[i+1] == "O")
                sum += score[i]
        }

        studentArr.add(Student(input[0].toInt(), sum))
    }

    studentArr.sort()
    bw.write("${studentArr.first().num} ${studentArr.first().score}")

    br.close()
    bw.close()
}

class Student (val num : Int, val score : Int) : Comparable<Student>{
    override fun compareTo(other: Student): Int {
        return if(this.score == other.score)
            this.num.compareTo(other.num)
        else
            other.score - this.score
    }
}

