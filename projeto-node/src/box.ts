
type Box<T = any> = {
    contents?: T[],
    contentLenght?: () => number;
}

let box: Box<string> = {
    contents: [],
    contentLenght: () => box.contents!.length
};

box.contents?.push("conteudo");

let box2: Box<number> = {
    contents: [],
}
box2.contents?.push(12);

let box3: Box = {
    contents: []
}
box3.contents?.push("teste");
box3.contents?.push(12345);

function tes<T>(arg: T): T {
    return arg;
}

let n: string = tes("123");