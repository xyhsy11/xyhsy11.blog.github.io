function multiply() {
    for (var i = 1; i < 10; i++) {
        for (var j = 1; j <= i; j++) {
            document.write(j + "*" + i + "=" +(i*j) + "&nbsp;&nbsp;");
        }
        document.write("<br/>");

    }
}

function add(a,b){
    document.write(a+b);
    document.write("<br/>");
}

function add1(a,b){
    document.write(a+b);
}

function add1(a,b){
    document.write(a + b);
}

function add2(){
    document.write(arguments.length);
    document.write(arguments[0]);
    document.write(arguments[1]);
}
/*multiply();
add(2,3);
add1(2);
add1(3,4)*/
add2(1,2);
var arr1 = new Array(1);
document.write("<br/>"+arr1.length+"<br/>"+arr1);
function arrLength() {
    var arr = [1,"abc",true];
    arr[10] = "12345";
    document.write(arr.length);

}
arrLength();

