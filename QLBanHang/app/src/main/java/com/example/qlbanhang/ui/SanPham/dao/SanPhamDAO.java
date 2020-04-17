package com.example.qlbanhang.ui.SanPham.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.qlbanhang.ui.SanPham.model.SanPham;

import java.util.List;

@Dao
public interface SanPhamDAO {
    @Query("SELECT * FROM SanPham")
    List<SanPham> getAllSanPham();
    @Insert
    long[] insertSanPham(SanPham... sanPham);
    @Update
    int deleteSanPham(SanPham sanPham);
    @Delete
    int updateSanPham(SanPham sanPham);
}
