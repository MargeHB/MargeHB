

//1) Crear Estructura de Datos (arreglos y objetos)

let radio =[
{HORA: '11:00', ESPECIALISTA: 'IGNACIO SCHULZ', PACIENTE: 'FRANCISCA ROJAS',RUT: '9878782-1',PREVISION:' FONASA'},
{HORA: '11:30', ESPECIALISTA: 'FEDERICO SUBERCASEAUX', PACIENTE: 'PAMELA ESTRADA',RUT: '15345241-3',PREVISION:' ISAPRE'},
{HORA: '15:00', ESPECIALISTA: 'FERNANDO WURTHZ', PACIENTE: 'ARMANDO LUNA',RUT: '16445345-9',PREVISION:' ISAPRE'},
{HORA: '15:30', ESPECIALISTA: 'ANA MARIA GODOY', PACIENTE: 'MANUEL GODOY',RUT: '17666419-0',PREVISION:' FONASA'},
{HORA: '16:00', ESPECIALISTA: 'PATRICIA SUAZO', PACIENTE: 'RAMON ULLOA',RUT: '14989389-K',PREVISION:' FONASA'},
];


let trauma = [
{HORA: '08:00', ESPECIALISTA: 'MARIA PAZ ALTUZARRA', PACIENTE: 'PAULA SANCHEZ',RUT: '15554774-5',PREVISION:' FONASA'},
{HORA: '10:00', ESPECIALISTA: 'RAUL ARAYA', PACIENTE: 'ANGÉLICA NAVAS',RUT: '15444147-9',PREVISION:' ISAPRE'},
{HORA: '10:30', ESPECIALISTA: 'MARIA ARRIAGADA', PACIENTE: 'ANA KLAPP',RUT: '17879423-9',PREVISION:' ISAPRE'},
{HORA: '11:00', ESPECIALISTA: 'ALEJANDRO BADILLA', PACIENTE: 'FELIPE MARDONES',RUT: '1547423-6',PREVISION:' ISAPRE'},
{HORA: '11:30', ESPECIALISTA: 'CECILIA BUDNIK', PACIENTE: 'DIEGO MARRE',RUT: '16554741-K',PREVISION:' FONASA'},
{HORA: '12:00', ESPECIALISTA: 'ARTURO CAVAGNARO', PACIENTE: 'CECILIA MENDEZ',RUT: '9747535-8',PREVISION:' ISAPRE'},
{HORA: '12:30', ESPECIALISTA: 'ANDRES KANACRI', PACIENTE: 'MARCIAL SUAZO',RUT: '11254785-5',PREVISION:' ISAPRE'},
];

let dento = [
{HORA: '08:30', ESPECIALISTA: 'ANDREA ZUÑIGA', PACIENTE: 'MARCELA RETAMAL',RUT: '11123425-6',PREVISION:' ISAPRE'},
{HORA: '11:00', ESPECIALISTA: 'MARIA PIA ZAÑARTU', PACIENTE: 'ANGEL MUÑOZ',RUT: '9878789-2',PREVISION:' ISAPRE'},
{HORA: '11:30', ESPECIALISTA: 'SCARLETT WITTING', PACIENTE: 'MARIO KAST',RUT: '7998789-5',PREVISION:' FONASA'},
{HORA: '13:00', ESPECIALISTA: 'FRANCISCO VON TEUBER', PACIENTE: 'KARIN FERNANDEZ',RUT: '18887662-K',PREVISION:' FONASA'},
{HORA: '13:30', ESPECIALISTA: 'EDUARDO VIÑUELA', PACIENTE: 'HUGO SANCHEZ',RUT: '17665461-4',PREVISION:' FONASA'},
{HORA: '14:00', ESPECIALISTA: 'RAQUEL VILLASECA', PACIENTE: 'ANA SEPULVEDA',RUT: '14441281-0',PREVISION:' ISAPRE'},
];

document.getElementById("header").innerHTML = "Centro Médico Ñuñoa - estadísticas";

//2) Mostrar por pantalla, 1a y última atención de cada listado ==> Primera Atención: Juan Pérex - Fonasa | Última atención: Ana Gálvez - Isapre 

//PrimerObjeto radio/trauma/dento
let First_radio = (radio[0]);
var radio_text1= (First_radio.PACIENTE + " - " + First_radio.PREVISION);

let First_trauma = (trauma[0]);
var trauma_text1= (First_trauma.PACIENTE + " - " + First_trauma.PREVISION);

let First_dento = (dento[0]);
var dento_text1= (First_dento.PACIENTE + " - " + First_dento.PREVISION);

//últimoObjeto-radio/trauma/dento
let last_radio = (radio[radio.length - 1]);
var radio_text2 =(last_radio.PACIENTE + " - " + last_radio.PREVISION);

let last_trauma = (trauma[trauma.length - 1]);
var trauma_text2 =(last_trauma.PACIENTE + " - " + last_trauma.PREVISION);

let last_dento = (dento[dento.length - 1]);
var dento_text2 =(last_dento.PACIENTE + " - " + last_dento.PREVISION);

//imprimir pantalla Radio/trauma/dento
document.getElementById("AtencionText1").innerHTML = "Radiología:  " + radio_text1 + " | " + radio_text2;
document.getElementById("AtencionText2").innerHTML = "Traumatología:  " + trauma_text1 + " | " + trauma_text2;
document.getElementById("AtencionText3").innerHTML = "Dental:  " + dento_text1 + " | " + dento_text2;

//3) Recorrer el arreglo y mostrar su contenido en una tabla 
//-----------------------------se declara header de tabla RADIOLOGIA-------------------------------------------------------------------------------------------------
var textoTbl_radio = "<tr><th>HORA</th><th>ESPECIALISTA</th><th>PACIENTE</th><th>RUT</th><th>PREVISION</th></tr>";

//Recorrer elementos del objeto
for (r=0;r<radio.length;r++){
    textoTbl_radio += `<tr>
        <td> ${radio[r].HORA}</td>
        <td> ${radio[r].ESPECIALISTA}</td>
        <td> ${radio[r].PACIENTE}</td>
        <td> ${radio[r].RUT}</td>
        <td> ${radio[r].PREVISION}</td>
   </tr>`;
}
//mostrar tabla por html
document.getElementById("tbl_radio").innerHTML = textoTbl_radio;

//----------------------------se declara header de tabla TRAUMATOLOGIA-------------------------------------------------------------------------------
var textoTbl_trauma = "<tr><th>HORA</th><th>ESPECIALISTA</th><th>PACIENTE</th><th>RUT</th><th>PREVISION</th></tr>";

//Recorrer elementos del objeto
for (r=0;r<trauma.length;r++){
    textoTbl_trauma += `<tr>
        <td> ${trauma[r].HORA}</td>
        <td> ${trauma[r].ESPECIALISTA}</td>
        <td> ${trauma[r].PACIENTE}</td>
        <td> ${trauma[r].RUT}</td>
        <td> ${trauma[r].PREVISION}</td>
   </tr>`;
}
//mostrar tabla por html
document.getElementById("tbl_trauma").innerHTML = textoTbl_trauma;

//-------------------------------------------------se declara header de tabla DENTAL--------------------------------------------------------------------------------------------
var textoTbl_dento = "<tr><th>HORA</th><th>ESPECIALISTA</th><th>PACIENTE</th><th>RUT</th><th>PREVISION</th></tr>";

//Recorrer elementos del objeto
for (r=0;r<dento.length;r++){
    textoTbl_dento += `<tr>
        <td> ${dento[r].HORA}</td>
        <td> ${dento[r].ESPECIALISTA}</td>
        <td> ${dento[r].PACIENTE}</td>
        <td> ${dento[r].RUT}</td>
        <td> ${dento[r].PREVISION}</td>
   </tr>`;
}
//mostrar tabla por html
document.getElementById("tbl_dento").innerHTML = textoTbl_dento;