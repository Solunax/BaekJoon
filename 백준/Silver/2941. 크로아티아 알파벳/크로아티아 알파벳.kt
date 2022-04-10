import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    val croatian = listOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var input = sc.next()

    croatian.forEach{
        input = input.replace(it, "V")
    }

    println(input.length)
}