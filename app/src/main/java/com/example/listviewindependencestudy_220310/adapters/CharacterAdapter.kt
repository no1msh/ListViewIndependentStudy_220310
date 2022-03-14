package com.example.listviewindependencestudy_220310.adapters

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.listviewindependencestudy_220310.R
import com.example.listviewindependencestudy_220310.datas.CharacterData

class CharacterAdapter(

    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<CharacterData>
) : ArrayAdapter<CharacterData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.characters_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]

        val txtName = row.findViewById<TextView>(R.id.txtName)
        val txtPosition = row.findViewById<TextView>(R.id.txtPosition)
        val txtCountry = row.findViewById<TextView>(R.id.txtCountry)
        val imgHeroFace = row.findViewById<ImageView>(R.id.imgHeroFace)

        txtName.text = data.name
        txtPosition.text = data.heroPosition

        when {
            data.heroPosition.equals("Tank") -> {
                txtPosition.setTextColor(Color.parseColor("#195190"))
            }
            data.heroPosition.equals("DPS") -> {
                txtPosition.setTextColor(Color.parseColor("#A4193D"))

            }
            else -> { // "Support"
                txtPosition.setTextColor(Color.parseColor("#2C5F2D"))
            }
        }

        txtCountry.text = data.country
        Glide.with(mContext).load(data.imgUrl).into(imgHeroFace)

        return row

    }
}