const  pessoa = {
    firstName: 'Diego',
    lastName: 'Pessoa',
    getFullName: function () {
        console.log(`${this.firstName} ${this.lastName}`);
    },

};

pessoa.getFullName();