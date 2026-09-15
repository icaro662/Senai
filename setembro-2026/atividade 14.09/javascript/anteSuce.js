const func = () => {
    let int = Number(prompt("Digite um número inteiro: "));
    if (isNaN(int) || !Number.isInteger(int)) {
        alert("Valor Inválido. Digite novamente.");
        func();
    } else {
        return alert(
        "Sucessor é " + 
            (int + 1) + 
            "\nAntecessor é " + 
            (int - 1));
    }
};

func();