-- task 1 ----------
select *
from furamaresort.dichvudikem;
CREATE DATABASE furamaresort;
CREATE TABLE furamaresort.loaikhang
(
    idloaikhachhang INT AUTO_INCREMENT PRIMARY KEY,
    tenloaikhang    VARCHAR(45) NOT NULL
);

CREATE TABLE furamaresort.khachhang
(
    idkhachhang     INT AUTO_INCREMENT PRIMARY KEY,
    idloaikhachhang INT          NOT NULL,
    hoten           varchar(45)  NOT NULL,
    ngaysinh        DATE         NOT NULL,
    socmnd          INT          NOT NULL,
    sdt             INT          NOT NULL,
    email           VARCHAR(45)  NOT NULL,
    diachi          VARCHAR(255) NOT NULL,
    FOREIGN KEY (idloaikhachhang)
        REFERENCES furamaresort.loaikhang (idloaikhachhang)
);

CREATE TABLE furamaresort.loaidichvu
(
    idloaidichvu  INT AUTO_INCREMENT PRIMARY KEY,
    tenloaidichvu VARCHAR(45) NOT NULL
);

CREATE TABLE furamaresort.kieuthue
(
    idkieuthue  INT AUTO_INCREMENT PRIMARY KEY,
    tenkieuthue VARCHAR(45) NOT NULL,
    gia         INT         NOT NULL
);

CREATE TABLE furamaresort.dichvu
(
    iddichvu     INT AUTO_INCREMENT PRIMARY KEY,
    tendichvu    VARCHAR(45) NOT NULL,
    dientich     INT         NOT NULL,
    sotang       INT         NOT NULL,
    songuoitoida VARCHAR(45),
    chiphithue   VARCHAR(45),
    idkieuthue   INT,
    idloaidichvu INT,
    trangthai    VARCHAR(45) NOT NULL,
    FOREIGN KEY (idkieuthue) REFERENCES furamaresort.kieuthue (idkieuthue),
    FOREIGN KEY (idloaidichvu) REFERENCES furamaresort.loaidichvu (idloaidichvu)
);

CREATE TABLE furamaresort.vitri
(
    idvitri  VARCHAR(45) PRIMARY KEY,
    tenvitri VARCHAR(45) NOT NULL
);

CREATE TABLE furamaresort.trinhdo
(
    idtrinhdo INT AUTO_INCREMENT PRIMARY KEY,
    trinhdo   VARCHAR(45) NOT NULL
);

CREATE TABLE furamaresort.bophan
(
    idbophan  INT AUTO_INCREMENT PRIMARY KEY,
    tenbophan VARCHAR(45) NOT NULL
);

CREATE TABLE furamaresort.nhanvien
(
    idnhanvien INT AUTO_INCREMENT PRIMARY KEY,
    hovaten    VARCHAR(45) NOT NULL,
    idvitri    VARCHAR(45),
    idtrinhdo  INT,
    idbophan   INT,
    ngaysinh   DATE        NOT NULL,
    socmnd     INT         NOT NULL,
    luong      VARCHAR(45) NOT NULL,
    sdt        INT         NOT NULL,
    email      VARCHAR(45) NOT NULL,
    diachi     VARCHAR(45) NOT NULL,
    FOREIGN KEY (idtrinhdo) REFERENCES furamaresort.trinhdo (idtrinhdo),
    FOREIGN KEY (idbophan) REFERENCES furamaresort.bophan (idbophan),
    FOREIGN KEY (idvitri) REFERENCES furamaresort.vitri (idvitri)
);

CREATE TABLE furamaresort.dichvudikem
(
    iddichvudikem    INT AUTO_INCREMENT PRIMARY KEY,
    tendichvudikem   VARCHAR(45) NOT NULL,
    gia              INT         NOT NULL,
    donvi            VARCHAR(45) NOT NULL,
    trangthaikhadung VARCHAR(45) NOT NULL
);

CREATE TABLE furamaresort.hopdong
(
    idhopdong      INT AUTO_INCREMENT PRIMARY KEY,
    idnhanvien     INT  NOT NULL,
    idkhachhang    INT  NOT NULL,
    iddichvu       INT  NOT NULL,
    ngaylamhopdong DATE NOT NULL,
    ngaykietthuc   DATE NOT NULL,
    tiendatcoc     INT  NOT NULL,
    tongtien       INT  NOT NULL,
    FOREIGN KEY (idnhanvien) REFERENCES furamaresort.nhanvien (idnhanvien),
    FOREIGN KEY (idkhachhang) REFERENCES furamaresort.khachhang (idkhachhang),
    FOREIGN KEY (iddichvu) REFERENCES furamaresort.dichvu (iddichvu)
);

CREATE TABLE furamaresort.hopdongchitiet
(
    idhopdongchitiet INT AUTO_INCREMENT PRIMARY KEY,
    idhopdong        INT,
    iddichvudikem    INT,
    soluong          INT,
    FOREIGN KEY (idhopdong) REFERENCES furamaresort.hopdong (idhopdong),
    FOREIGN KEY (iddichvudikem) REFERENCES furamaresort.dichvudikem (iddichvudikem)
);
-- TASK 2 --------------------------------------------------------
SELECT *
FROM furamaresort.nhanvien
WHERE hovaten LIKE 'H%'
   OR hovaten LIKE 'T%'
   OR hovaten LIKE 'K%';

-- TASK 3 --------------------------------------------------------
SELECT *, YEAR(CURDATE()) - YEAR(ngaysinh) age
FROM furamaresort.khachhang
WHERE (YEAR(CURDATE()) - YEAR(ngaysinh) BETWEEN 18 AND 50)
    and diachi = 'Đà Nẵng'
   OR diachi = 'Quảng Trị';

-- TASK 4 --------------------------------------------------------

SELECT COUNT(idhopdong) solantaohopdong, khachhang.idkhachhang
FROM furamaresort.hopdong
         INNER JOIN furamaresort.khachhang
                    ON hopdong.idkhachhang = khachhang.idkhachhang
WHERE idloaikhachhang = '8881'
GROUP BY idkhachhang
ORDER BY COUNT(idhopdong) ASC;

-- TASK 5 --------------------------------------------------------
SELECT kh.idkhachhang,
       hoten,
       tenloaikhang,
       hd.idhopdong,
       tendichvu,
       ngaylamhopdong,
       ngaykietthuc,
       SUM(chiphithue + (soluong * gia)) tongsotien
FROM furamaresort.khachhang kh
         LEFT JOIN furamaresort.loaikhang lkh ON kh.idloaikhachhang = lkh.idloaikhachhang
         LEFT JOIN furamaresort.hopdong hd ON kh.idkhachhang = hd.idkhachhang
         LEFT JOIN furamaresort.dichvu dv ON hd.iddichvu = dv.iddichvu
         LEFT JOIN furamaresort.hopdongchitiet hdct ON hd.idhopdong = hdct.idhopdong
         LEFT JOIN furamaresort.dichvudikem dvdk ON hdct.iddichvudikem = dvdk.iddichvudikem
GROUP BY kh.idkhachhang;

-- TASK 6 --------------------------------------------------------
SELECT dv.iddichvu, tendichvu, dientich, chiphithue, tenloaidichvu
FROM furamaresort.dichvu dv
         INNER JOIN furamaresort.loaidichvu ldv ON dv.idloaidichvu = ldv.idloaidichvu
         INNER JOIN furamaresort.hopdong hd ON dv.iddichvu = hd.iddichvu
WHERE idhopdong NOT IN (
    SELECT idhopdong
    FROM furamaresort.hopdong
    WHERE MONTH(ngaylamhopdong) BETWEEN 1 AND 3
      AND YEAR(ngaylamhopdong) = 2019
);

-- TASK 7 --------------------------------------------------------
SELECT dv.iddichvu, tendichvu, dientich, songuoitoida, chiphithue, tenloaidichvu
FROM furamaresort.dichvu dv
         INNER JOIN furamaresort.loaidichvu ldv ON dv.idloaidichvu = ldv.idloaidichvu
         INNER JOIN furamaresort.hopdong hd ON dv.iddichvu = hd.iddichvu
WHERE dv.iddichvu NOT IN (
    SELECT hd.iddichvu
    FROM furamaresort.dichvu dv
             INNER JOIN furamaresort.hopdong hd
    WHERE dv.iddichvu
      and YEAR(ngaylamhopdong) = 2019
    GROUP BY iddichvu
)
  AND year(ngaylamhopdong) = 2018
GROUP BY iddichvu;



-- TASK 8 --------------------------------------------------------

-- cách 1
SELECT hoten
FROM furamaresort.khachhang
GROUP BY hoten;
-- cách 2
SELECT DISTINCT hoten
FROM furamaresort.khachhang;

-- cách 3
SELECT hoten
FROM furamaresort.khachhang
UNION
SELECT hoten
FROM furamaresort.khachhang;

-- cách 4
SELECT hoten
FROM furamaresort.khachhang
WHERE idkhachhang NOT IN (
    SELECT kh.idkhachhang
    FROM furamaresort.khachhang kh
             INNER JOIN furamaresort.khachhang nkh
    WHERE kh.idkhachhang < nkh.idkhachhang
      and kh.hoten = nkh.hoten
);

-- TASK 9 --------------------------------------------------------

SELECT COUNT(idkhachhang)    soluongkhachhang,
       MONTH(ngaylamhopdong) thang,
       year(ngaylamhopdong)  nam,
       SUM(tongtien)         tongtien
FROM furamaresort.hopdong
WHERE YEAR(ngaylamhopdong) = 2019
group by MONTH(ngaylamhopdong)
order by MONTH(ngaylamhopdong) asc;

-- TASK 10 --------------------------------------------------------
SELECT hd.idhopdong, ngaylamhopdong, ngaykietthuc, ngaykietthuc, tiendatcoc, COUNT(idhopdongchitiet)
FROM furamaresort.hopdong hd
         INNER JOIN furamaresort.hopdongchitiet hdct ON hd.idhopdong = hdct.idhopdong
         INNER JOIN furamaresort.dichvudikem dvdk ON hdct.iddichvudikem = dvdk.iddichvudikem
GROUP BY idhopdong;

-- TASK 11 --------------------------------------------------------
SELECT hoten, tendichvudikem
FROM furamaresort.dichvudikem dvdk
         INNER JOIN furamaresort.hopdongchitiet hdct ON dvdk.iddichvudikem = hdct.iddichvudikem
         INNER JOIN furamaresort.hopdong hd ON hdct.idhopdong = hd.idhopdong
         INNER JOIN furamaresort.khachhang kh ON hd.idkhachhang = kh.idkhachhang
         INNER JOIN furamaresort.loaikhang lkh ON kh.idloaikhachhang = lkh.idloaikhachhang
WHERE tenloaikhang = 'Diamond'
  AND (diachi = 'Vinh' OR diachi = 'Quảng Ngãi')
GROUP BY hoten;

-- TASK 12 --------------------------------------------------------


SELECT hd.idhopdong, hovaten, hoten, kh.sdt, tendichvu, sum(soluong) SoLuongDichVuDikem
FROM furamaresort.hopdong hd
         INNER JOIN furamaresort.nhanvien nv ON hd.idnhanvien = nv.idnhanvien
         INNER JOIN furamaresort.khachhang kh ON hd.idkhachhang = kh.idkhachhang
         INNER JOIN furamaresort.dichvu dv ON hd.iddichvu = dv.iddichvu
         INNER JOIN furamaresort.hopdongchitiet hdct ON hd.idhopdong = hdct.idhopdong
GROUP BY hdct.idhopdong;

-- TASK 13 --------------------------------------------------------
SELECT hd.idhopdong, hovaten, hoten, kh.sdt, tendichvu, SUM(soluong) soluongchitiet, ngaylamhopdong
FROM furamaresort.hopdong hd
         INNER JOIN furamaresort.nhanvien nv ON hd.idnhanvien = nv.idnhanvien
         INNER JOIN furamaresort.khachhang kh ON hd.idkhachhang = kh.idkhachhang
         INNER JOIN furamaresort.dichvu dv ON hd.iddichvu = dv.iddichvu
         INNER JOIN furamaresort.hopdongchitiet hdct ON hd.idhopdong = hdct.idhopdong
WHERE tendichvu NOT IN (
    SELECT tendichvu
    FROM furamaresort.hopdong
             INNER JOIN furamaresort.dichvu ON hopdong.iddichvu = dichvu.iddichvu
             INNER JOIN furamaresort.loaidichvu ON dichvu.idloaidichvu = loaidichvu.idloaidichvu
    WHERE (MONTH(ngaylamhopdong) BETWEEN 1 AND 6)
      AND YEAR(ngaylamhopdong) = 2019
    GROUP BY tendichvu
)
GROUP BY hdct.idhopdong;

-- TASK 14 --------------------------------------------------------

SELECT hd.idhopdong, tenloaidichvu, tendichvudikem, COUNT(hdct.iddichvudikem) AS solansudung
FROM furamaresort.hopdong hd
         INNER JOIN furamaresort.dichvu dv ON hd.iddichvu = dv.iddichvu
         INNER JOIN furamaresort.loaidichvu ldv ON dv.idloaidichvu = ldv.idloaidichvu
         INNER JOIN furamaresort.hopdongchitiet hdct ON hd.idhopdong = hdct.idhopdong
         INNER JOIN furamaresort.dichvudikem dvdk ON hdct.iddichvudikem = dvdk.iddichvudikem
GROUP BY hdct.iddichvudikem
HAVING COUNT(hdct.iddichvudikem) = 1;

-- TASK 15 --------------------------------------------------------

SELECT hd.idnhanvien, hovaten, trinhdo, tenbophan, sdt, diachi, COUNT(idhopdong) SLHD2018_2019
FROM furamaresort.nhanvien nv
         INNER JOIN furamaresort.trinhdo td ON nv.idtrinhdo = td.idtrinhdo
         INNER JOIN furamaresort.hopdong hd ON nv.idnhanvien = hd.idnhanvien
         INNER JOIN furamaresort.bophan bp ON nv.idbophan = bp.idbophan
WHERE YEAR(ngaylamhopdong) = 2018
   OR YEAR(ngaylamhopdong) = 2019
GROUP BY hd.idnhanvien
HAVING (COUNT(idhopdong) BETWEEN 1 AND 3);

-- TASK 16 --------------------------------------------------------
SELECT nv.idnhanvien, hovaten, trinhdo, tenbophan, sdt, diachi, COUNT(idhopdong) SLHD2018_2019
FROM furamaresort.nhanvien nv
         LEFT JOIN furamaresort.trinhdo td ON nv.idtrinhdo = td.idtrinhdo
         LEFT JOIN furamaresort.hopdong hd ON nv.idnhanvien = hd.idnhanvien
         LEFT JOIN furamaresort.bophan bp ON nv.idbophan = bp.idbophan
WHERE nv.idnhanvien NOT IN (
    SELECT idnhanvien
    FROM furamaresort.hopdong
    WHERE YEAR(ngaylamhopdong) BETWEEN 2017 AND 2019
)
GROUP BY nv.idnhanvien
HAVING COUNT(idhopdong) = 0;

-- TASK 17 --------------------------------------------------------

UPDATE furamaresort.khachhang
SET idloaikhachhang = 8881
WHERE idloaikhachhang = 8882
  AND idkhachhang IN (
    SELECT idkhachhang
    FROM furamaresort.hopdong
    WHERE YEAR(ngaylamhopdong) = 2019
    GROUP BY idkhachhang
    HAVING SUM(tongtien) >= 10000000);


-- TASK 18 --------------------------------------------------------
-- keyword  SEACH : ON DELETE CASCADE
# //-------------------------------------------------------------------------------

-- TASK 19 --------------------------------------------------------
SET sql_safe_updates = false;
UPDATE furamaresort.dichvudikem
SET gia = gia * 2
WHERE iddichvudikem IN (
    SELECT iddichvudikem
    FROM furamaresort.hopdongchitiet hdtc
             JOIN furamaresort.hopdong hd ON hdtc.idhopdong = hd.idhopdong
    WHERE year(ngaylamhopdong) = 2019
    GROUP BY iddichvudikem
    HAVING SUM(soluong) >= 10
);
SET sql_safe_updates = true;


-- TASK 13 --------------------------------------------------------

