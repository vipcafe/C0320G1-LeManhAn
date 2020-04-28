class employee {
    constructor() {
        this.count=2;
        this.infomation = [
            "Name :", "Số CMND :", "Ngày tháng Năm sinh : ", "Địa Chỉ :", "email :",
            "Số điện Thoại :","Chức vụ :", "Mức Lương :"
        ];
        this.addInfomation = [["An BOSS (VIP)","212412071","12/01/1994","Quang Ngai","Vipcafe1994@gmail.com","0886622577","Chúa tể hội đồng Quản trị",9999],["Sinh","212412071","12/01/1994","Quang Ngai","Vipcafe1994@gmail.com","0886622577","Marketing","999 $"]];
    }

    //================================================ADD NEW CUSTOMER ====================================================

    //-------------------------Name ---------------------------------------
    name(index) {
        this.addInfomation[index][0]=prompt("vui lòng nhập : "+this.infomation[0])
        if(this.addInfomation[index][0] === ""){
            alert("vui lòng không để trống")
            return name();
        }
        else if(this.addInfomation[index][0] ==null){
            return false ;
        }
        else {
            while (true){
                let name = "" ;
                this.addInfomation[index][0]=this.addInfomation[index][0].trim().toLowerCase();
                for(let i=0 ; i < this.addInfomation[index][0].length ; i++){
                    if(this.addInfomation[index][0].charAt(i) === " " && this.addInfomation[index][0].charAt(i+1)===" "){
                        continue ;
                    }
                    if(i===0 || this.addInfomation[index][0].charAt(i-1) === " ") {
                        name += this.addInfomation[index][0].charAt(i).toUpperCase();
                        continue;
                    }
                    name+= this.addInfomation[index][0].charAt(i);
                }
                this.addInfomation[index][0]=name ;
                return true ;
            }
        }
    }
    //--------------------------Check CMND ---------------------------------------
    cmnd(index) {
        while (true){
            this.addInfomation[index][1]=prompt("vui lòng nhập : "+this.infomation[1])
            if(this.addInfomation[index][1] === ""){
                alert("vui lòng không để trống")
            }
            else {
                let regexp = /^[0-9]{9}$/
                if(regexp.test(this.addInfomation[index][1])){
                    return true
                }
                else {
                    alert("vui Lòng nhập cmnd gồm 9 ký tự là số")
                }
            }
        }

    }
    //---------------------BIRTHDAY --------------------------------------------------
    birthday(index) {
        while (true) {
            this.addInfomation[index][2] = prompt("vui lòng nhập : " + this.infomation[2])
            if (this.addInfomation[index][2] === ""||this.addInfomation[index][2] ==null) {
                alert("vui lòng không để trống")
            } else {
                if (this.addInfomation[index][2].charAt(2) === "/" && this.addInfomation[index][2].charAt(5) === "/") {
                    let day = this.addInfomation[index][2].substring(0, 2);
                    let month = this.addInfomation[index][2].substring(3, 5);
                    let year = this.addInfomation[index][2].substring(6, 10);
                    if ((day != parseFloat(day)) || (month != parseFloat(month)) || (year != parseFloat(year))) {
                        alert(" vui long nhap birthday theo dinh dang dd/mm/yyyy");
                        return birthday(index)
                    }
                    if (year < 1951) {
                        alert(" vui long nhap birthday theo dinh dang dd/mm/yyyy");
                        return birthday(index)
                    } else {
                        return true;
                    }
                } else {
                    alert(" vui long nhap birthday theo dinh dang dd/mm/yyyy");
                    return birthday(index)
                }
            }
        }
    }
    //---------------------------------ADDRESS ----------------------------
    address(index) {
        while (true) {
            this.addInfomation[index][3] = prompt("vui lòng nhập " + this.infomation[3]||this.addInfomation[index][2] ==null)
            if (this.addInfomation[index][3] === "") {
                alert("vui lòng không để trống")
            }
            else {
                return true ;

            }
        }
    }
    //---------------------------------EMAIL ---------------------------
    email(index) {
        while (true) {
            this.addInfomation[index][4] = prompt("vui lòng nhập " + this.infomation[4])
            if (this.addInfomation[index][4] === ""||this.addInfomation[index][2] ==null) {
                alert("vui lòng không để trống")
            } else {
                let regexp = /^[a-zA-Z0-9]+[a-zA-Z0-9_]*@[a-zA-Z-0-9]+([\.[a-zA-Z0-9]+)$/
                if(regexp.test(this.addInfomation[index][4])){
                    return true
                }
                else {
                    alert("vui lòng nhập email theo định dạng : xxxx@xxx.xxx")
                }
            }
        }
    }
    //-------------------------------Menber--------------------------------------
    phoneNumber(index){
        while (true) {
            this.addInfomation[index][5] = prompt("vui lòng nhập " + this.infomation[5])
            if (this.addInfomation[index][5] === ""||this.addInfomation[index][5] ==null) {
                alert("vui lòng không để trống")
            } else {
                let regexp = /^[0]+[0-9]{9,10}$/
                if(regexp.test(this.addInfomation[index][5])){
                    return true
                }
                else {
                    alert("vui lòng nhập email theo định dạng : 0xxxxxxxxx")
                }
            }
        }
    }
    position(index) {
        while (true) {
            this.addInfomation[index][6] = prompt("vui lòng nhập " + this.infomation[6] + "\n1.Marketing \n2.Sale \n3.Manager ")
            if (this.addInfomation[index][5] === "") {
                alert("vui lòng không để trống")
            } else {
                switch (parseInt(this.addInfomation[index][6])) {
                    case 1 :
                        this.addInfomation[index][6] = "Marketing";
                        return true;
                        break;
                    case 2 :
                        this.addInfomation[index][6] = "Sale";
                        return true;
                        break;
                    case 3 :
                        this.addInfomation[index][6] = "Manager";
                        return true;
                        break;
                    default :
                        alert("Vui lòng nhập theo quy định");
                        return member() ;
                }
            }
        }
    }

    //===================== DISPLAY INFORMATION CUSTOMER =========================
    displayInformationCustomer(){
        document.body.innerHTML="";
        let sount="<table border='1'><h1>Danh Sách người dùng</h1>"
        for (let i = 0 ;i < this.addInfomation.length;i++){
            sount+="<tr>"
            sount+="<td style='width: 200px'>"+this.addInfomation[i][0]+"</td>";
            sount+="<td><button type='button' onclick='displayInformationEmployee("+i+")'>Information</td>"
            sount+= "</tr>"
        }
        sount+="</table><button type='button' onclick='displayMainMenuEmployee()'>Come Back</button>"
        document.write(sount);
    }
    //----------------------------------DISPLAY INFORMATION-----------------------

    //====================================== EDIT INFORMATION ====================================

    editInformationCustomer(){
        document.body.innerHTML="";
        let sount="<table border='1'><h1>Danh Sách người dùng</h1>"
        for (let i = 0 ;i < this.addInfomation.length;i++){
            sount+="<tr>"
            sount+="<td style='width: 200px'>"+this.addInfomation[i][0]+"</td>";
            sount+="<td><button type='button' onclick='editInformationEmployee("+i+")'>Edit Information</td>"
            sount+= "</tr>"
        }
        sount+="</table><button type='button' onclick='displayMainMenuEmployee()'>Come Back</button>"
        document.write(sount);
    }


    //=============DELETE ===================
    deleteInformationCustomer(){
        document.body.innerHTML="";
        let sount="<table border='1'><h1>Danh Sách người dùng</h1>"
        for (let i = 0 ;i < this.addInfomation.length;i++){
            sount+="<tr>"
            sount+="<td style='width: 200px'>"+this.addInfomation[i][0]+"</td>";
            sount+="<td><button type='button' onclick='deleteInformationEmployee("+i+")'>Delete</td>"
            sount+= "</tr>"
        }
        sount+="</table><button type='button' onclick='displayMainMenuEmployee()'>Come Back</button>"
        document.write(sount);
    }
    //==========================================================================================

    //----------------------------Start -----------------------------------
    displaySalady(){
        document.body.innerHTML="";
        let sount="<table border='1'><h1>Danh Sách người dùng</h1>"
        for (let i = 0 ;i < this.addInfomation.length;i++){
            sount+="<tr>"
            sount+="<td style='width: 200px'>"+this.addInfomation[i][0]+"</td>";
            sount+="<td style='width: 200px'>"+this.addInfomation[i][7]+"</td>";
            sount+= "</tr>"
        }
        sount+="</table><button type='button' onclick='displayMainMenuEmployee()'>Come Back</button>"
        document.write(sount);
    }
    salary(index) {
        let money;
        if(this.addInfomation[index][6] === 'Marketing'){
            money = 500 ;
        }
        else if(this.addInfomation[index][6] === 'Sale'){
            money = 300;
        }
        else if(this.addInfomation[index][6] === 'Manager'){
            money = 200;
        }
        this.addInfomation[index][7] = parseInt(money) + " $" ;
        alert(this.addInfomation[index][7])
    }
    //==============================================================================

    addNewCustomerEmployee(index){
        this.addInfomation[index]= new Array();
        if(this.name(index)==false){
            this.addInfomation.splice(index,1)
            return displayMainMenuEmployee();
        }
        else {
            this.cmnd(index);
            this.birthday(index);
            this.address(index);
            this.email(index);
            this.phoneNumber(index)
            this.position(index);
            this.salary(index)
            this.count++;
            displayMainMenuEmployee();
            alert("Thêm thành công : "+this.addInfomation[index][0])
        }
    }
}