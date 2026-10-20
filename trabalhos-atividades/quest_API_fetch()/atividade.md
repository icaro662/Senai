<h3> ATIVIDADE - 16/10/2026</h3>
<h4> Discente: Ícaro Sancho de Farias Pereira Melo</h4>
<hr>
<br>

1 -  Porque a abordagem padrão utilizando apenas try/catch ao redor de um await fetch() falharia em capturar esse erro 404?

R: Respostas de erro HTTP como 404 Not Found ou 500 Server Error não caem no catch block pois o Promise do fetch() resolve no objeto que é a  resposta HTTP, independente se o status da resposta é fora ou dentro de 2xx.


<br>
<br>

2 - Snippets de códigos exemplares

Exemplo sem tratamento de respostas HTTP fora dos 2xx

``` javascript

    async function fetchData() {
        try {
            const response = await fetch(
            "https://jsonplaceholder.typicode.com/posts/999999",
            );

            console.log('response.status:', response.status);
            console.log('response.ok:', response.ok);
            
            // Função retorna como sucesso, mesmo que o status seja 404, pois a requisição foi concluída com sucesso
            return console.log("Dados recebidos com sucesso!");
        } catch (error) {
            console.error(error);
        }
    }
```
<br>

Output: 
```
Invocando a função fetchData()...

response.status: 404
response.ok: false

Dados recebidos com sucesso!
```

<br>
<br>



Exemplo com tratamento de respostas HTTP fora dos 2xx como erro
``` javascript
    async function fetchData() {
    try {
        const response = await fetch(
          "https://jsonplaceholder.typicode.com/posts/999999",
        );

        console.log('response.status:', response.status);
        console.log('response.ok:', response.ok);
        
        if (!response.ok) {
            throw new Error(`Erro HTTP encontrado! status: ${response.status}`);
        }
        
        const data = await response.json();
        console.log("Dados recebidos com sucesso!", data);
        
        return data;
    } catch (error) {
        console.error(`\nErro na execução da função fetchData:\n${error}\n`);
        console.log("Não foi possível obter os dados. Tente novamente.");
    }
}
```

Output:
```
Invocando a função fetchData()...

response.status: 404
response.ok: false

Erro na execução da função fetchData:
Error: Erro HTTP encontrado! status: 404

Não foi possível obter os dados. Tente novamente.
```