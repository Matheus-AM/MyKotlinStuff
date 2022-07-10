fun main() {
    var total : Int = 0
    var n = readLine()!!.toInt()
    for (none in 1..n) {
        var strln = readLine()!!
        var count = 0
        for (i in 0..4 step 2) {
            if( strln[i].equals('1') ) count++
        }
        total += count/2
    }
    println(total)
}