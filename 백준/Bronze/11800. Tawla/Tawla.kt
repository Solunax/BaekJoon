import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val name = listOf("Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh")
        var (a, b) = br.readLine().split(" ").map { it.toInt() }

        if (a < b)
            a = b.also { b = a }

        val result = if (a == b) {
            when (a) {
                1 -> "Habb Yakk"
                2 -> "Dobara"
                3 -> "Dousa"
                4 -> "Dorgy"
                5 -> "Dabash"
                else -> "Dosh"
            }
        } else {
            if (a == 6 && b == 5) {
                "Sheesh Beesh"
            } else {
                "${name[a - 1]} ${name[b - 1]}"
            }
        }

        bw.write("Case ${it + 1}: $result\n")
    }

    bw.close()
    br.close()
}