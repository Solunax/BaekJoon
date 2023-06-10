import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val year = listOf(1967, 1969, 1970, 1971, 1972, 1973, 1973, 1974, 1975, 1976, 1977, 1977, 1979, 1980, 1983, 1984,
1987, 1993, 1995, 1997, 1999, 2002, 2003, 2013, 2016)
val album = listOf("DavidBowie", "SpaceOddity", "TheManWhoSoldTheWorld", "HunkyDory", "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars",
"AladdinSane", "PinUps", "DiamondDogs", "YoungAmericans", "StationToStation", "Low", "Heroes", "Lodger",
"ScaryMonstersAndSuperCreeps", "LetsDance", "Tonight", "NeverLetMeDown", "BlackTieWhiteNoise", "1.Outside",
"Earthling", "Hours", "Heathen", "Reality", "TheNextDay", "BlackStar")

fun main() {
    repeat(br.readLine().toInt()){
        val (start, end) = br.readLine().split(" ").map { it.toInt() }
        val index = ArrayList<Int>()

        for(idx in year.indices){
            if(year[idx] in start .. end)
                index.add(idx)
        }

        bw.write("${index.size}\n")
        index.forEach {
            bw.write("${year[it]} ${album[it]}\n")
        }
    }

    bw.close()
    br.close()
}