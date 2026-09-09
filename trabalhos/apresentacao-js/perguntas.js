const perguntas = [ 
    {
        pergunta: "Imagine que vocês precisam criar um formulário de cadastro para um site. Como o JavaScript poderia ser utilizado para tornar esse formulário interativo?",
        alternativas: [
            "Usando addEventListener() para detectar o envio, validando os campos e exibindo feedback ao usuário.",
            "Usando apenas CSS para verificar os dados e enviar mensagens ao usuário.",
            "Trocando todos os campos do formulário por imagens para evitar erros.",
            "Removendo o botão de envio para impedir qualquer interação com o formulário."
        ],
        correta: 0,
        explicacao: "O JavaScript pode ouvir eventos do formulário, ler os valores digitados, validar os dados e atualizar a página com mensagens de feedback."
    },
    {
        pergunta: "Qual é a forma correta de selecionar no JavaScript um elemento com id=\"email\"?",
        alternativas: [
            "document.getElement('email')",
            "document.getElementById('email')",
            "document.selectId('email')",
            "document.id('email')"
        ],
        correta: 1,
        explicacao: "getElementById() busca um elemento HTML pelo valor do seu atributo id."
    },
    {
        pergunta: "Como obter o texto digitado em um campo de formulário selecionado na variável input?",
        alternativas: [
            "input.text",
            "input.content",
            "input.value",
            "input.inputText"
        ],
        correta: 2,
        explicacao: "A propriedade value contém o valor atual digitado em elementos de formulário, como input e textarea."
    },
    {
        pergunta: "Qual condição verifica se a variável nome está vazia ou contém apenas espaços?",
        alternativas: [
            "if (nome.trim() === '') { }",
            "if (nome.empty()) { }",
            "if (nome.value === null) { }",
            "if (nome.removeSpaces()) { }"
        ],
        correta: 0,
        explicacao: "trim() remove os espaços no início e no fim do texto; depois, a comparação com uma string vazia identifica se não há conteúdo."
    },
    {
        pergunta: "Um usuário clica em um botão “Enviar”, mas deixou o campo “E-mail” vazio. Como o JavaScript poderia identificar esse problema e interagir com o usuário?",
        alternativas: [
            "Lendo email.value, verificando se o texto está vazio e exibindo uma mensagem após usar event.preventDefault().",
            "Enviando o formulário imediatamente e esperando que o servidor corrija o campo vazio.",
            "Usando document.deleteElement('email') para remover o campo com problema.",
            "Alterando o texto do botão para 'Enviar' novamente, sem verificar o valor do campo."
        ],
        correta: 0,
        explicacao: "O código pode acessar email.value, remover espaços com trim(), impedir o envio padrão com preventDefault() e mostrar uma mensagem de orientação."
    }
]