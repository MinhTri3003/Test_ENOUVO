package com.example.enouvo;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewInfor extends RecyclerView.ViewHolder {
    TextView minimum, maxmum, numOfapproval, approver;
    public ViewInfor(@NonNull View itemView) {
        super(itemView);
        minimum =itemView.findViewById(R.id.MiniNum);
        maxmum =itemView.findViewById(R.id.MaxNum);
        numOfapproval =itemView.findViewById(R.id.NumApp);
        approver =itemView.findViewById(R.id.Approver_text);
    }
}
