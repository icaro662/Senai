const func = (a) => {
    const discount = 5 / 100;

    if (isNaN(a)) {
        alert("Valor inválido. Digite novamente.")
    } else {
        return alert("O preço promocional é " +
            (a - (a * discount)));
    }
}

let preço = func(prompt("Digite o preço do produto: "));