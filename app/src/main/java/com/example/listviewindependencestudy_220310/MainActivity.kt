package com.example.listviewindependencestudy_220310

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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

            val clickedCharacter = mCharacterList[position]

            Toast.makeText(this, "${clickedCharacter.name} is Clicked", Toast.LENGTH_SHORT).show()
            
        }

        mainListView.setOnItemLongClickListener { parent, view, position, id ->

            val longClickedCharacter = mCharacterList[position]

            val alert = AlertDialog.Builder(this)
                .setTitle("캐릭터 삭제")
                .setMessage("정말 캐릭터를 삭제할까요?")
                .setPositiveButton("네",DialogInterface.OnClickListener { dialog, which ->

                    mCharacterList.remove(longClickedCharacter)

                    mAdapter.notifyDataSetChanged()
                })
                .setNegativeButton("아니요",null)
                .show()

            return@setOnItemLongClickListener true
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