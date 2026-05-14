// DOM - manipular o HTML

// maneiras de selecionar o HTML

//document.getElementByid() - seleciona pelo ID
//document.getElementBytag() - seleciona pela tag
//document.getElementByclass() - seleciona pela classe
//document.querySelector() - selelciona pela classe, id ou tag

const form = document.querySelector("#formProduto")


form.addEventListener('submit', function(event) {
    event.preventDefault()

    const nomeProduto = document.querySelector("#nome").value
    const marca = document.querySelector("#marca").value
    const tamanho = document.querySelector("#tamanho").value
    const preco = document.querySelector("#preco").value
    const quantidade = document.querySelector("#quantidade").value

    const dados = {
        nomeProduto : nomeProduto,
        marca: marca,
        tamanho: tamanho,
        preco : parseFloat(preco),
        quantidade: parseInt(quantidade)
    }
    
    fetch('http://localhost:8080/roupa', {
    method : 'POST',
    headers : {
        "content-type" : 'application/json'
    },

        body : JSON.stringify(dados)
    })

    .then(reponse =>{

       if(reponse.ok) {
            swal.fire({
               title : "roupa cadastrada com sucesso",
               text: "roupa cadastrada",
               icon: "success",
            })             
       } else{
         swal.fire({
               title : "roupa cadastrada com sucesso",
               text: "roupa cadastrada",
               icon: "success",
            })  
        }   

    })

    .catch(erro => {
        swal.fire({
               title : "roupa cadastrada com sucesso",
               text: "roupa cadastrada",
               icon: "success",
            }) 
    })




})