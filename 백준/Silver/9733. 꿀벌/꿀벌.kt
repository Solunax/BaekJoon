import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val work = HashMap<String, Int>()
    val seq = listOf("Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex")
    var total = 0

    repeat(7){
        work[seq[it]] = 0
    }

    while (true){
        try{
           val st = StringTokenizer(br.readLine())

            while (st.hasMoreTokens()){
                val temp = st.nextToken()
                total++

                if(work.containsKey(temp))
                    work[temp] = work[temp]!! + 1
            }
        }catch (e : Exception){
            break
        }
    }

    repeat(7){ idx ->
        bw.write("%s %d %.2f\n".format(seq[idx], work[seq[idx]], work[seq[idx]]!!.toDouble() / total))
    }

    bw.write("Total $total 1.00")

    bw.close()
    br.close()
}
