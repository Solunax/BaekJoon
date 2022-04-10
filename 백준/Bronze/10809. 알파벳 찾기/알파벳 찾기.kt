import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val S = sc.nextLine()

    for(value in 97..122)
        print("${S.indexOf(value.toChar())} ")
}