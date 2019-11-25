package com.example.alatmusiktradisional

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_move_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val Extra_Name = "extra_name"
        const val Extra_Detail = "extra_detail"
        const val Extra_photo = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_detail)
        title = "Detail"

        val photo = intent.getIntExtra(Extra_photo, 0)

        img_detail.setImageResource(photo)
        tv_name_instrument.text = intent.getStringExtra(Extra_Name)
        tv_detail_instrument.text = intent.getStringExtra(Extra_Detail)

    }

}
