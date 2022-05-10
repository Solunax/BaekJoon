import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

var array = Array(21){ Array(21){ Array(21){ 0 } } }

fun main() {
    while(true){
        val (v1, v2, v3) = br.readLine().split(" ").map { it.toInt() }

        if(v1 == -1 && v2 == -1 && v3 == -1)
            break
        else
            bw.write("w($v1, $v2, $v3) = ${function(v1,  v2, v3)}\n")
    }
    bw.flush()

    br.close()
    bw.close()
}

fun function(a:Int, b:Int, c:Int): Int {
    if (a <= 0 || b <= 0 || c <= 0)
        return 1
    else if (a > 20 || b > 20 || c > 20){
        array[20][20][20] = function(20, 20, 20)
        return array[20][20][20]
    }
    else if (a < b && b < c){
        if(array[a][b][c] != 0)
            return array[a][b][c]

        array[a][b][c] = function(a, b, c-1) + function(a, b-1, c-1) - function(a, b-1, c)
        return array[a][b][c]
    }

    if(array[a][b][c] != 0)
        return array[a][b][c]
    
    array[a][b][c] = function(a - 1, b, c) + function(a - 1, b - 1, c) + function(a - 1, b, c - 1) - function(a - 1, b - 1, c - 1)
    return array[a][b][c]
}