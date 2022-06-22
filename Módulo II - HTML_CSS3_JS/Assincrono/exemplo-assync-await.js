
function usandoFuncoesAssincronasMasNaoQueroEsperarElas()
{
    returnString("Execução 1").catch(e => setTimeout(() => console.log(e), 300))

    returnString("Execução 2").then((ress) => {
        console.log(ress, '1')
    }).catch(e => console.log(e))

    console.log('teste')
}

async function usandoFuncoesAssincronasMasQueroEsperarAlguma()
{
    try {
        await returnString("Execução 1")
    } catch (error) {
        console.log(error)
    }

    try {
        console.log(await returnString("Execução 2"))
    } catch (error) {
        console.log(error)
    }
    
    console.log('teste')
}

function returnString(execucao) {
    return new Promise((resolve, reject) =>{
        console.log(`executando: ${execucao}`)
        resolve('Caio e estrevin malucos')
        //reject(`${execucao}: Caio e estrevin deu errado pq sao malucos`)
    })

}
async function teste()
{
    let result = await returnString("Execução 1")
    console.log(result)
    console.log('teste1')

}

async function test2() {
    returnString("Execução 2").then((ress) => {
        console.log(ress, '2')
    }).catch(e => console.log(e))
    console.log('teste2')
}

async function test3()
{
    var ress = await returnString("Execução 2")
    console.log(ress, '2')
    
}


teste()
test3()
.then(()=> {
    console.log('oi')
})
console.log('teste2')