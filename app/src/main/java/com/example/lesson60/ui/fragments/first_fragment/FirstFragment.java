package com.example.lesson60.ui.fragments.first_fragment;

import android.animation.Animator;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.lesson60.databinding.FragmentFirstBinding;
import com.example.lesson60.ui.activities.MainActivity;
import com.example.lesson60.ui.data.QuestionModel;


public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;

    QuestionModel questionModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listeners();
        getData();


    }

    private void getData() {
        questionModel = (QuestionModel) getArguments().getSerializable("key");
        binding.tvText.setText(questionModel.getQuiz());
        binding.btn1.setText(questionModel.getFirstAnswer());
        binding.btn2.setText(questionModel.getSecondAnswer());
        binding.btn3.setText(questionModel.getThirdAnswer());
        binding.btn4.setText(questionModel.getFourthAnswer());
        binding.btn5.setText(questionModel.getFifthAnswer());


    }


    private void listeners() {
        binding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = questionModel.getCorrectAnswer();
                if (questionModel.getFirstAnswer() == questionModel.getCorrectAnswer()) {
                    Toast.makeText(getActivity(), "Right", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.BounceIn)
                            .duration(700)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animation) {
                                    binding.btn1.setBackgroundColor(Color.GREEN);

                                }

                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    binding.btn1.setBackgroundColor(Color.rgb(156, 39, 176));

                                }

                                @Override
                                public void onAnimationCancel(Animator animation) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animation) {

                                }
                            })
                            .playOn(binding.btn1);
                } else {
                    Toast.makeText(getActivity(), "Wrong", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.BounceInDown)
                            .duration(700)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animation) {
                                    binding.btn1.setBackgroundColor(Color.RED);

                                }

                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    binding.btn1.setBackgroundColor(Color.rgb(156, 39, 176));

                                }

                                @Override
                                public void onAnimationCancel(Animator animation) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animation) {

                                }
                            })
                            .playOn(binding.btn1);

                }

            }
        });
        binding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (questionModel.getSecondAnswer() == questionModel.getCorrectAnswer()) {
                    Toast.makeText(getActivity(), "Right", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Bounce)
                            .duration(700)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animation) {
                                    binding.btn2.setBackgroundColor(Color.GREEN);

                                }

                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    binding.btn2.setBackgroundColor(Color.rgb(156, 39, 176));

                                }

                                @Override
                                public void onAnimationCancel(Animator animation) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animation) {

                                }
                            })
                            .playOn(binding.btn2);
                } else {
                    Toast.makeText(getActivity(), "Wrong", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.BounceInDown)
                            .duration(700)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animation) {
                                    binding.btn2.setBackgroundColor(Color.RED);

                                }

                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    binding.btn2.setBackgroundColor(Color.rgb(156, 39, 176));

                                }

                                @Override
                                public void onAnimationCancel(Animator animation) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animation) {

                                }
                            })
                            .playOn(binding.btn2);

                }

            }
        });
        binding.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (questionModel.getThirdAnswer() == questionModel.getCorrectAnswer()) {
                    Toast.makeText(getActivity(), "Right", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Bounce)
                            .duration(700)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animation) {
                                    binding.btn3.setBackgroundColor(Color.GREEN);

                                }

                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    binding.btn3.setBackgroundColor(Color.rgb(156, 39, 176));

                                }

                                @Override
                                public void onAnimationCancel(Animator animation) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animation) {

                                }
                            })
                            .playOn(binding.btn3);
                } else {
                    Toast.makeText(getActivity(), "Wrong", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.BounceInDown)
                            .duration(700)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animation) {
                                    binding.btn3.setBackgroundColor(Color.RED);

                                }

                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    binding.btn3.setBackgroundColor(Color.rgb(156, 39, 176));

                                }

                                @Override
                                public void onAnimationCancel(Animator animation) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animation) {

                                }
                            })
                            .playOn(binding.btn3);

                }

            }
        });
        binding.btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (questionModel.getFourthAnswer() == questionModel.getCorrectAnswer()) {
                    Toast.makeText(getActivity(), "Right", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Bounce)
                            .duration(700)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animation) {
                                    binding.btn4.setBackgroundColor(Color.GREEN);

                                }

                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    binding.btn4.setBackgroundColor(Color.rgb(156, 39, 176));

                                }

                                @Override
                                public void onAnimationCancel(Animator animation) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animation) {

                                }
                            })
                            .playOn(binding.btn4);
                } else {
                    Toast.makeText(getActivity(), "Wrong", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.BounceInDown)
                            .duration(700)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animation) {
                                    binding.btn4.setBackgroundColor(Color.RED);

                                }

                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    binding.btn4.setBackgroundColor(Color.rgb(156, 39, 176));

                                }

                                @Override
                                public void onAnimationCancel(Animator animation) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animation) {

                                }
                            })
                            .playOn(binding.btn4);

                }

            }
        });
        binding.btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (questionModel.getFifthAnswer() == questionModel.getCorrectAnswer()) {
                    Toast.makeText(getActivity(), "Right", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Bounce)
                            .duration(700)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animation) {
                                    binding.btn5.setBackgroundColor(Color.GREEN);

                                }

                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    binding.btn5.setBackgroundColor(Color.rgb(156, 39, 176));

                                }

                                @Override
                                public void onAnimationCancel(Animator animation) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animation) {

                                }
                            })
                            .playOn(binding.btn5);
                } else {
                    Toast.makeText(getActivity(), "Wrong", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.BounceInDown)
                            .duration(700)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animation) {
                                    binding.btn5.setBackgroundColor(Color.RED);

                                }

                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    binding.btn5.setBackgroundColor(Color.rgb(156, 39, 176));

                                }

                                @Override
                                public void onAnimationCancel(Animator animation) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animation) {

                                }
                            })
                            .playOn(binding.btn5);

                }

            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}