package ar.edu.unahur.obj2.caralibro

import kotlin.math.ceil

interface Escenario {
    val lineUp: Map<Int,String>
}

object Rock: Escenario {
    override val lineUp: Map<Int, String> = mapOf<Int,String>(1 to "Sumados", 2 to "Joya Nunca Taxi")
}

object Festival {
    val escearios = listOf(Rock)

    fun lineUp(): List<String> [
        TODO("Deberiamos sacar esto de algun lado...")
    ]
}
