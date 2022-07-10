fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    var count = 0
    for (i in 1..n) {
        if(readLine()!!.contains("++")) count++
        else count--
    }
    println(count)
}