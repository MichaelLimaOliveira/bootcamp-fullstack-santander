function verificaPalindromo(string) {
    if (!string) throw 'String invalida';

    return string === string.split('').reverse().join('');
}

try {
    verificaPalindromo('')

} catch (exception) {
    console.log('na real acaba aki')   
}

