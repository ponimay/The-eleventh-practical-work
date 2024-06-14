package ru.btpitMedia.menuschka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val textView: TextView = findViewById(R.id.text)
        val constraintLayout: ConstraintLayout = findViewById(R.id.constrainLayout)
        when (item.itemId) {
            R.id.action_settings -> {
                constraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                textView.text = "Settings"
                Toast.makeText(this, "u put settings", Toast.LENGTH_SHORT).show()
            }

            R.id.action1 -> {
                constraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                textView.text = "First page"
                Toast.makeText(this, "u put first page", Toast.LENGTH_SHORT).show()
            }

            R.id.action2 -> {
                constraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.blue))
                textView.text = "Second page"
                Toast.makeText(this, "u put second page", Toast.LENGTH_SHORT).show()
            }

            R.id.action3 -> {
                constraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.orange))
                textView.text = "Third page"
                Toast.makeText(this, "u put third page", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.nav_menu, menu)
        return true
    }
}