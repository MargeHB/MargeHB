/**
 *CACHIPUN CONTRA LA MAQUINA
 - Solicitar al usuario las veces que desea que se repita el juego contra la computadora
 - Por cada juego, se debe mostrar el resultado inmediatamente
 - luego pedir nuevamente una respuesta dependiendo de las veces que haya indicado el usuario que desea jugar 
 */

//Solicitar cantidad de veces que ciclo se repetirá y declarar opciones
var cantidadJugadas = prompt("Bienvenid(a), ¿Cuántas veces te gustaría jugar?");
const cantJugadas = parseInt(cantidadJugadas);

//usando función Math, se pueden obtener números aleatorios entre 0 y 2. ==> JUGADA AUTOMATICA DE LA MAQUINA
   
//variables auxiliares
let sumaUser=0;
let sumaMaq=0;
let sumaEmpate=0;
let sumaJuegos=0;

//REPETICIONES----------------------------------------------------------------------------------------------------------------------------------------------------
for(sumaJuegos; sumaJuegos < cantJugadas; sumaJuegos++) {
   //solicitar escoger piedra, papel o tijeras  ===> JUGADA DE USUARIO
    var usuario = prompt("Escoge 0=papel, 1=tijeras o 2=piedra"); 
    var user= parseInt(usuario);
    let maq=  parseInt(Math.floor(Math.random()*3));
   const opciones = ['papel','tijera','piedra'];
    //EMPATE
            if (user == maq){
               alert('Sacaste ' + opciones[user] + ' y la máquina sacó ' + opciones[maq] + ' Es un empate!! un poco más de suerte y le ganas! vamos!');
               sumaEmpate++;
            }
    //GANA USUARIO
            else if
            (user == 2 && maq == 1){
                alert('Sacaste ' + opciones[user]  + ' y la máquina sacó ' + opciones[maq]  + ' ¡¡Felitaciones!! ¡¡Ganaste esta partida!! Esta máquina no sabe con quién competía...')
                sumaUser++; 
            }
            else if(user== 1 && maq == 0){
                alert('Sacaste ' + opciones[user]  + ' y la máquina sacó ' + opciones[maq]  + ' ¡¡Felitaciones!! ¡¡Ganaste esta partida!! Esta máquina no sabe con quién competía...')
                sumaUser++; 
            }
            else if(user == 0 && maq == 2){
                alert('Sacaste ' + opciones[user]  + ' y la máquina sacó ' + opciones[maq]  + ' ¡¡Felitaciones!! ¡¡Ganaste esta partida!! Esta máquina no sabe con quién competía...')
                sumaUser++; 
            }
            //GANA MÁQUINA    
            else if(user ===2 && maq === 0){
                alert('Sacaste ' + opciones[user] + ' y la máquina sacó ' + opciones[maq] + ' Lo siento, esta vez ganó la máquina... sigue participando!');
                sumaMaq++;
            }
            else if(user === 1 && maq === 2){
                alert('Sacaste ' + opciones[user] + ' y la máquina sacó ' + opciones[maq] + ' Lo siento, esta vez ganó la máquina... sigue participando!');
                sumaMaq++;
            }
            else if(user === 0 && maq === 1){
                alert('Sacaste ' + opciones[user] + ' y la máquina sacó ' + opciones[maq] + ' Lo siento, esta vez ganó la máquina... sigue participando!');
                sumaMaq++;
            }
            else{
                alert("por favor escoge una opción válida");
            } 
                       
        }  
        alert("Fin del juego.... Estos son los cómputos finales");
            
       if (sumaUser > sumaMaq){     //COMPUTOS FINALES
                alert("Felicitaciones!! ganaste " + sumaUser + " veces, la máquina " + sumaMaq + " y empataron " + sumaEmpate + " veces"  + " Como tu no hay otro igual...all right!!");
                             
        }else if(sumaMaq> sumaUser){
            alert("Buuu esta vez te tocó perder. La máquina ganó " + sumaMaq + ", tu " + sumaUser + " y empataron " + sumaEmpate + " veces"  + " Suerte que no apostaste dinero!!");
        }else{
         ("Pero qué partidazo!!! tu ganaste "+ sumaUser + " veces, la máquina ganó " + sumaMaq + " y empataron " + sumaEmpate + " veces"  + " Nada hacía presagiar que esto podía pasar! ¡Empate señoras y señores!!!!");
        } 
       //Fin partida actual

