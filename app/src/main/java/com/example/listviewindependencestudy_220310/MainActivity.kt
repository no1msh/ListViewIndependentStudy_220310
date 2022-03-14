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

        mCharacterList.add( CharacterData("Tracer","DPS","UK","https://w.namu.la/s/73402c4f983d9d9615e819feb216b505701d87c96e6129d16ac9d79320d386c06effe0af35e01f66b57a5b39b3bda4d6b636aa0c87d002d2274fe4abd6377ea3c62fc31b2cecc1da8b2ee64cc63d8bd7dceb6563c0eb87b3db51ccbdb437f715"))
        mCharacterList.add( CharacterData("Reinhardt","Tank","Germany","https://ww.namu.la/s/380ce1fa03fdfecdc2c7d1dcdb7b52d4cdaa7b31990cc6aa7b3d57d040bba02dbaec47d2ab3b56ee512371485eb5d7a737f08436632cfded0ca0d97e65b42e91fb6d6fc392db1efece8abffbfdf1acfcd731c22df0266f9c3344a4339b666553"))
        mCharacterList.add( CharacterData("Lucio","Support","Brazil","https://ww.namu.la/s/f21b316472a17fbf6c1d6a27a6e0bff0822e67a210abbc2dd54f786bcf9513f41bde5ba394f3b6ef3c2fb0b6dd58b6d4b3341d49078134d4573ac1658eda44879151a34de6d4677fe65426167a338a8d29b9efa5beb0c3459d8fb2ceef9b3189"))
        mCharacterList.add( CharacterData("Soldier76","DPS","USA","https://w.namu.la/s/5fcdffbaa08985ca0d4d7553ac2ace41fceabea06a39c2fe140f37026e047d0abcfd6bdd2ed5db45d3005bf5db763b287e11e3adab030f2940c443f58748342cbc52d61a276170218dbb0e8077ce64dde0fa78293c00e1e6db43383e7e0af5c1"))
        mCharacterList.add( CharacterData("D.Va","Tank","South Korea","https://ww.namu.la/s/a2a266135124f01546791bcad788413f3a24517638cd9aa5f8f04759c572817906f41b1c4852034dffea6a0f1268d8df3c227e584020373a37576bb200a0336eae6ae578e8e794684ced0b757b114c2ba7a43aa0cf98c8e97251252c0bb98070"))
        mCharacterList.add( CharacterData("Mercy","Support","Swiss","https://ww.namu.la/s/bb55bbf661f3a54079198f71a3adc907451e9e8dc034e30e3ec45c04de8880f5ee348ca5d54cbcc5e094bde41c73434d91d489b1f3859461c2bf86c6492985d98a7156635231558754bb71cdbfbcde18841ed528724a6ef90c097fdef434330e"))
        mCharacterList.add( CharacterData("Zenyatta","Support","Nepal","https://w.namu.la/s/da619efb1fc53103269fef669e6acaaf768b72819b5d0a070b1101f275fe2a268921223b2b05878784d18cfe6c9c37b2d0022a14fccb196a90b257edbdcd659958f6a669f65d0a821ee67d3b4a654e16ae2abc96dada486eb49a6228d66d533e"))
        mCharacterList.add( CharacterData("Brigitte","Support","Sweden","https://ww.namu.la/s/f00ba4c6f5bf6b9a93088757ea186e0a7d09b2cbbf403bfc504aecd50fe09a7ddb1a7a99ef5cc6a0566323c509db3f6eafb3187a4f731508635e87c374e04fe78c6d436ad250ef821fd1b96e2822db9228d0bd106aebe0025593d937511aa9a9"))
        mCharacterList.add( CharacterData("Cassidy","DPS","USA","https://ww.namu.la/s/c7c154e848b0b86f3467a7ad478c66c6b8d9fafc99aa8bbe67c6be5b366a8e210e20fe2cfaf34bf97a9bf60287e6fcaa4cc3168bd6b510a66ef55b948428896f339d9cabd08b2a9d1b0e48ce811f4a587fe3e916711df39cb687f045acedd832"))
        mCharacterList.add( CharacterData("Genzi","DPS","Japan","https://w.namu.la/s/4331d710d6bd1d8884e0ee78238e3f94867e38bd1c65f0b4348d71f5b660c178349f6753f2ca2f6d7cd45a4a64f98df729c08e5c2957249cc2c7842c4df22455cb5683c6e7795fd212abfe627e054ea90ae3cd9b52e532a2a486efe0c4c91770"))

        mAdapter = CharacterAdapter(this, R.layout.characters_list_item , mCharacterList)

        mainListView.adapter = mAdapter

    }

}