package ar.edu.unahur.obj2.caralibro

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBeTrue

class UsuarioTest : DescribeSpec({
  describe("teseifest") {
    val juanFan = Participante(/**/)
    val reneReFan = Participante(/**/)
    val lauraSuperFan = Participante(/**/)

    describe("Accesos") {
      describe("los distintos perfiles") {
        it("intenta acceder al vip de un escenario") {
          juanFan.puedeAcceder(Rock).shouldBeTrue()
        }
        it("intenta acceder al vip de dos escenario") {
          juanFan.puedeAcceder(Rock).shouldBeTrue()
        }
        it("intenta acceder al vip de todos los escenarios") {
          juanFan.puedeAcceder(Rock).shouldBeTrue()
        }
      }

      describe("de tipo texto") {
        it("ocupa tantos bytes como su longitud") {
          saludoCumpleanios.espacioQueOcupa().shouldBe(45)
        }
      }
    }

    describe("Un usuario") {
      it("puede calcular el espacio que ocupan sus publicaciones") {
        val juana = Usuario()
        juana.agregarPublicacion(fotoEnCuzco)
        juana.agregarPublicacion(saludoCumpleanios)
        juana.espacioDePublicaciones().shouldBe(550548)
      }
    }
  }
})
