import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val input = br.readLine().toInt()
        var flag = false
        
        for (i in 2..64) {
            if (flag) {
                break
            }

            flag = checkPalindrome(input, i)
        }

        if (flag) {
            bw.write("1\n")
        } else {
            bw.write("0\n")
        }
    }

    bw.close()
    br.close()
}

fun checkPalindrome(input: Int, radix: Int): Boolean {
    var n = input
    val convert = ArrayList<Int>()

    while (n != 0) {
        convert.add(n % radix)
        n /= radix
    }

    for (i in 0 until convert.size / 2) {
        if (convert[i] != convert[convert.size - 1 - i]) {
            return false
        }
    }

    return true
}