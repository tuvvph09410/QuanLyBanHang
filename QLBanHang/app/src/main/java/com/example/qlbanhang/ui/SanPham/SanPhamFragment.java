package com.example.qlbanhang.ui.SanPham;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.room.Room;
import com.example.qlbanhang.R;
import com.example.qlbanhang.ui.SanPham.activity.Database;
import com.example.qlbanhang.ui.SanPham.activity.ThemSanPham;
import com.example.qlbanhang.ui.SanPham.adapter.SanPhamAdapter;
import com.example.qlbanhang.ui.SanPham.dao.SanPhamDAO;
import com.example.qlbanhang.ui.SanPham.model.SanPham;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class SanPhamFragment extends Fragment {
    List<SanPham> sanPhamList;
    SanPhamDAO sanPhamDAO;
    Database database;
    SanPhamAdapter sanPhamAdapter;
    ListView lv_sanPham;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_sanpham, container, false);
        lv_sanPham=root.findViewById(R.id.lv_sanPham);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");
        /*sanPhamDAO=new SanPhamDAO() {
            @Override
            public List<SanPham> getAllSanPham() {
                return null;
            }

            @Override
            public long[] insertSanPham(SanPham... sanPham) {
                return new long[0];
            }

            @Override
            public int deleteSanPham(SanPham sanPham) {
                return 0;
            }

            @Override
            public int updateSanPham(SanPham sanPham) {
                return 0;
            }
        };
        database=Room.databaseBuilder(getActivity().getApplicationContext(),Database.class,"SanPham").allowMainThreadQueries().build();
        sanPhamList=database.sanPhamDAO().getAllSanPham();
        sanPhamAdapter=new SanPhamAdapter(getActivity().getApplicationContext(),sanPhamList);
        lv_sanPham.setAdapter((ListAdapter) sanPhamAdapter);*/
        return root;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.menu_sanpham,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id == R.id.it_searchSp){

        }
        if (id == R.id.it_themSp){
            Intent intent=new Intent(getActivity(), ThemSanPham.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
