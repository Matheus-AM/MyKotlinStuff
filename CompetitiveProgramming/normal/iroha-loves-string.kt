fun main(){
    var line1 = readLine()!!.split(" ").map { it.toInt() }
    var lines : MutableList<String> = mutableListOf()
    for(i in 1..line1[0]){
        lines.add(readLine()!!)
    }
    lines.sort()
    println(lines.joinToString(""))
}