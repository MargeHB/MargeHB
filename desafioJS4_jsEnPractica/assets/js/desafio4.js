//Función limpiar errores
function clean (){
    document.querySelector(".result").innerHTML = "";
    document.querySelector(".errorNombre").innerHTML = "";
    document.querySelector(".errorAsunto").innerHTML = "";
    document.querySelector(".errorMensaje").innerHTML = "";
};

//Función en caso de Éxito
function exitoso() {
    document.querySelector(".result").innerHTML = "Mensaje enviado con Éxito!!!";
};


//funcion validar recibe como parametros texto ingresado por usuario
function validar (nombreVal,asuntoVal,mensajeVal){
let validado = true;
let condicion = /[a-zA-Z]\w+/;

//comparo input con texto esperado (uso expresiones regulares)
    //NOMBRE
    if (nombreVal == "" || condicion.test(nombreVal) == false) {
        document.querySelector(".errorNombre").innerHTML = "El nombre es requerido y no debe contener números.";
        validado = false;
    }

    //ASUNTO
    if (asuntoVal == "" || condicion.test(asuntoVal) == false) {
        document.querySelector(".errorAsunto").innerHTML = "El asunto es requerido y no debe contener números.";
        validado = false;
    };

    //MENSAJE
    if (mensajeVal == "" || condicion.test(mensajeVal) == false) {
        document.querySelector(".errorMensaje").innerHTML = "El mensaje es requerido y no debe contener números.";
        validado = false;
    };
return validado;
}

//se agrega eventListener con evento submit
let formulario = document.getElementById("formulario");
formulario.addEventListener("submit", function(evento){
evento.preventDefault();
clean();


//Rescato texto ingresado a validar
let nombreVal = document.querySelector(".nombre").value;
let asuntoVal = document.querySelector(".asunto").value;
let mensajeVal = document.querySelector(".mensaje").value;
let result = validar(nombre,asunto,mensaje);
if (result == true){
exitoso();
};
});


