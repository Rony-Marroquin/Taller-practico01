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
            val empleado1= Empleado()
            var x=0

            while(x !=2) {
                empleado1.solicitar()
                empleado1.deducciones()
                empleado1.imprimir()

                print("Si desea continuar escriba 1 y si desea salir escriba 2")
                x= readLine()!!.toInt()
            }


        }
        3->{

            val digito1 = Ejercicio3()

            digito1.solicitud()

            digito1.verificacion()
            digito1.mayorMenor()
            digito1.impresion()
            digito1.sumar()
            digito1.restar()



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