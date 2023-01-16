import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b ,c) = br.readLine().split(" ").map{ it.toInt() }
    calculate(a, b, c)

    br.close()
    bw.close()
}

fun calculate(a : Int, b : Int, c : Int){
    if(a + b == c){
        bw.write("$a+$b=$c")
        return
    }

    if(a - b == c){
        bw.write("$a-$b=$c")
        return
    }

    if(a * b == c){
        bw.write("$a*$b=$c")
        return
    }

    if(a / b == c){
        bw.write("$a/$b=$c")
        return
    }

    if(a == b + c){
        bw.write("$a=$b+$c")
        return
    }

    if(a == b - c){
        bw.write("$a=$b-$c")
        return
    }

    if(a == b * c){
        bw.write("$a=$b*$c")
        return
    }

    if(a == b / c){
        bw.write("$a=$b/$c")
        return
    }
}