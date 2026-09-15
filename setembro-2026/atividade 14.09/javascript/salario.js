const func = (a) => {
    const aumento = 15;
    if (isNaN(a)) {
        alert("Valor inválido. Digite novamente.")
        func();
    } else {
        return alert("Seu novo salário com 15% de aumento é " + 
            (a + (a * aumento / 100)));
    }
}

let salario = func(Number(prompt("Digite seu salário: ")));