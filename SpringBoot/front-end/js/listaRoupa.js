async function carregarProdutos() {
    try{
        let resposta = await fetch('http://localhost:8080/roupa') //Promisse
        console.log(resposta);
        let listaProdutos = await resposta.json();
        
        let tabela = document.getElementById("tabelaProdutos")

        tabela . innerHTML = ""
        listaProdutos.forEach(produto => {
            tabela.innerHTML += `
        <tr>
            <td>${produto.id}</td>
            <td>${produto.nomeProduto}</td>
            <td>${produto.marca}</td>
            <td>${produto.tamanho}</td>
            <td>R$ ${(produto.preco.toFixed(2))}</td>
            <td>${produto.quantidade}</td>
            <td>${(produto.quantidade * produto.preco).toFixed(2)}</td>
            <td>
                <button class="btn btn-danger btn-sm" title="Excluir Produto" 
                onclick="excluirProduto(${produto.id})">
                    <i class= "bi bi-trash"></i>
                </button>
            </td>
        </tr>
        `
        });

    } catch (erro) {
        console.log(erro);
    }

}

//Envia a requsição
function excluirProduto(id){
    fetch(`http://localhost:8080/roupa/${id}`,{
        method: "DELETE"
    })

    //Reposta da requsição
    .then(response =>{
        if (response.ok){
            Swal.fire({
                title : "ROUPA EXCLUÍDA COM SUCESSO",
                text : "ROUPA EXCLUÍDA",
                icon : "success"
            })
            carregarProdutos()
        }

        else{
            Swal.fire({
                title: "ERRO EXLUIR ROUPA",
                text: "ROUPA NÃO EXCLUÍDA",
                icon : "error"
            })
        }

    })

    .catch(erro=>{
        console.log("erro : ", erro)
    })
}

carregarProdutos()