package jp.techacademy.taiyu.ui

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)

        }

    override fun OnClick(v:View){
        if (v.id == R.id.button1){
            textView.text = editText.text.toString()
        } else if(v.id == R.id.button2){
            showAlertDialog()
        }
    }



}