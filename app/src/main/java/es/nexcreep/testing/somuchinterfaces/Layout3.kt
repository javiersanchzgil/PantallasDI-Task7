package es.nexcreep.testing.somuchinterfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class Layout3 : AppCompatActivity() {
    lateinit var stateSpinner: Spinner
    lateinit var positionSpinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout3)

        stateSpinner = findViewById(R.id.state_spinner)
        positionSpinner = findViewById(R.id.position_spinner)

        ArrayAdapter.createFromResource(
            this,
            R.array.civilStates,
            android.R.layout.simple_spinner_item
        ). also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            stateSpinner.adapter = adapter

        }

        ArrayAdapter.createFromResource(
            this,
            R.array.positions,
            android.R.layout.simple_spinner_item
        ). also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            positionSpinner.adapter = adapter

        }

    }
}