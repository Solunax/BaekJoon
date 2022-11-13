import java.util.Scanner

val bw = System.out.bufferedWriter()
val sc = Scanner(System.`in`)
fun main() {
    val arr = ArrayList<Long>()
    val n = sc.nextInt()

    repeat(n){
        arr.add(sc.next().reversed().toLong())
    }

    arr.sorted().forEach {
        bw.write("$it\n")
    }

    bw.close()
}

