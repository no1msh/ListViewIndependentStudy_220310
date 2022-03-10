package com.example.listviewindependencestudy_220310.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
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

        txtName.text = data.name
        txtPosition.text = data.heroPosition
        txtCountry.text = data.country

        return row

    }
}