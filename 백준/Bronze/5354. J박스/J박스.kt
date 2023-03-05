import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val size = br.readLine().toInt()

        for(i in 0 until size){
            for(j in 0 until size){
                if(i == 0 || i == size - 1 || j == 0 || j == size - 1)
                    bw.write("#")
                else
                    bw.write("J")
            }
            bw.write("\n")
        }
        bw.write("\n")
    }

    br.close()
    bw.close()
}