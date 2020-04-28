class Customer {
    constructor() {
        this.count=2;
        this.infomation = [
            "Name :", "Số CMND :", "Ngày tháng Năm sinh : ", "Địa Chỉ :", "email :",
            "Thành viên :","Số Lượng người :", "Loại Dịch Vụ :", "Số Ngày Thuê :",
            "Loại Phòng thuê :", "Tổng số tiền phải trả :"
        ];
        this.addInfomation = [["An DuBai (VIP)","212412071","12/01/1994","Quang Ngai","Vipcafe1994@gmail.com","Diamond","1","Villa",999,"Business","499500 $"],["Sinh","212412071","12/01/1994","Quang Ngai","Vipcafe1994@gmail.com","Diamond","1","Villa",999,"Business","499500 $"]];
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
    member(index) {
        while (true) {
            this.addInfomation[index][5] = prompt("vui lòng nhập " + this.infomation[5] + "\n1.Sliver \n2.Gold \n3.Pladinum \n4.Diamond")
            if (this.addInfomation[index][5] === "") {
                alert("vui lòng không để trống")
            } else {
                switch (parseInt(this.addInfomation[index][5])) {
                    case 1 :
                        this.addInfomation[index][5] = "Sliver";
                        return true;
                        break;
                    case 2 :
                        this.addInfomation[index][5] = "Gold";
                        return true;
                        break;
                    case 3 :
                        this.addInfomation[index][5] = "Platinum";
                        return true;
                        break;
                    case 4 :
                        this.addInfomation[index][5] = "Diamond";
                        return true;
                        break;
                    default :
                        alert("Vui lòng nhập theo quy định");
                        return member() ;
                }
            }
        }
    }

    //-------------------------------------nount --------------
    nount(index) {
        while (true) {
            this.addInfomation[index][6] = prompt("vui lòng nhập " + this.infomation[6]||this.addInfomation[index][2] ==null)
            if (this.addInfomation[index][6] === "") {
                alert("vui lòng không để trống")
            } else {
                if(isNaN(this.addInfomation[index][6])){
                    alert("vui lòng nhập số nguyên dương lớn hơn 0")
                    return nount(index);
                }
                else {
                    if(this.addInfomation[index][6] == parseInt(this.addInfomation[index][6])){
                        if(this.addInfomation[index][6]>0){
                            return true ;
                        }
                        else {
                            alert("vui lòng nhập số nguyên dương lớn hơn 0")
                            return nount(index) ;
                        }
                    }
                    else {
                        alert("vui lòng nhập số nguyên dương lớn hơn 0")
                        return nount(index);
                    }
                }
            }
        }
    }
    //---------------------------------------------SERVICE ----------------------------
    service(index) {
        while (true) {
            this.addInfomation[index][7] = prompt("vui lòng nhập " + this.infomation[7] + "\n1.Villa \n2.House \n3.Rom ")
            if (this.addInfomation[index][7] === "") {
                alert("vui lòng không để trống")
            } else {
                switch (parseInt(this.addInfomation[index][7])) {
                    case 1 :
                        this.addInfomation[index][7] = "Villa";
                        return true;
                        break;
                    case 2 :
                        this.addInfomation[index][7] = "House";
                        return true;
                        break;
                    case 3 :
                        this.addInfomation[index][7] = "Rom";
                        return true;
                        break;
                    default :
                        alert("Vui lòng nhập theo quy định");
                        return member(index) ;
                }
            }
        }
    }
//--------------------------------RENDAY ----------------------
    renday(index) {
        while (true) {
            this.addInfomation[index][8] = prompt("vui lòng nhập " + this.infomation[8]||this.addInfomation[index][2] ==null)
            if (this.addInfomation[index][8] === "") {
                alert("vui lòng không để trống")
            } else {
                if(isNaN(this.addInfomation[index][8])){
                    alert("vui lòng nhập số nguyên dương lớn hơn 0")
                    return nount(index);
                }
                else {
                    if(this.addInfomation[index][8] == parseInt(this.addInfomation[index][8])){
                        if(this.addInfomation[index][8]>0){
                            return true ;
                        }
                        else {
                            alert("vui lòng nhập số nguyên dương lớn hơn 0")
                            return nount(index) ;
                        }
                    }
                    else {
                        alert("vui lòng nhập số nguyên dương lớn hơn 0")
                        return nount(index);
                    }
                }
            }
        }
    }
    //------------------------------ROM-----------------------------------
    rom(index) {
        while (true) {
            this.addInfomation[index][9] = prompt("vui lòng nhập " + this.infomation[9] + "\n1.Normal \n2.Vip \n3.Business ")
            if (this.addInfomation[index][9] === ""||this.addInfomation[index][2] ==null) {
                alert("vui lòng không để trống")
            } else {
                switch (parseInt(this.addInfomation[index][9])) {
                    case 1 :
                        this.addInfomation[index][9] = "Normal";
                        return true;
                        break;
                    case 2 :
                        this.addInfomation[index][9] = "Vip";
                        return true;
                        break;
                    case 3 :
                        this.addInfomation[index][9] = "Business";
                        return true;
                        break;
                    default :
                        alert("Vui lòng nhập theo quy định");
                        return rom(index) ;
                }
            }
        }
    }
    //=============BUTTOM THEM NGUOI DUNG =============

    //===================== DISPLAY INFORMATION CUSTOMER =========================
    displayInformationCustomer(){
        document.body.innerHTML="";
        let sount="<table border='1'><h1>Danh Sách người dùng</h1>"
        for (let i = 0 ;i < this.addInfomation.length;i++){
            sount+="<tr>"
            sount+="<td style='width: 200px'>"+this.addInfomation[i][0]+"</td>";
            sount+="<td><button type='button' onclick='displayInformation("+i+")'>Information</td>"
            sount+= "</tr>"
        }
        sount+="</table><button type='button' onclick='displayMainMenu()'>Come Back</button>"
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
            sount+="<td><button type='button' onclick='editInformation("+i+")'>Edit Information</td>"
            sount+= "</tr>"
        }
        sount+="</table><button type='button' onclick='displayMainMenu()'>Come Back</button>"
        document.write(sount);
    }


    //=============DELETE ===================
    deleteInformationCustomer(){
        document.body.innerHTML="";
        let sount="<table border='1'><h1>Danh Sách người dùng</h1>"
        for (let i = 0 ;i < this.addInfomation.length;i++){
            sount+="<tr>"
            sount+="<td style='width: 200px'>"+this.addInfomation[i][0]+"</td>";
            sount+="<td><button type='button' onclick='deleteInformation("+i+")'>Delete</td>"
            sount+= "</tr>"
        }
        sount+="</table><button type='button' onclick='displayMainMenu()'>Come Back</button>"
        document.write(sount);
    }
    //==========================================================================================

    //----------------------------Start -----------------------------------
    moneyPlus(index) {
        let money;
        if(this.addInfomation[index][7] === 'Villa'){
            money = 500 * this.addInfomation[index][8];
        }
        else if(this.addInfomation[index][7] === 'House'){
            money = 300 * this.addInfomation[index][8];
        }
        else if(this.addInfomation[index][7] === 'Rom'){
            money = 100 * this.addInfomation[index][8];
        }
        this.addInfomation[index][10] = parseInt(money) + " $" ;
        alert(this.addInfomation[index][10])
    }
    //==============================================================================
    addNewCustomer(index){
        this.addInfomation[index]= new Array();
        if(this.name(index)==false){
            this.addInfomation.splice(index,1)
            return displayMainMenu();
        }
        else {
            this.cmnd(index);
            this.birthday(index);
            this.address(index);
            this.email(index);
            this.member(index);
            this.nount(index);
            this.service(index);
            this.renday(index);
            this.rom(index);
            this.moneyPlus(index);
            this.count++;
            displayMainMenu();
            alert("Thêm thành công : "+this.addInfomation[index][0])
        }
    }
    addNewCustomerEmployee(index){
        this.addInfomation[index]= new Array();
        if(this.name(index)==false){
            this.addInfomation.splice(index,1)
            return displayMainMenu();
        }
        else {
            this.cmnd(index);
            this.birthday(index);
            this.address(index);
            this.email(index);
            this.member(index);
            this.nount(index);
            this.service(index);
            this.renday(index);
            this.rom(index);
            this.moneyPlus(index);
            this.count++;
            displayMainMenu();
            alert("Thêm thành công : "+this.addInfomation[index][0])
        }
    }
}