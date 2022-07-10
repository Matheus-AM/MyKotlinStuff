fun main() {
    var t = readLine()!!.toInt()
    for (i in 1..t) {
        var buffer = readLine()!!.split(" ").map { it.toInt() }   
        var head = readLine()!!
        var half = buffer[0]/2
        if (buffer[1] == 0){
            println("YES")
            continue
        }else if (buffer[0]%2 == 0 && buffer[1] == half) {
            println("NO")
            continue
        }
        var tail: String
        if(buffer[0]%2 == 0){
            tail = head.substring(half).reversed()
            head = head.substring(0..half-1)    
        }else{
            tail = head.substring(half+1).reversed()
            head = head.substring(0..half-1)    
        }

        if (head == tail) {
            println("YES")
            continue
        }
        var posit = compare(half-1, head, tail)

        if(posit == -1) {
            println("YES")
            continue
        }else if (posit >= buffer[1]){
            println("YES")
            continue
        }
        println("NO")
    }   
}

fun compare (len:Int, x:String, y:String): Int{
    for (i in 0..len) {
        if(x[i] != y[i]) {
            return i
        }
    }
    return -1
}

/*
7
5 1
qwqwq
1 0
a
5 1
izoai
4 2
icpc
22 0
dokidokiliteratureclub
19 4
imteamshanghaialtmi
6 3
aaaaaa

RE {
    t = 1..100
    n = 1..100 k = 0..50 0..(n/2)
    s = str[1..n]
}


//buffer0[0] n, buffer0[1] k

if k==0 YES
if k==n/2 && n%2 == 0 { won't fit on it }

num of elements is even for any k
n7 k3 : a1 a2 a3 a4 r3 r2 r1 asdfdsa
n7 k2 : a1 a2 a3 r2 r1 asdfdsa
n7 k1 : a1 a2 r1 asdfdsa
n7 k0 : a1 asdfdsa

n6 k3 : a1 a2 a3 a4 r3 r2 r1 asdzsa
n6 k2 : a1 a2 a3 r2 r1 aszdsa
n6 k1 : a1 a2 r1 azddsa
n6 k0 : a1 zsddsa

n7 k3 : a1 a2 a3 a4 r3 r2 r1 asdzdsa
n7 k2 : a1 a2 a3 r2 r1 aszfdsa
n7 k1 : a1 a2 r1 azdfdsa
n7 k0 : a1 zsdfdsa

n6 k3 : a1 a2 a3 a4 r3 r2 r1 asddsa
n6 k2 : a1 a2 a3 r2 r1 aszdsa
n6 k1 : a1 a2 r1 azddsa
n6 k0 : a1 zsddsa


*/