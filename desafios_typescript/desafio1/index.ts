// Como podemos rodar isso em um arquivo .ts sem causar erros?

let employee = {} as {code:number , name:string};
employee.code = 10;
employee.name = "John";

/* --------------------  */
interface Employee {
    code:number , name:string
}
let employee2 = {} as Employee;
employee.code = 10;
employee.name = "John";
