const user = new Map();

user.set('Alexandre' , 'Admin')
user.set('Augusto' , 'User')
user.set('Estevão' , 'Admin')
user.set('Michael' , 'Admin')
user.set('Antonio' , 'User')



function getAdmins(users) {
    let admins = [];
    for ([keys, value]of users) {
        if(value === 'Admin'){
            admins.push(keys)
        }
    }
    return admins
}

console.log(getAdmins(user))