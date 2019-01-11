package com.example.admin.myprofile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.admin.myprofile.R.layout.activity_edu
import com.example.admin.myprofile.R.layout.activity_work

class MainActivity : AppCompatActivity() {
    var photo:ImageView?=null
    var eduButton:Button?=null
    var workButton:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen)
        photo=findViewById(R.id.profilephoto)
        photo?.setOnClickListener({
            var clickIntent= Intent(this@MainActivity,ProfilePhoto::class.java)
            startActivity(clickIntent)
        })
        eduButton=findViewById(R.id.edbutton)
        eduButton?.setOnClickListener({
            var click=Intent(this@MainActivity,Edu::class.java)
            startActivity(click)
        })

        workButton=findViewById(R.id.wrkbutton)
        workButton?.setOnClickListener({
            var clickli=Intent(this@MainActivity,work::class.java)
            startActivity(clickli)
        })
    }
}
