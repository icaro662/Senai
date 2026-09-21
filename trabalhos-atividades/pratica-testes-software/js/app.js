const form = document.getElementById("formAluno");
const mensagem = document.getElementById("mensagem");
const listaAlunos = document.getElementById("listaAlunos");
const contador = document.getElementById("contador");
const btnLimpar = document.getElementById("btnLimpar");

let alunos = [];

function mostrarMensagem(texto, tipo) {
  mensagem.textContent = texto;
  mensagem.className = "mensagem " + tipo;
}

function limparErros() {
  document.querySelectorAll("small").forEach(el => el.textContent = "");
}

function validarFormulario() {
  limparErros();

  const nome = document.getElementById("nome").value.trim();
  const cpf = document.getElementById("cpf").value.trim();
  const email = document.getElementById("email").value.trim();
  const telefone = document.getElementById("telefone").value.trim();
  const nascimento = document.getElementById("nascimento").value;
  const curso = document.getElementById("curso").value;
  const turno = document.getElementById("turno").value;

  let valido = true;

  // BUG INTENCIONAL 1: nome com apenas 2 caracteres é aceito.
  if (nome.length < 2) {
    document.getElementById("erroNome").textContent = "Informe o nome.";
    valido = false;
  }

  // BUG INTENCIONAL 2: validação de CPF considera apenas quantidade de caracteres.
  if (cpf.replace(/\D/g, "").length !== 11) {
    document.getElementById("erroCpf").textContent = "CPF deve possuir 11 dígitos.";
    valido = false;
  }

  // BUG INTENCIONAL 3: e-mail aceita "@" sem exigir domínio adequado.
  if (!email.includes("@")) {
    document.getElementById("erroEmail").textContent = "Informe um e-mail válido.";
    valido = false;
  }

  // BUG INTENCIONAL 4: telefone não é validado.
  if (!telefone) {
    document.getElementById("erroTelefone").textContent = "Informe o telefone.";
    valido = false;
  }

  if (!nascimento) {
    document.getElementById("erroNascimento").textContent = "Informe a data.";
    valido = false;
  }

  if (!curso) {
    document.getElementById("erroCurso").textContent = "Selecione o curso.";
    valido = false;
  }

  return valido;
}

form.addEventListener("submit", function(event) {
  event.preventDefault();

  if (!validarFormulario()) {
    mostrarMensagem("Existem dados que precisam ser corrigidos.", "erro");
    return;
  }

  const aluno = {
    nome: document.getElementById("nome").value.trim(),
    cpf: document.getElementById("cpf").value.trim(),
    email: document.getElementById("email").value.trim(),
    telefone: document.getElementById("telefone").value.trim(),
    nascimento: document.getElementById("nascimento").value,
    curso: document.getElementById("curso").value,
    turno: document.getElementById("turno").value || "Não informado"
  };

  // BUG INTENCIONAL 5: não impede CPF duplicado.
  alunos.push(aluno);

  renderizarAlunos();
  mostrarMensagem("Aluno cadastrado com sucesso!", "sucesso");

  // BUG INTENCIONAL 6: formulário é parcialmente limpo; alguns campos permanecem.
  document.getElementById("nome").value = "";
  document.getElementById("email").value = "";
});

// salva a opção selecionado do turno, e a restaura após o form.reset()
// para simular comportamente inicialmente esperado
const turnoElement = document.getElementById("turno");
let turnoSelect = '';

// escuta por mudanças dentro do turnoElement,
// armazena o valor do elemento que ativou o listener 
// (nesse caso, ao selecionar uma opção, o valor daquela opção é então salva)
turnoElement.addEventListener('change', (event) => { 
  turnoSelect = event.target.value;
  console.log("selected option", turnoSelect)
})

btnLimpar.addEventListener("click", function() {
  // BUG INTENCIONAL 7: o botão limpar não limpa o turno.
  // o botao limpar de fato limpa o turno
  form.reset();
  limparErros();
  document.getElementById("turno").value = turnoSelect; // restaura o valor do turno com a opção anteriormente selecionada antes do input de limpar.
  mensagem.className = "mensagem";
  mensagem.textContent = "";
});

function renderizarAlunos() {
  listaAlunos.innerHTML = "";

  if (alunos.length === 0) {
    listaAlunos.innerHTML = `
      <tr>
        <td colspan="6" class="vazio">Nenhum aluno cadastrado.</td>
      </tr>`;
  } else {
    alunos.forEach((aluno, index) => {
      const tr = document.createElement("tr");

      tr.innerHTML = `
        <td>${aluno.nome}</td>
        <td>${aluno.cpf}</td>
        <td>${aluno.email}</td>
        <td>${aluno.curso}</td>
        <td>${aluno.turno}</td>
        <td>
          <button class="btn btn-danger" onclick="excluirAluno(${index})">
            Excluir
          </button>
        </td>
      `;

      listaAlunos.appendChild(tr);
    });
  }

  contador.textContent = `${alunos.length} ${alunos.length === 1 ? "aluno" : "alunos"}`;
}

function excluirAluno(index) {
  // BUG INTENCIONAL 8: exclusão ocorre sem confirmação.
  alunos.splice(index, 1);
  renderizarAlunos();
  mostrarMensagem("Registro excluído.", "sucesso");
}

renderizarAlunos();