class Human(val name: String ){
    fun attack(){
        println("$name use Fist Attack!")
    }
}

fun main(){
    val instance = Human("Jack")
    instance.attack()
}