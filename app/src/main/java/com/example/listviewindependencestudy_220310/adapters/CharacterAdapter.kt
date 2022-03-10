package com.example.listviewindependencestudy_220310.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
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
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.characters_list_item,null)
        }

        val row = tempRow!!



        return row

    }
}