fun main() {
    var n : Int
    var k : Int
    var strin = readLine()!!.split(" ").map{it.toInt()}
    n = strin[0]; k = strin[1]
    var strin2 = readLine()!!.split(" ").map{it.toInt()}
    var count = 0
    var kth = strin2[k-1]
    when (kth) {
        0 -> {for (i in 0..k-1) {
                if( strin2[i] == 0) break
                count++
            }
        }
        strin2[n-1] -> count = n
        else -> {
            for (i in 0..n-1) {
                if( strin2[i] < kth) break
                count++
            }
        }
    }

    println(count)
        
}