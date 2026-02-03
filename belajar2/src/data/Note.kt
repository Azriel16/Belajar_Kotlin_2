package data

class Note(title: String) {

    var title: String = title
        get() {
            println("call getter function")
            return field
        }
        set(value) {
            println("call setter funtion")
            if (value.isNotBlank()){
                field = value
            } else {
                println("invalid title")
            }

        }
}

class BigNote(val title: String){
    val bigTitle: String
        get() = title.toUpperCase()

}