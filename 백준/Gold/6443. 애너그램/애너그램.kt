import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var check : Array<Int>
lateinit var visit : Array<Boolean>
lateinit var set : HashSet<String>
lateinit var stack : Stack<Char>
val sb = StringBuilder()

fun main() {
    set = HashSet()

    repeat(br.readLine().toInt()){
        val input = br.readLine().toCharArray()
        check = Array(26){0}
        visit = Array(input.size){false}
        stack = Stack()
        set.clear()

        input.forEach {
            check[it - 'a']++
        }

        track(0, input.size)

        set.sorted().forEach {
            bw.write("$it\n")
        }
    }

    bw.close()
    br.close()
}

fun track(length : Int, n : Int){
    if(length == n){
        sb.clear()

        for(c in stack)
            sb.append(c)

        set.add(sb.toString())
    }

    for(i in 0 until 26){
        if(check[i] > 0){
            check[i]--
            stack.push((i + 'a'.code).toChar())
            track(length + 1, n)
            stack.pop()
            check[i]++
        }
    }
}