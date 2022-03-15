package com.example.listviewindependencestudy_220310.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listviewindependencestudy_220310.R
import com.example.listviewindependencestudy_220310.datas.StudentData

class StudentAdapter(
    val mContext : Context,
    resId : Int,
    val mList : ArrayList<StudentData>,
) : ArrayAdapter<StudentData>(mContext,resId,mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if(tempRow == null)
        {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, null)
        }

        val row = tempRow!!

        return row
    }
}