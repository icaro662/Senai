const gather = () => { 
    let nota1 = Number(prompt("Digite a primeira nota: "));
    let nota2 = Number(prompt("Digite a segunda nota: "));
    let nota3 = Number(prompt("Digite a terceira nota: "));

    if (isNaN(nota1) || isNaN(nota2) || isNaN(nota3)) {
        alert("Valor invalido, tente novamente.");
        return gather();
    } else  return gradesMedian(nota1, nota2, nota3);
}

function gradesMedian(nota1, nota2, nota3) {
    let result = (nota1 + nota2 + nota3) / 3;
    alert("Sua média é " + result);
}

gather();
