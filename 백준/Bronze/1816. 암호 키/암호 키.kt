import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
const val MAX = 1000001
val check = Array(MAX){true}
val prime = ArrayList<String>()

fun main() {
    setPrime()

    repeat(br.readLine().toInt()){
        val num = BigInteger(br.readLine())
        var flag = true

        for(i in 0 until prime.size){
            if(num.remainder(BigInteger(prime[i])) == BigInteger("0")){
                flag = false
                break
            }
        }


        if(flag)
            bw.write("YES\n")
        else
            bw.write("NO\n")
    }

    bw.close()
    br.close()
}

fun setPrime(){
    check[0] = false
    check[1] = false

    for(i in 2 until  MAX){
        if(check[i]){
            for(j in 2 * i until MAX step (i))
                check[j] = false
        }
    }

    for(i in 0 until MAX){
        if(check[i])
            prime.add(i.toString())
    }
}