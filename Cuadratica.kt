class Cuadratica (){

    var A:Double=0.0
    var B:Double=0.0
    var C:Double=0.0
    var potencia:Double=0.0
    var x1:Double=0.0
    var x2:Double=0.0

    fun carga (){
        println("igrese el valor de A")
        A= readLine()!!.toDouble()
        println("igrese el valor de B")
        B= readLine()!!.toDouble()
        println("igrese el valor de C")
        C= readLine()!!.toDouble()

    }

    fun validacionPotencia(){

        potencia= Math.pow(B,2.0) - (4*A*C)

        if (potencia >0){

            x1= ((-1)*B + Math.sqrt(potencia))/(2*A)
            x2= ((-1)*B - Math.sqrt(potencia))/(2*A)

        }else{
            println(" No se puede realizar la operacion por el metodo ecuacion cuadratica")
        }


    }

    fun imprimir (){
        println("Los valores de la ecuacion cuadratica son\n" +
                " X1=$x1 y X2=$x2 ")

    }

}






