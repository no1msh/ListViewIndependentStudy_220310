package com.example.listviewindependencestudy_220310

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.listviewindependencestudy_220310.adapters.StudentAdapter
import com.example.listviewindependencestudy_220310.databinding.ActivityMainBinding
import com.example.listviewindependencestudy_220310.datas.StudentData


class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    lateinit var mAdapter : StudentAdapter

    lateinit var mStudentList : ArrayList<StudentData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        setupEvents()
        setValues()

    }

    fun setupEvents(){

    }

    fun setValues(){

        mStudentList.add(StudentData("muzi",12,"서울특별시 중랑구"))
        mStudentList.add(StudentData("prodo",9,"서울특별시 용산구"))
        mStudentList.add(StudentData("apich",11,"인천광역시 부평구"))
        mStudentList.add(StudentData("Jay-z",13,"부천시 오정구"))
        mStudentList.add(StudentData("rion",11,"서울특별시 구로구"))
        mStudentList.add(StudentData("chunsik",12,"서울특별시 강서구"))
        mStudentList.add(StudentData("jyordy",11,"부천시 원미구"))
        mStudentList.add(StudentData("tube",9,"서울특별시 동대문구"))
        mStudentList.add(StudentData("kero",10,"서울특별시 강남구"))

        mAdapter = StudentAdapter(this, R.layout.student_list_item , mStudentList )
        binding.mainListView.adapter = mAdapter

    }

}