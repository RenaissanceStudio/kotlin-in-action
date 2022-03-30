package ch01.ex1_ATasteOfKotlin

data class Person(val name: String,
                  val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"),
                         Person("Bob", age = 29))

    val oldest = persons.stream().max { p1, p2 ->
        p1.age ?: 0.compareTo(p2.age ?: 0)
    }.get()
    println("The oldest is: $oldest")
}

// The oldest is: Person(name=Bob, age=29)
