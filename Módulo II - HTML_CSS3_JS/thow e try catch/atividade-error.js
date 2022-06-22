function returnStringIfRightSize(string, stringSize) {
    if(string.length === stringSize){
        return string
    }
    else {
    throw 'error'
    }
}

function tryError(string, stringSize){
    try {
        returnStringIfRightSize(string, stringSize)
    } catch (e) {
        console.log(e)

    }
}

tryError('ana', 3)