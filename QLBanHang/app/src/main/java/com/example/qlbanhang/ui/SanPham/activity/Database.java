package com.example.qlbanhang.ui.SanPham.activity;

import androidx.room.RoomDatabase;

import com.example.qlbanhang.ui.SanPham.dao.SanPhamDAO;
import com.example.qlbanhang.ui.SanPham.model.SanPham;

@androidx.room.Database(entities = {SanPham.class},version = 1)
public abstract class Database extends RoomDatabase {
    public abstract SanPhamDAO sanPhamDAO();
}
