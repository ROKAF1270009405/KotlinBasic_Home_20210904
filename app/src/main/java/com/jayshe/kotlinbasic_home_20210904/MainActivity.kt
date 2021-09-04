package com.jayshe.kotlinbasic_home_20210904

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logBtn.setOnClickListener {

//            이 중괄호 내부의 코드는, logBtn이 클릭될떄마타 실행됨.

            Log.d("메인화면","로그 버튼 눌림")

        }
        
        secondLogBtn.setOnClickListener { 
            
//            두번째 버튼이 눌리면 할 일을 따로 지정
            
            Log.e("메인화면", "두번째 로그 버튼 눌림")
            
        }

    }
}