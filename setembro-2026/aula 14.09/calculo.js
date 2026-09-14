let numero = Number(prompt("Digite um número inteiro: "));

function multipleNumber(number) {
    if (isNaN(number)) {
      for (; ; isNaN(number) != true) {
        number = Number(prompt("Valor Incorreto. Digite novamente: "));
      }
    } else return number * 2;
}

alert(multipleNumber(numero));