interface Pessoa {
    nome:string;
    idade:number | string;
    profissao: string
}
let pessoa1 = {} as Pessoa;
pessoa1.nome = "maria";
pessoa1.idade = 29;
pessoa1.profissao = "atriz"

let pessoa2 = {} as Pessoa;
pessoa2.nome = "roberto";
pessoa2.idade = 19;
pessoa2.profissao = "Padeiro";

let pessoa3 = {
    nome: "laura",
    idade: "32",
    profissao: "Atriz"
} as Pessoa;

let pessoa4 = {
    nome:"carlos",
    idade: 19,
    profissao:"padeiro"
} as Pessoa;
