# ATIVIDADE PRÁTICA — EQUIPE DE QA

## Objetivo
Testar o Portal Acadêmico utilizando os requisitos fornecidos.

### Entregas
1. Análise dos requisitos.
2. Mínimo de 15 cenários de teste.
3. Mínimo de 15 casos de teste.
4. Execução dos testes.
5. Registro dos bugs encontrados.
6. Plano de testes.
7. Organização em suítes.
8. Relatório final.

## Sugestões de testes
Teste, no mínimo:
- campos vazios;
- dados válidos;
- dados inválidos;
- limites de caracteres;
- formatos;
- duplicidade;
- botões;
- mensagens;
- exclusão;
- responsividade.

## Modelo de caso de teste
ID:
Título:
Pré-condição:
Dados de entrada:
Passos:
Resultado esperado:
Resultado obtido:
Status: PASSOU / FALHOU / BLOQUEADO

## Modelo de bug
ID:
Título:
Prioridade:
Passos para reproduzir:
Resultado esperado:
Resultado obtido:
Evidência:
Ambiente:

Não altere o código antes de concluir a execução dos testes.

## Gabarito das entregas

### 1. Análise dos requisitos

Foram encontrados bugs nos requisitos RF02, RF03, RF04, RF05, RF06, RF09, RF11 e RF12.

Os requisitos RF01, RF07, RF08, RF10, RF13 e RNF01 foram considerados validados.

### 2. Casos de teste

#### RF02 — Nome

##### CT-01

ID: CT-01  
Título: Nome com 1 caractere  
Pré-condição: Formulário aberto.  
Dados de entrada: `A`  
Passos: Preencher o nome e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Status: FALHOU

##### CT-02

ID: CT-02  
Título: Nome com 2 caracteres  
Pré-condição: Formulário aberto.  
Dados de entrada: `Jo`  
Passos: Preencher o nome e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Status: FALHOU

##### CT-03

ID: CT-03  
Título: Nome com 3 caracteres  
Pré-condição: Formulário aberto.  
Dados de entrada: `Ana`  
Passos: Preencher o nome e enviar o cadastro.  
Resultado esperado: Cadastro permitido.  
Resultado obtido: Cadastro permitido.  
Status: PASSOU

##### CT-04

ID: CT-04  
Título: Nome contendo números  
Pré-condição: Formulário aberto.  
Dados de entrada: `João123`  
Passos: Preencher o nome e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Status: FALHOU

##### CT-05

ID: CT-05  
Título: Nome contendo caracteres especiais  
Pré-condição: Formulário aberto.  
Dados de entrada: `João@Silva`  
Passos: Preencher o nome e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Status: FALHOU

##### CT-06

ID: CT-06  
Título: Nome contendo apenas letras  
Pré-condição: Formulário aberto.  
Dados de entrada: `João Silva`  
Passos: Preencher o nome e enviar o cadastro.  
Resultado esperado: Cadastro permitido.  
Resultado obtido: Cadastro permitido.  
Status: PASSOU

##### CT-07

ID: CT-07  
Título: Nome com quantidade excessiva de caracteres  
Pré-condição: Formulário aberto.  
Dados de entrada: Nome com 100 ou mais caracteres.  
Passos: Preencher o nome e enviar o cadastro.  
Resultado esperado: Rejeitar ou limitar conforme a especificação.  
Resultado obtido: Campo não possui limite definido.  
Status: BLOQUEADO

#### RF03 — CPF

##### CT-08

ID: CT-08  
Título: CPF com 10 dígitos  
Pré-condição: Formulário aberto.  
Dados de entrada: `1111111111`  
Passos: Preencher o CPF e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro rejeitado.  
Status: PASSOU

##### CT-09

ID: CT-09  
Título: CPF com 11 dígitos  
Pré-condição: Formulário aberto.  
Dados de entrada: `11111111111`  
Passos: Preencher o CPF e enviar o cadastro.  
Resultado esperado: Cadastro aceito.  
Resultado obtido: Cadastro aceito.  
Status: PASSOU

##### CT-10

ID: CT-10  
Título: CPF com 12 dígitos  
Pré-condição: Formulário aberto.  
Dados de entrada: `111111111111`  
Passos: Preencher o CPF e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro rejeitado.  
Status: PASSOU

##### CT-11

ID: CT-11  
Título: CPF com letras após 11 dígitos  
Pré-condição: Formulário aberto.  
Dados de entrada: `11111111111a`  
Passos: Preencher o CPF e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Status: FALHOU

##### CT-12

ID: CT-12  
Título: CPF com caracteres especiais após 11 dígitos  
Pré-condição: Formulário aberto.  
Dados de entrada: `11111111111@`  
Passos: Preencher o CPF e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Status: FALHOU

#### RF04 — E-mail

##### CT-13

ID: CT-13  
Título: E-mail válido  
Pré-condição: Formulário aberto.  
Dados de entrada: `aluno@gmail.com`  
Passos: Preencher o e-mail e enviar o cadastro.  
Resultado esperado: Cadastro aceito.  
Resultado obtido: Cadastro aceito.  
Status: PASSOU

##### CT-14

ID: CT-14  
Título: E-mail sem @  
Pré-condição: Formulário aberto.  
Dados de entrada: `alunogmail.com`  
Passos: Preencher o e-mail e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro rejeitado.  
Status: PASSOU

##### CT-15

ID: CT-15  
Título: E-mail apenas com @  
Pré-condição: Formulário aberto.  
Dados de entrada: `@`  
Passos: Preencher o e-mail e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Status: FALHOU

##### CT-16

ID: CT-16  
Título: E-mail sem domínio  
Pré-condição: Formulário aberto.  
Dados de entrada: `aluno@`  
Passos: Preencher o e-mail e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Status: FALHOU

##### CT-17

ID: CT-17  
Título: E-mail sem usuário  
Pré-condição: Formulário aberto.  
Dados de entrada: `@gmail.com`  
Passos: Preencher o e-mail e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Status: FALHOU

##### CT-18

ID: CT-18  
Título: E-mail dentro do limite  
Pré-condição: Formulário aberto.  
Dados de entrada: E-mail normal.  
Passos: Preencher o e-mail e enviar o cadastro.  
Resultado esperado: Cadastro aceito.  
Resultado obtido: Cadastro aceito.  
Status: PASSOU

##### CT-19

ID: CT-19  
Título: E-mail excessivamente longo  
Pré-condição: Formulário aberto.  
Dados de entrada: E-mail com quantidade excessiva de caracteres.  
Passos: Preencher o e-mail e enviar o cadastro.  
Resultado esperado: Rejeitar ou limitar conforme a especificação.  
Resultado obtido: Campo não possui limite definido.  
Status: BLOQUEADO

#### RF05 — Telefone

##### CT-20

ID: CT-20  
Título: Telefone brasileiro válido  
Pré-condição: Formulário aberto.  
Dados de entrada: `81999999999`  
Passos: Preencher o telefone e enviar o cadastro.  
Resultado esperado: Cadastro aceito.  
Resultado obtido: Cadastro aceito.  
Status: PASSOU

##### CT-21

ID: CT-21  
Título: Telefone contendo letras  
Pré-condição: Formulário aberto.  
Dados de entrada: `81999abc999`  
Passos: Preencher o telefone e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Status: FALHOU

##### CT-22

ID: CT-22  
Título: Telefone contendo caracteres especiais  
Pré-condição: Formulário aberto.  
Dados de entrada: `81@9999#9999`  
Passos: Preencher o telefone e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Status: FALHOU

##### CT-23

ID: CT-23  
Título: Telefone em formato inválido  
Pré-condição: Formulário aberto.  
Dados de entrada: Número fora do padrão brasileiro.  
Passos: Preencher o telefone e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Status: FALHOU

##### CT-24

ID: CT-24  
Título: Telefone com 1 dígito  
Pré-condição: Formulário aberto.  
Dados de entrada: `8`  
Passos: Preencher o telefone e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Status: FALHOU

##### CT-25

ID: CT-25  
Título: Telefone incompleto  
Pré-condição: Formulário aberto.  
Dados de entrada: `819999`  
Passos: Preencher o telefone e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Status: FALHOU

##### CT-26

ID: CT-26  
Título: Telefone com quantidade válida  
Pré-condição: Formulário aberto.  
Dados de entrada: `81999999999`  
Passos: Preencher o telefone e enviar o cadastro.  
Resultado esperado: Cadastro aceito.  
Resultado obtido: Cadastro aceito.  
Status: PASSOU

#### RF06 — Data de nascimento

##### CT-27

ID: CT-27  
Título: Data anterior a 1950  
Pré-condição: Formulário aberto.  
Dados de entrada: `01/01/1949`  
Passos: Preencher a data e enviar o cadastro.  
Resultado esperado: Data rejeitada.  
Resultado obtido: Data aceita.  
Status: FALHOU

##### CT-28

ID: CT-28  
Título: Data no limite inferior  
Pré-condição: Formulário aberto.  
Dados de entrada: `01/01/1950`  
Passos: Preencher a data e enviar o cadastro.  
Resultado esperado: Data aceita.  
Resultado obtido: Data aceita.  
Status: PASSOU

##### CT-29

ID: CT-29  
Título: Data dentro do intervalo  
Pré-condição: Formulário aberto.  
Dados de entrada: `01/01/2000`  
Passos: Preencher a data e enviar o cadastro.  
Resultado esperado: Data aceita.  
Resultado obtido: Data aceita.  
Status: PASSOU

##### CT-30

ID: CT-30  
Título: Data no limite superior  
Pré-condição: Formulário aberto.  
Dados de entrada: `01/01/2026`  
Passos: Preencher a data e enviar o cadastro.  
Resultado esperado: Data aceita.  
Resultado obtido: Data aceita.  
Status: PASSOU

##### CT-31

ID: CT-31  
Título: Data posterior a 2026  
Pré-condição: Formulário aberto.  
Dados de entrada: `01/01/2027`  
Passos: Preencher a data e enviar o cadastro.  
Resultado esperado: Data rejeitada.  
Resultado obtido: Data aceita.  
Status: FALHOU

#### RF09 — Cadastro duplicado

##### CT-32

ID: CT-32  
Título: Cadastrar primeiro aluno com CPF válido  
Pré-condição: Não existe aluno cadastrado com o CPF usado.  
Dados de entrada: CPF válido.  
Passos: Preencher o formulário e cadastrar o aluno.  
Resultado esperado: Cadastro realizado.  
Resultado obtido: Cadastro realizado.  
Status: PASSOU

##### CT-33

ID: CT-33  
Título: Cadastrar segundo aluno com mesmo CPF  
Pré-condição: Já existe aluno cadastrado com o CPF usado.  
Dados de entrada: Mesmo CPF do primeiro aluno.  
Passos: Preencher o formulário e tentar cadastrar o segundo aluno.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro realizado.  
Status: FALHOU

##### CT-34

ID: CT-34  
Título: Cadastrar aluno com CPF diferente  
Pré-condição: Existe outro aluno cadastrado.  
Dados de entrada: Outro CPF válido.  
Passos: Preencher o formulário e cadastrar o aluno.  
Resultado esperado: Cadastro realizado.  
Resultado obtido: Cadastro realizado.  
Status: PASSOU

#### RF11 — Sucesso

##### CT-35

ID: CT-35  
Título: Realizar cadastro válido  
Pré-condição: Formulário aberto.  
Dados de entrada: Todos os campos válidos.  
Passos: Preencher e enviar o formulário.  
Resultado esperado: Cadastro realizado e formulário completamente limpo.  
Resultado obtido: Cadastro realizado, mas alguns campos permanecem preenchidos.  
Status: FALHOU

##### CT-36

ID: CT-36  
Título: Verificar campos após cadastro  
Pré-condição: Cadastro válido concluído.  
Dados de entrada: Nenhum.  
Passos: Verificar todos os campos do formulário.  
Resultado esperado: Todos os campos vazios ou resetados.  
Resultado obtido: Alguns campos não são limpos.  
Status: FALHOU

#### RF12 — Exclusão

##### CT-37

ID: CT-37  
Título: Solicitar exclusão  
Pré-condição: Existe aluno cadastrado.  
Dados de entrada: Ação `Excluir`.  
Passos: Clicar no botão `Excluir`.  
Resultado esperado: Sistema solicita confirmação.  
Resultado obtido: Exclusão ocorre sem confirmação.  
Status: FALHOU

##### CT-38

ID: CT-38  
Título: Cancelar exclusão  
Pré-condição: Confirmação de exclusão exibida.  
Dados de entrada: Ação `Cancelar`.  
Passos: Clicar em `Cancelar`.  
Resultado esperado: Aluno permanece cadastrado.  
Resultado obtido: Não há confirmação para cancelar.  
Status: FALHOU

##### CT-39

ID: CT-39  
Título: Confirmar exclusão  
Pré-condição: Confirmação de exclusão exibida.  
Dados de entrada: Ação `Confirmar`.  
Passos: Clicar em `Confirmar`.  
Resultado esperado: Aluno é excluído.  
Resultado obtido: Não há confirmação para confirmar.  
Status: FALHOU

### 3. Execução dos testes

Foram executados 39 casos. Os casos válidos passaram e os casos que expõem os bugs falharam.

### 4. Registro dos bugs

#### BUG-01 — RF02: nome aceita menos de 3 caracteres

ID: BUG-01  
Título: Nome aceita menos de 3 caracteres  
Prioridade: Alta  
Passos para reproduzir: Informar `A` ou `Jo` no nome e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Evidência: CT-01 e CT-02.  
Ambiente: Navegador desktop.

#### BUG-02 — RF02: nome aceita números e símbolos

ID: BUG-02  
Título: Nome aceita números e caracteres especiais  
Prioridade: Alta  
Passos para reproduzir: Informar `João123` ou `João@Silva` e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Evidência: CT-04 e CT-05.  
Ambiente: Navegador desktop.

#### BUG-03 — RF02: nome não possui limite máximo

ID: BUG-03  
Título: Nome não possui limite máximo  
Prioridade: Média  
Passos para reproduzir: Informar um nome com 100 ou mais caracteres.  
Resultado esperado: Campo rejeita ou limita o valor conforme especificação.  
Resultado obtido: Limite máximo não está definido.  
Evidência: CT-07.  
Ambiente: Navegador desktop.

#### BUG-04 — RF03: CPF aceita caracteres após 11 dígitos

ID: BUG-04  
Título: CPF aceita letras e símbolos após 11 dígitos  
Prioridade: Alta  
Passos para reproduzir: Informar `11111111111a` ou `11111111111@` e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Evidência: CT-11 e CT-12.  
Ambiente: Navegador desktop.

#### BUG-05 — RF04: e-mail valida apenas @

ID: BUG-05  
Título: E-mail valida somente a presença de @  
Prioridade: Alta  
Passos para reproduzir: Informar `@`, `aluno@` ou `@gmail.com` e enviar o cadastro.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Evidência: CT-15, CT-16 e CT-17.  
Ambiente: Navegador desktop.

#### BUG-06 — RF04: e-mail não possui limite máximo

ID: BUG-06  
Título: E-mail não possui limite máximo  
Prioridade: Média  
Passos para reproduzir: Informar um e-mail com quantidade excessiva de caracteres.  
Resultado esperado: Campo rejeita ou limita o valor conforme especificação.  
Resultado obtido: Limite máximo não está definido.  
Evidência: CT-19.  
Ambiente: Navegador desktop.

#### BUG-07 — RF05: telefone aceita entradas inválidas

ID: BUG-07  
Título: Telefone aceita letras, símbolos e tamanho inválido  
Prioridade: Alta  
Passos para reproduzir: Informar letras, símbolos, formato inválido ou apenas `8`.  
Resultado esperado: Cadastro rejeitado.  
Resultado obtido: Cadastro permitido.  
Evidência: CT-21 a CT-25.  
Ambiente: Navegador desktop.

#### BUG-08 — RF06: data aceita anos fora do intervalo

ID: BUG-08  
Título: Data aceita anos menores que 1950 e maiores que 2026  
Prioridade: Alta  
Passos para reproduzir: Informar `01/01/1949` ou `01/01/2027`.  
Resultado esperado: Data rejeitada.  
Resultado obtido: Data aceita.  
Evidência: CT-27 e CT-31.  
Ambiente: Navegador desktop.

#### BUG-09 — RF09: permite CPF duplicado

ID: BUG-09  
Título: Sistema permite dois alunos com o mesmo CPF  
Prioridade: Alta  
Passos para reproduzir: Cadastrar um aluno e depois cadastrar outro usando o mesmo CPF.  
Resultado esperado: Segundo cadastro rejeitado.  
Resultado obtido: Segundo cadastro realizado.  
Evidência: CT-32 e CT-33.  
Ambiente: Navegador desktop.

#### BUG-10 — RF11: formulário não é limpo

ID: BUG-10  
Título: Cadastro não limpa todos os campos  
Prioridade: Média  
Passos para reproduzir: Realizar um cadastro válido e verificar o formulário.  
Resultado esperado: Todos os campos vazios ou resetados.  
Resultado obtido: Alguns campos permanecem preenchidos.  
Evidência: CT-35 e CT-36.  
Ambiente: Navegador desktop.

#### BUG-11 — RF12: exclusão não solicita confirmação

ID: BUG-11  
Título: Exclusão ocorre sem confirmação  
Prioridade: Alta  
Passos para reproduzir: Clicar em `Excluir` em um aluno cadastrado.  
Resultado esperado: Sistema solicita confirmação antes de excluir.  
Resultado obtido: Sistema não exibe confirmação.  
Evidência: CT-37 a CT-39.  
Ambiente: Navegador desktop.

### 5. Plano de testes

- Testar dados válidos e inválidos.
- Testar limites de tamanho e datas.
- Testar formatos de nome, CPF, e-mail e telefone.
- Testar duplicidade, limpeza, mensagens e exclusão.
- Testar em desktop e mobile.

### 6. Suítes de testes

- Suíte Nome.
- Suíte CPF.
- Suíte E-mail.
- Suíte Telefone.
- Suíte Data de nascimento.
- Suíte Cadastro duplicado.
- Suíte Sucesso.
- Suíte Exclusão.

### 7. Relatório final

Foram executados 39 casos e registrados 11 bugs. Recomenda-se corrigir as validações antes da liberação do sistema.
