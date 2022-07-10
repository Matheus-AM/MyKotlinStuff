fun main(){
    var buffer = readLine()!!.toInt()
    for(_x in 1..buffer){
        var answ: MutableList<Char> = mutableListOf()        
        var buffer2 = readLine()!!
        for(i in 0..buffer2.length-1 step 2){
            answ.add(buffer2[i])
        }
        answ.add(buffer2[buffer2.length-1])
        println(answ.joinToString(""))
    }
}