const func = (a) => {
    const horasDia = 8;
    const brlHora = 25;

    if (isNaN(a)) {
        alert("Valor inválido. Digite novamente.");
        func();
    } else {
        return alert("Seu salário é " +
            ((horasDia * a) * brlHora)
        );
    }
}

const dias = func(Math.round(Number(prompt("Digite qntd. de dias trabalhados: "))));