const func = () => {
    const custoDia = 90;
    const custoKm = 0.20;
    let km = Number(prompt("Digite quilometros percorridos: "));
    let dias = Number(prompt("Digite qtnd. de dias alugado: "));

    if (isNaN(km) || isNaN(dias)) {
        alert("Valor inválido. Digite novamente.");
        func();
    } else {
        return alert("Total a pagar por " +
            km +
            " quilometros percorridos por " +
            dias +
            " dias alugado: " +
            ((km * custoKm) + (dias * custoDia))
        );
    }
}

func();