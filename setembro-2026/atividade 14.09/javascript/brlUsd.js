const func = () => {
    const usd = 3.45;
    let brl = Number(prompt("Quantos brl em sua carteira?"));

    if (isNaN(brl)) {
        alert("Valor inválido. Digite novamente.");
        func();
    } else {
        return alert("Você pode comprar " + Number.parseFloat(brl / usd).toFixed(2) + " usd");
    }
}

func();