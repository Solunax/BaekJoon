import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (m1, m2, t1, t2) = br.readLine().split(" ")

    if(m1 != m2 && t1 != t2){
        bw.write("?")
    } else if(m1 == m2 && t1 != t2){
        if(m1 == "R" && (t1 == "P" || t2 == "P"))
            bw.write("TK")
        else if(m1 == "S" && (t1 == "R" || t2 == "R"))
            bw.write("TK")
        else if(m1 == "P" && (t1 == "S" || t2 == "S"))
            bw.write("TK")
        else
            bw.write("?")
    } else if(m1 != m2 && t1 == t2){
        if(t1 == "R" && (m1 == "P" || m2 == "P"))
            bw.write("MS")
        else if(t1 == "S" && (m1 == "R" || m2 == "R"))
            bw.write("MS")
        else if(t1 == "P" && (m1 == "S" || m2 == "S"))
            bw.write("MS")
        else
            bw.write("?")
    } else{
        if(m1 == "S"){
            if(t1 == "P")
                bw.write("MS")
            if(t1 == "R")
                bw.write("TK")
            if(t1 == "S")
                bw.write("?")
        }

        if(m1 == "R"){
            if(t1 == "P")
                bw.write("TK")
            if(t1 == "R")
                bw.write("?")
            if(t1 == "S")
                bw.write("MS")
        }

        if(m1 == "P"){
            if(t1 == "P")
                bw.write("?")
            if(t1 == "R")
                bw.write("MS")
            if(t1 == "S")
                bw.write("TK")
        }
    }


    bw.close()
    br.close()
}