const circle = require("./p3_circle")
const rectangle = require("./p3_rectangle")
const triangle = require("./p3_triangle")
console.log("Circle Area: " + circle.calcArea(2));
console.log("Circle Circumference: " + circle.calcCircumference(2));
console.log("Circle Diameter: " + circle.calcDiameter(2));

console.log("Rectangle Area: " + rectangle.calcArea(3,4));
console.log("Rectangle Perimeter: ", rectangle.calcPerimeter(3,4));

console.log("Triangle Equilateral: ", triangle.isEquilateral(1,1,1));
console.log("Triangle Perimeter: ", triangle.calcPerimeter(1,1,1));