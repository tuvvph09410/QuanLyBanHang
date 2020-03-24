﻿create database QuanLiBanHangMyPham
go
use QuanLiBanHangMyPham
go

create table NguoiDung (
	username nvarchar(20) not null,
	matKhau nvarchar(200),
	SDT nvarchar(11),
	email  nvarchar(50),
	ghiChu nvarchar(500),
	constraint PK_NguoiDung primary key (username) 
)
create table SanPham (
	maSP nvarchar(20) not null,
	tenSP nvarchar(150),
	thuongHieu nvarchar(150),
	NSX  date,
	HSD date,
	giaNhap float,
	sale float,
	giaBan float,
	soLuong int,
	moTa nvarchar(500),
	constraint PK_SanPham primary key (maSP) 
)
create table KhachHangMua (
	maKH nvarchar(20) not null,
	tenKH nvarchar(200),
	SDT nvarchar(11),
	email  nvarchar(50),
	ghiChuKH  nvarchar(200),
	constraint PK_KhachHang primary key (maKH) 
)
create table HoaDon (
	maHD nvarchar(20) not null,
	tenHD nvarchar(200),
	maKH nvarchar(20) not null,
	maSP nvarchar(20) not null,
	username nvarchar(20) not null,
	ngay date,
	tongTien float,
	shipper nvarchar(40),
	ghiChuHĐ nvarchar(300),
	constraint PK_HoaDon primary key (maHD),
	constraint FK_HoaDon1 foreign key (maKH) references KhachHangMua(maKH),
	constraint FK_HoaDon2 foreign key (maSP) references SanPham(maSP),
	constraint FK_HoaDon3 foreign key (username) references NguoiDung(username)
	)
create table HoaDonChiTiet (
	maHDCT nvarchar(20) not null,
	maHD nvarchar(20) not null,
	donGia float,
	tongSoLuong int,
	sale float,
	daCK float,
	tinhTrangThanhToan nvarchar(100) not null,
	tinhTrangVanChuyen nvarchar(100) not null,
	constraint PK_HoaDonChiTiet primary key (maHDCT),
	constraint FK_HoaDonChiTiet1 foreign key (maHD) references HoaDon(maHD),
)


