import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine().split(" ").map { it.toInt() }

        val hp = input[0]
        val mp = input[1]
        val atk = input[2]
        val def = input[3]
        val itemHp = input[4]
        val itemMp = input[5]
        val itemAtk = input[6]
        val itemDef = input[7]

        val finalHp = if(hp + itemHp < 1)
            1
        else
            hp + itemHp

        val finalMp = if(mp + itemMp < 1)
            1
        else
            mp + itemMp

        val finalAtk = if(atk + itemAtk < 0)
            0
        else
            atk + itemAtk

        val finalDef = def + itemDef

        val result = finalHp + (5 * finalMp) + (2 * finalAtk) + (2 * finalDef)
        bw.write("$result\n")
    }

    bw.close()
    br.close()
}