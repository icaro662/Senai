const func = () => {
    let a = Number(prompt("Digite a primeira nota: ")); 
    let b = Number(prompt("Digite a segunda nota: ")); 

    if (isNaN(a) || isNaN(b)) { 
        alert("Valor inválido. tente novamente");
        func();
    } else { return alert("Sua média é " + (a + b) / 2)};
}

func();