console.log("teste");

console.log("Teste");

type Rect = {
    width: number,
    height: number
}

type Triangle = {
    angle: number,
    type: "isosceles" | "scalene" | "obtuse"
}

type Circle = {
    radius: number
}

type GeometricFigure = Rect | Triangle | Circle;

let rect: Rect = {
    width: 20,

};

let t: GeometricFigure = {
    angle: 45,
    type: "isosceles"
}

t = {
    radius: 09
}

t = {

}
