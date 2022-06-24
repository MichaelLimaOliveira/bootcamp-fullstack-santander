class BankAcount {
    constructor(accountAgency, accountNumber, accountType) {
        this.accountAgency = accountAgency;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this._accountBalance = 0;
    }

    get accountBalance() {
        return this._accountBalance
    }

    set accountBalance(value) {
        this._accountBalance = value;
    }

    withdraw(value) {
        if(value > this._accountBalance) {
            return 'Saldo insuficiente'
        }
        else {
            return this._accountBalance -= value;
        }
    }

    deposit(value) {
        this._accountBalance +=value;

        return this._accountBalance;
    }
}

class TransactionAccount extends BankAcount {
    constructor(accountAgency, accountNumber, accountCreditCard) {
        super(accountAgency,accountNumber); 
        this.accountType = 'corrente';
        this._accountCreditCard = accountCreditCard;   
    }

    get accountCreditCard() {
        return this._accountCreditCard;
    }

    set accountCreditCard(value) {
        this._accountCreditCard = value;
    }
}

class SavingsAccount extends BankAcount {
    constructor(accountAgency, accountNumber, accountSavingsCard) {
        super(accountAgency, accountNumber);
        this.accountType = 'poupança';
        this._accountSavingsCard = accountSavingsCard;
    }

    get accountSavingsCard() {
        return this._accountSavingsCard;
    }

    set accountSavingsCard(value) {
        this._accountSavingsCard = value
    }
}

class UniversityAccount extends BankAcount {
    constructor(accountAgency, accountNumber, accountUniversityCard) {
        super(accountAgency, accountNumber);
        this.accountType = 'Universitaria';
        this._accountUniversityCard = accountUniversityCard;
    }

    get accountUniversityCard() {
        return this._accountUniversityCard;
    }

    set accountUniversityCard(value) {
        this._accountUniversityCard = value;
    }

    withdraw(value) {
        if (value > 500){
            return 'Operaçao negada! (limite de 500 por saque)'
        }
        this._accountBalance -= value;
    }
}