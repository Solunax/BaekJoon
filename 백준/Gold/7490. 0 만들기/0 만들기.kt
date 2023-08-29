import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val op = listOf("+", "-", " ")
var n = 0
lateinit var result : ArrayList<String>

fun main() {
    repeat(br.readLine().toInt()){
        n = br.readLine().toInt()
        result = ArrayList()

        getResult(1, "1")

        result.sorted().forEach {
            bw.write("$it\n")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}


fun getResult(count : Int, s : String){
    if(count == n){
        val str = s.replace(" ", "")

        if(calcNumbers(str))
            result.add(s)

        return
    }

    repeat(3){
        getResult(count + 1, s + op[it] + "${count + 1}")
    }
}

fun calcNumbers(str : String) : Boolean{
    val st = StringTokenizer(str, "+|-", true)
    var sum = st.nextToken().toInt()

    while (st.hasMoreTokens()){
        when (st.nextToken()){
            "+" -> sum += st.nextToken().toInt()
            "-" -> sum -= st.nextToken().toInt()
        }
    }

    return sum == 0
}