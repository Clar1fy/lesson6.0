package com.example.lesson60.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lesson60.R;

import com.example.lesson60.ui.data.QuestionClient;
import com.example.lesson60.ui.data.QuestionModel;
import com.example.lesson60.ui.fragments.first_fragment.adapter.QuestionsAdapter;
import com.example.lesson60.databinding.ActivityMainBinding;
import com.example.lesson60.ui.interfaces.ItemOnClickListener;
import com.example.lesson60.ui.fragments.first_fragment.FirstFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    QuestionsAdapter questionsAdapter;
    QuestionModel questionModel;
    ItemOnClickListener itemOnClickListener;
    ArrayList<QuestionModel> questionList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialization();
        listeners();
    }


    private void initialization() {
        questionList = (ArrayList<QuestionModel>) QuestionClient.getQuestionsList();
        questionsAdapter = new QuestionsAdapter(questionList);
        binding.recyclerView.setAdapter(questionsAdapter);

    }

    private void listeners() {
        questionsAdapter.setItemOnClickListener(new ItemOnClickListener() {
            @Override
            public void onItemClick(QuestionModel questionModel) {
                FirstFragment firstFragment = new FirstFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("key", questionModel);
                firstFragment.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment, firstFragment).commit();

            }
        });
    }
}