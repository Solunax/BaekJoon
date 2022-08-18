import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val m = br.readLine().toInt()
    val tree = Array(n + 1){ Array(n+1){0} }
    val check = Array(n + 1){0}

    for(i in 0 until m){
        val (v1,v2) = br.readLine().split(" ").map { it.toInt() }
        tree[v1][v2] = 1
        tree[v2][v1] = 1
    }

    val stack = Stack<Int>()
    stack.push(1)
    check[1] = 1
    var result = 0

    while(stack.isNotEmpty()){
        val index = stack.pop()

        for(i in 1 .. n){
            if(tree[index][i] == 1 && check[i] != 1){
                stack.push(i)
                check[i] = 1
                result++
            }
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}