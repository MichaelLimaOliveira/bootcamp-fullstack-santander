function checkPalindrome(string) {
    if(!string) return 'Invalid string'

    return string.replace(/\s+/g, '').split("").reverse().join("") === string.replace(/\s+/g, '').split("").join("")
}

function checkPalindrome2(string) {
    if (!string) return 'invalid string'

    string = string.replace(/\s+/g, '')
    for (let i = 0; i < string.length / 2; i++) {
        if(string[i] !== string[string.length -1 -i]) {
            return false
        }
    }
    return true
}

console.log(checkPalindrome2('roma me tem amor'))