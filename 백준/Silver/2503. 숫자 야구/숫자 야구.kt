import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val check = Array(1000){false}

    for(i in 123 until 1000){
        val s = i.toString()

        if(s[0] == s[1] || s[0] == s[2] || s[1] == s[2])
            continue

        if(s[0] == '0' || s[1] == '0' || s[2] == '0')
            continue

        check[i] = true
    }

    repeat(br.readLine().toInt()){
        val (num, strike, ball) = br.readLine().split(" ").map { it.toInt() }

        val inputNumString = num.toString()

        for(i in 123 until 1000){
            if(check[i]){
                val checkString = i.toString()
                var nStrike = 0
                var nBall = 0

                repeat(3){ v1 ->
                    repeat(3){ v2 ->
                        if(v1 == v2 && inputNumString[v1] == checkString[v2])
                            nStrike++
                        else if(v1 != v2 && inputNumString[v1] == checkString[v2])
                            nBall++
                    }
                }

                check[i] = nStrike == strike && nBall == ball
            }
        }
    }

    var count = 0
    check.forEach {
        if(it)
            count++
    }

    bw.write("$count")

    bw.close()
    br.close()
}