import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var v1 = br.readLine()
    var v2 = br.readLine()

    val v1Origin = v1
    val v2Origin = v2

    if(v1.length != v2.length){
        val len = lcm(v1.length, v2.length)

        while(v1.length != len){
            v1 += v1Origin
        }
        
        while(v2.length != len){
            v2 += v2Origin
        }
    }

    if(v1 == v2)
        bw.write("1")
    else
        bw.write("0")

    bw.close()
    br.close()
}

fun lcm(n1 : Int, n2 : Int) : Int{
    return (n1 * n2) / gcd(n1, n2)
}

fun gcd(n1 : Int, n2 : Int) : Int{
    return if(n2 == 0)
        n1
    else
        gcd(n2, n1 % n2)
}