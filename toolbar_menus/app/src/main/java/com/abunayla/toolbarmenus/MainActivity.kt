package com.abunayla.toolbarmenus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.miSync-> Toast.makeText(this, "Syncing", Toast.LENGTH_SHORT).show()
            R.id.miSave-> Toast.makeText(this, "Saving", Toast.LENGTH_SHORT).show()
            R.id.miUpload-> Toast.makeText(this, "Uploading",
                Toast.LENGTH_SHORT).show()
            R.id.miSettings-> Toast.makeText(this, "Settings",
                Toast.LENGTH_SHORT).show()
            R.id.miWebSite-> Toast.makeText(this, "www.AbuNayla.com",
                Toast.LENGTH_SHORT).show()
            R.id.miClose->finish()


        }
        return true
    }
}