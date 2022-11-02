document.getElementById("registerForm").addEventListener("submit", function(event){
  event.preventDefault()
});

function registrar(){
    fetch("http://localhost:8080/api/registrarUsuario/"+ document.getElementById("email").value + "/" + document.getElementById("password").value + "/" + document.getElementById("fname").value + "/" + document.getElementById("lname").value+"/"+document.getElementById("user").value)
  }

  fetch("http://localhost:8080/api/registrarUsuario/"+ document.getElementById("email").value + "/" + document.getElementById("password").value + "/" + document.getElementById("nombre").value + "/" + document.getElementById("apellido").value).then(function(response){

      response.json().then(function(data) {

        if(!data.respuesta){

          document.getElementById("pop-up").style.display = "block";


        }else{

          window.open("https://www.w3schools.com");

        }

          

      });

  

  });