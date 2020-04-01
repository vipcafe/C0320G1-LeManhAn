function TinhTrungBinh() {
    let toan= parseInt(prompt("Nhap diem toan"));
    let ly = parseInt(prompt("nhap diem ly"));
    let hoa = parseInt(prompt("nhap diem hoa"));

    if ((toan > 0) && (ly > 0) && (hoa > 0) ){
        let trungbinh = parseInt((toan + ly + hoa) / 3);

        alert("Toan : " + toan + "\nLy : " + ly + "\nHoa : " + hoa + "\ndiem trung binh :" + trungbinh);
    }
    else {
        alert("Vui Long Nhap Diem Lon Hon 0");
    }
}