const func = () => {
    const lata = 2;
    
    let largura = Number(prompt("Digite a largura da parede: "));
    let altura = Number(prompt("Digite a altura da parede: "));

    if (isNaN(largura) || isNaN(altura)) {
        alert("Valor inválido. Digite novamente.");
        func();
    } else {
        let metroQuadrado = largura * altura;
        let tintaNeces = Math.round(metroQuadrado / lata);

        alert("Para pintar " + 
            metroQuadrado + 
            " metros quadrados de parede, é necessário " +
             tintaNeces +
            " latas de tinta."
        )
    }
}

func();