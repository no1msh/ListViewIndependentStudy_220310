package com.example.listviewindependencestudy_220310

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.listviewindependencestudy_220310.adapters.CharacterAdapter
import com.example.listviewindependencestudy_220310.datas.CharacterData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mCharacterList = ArrayList<CharacterData>()

    lateinit var mAdapter : CharacterAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setEvent()
        setValue()
    }

    fun setEvent(){
        mainListView.setOnItemClickListener { parent, view, position, id ->

            val ClickedCharacter = mCharacterList[position]

            Toast.makeText(this, "${ClickedCharacter.name} is Clicked", Toast.LENGTH_SHORT).show()
            
        }
    }
    
    fun setValue(){

        mCharacterList.add( CharacterData("Tracer","DPS","UK"))
        mCharacterList.add( CharacterData("Reinhardt","Tank","Germany"))
        mCharacterList.add( CharacterData("Lucio","Support","Brazil"))
        mCharacterList.add( CharacterData("Soldier76","DPS","USA"))
        mCharacterList.add( CharacterData("D.Va","Tank","South Korea"))
        mCharacterList.add( CharacterData("Mercy","Support","Swiss"))
        mCharacterList.add( CharacterData("Zenyatta","Support","Nepal"))
        mCharacterList.add( CharacterData("Brigitte","Support","Sweden"))
        mCharacterList.add( CharacterData("Cassidy","DPS","USA"))
        mCharacterList.add( CharacterData("Genzi","DPS","Japan"))

        mAdapter = CharacterAdapter(this, R.layout.characters_list_item , mCharacterList)

        mainListView.adapter = mAdapter

    }

}