import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    while(true){
        val (numA, numB) = br.readLine().split(" ").map { it.toInt() }
        val aArray = ArrayList<Int>()
        val bArray = ArrayList<Int>()

        if(numA == 0 && numB == 0)
            break
        else{
            for(i in 1..numA){
                if(numA % i == 0)
                    aArray.add(i)
            }

            for(i in 1..numB){
                if(numB % i == 0)
                    bArray.add(i)
            }
        }

        if(bArray.contains(numA))
            bw.write("factor\n")
        else if(aArray.contains(numB))
            bw.write("multiple\n")
        else
            bw.write("neither\n")
        
        bw.flush()
    }
    bw.close()
    br.close()
}
