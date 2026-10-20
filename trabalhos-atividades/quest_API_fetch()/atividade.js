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

console.log('Invocando a função fetchData()...\n');
fetchData()