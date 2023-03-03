import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val (a, b, c) = br.readLine().split(" ").map { it.toInt() }.sorted()

        if(a == 0 && b == 0 && c == 0)
            break

        if(c >= a + b)
            bw.write("Invalid\n")
        else{
            if(a == b && b == c)
                bw.write("Equilateral\n")
            else if(a == b || b == c)
                bw.write("Isosceles\n")
            else
                bw.write("Scalene\n")
        }
    }

    br.close()
    bw.close()
}