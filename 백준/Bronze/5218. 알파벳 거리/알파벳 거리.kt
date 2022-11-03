import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (v1, v2) = br.readLine().split(" ")

        bw.write("Distances: ")
        for(i in v1.indices){
            if(v1[i] > v2[i])
                bw.write("${(v2[i]-'A'+27)-(v1[i]-'A'+1)} ")
            else
                bw.write("${(v2[i]-'A'+1)-(v1[i]-'A'+1)} ")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}