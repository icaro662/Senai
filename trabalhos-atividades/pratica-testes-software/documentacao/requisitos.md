# REQUISITOS — PORTAL ACADÊMICO

## RF01 — Cadastro de aluno | verificado e validado
O sistema deve permitir cadastrar um aluno.

## RF02 — Nome
O nome completo é obrigatório e deve possuir pelo menos 3 caracteres.

bug: nome precisa ter no minimo 2 caracteres
bug: aceita caracteres especiais e numeros
bug: nao possue limite de caracteres

## RF03 — CPF
O CPF é obrigatório e deve possuir exatamente 11 dígitos.

bug: apos os 11 digitos minimos, o campo aceita ate 3 ( totalizando 14) digitos nao numericos. Por exemplo, o cpf "11111111111as@" é valido para o sistema.

## RF04 — E-mail
O e-mail é obrigatório e deve possuir formato válido, como `aluno@dominio.com`.

bug: campo apenas verifica se o caractere "@" está presente
bug: nao possue limite de caracteres

## RF05 — Telefone
O telefone é obrigatório e deve aceitar somente números no formato de telefone brasileiro.

bug: aceita formatos diferentes, letras e caracteres especiais
bug: aceita no minimo 1 caractere

## RF06 — Data de nascimento
A data de nascimento é obrigatória.

bug: data de nascimento aceita valores de anos menores de 1950 e maiores de 2026

## RF07 — Curso | verificado e validado
O curso é obrigatório. 

## RF08 — Turno | verificado e validado
O turno é opcional. 

## RF09 — Cadastro duplicado 
O sistema não deve permitir o cadastro de dois alunos com o mesmo CPF.

bug: é possivel cadastrar dois alunos com mesmo cpf

## RF10 — Limpar | verificado e validado
O botão "Limpar" deve apagar todos os dados digitados no formulário.

## RF11 — Sucesso
Após um cadastro válido, o sistema deve apresentar uma mensagem de sucesso e preparar o formulário para um novo cadastro.

bug: cadastro não limpa todos os campos do formulario

## RF12 — Exclusão
O usuário pode excluir um aluno cadastrado, mas o sistema deve solicitar confirmação antes da exclusão.

bug: sistema nao oferece confirmaçao antes da exclusao

## RF13 — Responsividade | verificado e validado
A interface deve continuar utilizável em telas menores, como smartphones.

## RNF01 — Usabilidade  | verificado e validado
As mensagens de erro devem ser claras e indicar ao usuário o que precisa ser corrigido.
