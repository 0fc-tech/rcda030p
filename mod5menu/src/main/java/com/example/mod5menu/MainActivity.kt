package com.example.mod5menu

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //Va créer le menu d'options en haut à droite
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }
    //Est déclenché à chaque clic sur une option
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.itemAdd ->
                Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show()
            R.id.itemEdit ->
                Toast.makeText(this, "Piaf 🐦", Toast.LENGTH_SHORT).show()
            R.id.itemSettings ->
                Toast.makeText(this, "Paramètres", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}