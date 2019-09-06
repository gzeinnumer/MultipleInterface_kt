package com.gzeinnumer.multipleinterfacekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val obj = C()

        obj.call()
        obj.callMe()
    }
}

class C:A,B{
    override fun call() {
        super<A>.call()
        super<B>.call()
    }

    override fun callMe() {
        super<A>.callMe()
        super<B>.callMe()
    }

}

interface A{
    fun callMe(){
        println("A")
    }
    fun call(){
        println("Call A")
    }
}

interface B{
    fun callMe(){
        println("B")
    }
    fun call(){
        println("Call B")
    }
}


