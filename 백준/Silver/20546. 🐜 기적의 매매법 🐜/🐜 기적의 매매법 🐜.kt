import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var chart : List<Int>

fun main() {
    val m = br.readLine().toInt()
    chart = br.readLine().split(" ").map{ it.toInt() }

    val jun = bnp(m)
    val sung = timing(m)

    if(jun > sung)
        bw.write("BNP")
    else if(jun < sung)
        bw.write("TIMING")
    else
        bw.write("SAMESAME")

    br.close()
    bw.close()
}

fun bnp(money : Int) : Int{
    var m = money
    var share = 0

    for(i in 0 until 13){
        share += m / chart[i]
        m %= chart[i]
    }

    return m + (share * chart.last())
}

fun timing(money: Int) : Int{
    var m = money
    var share = 0
    var up = 0
    var down = 0

    for(i in 1 until 13){
        if(chart[i] > chart[i - 1]){
            up++
            down = 0
        }else if(chart[i] < chart[i - 1]){
            down++
            up = 0
        }else{
            up = 0
            down = 0
        }

        if(up >= 3){
            m += chart[i] * share
            up = 0
            share = 0
        }else if(down >= 3){
            val temp = m / chart[i]
            share += temp
            m -= temp * chart[i]
        }
    }

    return m + (share * chart.last())
}