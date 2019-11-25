package com.example.alatmusiktradisional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var rvInstrument: RecyclerView
    private var list: ArrayList<Instrument> = arrayListOf()
    private var title: String = "List Instrument Traditional"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setActionBarTitle(title)

        rvInstrument = findViewById(R.id.rv_instrument)
        rvInstrument.setHasFixedSize(true)

        list.addAll(instrumentsData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.manu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerList()
            }

            R.id.action_about -> {
                showAboutMe()
            }
        }
        setActionBarTitle(title)
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

    private fun showRecyclerList() {
        rvInstrument.layoutManager = LinearLayoutManager(this)

        val listInstrumentAdapter = ListInstrumentAdapter(list)
        rvInstrument.adapter = listInstrumentAdapter

        listInstrumentAdapter.setOnItemClickCallback(object :
            ListInstrumentAdapter.OnItemClickListener {
            override fun onItemClicked(data: Instrument) {
                showSelectedInstrument(data)
            }
        })
    }

    private fun showAboutMe() {
        val about = Intent (this@MainActivity, AboutActivity::class.java)

        startActivity(about)
    }

    private fun showSelectedInstrument(instrument: Instrument) {
        val moveDetailInstrument = Intent(this@MainActivity, DetailActivity::class.java)

        moveDetailInstrument.putExtra(DetailActivity.Extra_Name, instrument.name)
        moveDetailInstrument.putExtra(DetailActivity.Extra_Detail, instrument.detail)
        moveDetailInstrument.putExtra(DetailActivity.Extra_photo, instrument.photo)

        startActivity(moveDetailInstrument)
    }

}
