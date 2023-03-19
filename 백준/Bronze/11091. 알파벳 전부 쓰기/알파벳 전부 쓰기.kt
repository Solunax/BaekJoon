import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val check = Array(26){0}
        val str = br.readLine().lowercase()

        str.forEach { v ->
            if(v in 'a'..'z')
                check[v - 'a']++
        }

        val missing = ArrayList<Char>()
        for(i in 0 until 26){
            if(check[i] == 0)
                missing.add('a' + i)
        }

        if(missing.size == 0)
            bw.write("pangram\n")
        else{
            bw.write("missing ")
            missing.forEach { v ->
                bw.write("$v")
            }
            bw.write("\n")
        }
    }

    br.close()
    bw.close()
}