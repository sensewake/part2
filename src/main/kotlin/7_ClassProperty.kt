class Coffee (
    var name:String="",
    var price:Int=0,
    //val brand:String,
){

}

class EmptyClass

fun main(){
    val coffee = Coffee()
    coffee.name = "아이스 아메리카노"
    coffee.price = 2000

    println("${coffee.name} 가격은 ${coffee.price}")
}