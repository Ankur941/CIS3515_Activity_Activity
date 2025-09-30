package edu.temple.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val message = intent.getStringExtra(MESSAGE_KEY)
        // TODO Step 3: Extract transferred value and use for lyricsDisplayView text size
        with(findViewById<TextView>(R.id.lyricsDisplayTextView)) {

            text = message
        }


    }
}



/*
        findViewById<Button>(R.id.closeButton).setOnClickListener {
            setResult(RESULT_OK), Intent.putExtra(MESSAGE_KEY, message)
            finish()
        }




    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
    }


}*/