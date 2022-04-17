import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    while(true){
        var (a, b, c) = Triple(sc.nextInt(), sc.nextInt(), sc.nextInt())
        if(a == 0 && b == 0 && c == 0 )
            break
        else{
            if(a > c)
                c = a.also { a = c }

            if(b > c)
                c = b.also { b = c }

            if(a*a + b*b == c*c)
                println("right")
            else
                println("wrong")
        }
    }
}