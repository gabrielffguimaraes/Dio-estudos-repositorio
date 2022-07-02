import {IAnimal, ICanino, IDomestico, IFelinos, Usuario, Funcionario, Brasileiro} from "./interfaces";
import {MeuCachorro} from "./classes";
import $ from 'jquery';
/* interfaces and types examples */
const animal:IAnimal = {
    nome:'gabriel',
    tipo:'terrestre',
    makeSound(potencia) {
        console.log(potencia);
    }
}
const felino:IFelinos = {
    nome:'gabriel',
    tipo:'terrestre',
    visaoNoturna: true,
    makeSound(potencia) {
        console.log(potencia);
    }
}
const canino:ICanino = {
    nome:'gabriel',
    tipo:'terrestre',
    porte: 'grande',
    makeSound(potencia) {
        console.log(potencia);
    }
}
const domestico:IDomestico = {
    visaoNoturna:true,
    porte:'grande',
    makeSound(potencia) {
        console.log(50)
    },
    tipo:'aquatico',
    nome:'bob'
}
/* function example */
function soma (a:number ,b: number) {
    return a + b;
}


//** INPUT TYPES DOM **//
const input:HTMLInputElement = document.querySelector('input') as HTMLInputElement;
input.addEventListener('input',(event) => {
    const i  = event.target as HTMLInputElement;
    console.log(i.value);
});
//** GENERIC TYPES **//

function getHumanList <T>(nome:T,parentes:T[]) {
    return [1,2,3].map(r => nome);
}
getHumanList('GABRIEL',['A'])

//** NIVEIS DE ACESSO POR CARGO **/

function liberarAcesso (usuario:Usuario | Funcionario) {
    if("cargo" in usuario) {
        console.log("Redirect to funcionario's page");
        return;
    }
    if(!("cargo" in usuario)) {
        console.log("Redirect to usuarios's page");
        return;
    }
}
liberarAcesso({nome:"gabriel",senha:123456,cargo:'supervisor'} as Funcionario);

/** READONLY & PRIVATE ATRIBUTOS**/

const meuCao = new MeuCachorro('Estrela',7);
console.log(meuCao);

/** USING A LIB **/

$.fn.extend({
    minhaNovaFuncao()
    {
       return "teste";
    }
});

console.log($("input").minhaNovaFuncao());

/** OMIT **/
const brasileiro:Brasileiro = {
    nome:'gabriel',
    graca:8001,
    idade:25
}
console.log(brasileiro);
