const func = () => {
    let a = Number(prompt("Digite valor da variável a: "));
    let b = Number(prompt("Digite valor da variável b: "));
    let c = Number(prompt("Digite valor da variável c: "));

    if (isNaN(a) || isNaN(b) || isNaN(c)) {
        alert("Valor inválido. Digite novamente.");
        func();
    } else { 
        return alert("O valor de delta é " + 
            ((b * b) - (4 * a * c)));
    }
}

func();