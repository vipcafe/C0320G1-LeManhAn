function main2() {
    var x = 5;
    console.log(x);
    var x = 10; // OK
    console.log(x);
    var y = 55;
    console.log(y);
    var y = 100;
    // ERROR: [ts] Cannot redeclare block-scoped variable 'y'.
    console.log(y);
}
main();
//# sourceMappingURL=ReDeclareVariable.js.map