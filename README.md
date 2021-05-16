# cadastroCep

# Exemplo de como consumir a Api

# Cadastrar uma loja

Url: http://localhost:8080/loja

Método: Post

Body:

{

    "nome":"Lapa"

}

# Cadastrar uma faixa de  cep

Url:http://localhost:8080/cep

Método: Post

Body:

{

    "faixaInicio":40000001,
    "faixaFim":50000000,
     "lojaDTO":{
         "id":1
     }
}

# Atualizar uma faixa de cep

Url:http://localhost:8080/cep

Método: Put

Body:

{

    "id":1,
    "faixaInicio":20000001,
    "faixaFim":30000000,
     "lojaDTO":{
         "id":1
     }
}

# Buscar uma loja por um cep

Método: Get
Url:http://localhost:8080/loja/cep/20000002

# Excluir uma faixa de cep

Método: Delete
Url:http://localhost:8080/cep/1


