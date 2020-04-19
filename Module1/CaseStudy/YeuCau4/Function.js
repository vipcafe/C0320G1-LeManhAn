
let Nhap = prompt("Nhap so lan muon them");
alert(Nhap);
let count = 0 ;
let b = [];
let data ;
let money;
let c =[];

while (count < Nhap ){
    start() ;
    count ++
}


let a = [
    "Name :", "Số CMND :", "Ngày tháng Năm sinh : ", "Địa Chỉ :", "email :",
    "Thành viên :", "Giãm giá :", "Số Lượng :", "Loại Dịch Vụ :", "Số Ngày Thuê :",
    "Loại Phòng thuê :", "Tổng số tiền phải trả :"
];

//====================== CLEAR ======================================
function clear() {
    document.getElementById("name").value="";
    document.getElementById("cmnd").value="";
    document.getElementById("email").value="";
    document.getElementById("from").value="";
    document.getElementById("birthday").value="";
    document.getElementById("bug_cmnd").innerHTML="*";
    document.getElementById("bug_email").innerHTML="*";
    document.getElementById("bug_birthday").innerHTML="*";
    document.getElementById("renday").value="";
    document.getElementById("bug_renday").innerHTML="*";
    document.getElementById("quantum").value="";
    document.getElementById("bug_quantum").innerHTML="*";
}
function prinln0() {
    document.getElementById("prinln2").innerHTML="";
    let sout ="";
    sout+="<table>";
    for(let i=0;i<c.length;i++) {
        sout+="<tr>"
        sout+="<td>"+c[i][0]+"</td>";
        sout+="<td> <button onclick='editProduct("+i+")'>Edit</button></td>"
        sout+="<td> <button onclick='deleteProduct("+i+")'>Delete</button></td>"
        sout+="</tr>"
    }
    sout+="</table>"
    document.getElementById("prinln2").innerHTML =sout;
}
//=============================== HAM "IN TH0NG TIN NGUOI DUNG" ================================
function prinln() {
    data = "<table id='Xuat'>";
    for (let i = 0; i < a.length; i++) {
        data += "<tr>" +
            "<td width='30px' >" + i + "</td>" +
            "<td width='170px' >" + a[i] + "</td>" +
            "<td width='200px' >" + b[i] + "</td>" +
            "</tr>";
    }
    data += '</table><br><br>';
    data += '<input  type="button" value="Edit" onclick="Edit()" >';
    document.body.innerHTML="";
    document.write(data);
}
//=============================HAM "TINH SO TIEN ' ========================
function moneyplus() {

    if(b[8] == 'Villa'){
        money = 500 * b[9];
    }
    else if(b[8] == 'House'){
        money = 300 * b[9];
    }
    else if(b[8] == 'Room'){
        money = 100 * b[9];
    }

    if(b[5] === 'Sliver'){
        money -= 2;
    }
    else if(b[5] === 'Gold'){
        money -= 5;
    }
    else if(b[5] === 'Platium'){
        money -= 10;
    }
    else if(b[5] === 'Diamond'){
        money -= 15;
    }

    if(b[9] > 7){
        money -= 30;
    }
    else if(b[9] >= 5){
        money -= 20;
    }
    else if(b[9] >= 2){
        money -= 10;
    }
    if(b[3] === "Da Nang"){
        money -= 20;
    }
    else if(b[3] === "Hue"){
        money -= 10;
    }
    else if(b[3] === "Quang Nam"){
        money -= 5;
    }
    b[11]=money + " $";

}
//============================HAM START =====================================================
function start() {
    b = [
        document.getElementById('name').value,
        document.getElementById('cmnd').value,
        document.getElementById('birthday').value,
        document.getElementById('from').value,
        document.getElementById('email').value,
        document.getElementById('rank').value,
        document.getElementById('sale').value,
        document.getElementById('quantum').value,
        document.getElementById('service').value,
        document.getElementById('renday').value,
        document.getElementById('rom').value
    ];
//=========================== Name ===================================
    let tenname = "" ;
    b[0]=b[0].trim().toLowerCase();
    for(let i=0 ; i < b[0].length ; i++){
        if(b[0].charAt(i) === " " && b[0].charAt(i+1)===" "){
            continue ;
        }
        if(i===0 || b[0].charAt(i-1) === " ") {
            tenname += b[0].charAt(i).toUpperCase();
            continue;
        }
        tenname+= b[0].charAt(i);
    }
    b[0]=tenname ;
//===========================Check cmnd ========================
    let checkcmnd;
    if(b[1].length !== 9 ){
        document.getElementById("bug_cmnd").innerHTML="   *vui long nhap so cmnd dang so 9 ky tu va lon hon 0";
        checkcmnd = false ;
    }
    else if(b[1].length == 9 ){
        if(b[1] != parseInt(b[1])){
            document.getElementById("bug_cmnd").innerHTML="   *vui long nhap so cmnd dang so 9 ky tu va lon hon 0";
            checkcmnd = false ;
        }
        else if(b[1]<0){
            document.getElementById("bug_cmnd").innerHTML="   *vui long nhap so cmnd dang so 9 ky tu va lon hon 0";
            checkcmnd = false ;
        }
        else {
            document.getElementById("bug_cmnd").innerHTML="   *ok";
            checkcmnd = true ;
        }
    }
    //===========================  "CHECK MAIL' ================================
    let x = document.getElementById("email").value;
    let atposition = x.indexOf("@");
    let dotposition = x.lastIndexOf(".");
    let checkmail ;
    if (atposition < 1 || dotposition < (atposition + 2) || (dotposition + 2) >= x.length) {
        document.getElementById("bug_email").innerHTML=" *vui long nhap email theo dinh dang xxxx@xxx.com";
        checkmail = false ;
    }
    else {
        document.getElementById("bug_email").innerHTML="   *ok";
        checkmail = true ;
    }
//===============================Xet ngay thang=============================================
    let y= document.getElementById("birthday").value ;
    let checkbrthday ;
    if(y.charAt(2) === "/" && y.charAt(5) === "/"){
        let day = y.substring(0,2);
        let month = y.substring(3,5);
        let year = y.substring(6,10);
        if ((day != parseFloat(day))||(month != parseFloat(month))||(year != parseFloat(year))){
            document.getElementById("bug_birthday").innerHTML=" *vui long nhap birthday theo dinh dang dd/mm/yyyy";
            checkbrthday =false ;


        }
        if(year<1951){
            document.getElementById("bug_birthday").innerHTML=" *vui long nhap birthday theo dinh dang dd/mm/yyyy";
            return checkbrthday =false ;
        }
        else {
            document.getElementById("bug_birthday").innerHTML=" *ok";
            checkbrthday =true ;
        }
    }
    else {
        document.getElementById("bug_birthday").innerHTML=" *vui long nhap birthday theo dinh dang dd/mm/yyyy";
        checkbrthday =false ;
    }
//===================================== NGAY THUE VA NGUOI DI KEM ================================
    let renday = document.getElementById("renday").value ;
    let quantum = document.getElementById("quantum").value ;
    let checkRenday ;
    let checkQuantum ;
    if (renday != parseInt(renday) || renday<0){
        document.getElementById("bug_renday").innerHTML=" vui long nhap so nguyen duong";
        checkRenday =false ;
    }
    else {
        document.getElementById("bug_renday").innerHTML=" *ok";
        checkRenday = true ;
    }
    if ((quantum != parseInt(quantum)|| quantum < 0)){
        document.getElementById("bug_quantum").innerHTML=" vui long nhap so nguyen duong";
        checkQuantum =false ;
    }
    else {
        document.getElementById("bug_quantum").innerHTML=" *ok"
        checkQuantum = true ;
    }
    clear();
// ================================= Dieu kien sumbit ============================================
    if (checkmail == true && checkbrthday == true && checkcmnd == true&& checkRenday == true && checkQuantum == true ){
        moneyplus();
        c.push(b);
        alert("Them Thanh Cong");
    }
    prinln0()
}

//=================================== NUT "CHINH SUA" =============================
function Edit() {
    let ed;
    while (ed !== "99") {
        let info;
        ed = parseInt(prompt("Nhap so muon sữa theo STT thong tin khach hang 0->10 \n Nhap '99' de kiet thuc "));
        if (ed >= 0 && ed < 11 && ed != 5) {
            info = prompt("Nhap lai thong tin \n" + a[ed]);
            b[ed] = info;
            alert("Da update " + a[ed]);

        }
        else if (ed == "99"){
            alert("Thong tin cua ban da duoc cap nhat");
            moneyplus();
            prinln();
            break;
        }
        else if (ed == "5" ){
            info = prompt("Nhap thong tin theo stt :\n 0 .Menber \n 1 .Gold \n 2 .Sliver \n 3 .Platium \n 4 .Diamond  \n");
            switch (info) {
                case "0" :
                    b[ed] = 'Member' ;
                    break;
                case "1" :
                    b[ed] = 'Gold' ;
                    alert(b[ed])
                    break;
                case "2" :
                    b[ed] = "Sliver" ;
                    break;
                case "3" :
                    b[ed] = "Platium" ;
                    break;
                case "4" :
                    b[ed] = "Diamond" ;
                    break;
            }

        }
        else {
            alert('"Failed" vui long nhap so trong pham vi tu 0 -> 10')
        }
    }
}
// =====================================================

