import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (numberOfPokemon, numberOfQuestion) = br.readLine().split(" ").map { it.toInt() }
    val pokemonDictionaryByNumber = HashMap<Int, String>()
    val pokemonDictionaryByName = HashMap<String, Int>()

    for(i in 0 until numberOfPokemon){
        val value = br.readLine()
        pokemonDictionaryByNumber[i + 1] = value
        pokemonDictionaryByName[value] = i + 1
    }


    for(i in 0 until numberOfQuestion){
        val question = br.readLine()
        val checkString = question.toIntOrNull()

        if(checkString !=  null)
            bw.write("${pokemonDictionaryByNumber[checkString]}\n")
        else
            bw.write("${pokemonDictionaryByName[question]}\n")
    }



    br.close()
    bw.close()
}