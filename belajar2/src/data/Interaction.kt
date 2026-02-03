package data

import java.awt.print.Printable

interface Interaction {
    val name: String
    fun sayHello(name: String){
//        println("Hello $name, my name is ${this.name}")
//        bisa saja tanpa harus melakukan override di bawah
//        dengan menyimpan langsung di body function yang ada di interface
    }
}

interface Go : Interaction{
    fun go(){
        println("Go!")
    }
}

interface MoveA{
    fun move() = println("Move A")
}
interface  MoveB{
    fun move() = println("Move B")
}

class Human(override val name: String):  Go, MoveA, MoveB{
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
    override fun move(){
        super<MoveA>.move()
        super<MoveB>.move()
        println("Move Human")
    }
}