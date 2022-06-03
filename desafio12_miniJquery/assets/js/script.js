
//EJERCICIO 1
//esperar que html cargue
$(document).ready(function(){

//capturar evento
    $("#boton").on("click", function(){
       
        //Funcion para cambiar color y tamaño texto luego de hacer click
       $("#cambiar").css("background-color", "green");
       $("#cambiar").css("font-size", "80px");

    });
});


//EJERCICIO 2
//esperar que html cargue
$(document).ready(function(){

    //capturar evento
        $("#elto").on("click", function(){
    //añadir animacion luego de click
        $('#elto').toast('hide')
        $('#elto').toast('show');

});
});

//EJERCICIO 3
//esperar que html cargue
$(document).ready(function(){

 //capturar evento
 $('#caja').on("mouseover", function(){
    //añadir color luego de click
    $('#par').css("background-color", "red");
    $('#par2').css("background-color", "red");
    $('#impar').css("background-color", "yellow");
    $('#impar2').css("background-color", "yellow");
    $('#impar3').css("background-color", "yellow");
});
    //volver
    $("#caja").on("mouseleave", function(){
        $('#par').css("background-color", "blueviolet");
        $('#par2').css("background-color", "blueviolet");
        $('#impar').css("background-color", "aqua");
        $('#impar2').css("background-color", "aqua");
        $('#impar3').css("background-color", "aqua");
    
    });
});