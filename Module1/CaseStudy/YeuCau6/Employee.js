function displayMainMenuEmployee() {

    document.body.innerText = "";
    let sout = "<div style='text-align: center ;'><h1 style='color: red'>MAIN MENU EMPLOYEE </h1>";
    sout+="<button type='button' style='width: 180px ;height: 40px ;color: darkblue ;background: chocolate' onclick='Employee.addNewCustomerEmployee("+Employee.count+")'>ADD NEW EMPLOYEE</button><br>";
    sout+="<button type='button' style='width: 180px ;height: 40px ;color: darkblue ;background: chocolate' onclick='Employee.displayInformationCustomer()'>INFOMATION EMPLOYEE</button><br>";
    sout+="<button type='button' style='width: 180px ;height: 40px ;color: darkblue ;background: chocolate' onclick='Employee.editInformationCustomer()'>EDIT INFOMATION EMPLOYEE</button><br>";
    sout+="<button type='button' style='width: 180px ;height: 40px ;color: darkblue ;background: chocolate' onclick='Employee.deleteInformationCustomer()'>DELETE INFOMATION EMPLOYEE</button><br>";
    sout+="<button type='button' style='width: 180px ;height: 40px ;color: darkblue ;background: chocolate' onclick='Employee.displaySalady()'>SALADY OF EMPLOYEE</button><br>";
    sout+="<button type='button' style='width: 180px ;height: 40px' onclick='displayMainMenu()'>COME BACK</button><br>";

    sout+="<h3 style='color: brown'>Hiện đang có "+Employee.count+" nhân viên</h3>"
    sout+="</div>";
    return document.write(sout)
}
//-------------------------------------------------Delete -----------------------------------
function deleteInformationEmployee(index) {
    if (index == 0) {
        alert(Employee.addInfomation[index][0]+" Là TK VIP Bạn không thể xóa được người này !!")
        Employee.deleteInformationCustomer();
    } else {
        if (confirm("Ban có chắc chắn muốn xóa người này không ?")) {
            Employee.addInfomation.splice(index, 1)
            Employee.deleteInformationCustomer();
            Employee.count = Employee.count - 1;
        }
    }
}
//----------------------------------------------Edit ----------------------------------
function editInformationEmployee(index){
    while(true){
        result ="";
        result = prompt("Nhập cột muốn sửa và nhập '999' để thoát : " +
            "\n1."+Employee.infomation[0]+Employee.addInfomation[index][0]+
            "\n2."+Employee.infomation[1]+Employee.addInfomation[index][1]+
            "\n3."+Employee.infomation[2]+Employee.addInfomation[index][2]+
            "\n4."+Employee.infomation[3]+Employee.addInfomation[index][3]+
            "\n5."+Employee.infomation[4]+Employee.addInfomation[index][4]+
            "\n6."+Employee.infomation[5]+Employee.addInfomation[index][5]+
            "\n7."+Employee.infomation[6]+Employee.addInfomation[index][6])
        result=parseInt(result);
        switch (result) {
            case 1 :
                Employee.name(index);
                break;
            case 2 :
                Employee.cmnd(index);
                break;
            case 3 :
                Employee.birthday(index);
                break;
            case 4 :
                Employee.address(index);
                break;
            case 5 :
                Employee.email(index);
                break;
            case 6 :
                Employee.phoneNumber(index);
                break;
            case 7 :
                Employee.position(index);
                Employee.salary(index);
                break;
            case 999 :
                Employee.editInformationCustomer();
                return true ;
            default :
                return editInformationEmployee(index)
        }
    }

    Employee.displayInformationCustomer()
}
//----------------------------------Information ------------------------
function displayInformationEmployee(index){
    document.body.innerHTML="";
    let sount="<table border='1'  ><h1>Danh Sách người dùng</h1>"
    for (let i = 0 ;i < Employee.addInfomation[index].length;i++){
        sount+="<tr>"
        sount+="<td style='width: 150px'>"+Employee.infomation[i]+"</td>";
        sount+="<td style='width: 200px'>"+Employee.addInfomation[index][i]+"</td>";
        sount+= "</tr>"
    }
    sount+="</table><button type='button' onclick='Employee.displayInformationCustomer()'>Come Back</button>"
    document.write(sount);
}

