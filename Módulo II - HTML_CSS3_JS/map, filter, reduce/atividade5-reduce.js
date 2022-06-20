function finalPrice(priceList, valueInAccont) {
    return priceList.reduce(function(previous, current) {
        return previous - current.price

    },valueInAccont)
}

const priceList = [
    {
        name: 'batom',
        price: 100
    },
    {
        name: 'leite',
        price: 20
    },
    {
        name: 'cafe',
        price: 50
    }
]
const valueInAccont = 200
console.log(finalPrice(priceList, valueInAccont))
