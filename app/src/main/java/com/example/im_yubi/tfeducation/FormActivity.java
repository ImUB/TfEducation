package com.example.im_yubi.tfeducation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

public class FormActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        final int[][] key = {{0,0,0,0,0,0}, {0,0,0,0,0,0}};

        final View Intro = findViewById(R.id.intro);
        Button start_btn = Intro.findViewById(R.id.start_btn);

        final View Menu = findViewById(R.id.menu);
        Button classfication_btn = Menu.findViewById(R.id.btn_classification);
        Button clustering_btn = Menu.findViewById(R.id.btn_clustering);
        Button recommend_btn = Menu.findViewById(R.id.btn_recommend);
        Button remind_btn = Menu.findViewById(R.id.btn_remind);
        Button reduction_btn = Menu.findViewById(R.id.btn_reduction);

        final View Classification = findViewById(R.id.classfication);
        final View Clustering = findViewById(R.id.clustering);
        final View Recommend = findViewById(R.id.recommend);
        final View Remind = findViewById(R.id.remind);
        final View Reduction = findViewById(R.id.reduction);

        final View Usesfiledform = findViewById(R.id.usesfiledform);
        Button preview = Usesfiledform.findViewById(R.id.preview);
        final Button next = Usesfiledform.findViewById(R.id.Next);

        final View Progress = findViewById(R.id.progress);
        Button p_information = findViewById(R.id.p_information);

        final View Contnets = findViewById(R.id.contents);
        Button contents_btn = findViewById(R.id.btn_Contents);
        Button tointro = findViewById(R.id.ToIntro);
        Button tomenu = findViewById(R.id.ToMenu);
        Button toclassfication = findViewById(R.id.ToClassfication);
        Button toclustering = findViewById(R.id.ToClustering);
        Button torecomend = findViewById(R.id.ToRecomend);
        Button toremind = findViewById(R.id.ToRemind);
        Button toreduction =findViewById(R.id.ToReduction);

        final View Serch = findViewById(R.id.serch);
        Button serch_btn = findViewById(R.id.serch_btn);

        final View Main = findViewById(R.id.main);

        Menu.setVisibility(View.GONE);
        Classification.setVisibility(View.GONE);
        Clustering.setVisibility(View.GONE);
        Recommend.setVisibility(View.GONE);
        Remind.setVisibility(View.GONE);
        Reduction.setVisibility(View.GONE);
        Main.setVisibility(View.GONE);
        Usesfiledform.setVisibility(View.GONE);
        Progress.setVisibility(View.GONE);
        Contnets.setVisibility(View.GONE);
        Serch.setVisibility(View.GONE);


        start_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intro.setVisibility(View.GONE);
                Menu.setVisibility(View.VISIBLE);
            }
        });

        classfication_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Menu.setVisibility(View.GONE);
                Classification.setVisibility(View.VISIBLE);
                Usesfiledform.setVisibility(View.VISIBLE);
                key[0][0] = 1;
            }
        });

        clustering_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Menu.setVisibility(View.GONE);
                Clustering.setVisibility(View.VISIBLE);
                Usesfiledform.setVisibility(View.VISIBLE);
                key[0][0] = 1;
            }
        });

        recommend_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Menu.setVisibility(View.GONE);
                Recommend.setVisibility(View.VISIBLE);
                Usesfiledform.setVisibility(View.VISIBLE);
                key[0][0] = 1;
            }
        });

        remind_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Menu.setVisibility(View.GONE);
                Remind.setVisibility(View.VISIBLE);
                Usesfiledform.setVisibility(View.VISIBLE);
                key[0][0] = 1;
            }
        });

        reduction_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Menu.setVisibility(View.GONE);
                Reduction.setVisibility(View.VISIBLE);
                Usesfiledform.setVisibility(View.VISIBLE);
                key[0][0] = 1;
            }
        });

        p_information.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Progress.getVisibility() == View.GONE)
                {
                    Progress.setVisibility(View.VISIBLE);
                }
                else
                {
                    Progress.setVisibility(View.GONE);
                }
            }
        });

        contents_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Contnets.getVisibility() == View.GONE)
                {
                    Contnets.setVisibility(View.VISIBLE);
                }
                else
                {
                    Contnets.setVisibility(View.GONE);
                }
            }
        });

        tointro.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(Intro.getVisibility() == View.VISIBLE)
                {
                    Intro.setVisibility(View.VISIBLE);

                }
                else if(Menu.getVisibility() == View.VISIBLE)
                {
                    Menu.setVisibility(View.GONE);
                    Intro.setVisibility(View.VISIBLE);
                }
                else if(Classification.getVisibility() == View.VISIBLE)
                {
                    Classification.setVisibility(View.GONE);
                    Intro.setVisibility(View.VISIBLE);
                }
                else if(Clustering.getVisibility() == View.VISIBLE)
                {
                    Clustering.setVisibility(View.GONE);
                    Intro.setVisibility(View.VISIBLE);
                }
                else if(Recommend.getVisibility() == View.VISIBLE)
                {
                    Recommend.setVisibility(View.GONE);
                    Intro.setVisibility(View.VISIBLE);
                }
                else if(Remind.getVisibility() == View.VISIBLE)
                {
                    Remind.setVisibility(View.GONE);
                    Intro.setVisibility(View.VISIBLE);
                }
                else if(Reduction.getVisibility() == View.VISIBLE)
                {
                    Reduction.setVisibility(View.GONE);
                    Intro.setVisibility(View.VISIBLE);
                }
                else if(Main.getVisibility() == View.VISIBLE)
                {
                    Main.setVisibility(View.GONE);
                    Intro.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
            }
        });

        tomenu.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(Intro.getVisibility() == View.VISIBLE)
                {
                    Intro.setVisibility(View.GONE);
                    Menu.setVisibility(View.VISIBLE);

                }
                else if(Menu.getVisibility() == View.VISIBLE)
                {
                    Menu.setVisibility(View.VISIBLE);
                }
                else if(Classification.getVisibility() == View.VISIBLE)
                {
                    Classification.setVisibility(View.GONE);
                    Menu.setVisibility(View.VISIBLE);
                }
                else if(Clustering.getVisibility() == View.VISIBLE)
                {
                    Clustering.setVisibility(View.GONE);
                    Menu.setVisibility(View.VISIBLE);
                }
                else if(Recommend.getVisibility() == View.VISIBLE)
                {
                    Recommend.setVisibility(View.GONE);
                    Menu.setVisibility(View.VISIBLE);
                }
                else if(Remind.getVisibility() == View.VISIBLE)
                {
                    Remind.setVisibility(View.GONE);
                    Menu.setVisibility(View.VISIBLE);
                }
                else if(Reduction.getVisibility() == View.VISIBLE)
                {
                    Reduction.setVisibility(View.GONE);
                    Menu.setVisibility(View.VISIBLE);
                }
                else if(Main.getVisibility() == View.VISIBLE)
                {
                    Main.setVisibility(View.GONE);
                    Menu.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }

            }
        });

        toclassfication.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(Intro.getVisibility() == View.VISIBLE)
                {
                    Intro.setVisibility(View.GONE);
                    Classification.setVisibility(View.VISIBLE);
                    Usesfiledform.setVisibility(View.VISIBLE);

                }
                else if(Menu.getVisibility() == View.VISIBLE)
                {
                    Menu.setVisibility(View.GONE);
                    Classification.setVisibility(View.VISIBLE);
                    Usesfiledform.setVisibility(View.VISIBLE);
                }
                else if(Classification.getVisibility() == View.VISIBLE)
                {
                    Classification.setVisibility(View.VISIBLE);
                }
                else if(Clustering.getVisibility() == View.VISIBLE)
                {
                    Clustering.setVisibility(View.GONE);
                    Classification.setVisibility(View.VISIBLE);
                }
                else if(Recommend.getVisibility() == View.VISIBLE)
                {
                    Recommend.setVisibility(View.GONE);
                    Classification.setVisibility(View.VISIBLE);
                }
                else if(Remind.getVisibility() == View.VISIBLE)
                {
                    Remind.setVisibility(View.GONE);
                    Classification.setVisibility(View.VISIBLE);
                }
                else if(Reduction.getVisibility() == View.VISIBLE)
                {
                    Reduction.setVisibility(View.GONE);
                    Classification.setVisibility(View.VISIBLE);
                }
                else if(Main.getVisibility() == View.VISIBLE)
                {
                    Main.setVisibility(View.GONE);
                    Classification.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
                key[0][0] = 1;
            }
        });

        toclustering.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(Intro.getVisibility() == View.VISIBLE)
                {
                    Intro.setVisibility(View.GONE);
                    Clustering.setVisibility(View.VISIBLE);
                    Usesfiledform.setVisibility(View.VISIBLE);

                }
                else if(Menu.getVisibility() == View.VISIBLE)
                {
                    Menu.setVisibility(View.GONE);
                    Clustering.setVisibility(View.VISIBLE);
                    Usesfiledform.setVisibility(View.VISIBLE);
                }
                else if(Classification.getVisibility() == View.VISIBLE)
                {
                    Classification.setVisibility(View.GONE);
                    Clustering.setVisibility(View.VISIBLE);
                }
                else if(Clustering.getVisibility() == View.VISIBLE)
                {
                    Clustering.setVisibility(View.VISIBLE);
                }
                else if(Recommend.getVisibility() == View.VISIBLE)
                {
                    Recommend.setVisibility(View.GONE);
                    Clustering.setVisibility(View.VISIBLE);
                }
                else if(Remind.getVisibility() == View.VISIBLE)
                {
                    Remind.setVisibility(View.GONE);
                    Clustering.setVisibility(View.VISIBLE);
                }
                else if(Reduction.getVisibility() == View.VISIBLE)
                {
                    Reduction.setVisibility(View.GONE);
                    Clustering.setVisibility(View.VISIBLE);
                }
                else if(Main.getVisibility() == View.VISIBLE)
                {
                    Main.setVisibility(View.GONE);
                    Clustering.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
                key[0][0] = 1;
            }
        });

        torecomend.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(Intro.getVisibility() == View.VISIBLE)
                {
                    Intro.setVisibility(View.GONE);
                    Recommend.setVisibility(View.VISIBLE);
                    Usesfiledform.setVisibility(View.VISIBLE);

                }
                else if(Menu.getVisibility() == View.VISIBLE)
                {
                    Menu.setVisibility(View.GONE);
                    Recommend.setVisibility(View.VISIBLE);
                    Usesfiledform.setVisibility(View.VISIBLE);
                }
                else if(Classification.getVisibility() == View.VISIBLE)
                {
                    Classification.setVisibility(View.GONE);
                    Recommend.setVisibility(View.VISIBLE);
                }
                else if(Clustering.getVisibility() == View.VISIBLE)
                {
                    Clustering.setVisibility(View.GONE);
                    Recommend.setVisibility(View.VISIBLE);
                }
                else if(Recommend.getVisibility() == View.VISIBLE)
                {
                    Recommend.setVisibility(View.VISIBLE);
                }
                else if(Remind.getVisibility() == View.VISIBLE)
                {
                    Remind.setVisibility(View.GONE);
                    Recommend.setVisibility(View.VISIBLE);
                }
                else if(Reduction.getVisibility() == View.VISIBLE)
                {
                    Reduction.setVisibility(View.GONE);
                    Recommend.setVisibility(View.VISIBLE);
                }
                else if(Main.getVisibility() == View.VISIBLE)
                {
                    Main.setVisibility(View.GONE);
                    Recommend.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
                key[0][0] = 1;
            }
        });

        toremind.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(Intro.getVisibility() == View.VISIBLE)
                {
                    Intro.setVisibility(View.GONE);
                    Remind.setVisibility(View.VISIBLE);
                    Usesfiledform.setVisibility(View.VISIBLE);

                }
                else if(Menu.getVisibility() == View.VISIBLE)
                {
                    Menu.setVisibility(View.GONE);
                    Remind.setVisibility(View.VISIBLE);
                    Usesfiledform.setVisibility(View.VISIBLE);
                }
                else if(Classification.getVisibility() == View.VISIBLE)
                {
                    Classification.setVisibility(View.GONE);
                    Remind.setVisibility(View.VISIBLE);
                }
                else if(Clustering.getVisibility() == View.VISIBLE)
                {
                    Clustering.setVisibility(View.GONE);
                    Remind.setVisibility(View.VISIBLE);
                }
                else if(Recommend.getVisibility() == View.VISIBLE)
                {
                    Recommend.setVisibility(View.GONE);
                    Remind.setVisibility(View.VISIBLE);
                }
                else if(Remind.getVisibility() == View.VISIBLE)
                {
                    Remind.setVisibility(View.VISIBLE);
                }
                else if(Reduction.getVisibility() == View.VISIBLE)
                {
                    Reduction.setVisibility(View.GONE);
                    Remind.setVisibility(View.VISIBLE);
                }
                else if(Main.getVisibility() == View.VISIBLE)
                {
                    Main.setVisibility(View.GONE);
                    Reduction.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
                key[0][0] = 1;

            }
        });

        toreduction.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {

                if(Intro.getVisibility() == View.VISIBLE)
                {
                    Intro.setVisibility(View.GONE);
                    Reduction.setVisibility(View.VISIBLE);
                    Usesfiledform.setVisibility(View.VISIBLE);

                }
                else if(Menu.getVisibility() == View.VISIBLE)
                {
                    Menu.setVisibility(View.GONE);
                    Reduction.setVisibility(View.VISIBLE);
                    Usesfiledform.setVisibility(View.VISIBLE);
                }
                else if(Classification.getVisibility() == View.VISIBLE)
                {
                    Classification.setVisibility(View.GONE);
                    Reduction.setVisibility(View.VISIBLE);
                }
                else if(Clustering.getVisibility() == View.VISIBLE)
                {
                    Clustering.setVisibility(View.GONE);
                    Reduction.setVisibility(View.VISIBLE);
                }
                else if(Recommend.getVisibility() == View.VISIBLE)
                {
                    Recommend.setVisibility(View.GONE);
                    Reduction.setVisibility(View.VISIBLE);
                }
                else if(Remind.getVisibility() == View.VISIBLE)
                {
                    Remind.setVisibility(View.GONE);
                    Reduction.setVisibility(View.VISIBLE);
                }
                else if(Reduction.getVisibility() == View.VISIBLE)
                {
                    Reduction.setVisibility(View.VISIBLE);
                }
                else if(Main.getVisibility() == View.VISIBLE)
                {
                    Main.setVisibility(View.GONE);
                    Reduction.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
                key[0][0] = 1;
            }
        });


        serch_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Serch.getVisibility() == View.GONE)
                {
                    Serch.setVisibility(View.VISIBLE);
                }
                else
                {
                    Serch.setVisibility(View.GONE);
                }
            }
        });

        preview.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (key[0][0] == 1)
                {
                    if(Classification.getVisibility() == View.VISIBLE)
                    {
                        Classification.setVisibility(View.GONE);
                        Menu.setVisibility(View.VISIBLE);
                    }
                    else if(Clustering.getVisibility() == View.VISIBLE)
                    {
                        Clustering.setVisibility(View.GONE);
                        Menu.setVisibility(View.VISIBLE);
                    }
                    else if(Recommend.getVisibility() == View.VISIBLE)
                    {
                        Recommend.setVisibility(View.GONE);
                        Menu.setVisibility(View.VISIBLE);
                    }
                    else if(Remind.getVisibility() == View.VISIBLE)
                    {
                        Remind.setVisibility(View.GONE);
                        Menu.setVisibility(View.VISIBLE);
                    }
                    else if(Reduction.getVisibility() == View.VISIBLE)
                    {
                        Reduction.setVisibility(View.GONE);
                        Menu.setVisibility(View.VISIBLE);
                    }
                }
                else if (key[1][0] == 1)
                {
                    key[0][0] = 1;
                    key[1][0] = 0;
                    Main.setVisibility(View.GONE);
                    next.setVisibility(View.VISIBLE);
                    if (key[1][1] == 1)
                    {
                        Classification.setVisibility(View.VISIBLE);
                    }
                    else if (key[1][2] == 1)
                    {
                        Clustering.setVisibility(View.VISIBLE);
                    }
                    else if (key[1][3] == 1)
                    {
                        Recommend.setVisibility(View.VISIBLE);
                    }
                    else if (key[1][4] == 1)
                    {
                        Remind.setVisibility(View.VISIBLE);
                    }
                    else if (key[1][5] == 1)
                    {
                        Reduction.setVisibility(View.VISIBLE);
                    }
                }
            }
        });

        next.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(key[0][0] == 1)
                {
                    key[0][0] = 0;
                    key[1][0] = 1;
                    if(Classification.getVisibility() == View.VISIBLE)
                    {
                        Classification.setVisibility(View.GONE);
                        Main.setVisibility(View.VISIBLE);
                        key[1][1] = 1;
                    }
                    else if(Clustering.getVisibility() == View.VISIBLE)
                    {
                        Clustering.setVisibility(View.GONE);
                        Main.setVisibility(View.VISIBLE);
                        key[1][2] = 1;
                    }
                    else if(Recommend.getVisibility() == View.VISIBLE)
                    {
                        Recommend.setVisibility(View.GONE);
                        Main.setVisibility(View.VISIBLE);
                        key[1][3] = 1;
                    }
                    else if(Remind.getVisibility() == View.VISIBLE)
                    {
                        Remind.setVisibility(View.GONE);
                        Main.setVisibility(View.VISIBLE);
                        key[1][4] = 1;
                    }
                    else if(Reduction.getVisibility() == View.VISIBLE)
                    {
                        Reduction.setVisibility(View.GONE);
                        Main.setVisibility(View.VISIBLE);
                        key[1][5] = 1;
                    }
                }
                else if (key[1][0] == 1)
                {
                    next.setVisibility(View.GONE);
                }

            }
        });
        Button buttonOpen = findViewById(R.id.Open);
        buttonOpen.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("RtlHardcoded")
            @Override
            public void onClick(View v) {
                DrawerLayout drawer = findViewById(R.id.drawer);
                if(!drawer.isDrawerOpen(Gravity.LEFT)) {
                    drawer.openDrawer(Gravity.LEFT);
                }
                else
                    drawer.closeDrawer(Gravity.LEFT);
            }
        });





    }
}
