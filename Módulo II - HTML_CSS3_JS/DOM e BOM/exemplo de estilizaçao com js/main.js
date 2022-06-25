const meuElemento = document.getElementById('meu-elemento')

function adicionarClasse() {
    meuElemento.classList.add("novo-estilo");
}

function removerClasse() {
    meuElemento.classList.remove("classe")
}

function adicionaOuRemoveClasse() {
    meuElemento.classList.toggle("dark-mode")
}

function trocarCorDoH1ParaVermelho() {
    meuElemento.style.color = "red"
}