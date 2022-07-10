fun main(){
    var buff1 = readLine()!!.toInt()
    for(_x in 0..buff1-1){
        readLine()!!.toInt()
        var buff3 = readLine()!!
        var count2 = 0
        var count = 0
        buff3.map { 
            if (it == '(') count++ 
            else count-- 
            if(count < count2) count2--
        }
        println((0 - count2).toString())
    }
}