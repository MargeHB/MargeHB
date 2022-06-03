//espera hasta que documento se cargue
$(document).ready(() => {


  /*$('button').on('click', function(){
 let input = $('.input1');
 parseInt(input),
 alert(input);*/

  //preparando info para llamar a la api
  $('form').submit(() => {
    event.preventDefault();

    //capturar valor desde formulario
    let valueInput = $('#inputValue').val()

    //llamado a la api
    $.ajax({
      type: "GET",
      url: "https://rws-cards-api.herokuapp.com/api/v1/cards/search?value=" + valueInput,
      dataType: "json",
      success: data => {
        console.log(data);

        //Dibujamos el resultado del GET en h3 id=insertID1
        //$('#insertID1').html('Data -->' + data)



        //Comprueba que la respuesta contenga mas de una carta
        if (data.nhits >= 0) {

          //Dibujamos cantidad de cartas
          $('#insertID2').html('N Cartas --> ' + data.nhits)


          //iteramos en las cartas
          for (let carta of data.cards) {

            //Comprobamos id corresponda al seleccionado, valueImput es el numero capturado en el formulario
            if (carta.value === valueInput) {

              //Capturamos dartos de la carta
              let tipo = carta.type
              let nombreCorto = carta.name_short
              let nombre = carta.name
              let id = carta.value_int

              let up = carta.meaning_up
              let rev = carta.meaning_rev
              let desc = carta.desc

              //esta variable tiene que ser Global por eso es VAR (   <p>Tipo -->   ${nombreCorto}</p> <p>Tipo -->${rev}</p> <p>Tipo -->   ${desc}</p>)
              var datosCarta = `
        <p>CARD NUMBER-->  ${id}</p>
        <p>ARCANA TYPE--> ${tipo}</p>
        <p>CARD NAME -->   ${nombre}</p>
        <p>CARD MEANING --> ${up}</p>
         `






              //Dibujamos Los datos 
              $('#Data7').html(datosCarta)
            

              //incluir datos en grafico
              let grafico = [
                 {label: "luck", y: (Math.floor(Math.random()*11)) },
                 {label: "love", y: (Math.floor(Math.random()*8)) },
                 {label: "money", y: (Math.floor(Math.random()*5)) },
                ]


              //GRAFICO
              let datosGraf = {
                animationEnabled: true,
                title: {
                  text: "Card Chart",
               },
                axisY: {
                  title: "Energy",
                  titleFontSizetSize: 8
                },
                axisX: {
                  title: "Variables",
                  titleFontSize: 8
                },
                data: [
                  {
                    type: "column",
                    dataPoints: grafico
                  }
                ]
              }
            

              //Renderizar grafico
              let chart = new CanvasJS.Chart('container3', datosGraf)
              chart.render()
            }
          }
        }
      }



    })
    })
})






/*window.onload = function(){
  $("#container3").CanvasJSChart(criteria);
var criteria = {
  title: {
    text: datosCarta.${nombre}, "Card Chart"},
    





    axisX:{
      title:
    }

}*/





/*                  <p>4 -->   ${tipo}</p>
                    <p> -->   ${nombreCorto}</p>
                    <p>5 -->   ${nombre}</p>
                    <p>3 -->   ${id}</p>
                    <p>6 -->   ${up}</p>
                    <p> -->   ${rev}</p>
                    <p> -->   ${desc}</p>*/



/*
for(var i = 0; i<data.length;i++){
  (data => {           //agregar listener onclick
    $('.resultado')
      .append(`<p>${data.name} -
      ${data.type} - 
      ${data.meaning_up}</p>`);
  })}
  var cards = data.find(function(data){
    return data.parseInt$('#inputValue') == "cards"});
  
  
          //var $(selector).text(textString);
var text1 = cards;
 
  }});

 
});
});


/*(function() {
  var cardsAPI = "http://rws-cards-api.herokuapp.com/api/v1/cards";
  $.getJSON( cardsAPI, {
    tags: "mount rainier",
    tagmode: "any",
    format: "json"
  })
    .done(function( data ) {
      $.each( data.items, function( i, item ) {
        $( "<img>" ).attr( "src", item.media.m ).appendTo( "#images" );
        if ( i === 3 ) {
          return false;
        }
      });
    });
})();*/









/*console.log(dataApi.data);
          dataApi.data.forEach(element => {           //agregar listener onclick
              $('.resultado')
                  .append(`<p>${element.name} -
              ${element.value_int} - 
              ${element.meaning_up}</p>`);
          })
      },*/



/*//verificar que datos ingresados sean en formato solicitado
$.ajax({
    url: "https://rws-cards-api.herokuapp.com/api/v1/cards/search" + inValue,
    type: 'GET',
    dataType: 'JSON',
    success: function (data){  //si todo sale bien, funcionalidad se agrega aquí
   

    //recibe datos
    let nombre = data.name
    let tipo = data.type
    let significado = data.meaning_up

    $('cartanombre').html(`
            <div class="text-center">
            <img src="{imagen}
            <h3>${nombre}</h3>
            <h6>${tipo}</h6>
            <h6>${significado}</h6>
            </div>
   `)
    },
    error: function(data){
        alert("pucha no resultó");
    },
    async: true,
    }


  )})})*/
