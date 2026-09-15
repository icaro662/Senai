const func = () => {
    let int = Number(prompt("Digite um número inteiro "))
    if (isNaN(int)) {
        alert("Valor Inválido. Digite novamente.");
        func();
    } else { 
        return alert(
        "O Dobro de " +
            int +
            " é " +
            int * 2 +
            "\nA terça parte de " +
            int +
            " é " +
            (int / 3) +
            "."
        );
    }
}

func();