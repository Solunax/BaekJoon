import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map{ it.toInt() }
    val girlGroup = HashMap<String, ArrayList<String>>()

    repeat(n){
        val name = br.readLine()
        girlGroup[name] = ArrayList()

        repeat(br.readLine().toInt()){
            girlGroup[name]!!.add(br.readLine())
        }

        girlGroup[name]!!.sort()
    }

    repeat(m){
        val name = br.readLine()
        when(br.readLine().toInt()){
            0 -> {
                girlGroup[name]!!.forEach {
                    bw.write("$it\n")
                }
            }
            1 -> {
                girlGroup.forEach { (group, member) ->
                    member.forEach { memberName ->
                        if(name == memberName)
                            bw.write("$group\n")
                    }
                }
            }
        }
    }

    bw.close()
    br.close()
}