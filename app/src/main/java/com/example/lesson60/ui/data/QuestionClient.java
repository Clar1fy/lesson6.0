package com.example.lesson60.ui.data;


import com.example.lesson60.ui.data.QuestionModel;

import java.util.ArrayList;
import java.util.List;

public class QuestionClient {
    public static ArrayList<QuestionModel> questionList = new ArrayList<>();

    public static List<QuestionModel> getQuestionsList() {
        questionList.add(new QuestionModel("First level", "Who is current Team Spirit carry?(1)", "Yatoro", "TORONTOTOKYO", "Collapse", "Mira", "Miposhka", "Yatoro"));
        questionList.add(new QuestionModel("Second level", "Who is current Team Spirit MID?(2)", "Yatoro", "TORONTOTOKYO", "Collapse", "Mira", "Miposhka", "TORONTOTOKYO"));
        questionList.add(new QuestionModel("Third level", "Who is current Team Spirit offlaner?(3)", "Yatoro", "TORONTOTOKYO", "Collapse", "Mira", "Miposhka", "Collapse"));
        questionList.add(new QuestionModel("Fourth level", "Who is current Team Spirit soft support?(4)", "Yatoro", "TORONTOTOKYO", "Collapse", "Mira", "Miposhka", "Mira"));
        questionList.add(new QuestionModel("Fifth level", "Who is current Team Spirit  hard support and captain?(5)", "Yatoro", "TORONTOTOKYO", "Collapse", "Mira", "Miposhka", "Miposhka"));
        questionList.add(new QuestionModel("Sixth level", "Who is current Team Spirit coach?", "Ceb", "Artstyle", "Silent", "Dendi", "XBOCT", "Silent"));
        questionList.add(new QuestionModel("Seventh level", "Which TI did Team Spirit win?", "TI8", "TI9", "TI1", "TI6", "TI10", "TI10"));
        questionList.add(new QuestionModel("Eighth level", "Which did Team Spirit finish in Dota PIT Season 5?", "1", "2", "3", "4", "5", "2"));
        questionList.add(new QuestionModel("Ninth level", "Where is Team Spirit from?", "Europe", "North America", "South America", "Russia", "Ukraine", "Russia"));
        questionList.add(new QuestionModel("Tenth level", "Who did Team Spirit beat in TI10 Grand Final?", "OG", "Na'Vi", "PSG.LGD", "Team Liquid", "Virtus Pro", "PSG.LGD"));


        return questionList;
    }
}
