import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    sc.nextLine()

    for(i in 1..t){
        val (r, s) = Pair(sc.nextInt(), sc.nextLine().split("").filter { it.isNotBlank() })
        val string:StringBuilder = StringBuilder()

        for(j in 0 until s.size){
            for(k in 1..r)
                string.append(s[j])
        }
        println(string)
    }
}