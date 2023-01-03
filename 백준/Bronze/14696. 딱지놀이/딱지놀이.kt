import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val a = Array(5){0}
        val b = Array(5){0}

        val inputA = br.readLine().split(" ").map { it.toInt() }
        val inputB = br.readLine().split(" ").map { it.toInt() }

        for(i in 1 until inputA.size)
            a[inputA[i]]++

        for(i in 1 until inputB.size)
            b[inputB[i]]++

        if(a[4] != b[4]){
            if(a[4] > b[4])
                bw.write("A\n")
            else
                bw.write("B\n")
        }else if(a[3] != b[3]){
            if(a[3] > b[3])
                bw.write("A\n")
            else
                bw.write("B\n")
        }else if(a[2] != b[2]){
            if(a[2] > b[2])
                bw.write("A\n")
            else
                bw.write("B\n")
        }else if (a[1] != b[1]){
            if(a[1] > b[1])
                bw.write("A\n")
            else
                bw.write("B\n")
        }else
            bw.write("D\n")
    }

    br.close()
    bw.close()
}