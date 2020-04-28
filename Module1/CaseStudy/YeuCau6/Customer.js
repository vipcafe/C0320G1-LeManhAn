function displayMainMenu() {

    document.body.innerText = "";
    let sout = "<div style='text-align: center'><h1 style='color: darkblue'>MAIN MENU CUSTOMER</h1>";
    sout+="<button type='button' style='width: 180px ;height: 40px' onclick='khachHang.addNewCustomer("+khachHang.count+")'>ADD NEW CUSTOMER</button><br>";
    sout+="<button type='button' style='width: 180px ;height: 40px' onclick='khachHang.displayInformationCustomer()'>INFOMATION CUSTOMER</button><br>";
    sout+="<button type='button' style='width: 180px ;height: 40px' onclick='khachHang.editInformationCustomer()'>EDIT INFOMATION CUSTOMER</button><br>";
    sout+="<button type='button' style='width: 180px ;height: 40px' onclick='khachHang.deleteInformationCustomer()'>DELETE INFOMATION CUSTOMER</button><br>";
    sout+="<button type='button' style='width: 180px ;height: 40px' onclick='displayMainMenuEmployee()'>Main Menu Employee</button><br>";
    sout+="<h3 style='color: brown'>Hiện đang có "+khachHang.count+" khách hàng</h3>"
    sout+="</div>";
    return document.write(sout)
}
//-------------------------------------------------Delete -----------------------------------
function deleteInformation(index) {
    if (index == 0) {
        alert(khachHang.addInfomation[index][0]+" Là TK VIP Bạn không thể xóa được người này !!")
        khachHang.deleteInformationCustomer();
    } else {
        if (confirm("Ban có chắc chắn muốn xóa người này không ?")) {
            khachHang.addInfomation.splice(index, 1)
            khachHang.deleteInformationCustomer();
            khachHang.count = khachHang.count - 1;
        }
    }
}
//----------------------------------------------Edit ----------------------------------
function editInformation(index){
    while(true){
        result ="";
        result = prompt("Nhập cột muốn sửa và nhập '999' để thoát : " +
            "\n1."+khachHang.infomation[0]+khachHang.addInfomation[index][0]+
            "\n2."+khachHang.infomation[1]+khachHang.addInfomation[index][1]+
            "\n3."+khachHang.infomation[2]+khachHang.addInfomation[index][2]+
            "\n4."+khachHang.infomation[3]+khachHang.addInfomation[index][3]+
            "\n5."+khachHang.infomation[4]+khachHang.addInfomation[index][4]+
            "\n6."+khachHang.infomation[5]+khachHang.addInfomation[index][5]+
            "\n7."+khachHang.infomation[6]+khachHang.addInfomation[index][6]+
            "\n8."+khachHang.infomation[7]+khachHang.addInfomation[index][7]+
            "\n9."+khachHang.infomation[8]+khachHang.addInfomation[index][8]+
            "\n10."+khachHang.infomation[9]+khachHang.addInfomation[index][9])
        result=parseInt(result);
        switch (result) {
            case 1 :
                khachHang.name(index);
                break;
            case 2 :
                khachHang.cmnd(index);
                break;
            case 3 :
                khachHang.birthday(index);
                break;
            case 4 :
                khachHang.address(index);
                break;
            case 5 :
                khachHang.email(index);
                break;
            case 6 :
                khachHang.member(index);
                break;
            case 7 :
                khachHang.nount(index);
                break;
            case 8 :
                khachHang.service(index);
                khachHang.moneyPlus(index);
                break;
            case 9 :
                khachHang.renday(index);
                break;
            case 10 :
                khachHang.rom(index);
                break;
            case 999 :
                khachHang.editInformationCustomer();
                return true ;
            default :
                return editInformation(index)
        }
    }

    khachHang.displayInformationCustomer()
}
//----------------------------------Information ------------------------
function displayInformation(index){
    document.body.innerHTML="";
    let sount="<table border='1'  ><h1>Danh Sách người dùng</h1>"
    for (let i = 0 ;i < khachHang.addInfomation[index].length;i++){
        sount+="<tr>"
        sount+="<td style='width: 150px'>"+khachHang.infomation[i]+"</td>";
        sount+="<td style='width: 200px'>"+khachHang.addInfomation[index][i]+"</td>";
        sount+= "</tr>"
    }
    sount+="</table><button type='button' onclick='khachHang.displayInformationCustomer()'>Come Back</button>"
    document.write(sount);
}