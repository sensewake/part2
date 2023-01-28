fun main(){
    try{
        throw Exception()
    } catch(e:Exception){
        println("에러발생!")
    } finally{
        println("finally실행!")
    }

    val a = try{
        "1234".toInt()
    } catch(e:Exception){
        println("예외발생!")
    }
    println(a)
    //throw Exception("예외발생!")

    val b:String?=null
    val c:String =b?:failFast("a is null")
    println(c.length)
}

fun failFast(message:String):Nothing{
    throw IllegalArgumentException(message)
}