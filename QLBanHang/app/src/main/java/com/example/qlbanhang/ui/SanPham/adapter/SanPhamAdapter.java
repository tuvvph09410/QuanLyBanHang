package com.example.qlbanhang.ui.SanPham.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.qlbanhang.R;
import com.example.qlbanhang.ui.NguoiDung.NguoiDung;
import com.example.qlbanhang.ui.NguoiDung.NguoiDungAdapter;
import com.example.qlbanhang.ui.SanPham.activity.Database;
import com.example.qlbanhang.ui.SanPham.dao.SanPhamDAO;
import com.example.qlbanhang.ui.SanPham.model.SanPham;


import java.util.List;

public class SanPhamAdapter extends RecyclerView.Adapter<SanPhamAdapter.ViewHolder> {
    List<SanPham> sanPhamList;
    Context context;
    SanPhamDAO sanPhamDAO;
    Database database;

    public SanPhamAdapter(Context context,List<SanPham> sanPhamList){
        this.context=context;
        this.sanPhamList=sanPhamList;
        sanPhamDAO=new SanPhamDAO(){
            @Override
            public List<SanPham> getAllSanPham(){
                return getAllSanPham();
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
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.item_sanpham,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    final SanPham sanPham=sanPhamList.get(position);
    holder.tv_tensp.setText(sanPham.getTenSP());
    holder.tv_giasp.setText(sanPham.getGiaSP());
    holder.tv_thuonghieu.setText(sanPham.getThuongHieu());
    holder.tv_nsxsp.setText(sanPham.getNSX());
    holder.tv_hsdsp.setText(sanPham.getHSD());
    //holder.img_anhsp.setImageBitmap(sanPham.getImgSP());
    holder.img_btndeletesp.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sanPhamList.remove(sanPham);
            sanPhamDAO.deleteSanPham(sanPham);
            notifyDataSetChanged();
        }
    });
    }

    @Override
    public int getItemCount() {
        return sanPhamList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_tensp;
        TextView tv_giasp;
        TextView tv_thuonghieu;
        TextView tv_nsxsp;
        TextView tv_hsdsp;
        ImageView img_btndeletesp;
        ImageView img_anhsp;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_tensp=itemView.findViewById(R.id.tv_tensp);
            tv_giasp=itemView.findViewById(R.id.tv_giasp);
            tv_thuonghieu=itemView.findViewById(R.id.tv_thuonghieu);
            tv_nsxsp=itemView.findViewById(R.id.tv_nsxsp);
            tv_hsdsp=itemView.findViewById(R.id.tv_hsdsp);
            img_btndeletesp=itemView.findViewById(R.id.img_btndeletesp);
            img_anhsp=itemView.findViewById(R.id.img_anhsp);
        }
    }
}
