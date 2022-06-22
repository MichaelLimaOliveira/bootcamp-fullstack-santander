async function resolvePromise() {
    const myPromise = new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve('Resolvida');
        }, 3000)
    });

    let result;

    try {
        result = await myPromise
            
    } catch(e){
        result = e.message;
    }
    return result;
}

async function test()
{
    let x = await resolvePromise()
    let y = resolvePromise().then(resultado => console.log(resultado))
    console.log(x, y)
}

test()

/*(async () => {
    const a = new Promise((resolve) => {
        resolve('aki passou a')
    })
    const b = new Promise((resolve) => {
        resolve('aki passou b')
    })
})(); */ 

