package data

class Car(paramBrand: String, paramName: String, paramYear: Int = 2024){

    init {
        println("Car $paramBrand dibuat")
    }

    constructor( paramBrand: String, paramName: String) : this(paramBrand, paramName, 2024){
        println("Secondary Constructor")
    }

    constructor(paramBrand: String): this(paramBrand, ""){
        println("Secondary Constructor 2")
    }

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear
}