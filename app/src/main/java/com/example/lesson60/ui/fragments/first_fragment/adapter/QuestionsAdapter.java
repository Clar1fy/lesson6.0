package com.example.lesson60.ui.fragments.first_fragment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.lesson60.databinding.QuestionHolderBinding;
import com.example.lesson60.ui.data.QuestionModel;
import com.example.lesson60.ui.interfaces.ItemOnClickListener;


import java.util.ArrayList;

public class QuestionsAdapter extends RecyclerView.Adapter<QuestionsAdapter.HolderQuestion> {
    ArrayList<QuestionModel> list = new ArrayList<>();
    ItemOnClickListener itemOnClickListener;


    public QuestionsAdapter(ArrayList<QuestionModel> list) {
        this.list = list;

    }


    public void setItemOnClickListener(ItemOnClickListener itemOnClickListener) {
        this.itemOnClickListener = itemOnClickListener;
    }


    @NonNull
    @Override
    public QuestionsAdapter.HolderQuestion onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HolderQuestion(QuestionHolderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HolderQuestion holder, int position) {
        holder.onBind(list.get(position));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HolderQuestion extends RecyclerView.ViewHolder {
        QuestionHolderBinding binding;


        public HolderQuestion(@NonNull QuestionHolderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }


        public void onBind(QuestionModel questionModel) {
            binding.tvText.setText(questionModel.getLevel());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemOnClickListener.onItemClick(questionModel);

                }
            });
        }
    }
}
