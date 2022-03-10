package com.example.listviewindependencestudy_220310

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewindependencestudy_220310.adapters.CharacterAdapter
import com.example.listviewindependencestudy_220310.datas.CharacterData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val characterList = ArrayList<CharacterData>()

    lateinit var mAdapter : CharacterAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setValue()
    }

    fun setValue(){

        characterList.add( CharacterData("Tracer","DPS","UK"))
        characterList.add( CharacterData("Reinhardt","Tank","Germany"))
        characterList.add( CharacterData("Lucio","Support","Brazil"))
        characterList.add( CharacterData("Soldier","DPS","USA"))
        characterList.add( CharacterData("D.Va","Tank","South Korea"))
        characterList.add( CharacterData("Mercy","Support","Swiss"))
        characterList.add( CharacterData("Zenyatta","Support","Nepal"))
        characterList.add( CharacterData("Brigitte","Support","Sweden"))
        characterList.add( CharacterData("Cassidy","DPS","USA"))
        characterList.add( CharacterData("Genzi","DPS","Japan"))

        mAdapter = CharacterAdapter(this, R.layout.characters_list_item , characterList)

        mainListView.adapter = mAdapter

    }

}