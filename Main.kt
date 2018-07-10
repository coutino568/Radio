
fun main(args: Array<String>){
    val andy=Radio(frecuencia="FM",volumen=50,estacion_FM=90.5,estacion_AM=580)
    andy.mostrar()
    andy.turn_On()
    andy.mostrar()
    andy.mode()
    andy.mostrar()
    andy.volumen10()
    andy.mostrar()
}


class Radio(var estado_on:Boolean= false,
            var frecuencia:String,
            var volumen:Int,
            var estacion_FM:Double,
            var estacion_AM:Int){
    //apaga el radio
    fun turn_Off(){estado_on=false
    println("**Apagando**\n")}
    //enciende el radio
    fun turn_On(){estado_on=true
        println("**Encendiendo**\n")}
    //cambia de FM a AM y viceversa
    fun mode(){
        println("**Cambiando modo**")
        if(frecuencia=="AM"){frecuencia="FM"}
    else if(frecuencia=="FM"){frecuencia="AM"}}
    //muestra el estado actual del radio
    fun mostrar(){
        println("Radio encendido?: "+estado_on)
        if(estado_on==true){
            println("Modo: "+frecuencia)
            if (frecuencia=="AM"){
                println("Estacion AM: "+estacion_AM)
            }else{
                println("Estacion FM: "+estacion_FM)
            }
            println("Volumen: "+volumen+"\n")

    }}
    //agrega volumen de 10 en 10
    fun volumen10 (){
        if(volumen+10>=100){
            volumen=100
            println("VOLUMEN AL MAXIMO!")
        }else if(volumen+10<100){
            volumen=volumen+10

        }
    }
    //agrega volumen de 1 en 1
    fun volumen1(){
        if(volumen+1>=100){
            volumen=100
            println("VOLUMEN AL MAXIMO!")
        }else if (volumen+1<100){
            volumen=volumen+1
        }
    }
    //quita volumen de 10 en 10
    fun volumen_10(){
        if(volumen-10<0){
            volumen=0
            println("VOLUMEN MINIMO!")
        }else if(volumen-10>0){
            volumen=volumen-10
        }
    }
    //quita volumen de 1 en 1
    fun volumen_1(){
        if(volumen-1<0){
            volumen=0
            println("VOLUMEN MINIMO!")
        }else if(volumen-1>0){
            volumen=volumen-1
        }
    }
    //agrega 20 khz a la frecuencia AM /si se pasa de 1600 regresa a la frecuecnia mas pequena
    fun khz20(){
        if(estacion_AM+20>1600){
            estacion_AM=560
        }else if(estacion_AM+20<=1600){
            estacion_AM=estacion_AM+20
        }
    }
    //quita 20 khz a la frecuencia AM/si se pasa de 560 regresa a la frecuencia mas alta
    fun khz_20(){
        if(estacion_AM-20<560){
            estacion_AM=1600
        }else if(estacion_AM-20>=560){
            estacion_AM=estacion_AM-20
        }
    }
    //agrega 10 MHZ a la frecuencia FM/ si se pasa de 107.1 regresa a la frecuencia mas pequena
    fun mhz10(){
        if(estacion_FM+0.1>107.1){
            estacion_FM=87.5
        }else if(estacion_FM+0.1>=107.7){
            estacion_FM=estacion_FM+0.1
        }
    }
    //quita 10 MHZ a la frecuencia FM/ si se pasa de 87.5 se regresa a la frecuencia mas alta
    fun mhz_10(){
        if (estacion_FM-0.1<87.5){
            estacion_FM=107.1
        }else if(estacion_FM-0.1>=87.5){
            estacion_FM=estacion_FM-0.1
        }
    }


    }

    //fun switch(estado_on:Boolean){
       //if( estado_on==False){estado_on=True}
       // else {estado_on=False}
   // }




