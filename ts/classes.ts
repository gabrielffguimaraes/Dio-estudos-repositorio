import {ICanino} from "./interfaces";

class MeuCachorro implements ICanino {
    protected teste : string;
    nome: string;
    porte: any;
    tipo: any;
    idade: number;

    makeSound(potencia:number): void {
    }

    constructor(nome:string,idade:number,teste:string) {
        this.nome = nome;
        this.idade = idade;
        this.teste=  teste;
    }
}

export {
    MeuCachorro
}
