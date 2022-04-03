open class Human(val name: String){
    open fun attack(){
        println("$name use Fist Attack!")
    }

    open val mana: Boolean = false
}

class Mage(name: String): Human(name){
    override fun attack(){
    println("$name use Fireball!") 
    }

    override val mana: Boolean
        get() = true
}

fun main(){
    
    val human = Human("Allen")
    val mage = Mage("john")

    manaOrNot(human.mana, human.name)
    manaOrNot(mage.mana, mage.name)
}

fun manaOrNot(instance: Boolean, name: String){
    if(instance) println("$name has mana")
    else println("$name has no mana")
}