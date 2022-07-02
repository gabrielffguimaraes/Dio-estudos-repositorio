interface  IAnimal {
    nome: string;
    tipo: 'terrestre' | 'aquatico';
    idade?: number;
    makeSound(potencia:number):void;
}
interface  IFelinos extends IAnimal {
    visaoNoturna:boolean;
}
interface ICanino extends IAnimal {
    porte:'pequeno' | 'medio' | 'grande';
}

interface Usuario {
    nome:string,
    senha:number,
    interno?:boolean
}
interface Funcionario extends Usuario {
    cargo:'supervisor' | 'coordenador' | 'faxineiro'
    interno:true
}

interface Pessoa {
    nome:string;
    idade:number;
    dinheiro:boolean
}
interface Brasileiro extends Omit<Pessoa,'dinheiro'> {
    graca:number
}
type IDomestico = IFelinos & ICanino;

export {IAnimal,IFelinos,ICanino,IDomestico,Usuario,Funcionario,Pessoa,Brasileiro}
