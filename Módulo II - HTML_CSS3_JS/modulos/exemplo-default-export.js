function mostrarIdade(pessoa) {
    return `A idade de ${pessoa.nome} é ${pessoa.idade}`;
}

function mostrarCidade(pessoa) {
    return `A cidade de ${pessoa.nome} é ${pessoa.cidade}`
}

function mostrarHobby(pessoa) {
    return `O hobby de ${pessoa.nome} é ${pessoa.hobby}`
}


export {
    mostrarIdade,
    mostrarCidade
}

export default mostrarHobby;