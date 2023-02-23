import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val(comp, n, t, l) = br.readLine().split(" ")
        if(check(comp, n, t, l))
            bw.write("TLE!\n")
        else
            bw.write("May Pass.\n")
    }

    br.close()
    bw.close()
}

fun check(comp : String, n : String, t : String, l : String) : Boolean{
    var len = BigInteger(n)
    val case = BigInteger(t)
    val limit = BigInteger(l).multiply(BigInteger("100000000"))

    when(comp){
        "O(N)" -> {
            if(len.multiply(case).compareTo(limit) == 1)
                return true
        }
        "O(N^2)" -> {
            if(len.pow(2).multiply(case).compareTo(limit) == 1)
                return true
        }
        "O(N^3)" -> {
            if(len.pow(3).multiply(case).compareTo(limit) == 1)
                return true
        }
        "O(2^N)" -> {
            if(BigInteger("2").pow(len.toInt()).multiply(case).compareTo(limit) == 1)
                return true
        }
        "O(N!)" -> {
            var n = len.toLong()

            while(n-- > 1){
                len = len.multiply(BigInteger.valueOf(n))

                if(len.compareTo(limit) == 1)
                    return true
            }

            if(len.multiply(case).compareTo(limit) == 1)
                return true
        }
    }

    return false
}