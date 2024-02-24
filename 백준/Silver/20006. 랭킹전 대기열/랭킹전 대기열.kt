import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var m = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    val p = input[0]
    m = input[1]
    val games = ArrayList<Room>()

    repeat(p) {
        val player = br.readLine().split(" ")
        val level = player[0].toInt()
        val id = player[1]
        var isJoin = false

        for (room in games) {
            if (level in room.limit - 10..room.limit + 10
                && !room.isStarted && !isJoin
            ) {
                room.joinPlayer(level, id)
                isJoin = true
                break
            }
        }

        if (!isJoin) {
            games.add(Room(level))
            games.last().joinPlayer(level, id)
        }
    }

    games.forEach { room ->
        if (room.isStarted) {
            bw.write("Started!\n")
        } else {
            bw.write("Waiting!\n")
        }

        room.player.sortBy { it.second }
        room.player.forEach {
            bw.write("${it.first} ${it.second}\n")
        }
    }

    bw.close()
    br.close()
}

class Room(val limit: Int) {
    var isStarted = false
    val player = ArrayList<Pair<Int, String>>()

    fun joinPlayer(level: Int, id: String) {
        player.add(Pair(level, id))

        if (player.size == m) {
            isStarted = true
        }
    }
}