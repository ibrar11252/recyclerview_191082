package com.muhammadibrar.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import Adapters.RecipeAdapter;
import Classes.RecyclerItemClickListener;
import Models.RecipeModel;

public class MainActivity extends AppCompatActivity {

    //using recycler view
    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    recyclerView=findViewById(R.id.recyclerView);
        ArrayList<RecipeModel> list=new ArrayList<>();

        list.add(new RecipeModel(R.drawable.food1,"burger"));
        list.add(new RecipeModel(R.drawable.food2,"burger"));
        list.add(new RecipeModel(R.drawable.food3,"burger"));
        list.add(new RecipeModel(R.drawable.food4,"burger"));
        list.add(new RecipeModel(R.drawable.food5,"burger"));
        list.add(new RecipeModel(R.drawable.food6,"burger"));
        list.add(new RecipeModel(R.drawable.food7,"burger"));
        list.add(new RecipeModel(R.drawable.food8,"burger"));
        list.add(new RecipeModel(R.drawable.food9,"burger"));


        RecipeAdapter adapter=new RecipeAdapter(list ,this);
        recyclerView.setAdapter(adapter);
//agr nechai horizontl scroll krwana


//        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
//
//        recyclerView.setLayoutManager(layoutManager);

       //agr right side mai scroll krwana

//        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//
//
//        recyclerView.setLayoutManager(layoutManager);



        //grid layout

//        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
//
//        recyclerView.setLayoutManager(gridLayoutManager);
     //   GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        //recyclerView.setLayoutManager(gridLayoutManager);


        StaggeredGridLayoutManager staggered=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(staggered);



        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener<Object>(

                this,recyclerView,new RecyclerItemClickListener.OnItemClickListener(){


            @Override
            public void onItemClick(View view, int position) {

                switch(position){
                    case 0:


                        Intent intent=new Inten(MainActivity.this,ScrollingActivity.this);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + position);
                }


            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }

        ));










    }
}