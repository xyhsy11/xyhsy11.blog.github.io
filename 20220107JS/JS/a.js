var date = new Date();
document.write(date+ "<br>");
document.write(randomHundred());

encodeTest();

function randomHundred() {
    return Math.round(Math.random()*100);
}

function regTest(){
    var reg1 = new RegExp("\w{6,12}");
    var reg2 = /\w{6,12}/;
    alert(reg1);
    alert(reg2);
}
function encodeTest(){
    var str = encodeURI("韩思宇");
    document.write(str);
    str = decodeURI(str);
    document.write(str);
}