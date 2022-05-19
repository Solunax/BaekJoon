import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val fruit = br.readLine().toInt()
    val array = LinkedList<Pair<Int, Int>>()

    for(i in 0 until 6){
        val (direction, length) = br.readLine().split(" ").map { it.toInt() }
        array.add(Pair(direction, length))
    }

    var maxWidthIndex = 0
    var maxHeightIndex = 0

    var maxWidth = 0
    var maxHeight = 0

    for(i in 0 until 6){
        if(array[i].first == 1 || array[i].first == 2){
            if(maxWidth < array[i].second){
                maxWidth = array[i].second
                maxWidthIndex = i
            }
        }

        if(array[i].first == 3 || array[i].first == 4){
            if(maxHeight < array[i].second){
                maxHeight = array[i].second
                maxHeightIndex = i
            }
        }
    }

    var width = 0
    var height = 0

    width = when(maxWidthIndex){
        0 -> {abs(array[5].second - array[maxWidthIndex + 1].second)}
        5 -> {abs(array[maxWidthIndex - 1].second - array[0].second)}
        else -> {abs(array[maxWidthIndex - 1].second - array[maxWidthIndex + 1].second)}
    }

    height = when(maxHeightIndex){
        0 -> {abs(array[5].second - array[maxHeightIndex + 1].second)}
        5 -> {abs(array[maxHeightIndex - 1].second - array[0].second)}
        else -> {abs(array[maxHeightIndex - 1].second - array[maxHeightIndex + 1].second)}
    }

    val miniSquare = width * height

    bw.write("${fruit * (maxWidth * maxHeight - miniSquare)}")

    br.close()
    bw.close()
}