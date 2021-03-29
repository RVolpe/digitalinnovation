package one.digitalinnovation.collections

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun created(id:String, values:T) {
        map[id] = values
    }

    fun findById(id: String) = map[id]

    fun getAll() = ""
}