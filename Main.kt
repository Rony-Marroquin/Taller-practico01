fun main (){
    println("Bienvenido al taller01 ingresa una de las opciones")
    println("Ejercicio #1")
    println("Ejercicio #2")
    println("Ejercicio #3")
    println("Ejercicio #4")

    var opcion= readLine()!!.toInt()
    when(opcion){

        1->{
            val formula= Cuadratica()
            formula.carga()
            formula.validacionPotencia()
            formula.imprimir()
        }

        2->{


        }
        3->{


        }

        4->{
            val dado1 = Dado ()
            dado1.tirar()
            dado1.imprimir()
            dado1.unidades()
            dado1.Decenas()
            dado1.centenas()
            dado1.UnidadesDecenas()


            val dado2 = DadoRecuadro()
            dado2.tirar()

        }


    }
}