fun main(){
    var buffer = readLine()!!.split(' ')
    var count1 = 0
    var count2 = 0
    for(i in buffer){
        if(i == "5") count1++
        if(i == "7") count2++
    }
    if(count1 == 2 && count2 == 1){
        println("YES")
    }else{
        println("NO")
    }
}