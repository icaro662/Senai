const func = () => {
    const minPor = 10;

    let porDia = Math.round(Number(prompt("Digite qntd. de cigarros por dia: ")));
    let anos = Math.round(Number(prompt("Digite qntd. de anos fumando: ")));

    if (isNaN(porDia) || isNaN(anos)) {
        alert("Valor Inválido. Digite novamente.");
        func();
    } else {
        let anosToDias = 365 * anos;
        let totalCigarros = anosToDias * porDia;
        let cigarrosToMin = totalCigarros * minPor;
        let result =  cigarrosToMin / 1440;
        return alert("Você perdeu " + result + " de dias.");
    }
}

func();