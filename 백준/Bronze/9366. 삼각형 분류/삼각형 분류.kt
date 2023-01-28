import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (a, b, c) = br.readLine().split(" ").map { v -> v.toInt() }.sorted()

        val result = if(a + b > c){
            if(a == b && b == c)
                "equilateral"
            else if(a == b || b == c || a == c)
                "isosceles"
            else
                "scalene"
        } else
            "invalid!"

        bw.write("Case #${it + 1}: $result\n")
    }

    br.close()
    bw.close()
}

