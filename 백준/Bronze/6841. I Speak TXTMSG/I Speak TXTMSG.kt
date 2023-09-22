import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val table = HashMap<String, String>()

    table["CU"] = "see you"
    table[":-)"] = "I’m happy"
    table[":-("] = "I’m unhappy"
    table[";-)"] = "wink"
    table[":-P"] = "stick out my tongue"
    table["(~.~)"] = "sleepy"
    table["TA"] = "totally awesome"
    table["CCC"] = "Canadian Computing Competition"
    table["TY"] = "thank-you"
    table["YW"] = "you’re welcome"
    table["TTYL"] = "talk to you later"

    while (true){
        val str = br.readLine()

        if(table.containsKey(str))
            bw.write("${table[str]}\n")
        else
            bw.write("$str\n")

        if(str == "TTYL")
            break
    }

    bw.close()
    br.close()
}