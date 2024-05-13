package com.example.comprension_LyS
import android.content.res.Configuration
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import java.util.*

class MainActivity : AppCompatActivity() {

    private fun changeAppLanguage(languageCode: String) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)
        val configuration = Configuration()
        configuration.locale = locale
        baseContext.resources.updateConfiguration(configuration, baseContext.resources.displayMetrics)

        recreate()
    }

    private fun showAlert(message: String) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Welcome")
        builder.setMessage(message)
        builder.setPositiveButton("OK") { dialog, _ ->
        }
        val dialog = builder.create()
        dialog.show()

        dialog.setCanceledOnTouchOutside(false)
        dialog.setCancelable(false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val borderText = findViewById<TextView>(R.id.border_text)
        borderText.apply {
            text = "textS04E1"

            setTextColor(resources.getColor(android.R.color.white))
            gravity = android.view.Gravity.START

            setBackgroundResource(R.color.purple_500)
        }

        val selectText = findViewById<TextView>(R.id.select_text)
        selectText.apply {
            text = getString(R.string.select_country)
            gravity = android.view.Gravity.CENTER
        }

        val countries = arrayOf("Mexico", "United States", "Canada", "Brazil", "Argentina")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countries)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        val countrySpinner = findViewById<Spinner>(R.id.country_list)
        countrySpinner.adapter = adapter

        val nextButton = findViewById<Button>(R.id.next_button)
        nextButton.apply {
            text = getString(R.string.next)
            setBackgroundResource(R.color.purple_500)
            setTextColor(resources.getColor(android.R.color.white))
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                gravity = android.view.Gravity.CENTER_HORIZONTAL
            }
        }

        countrySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: android.view.View?, position: Int, id: Long) {
                val selectedCountry = parent?.getItemAtPosition(position).toString()

                when (selectedCountry) {
                    "Mexico", "Argentina", "Spain" -> {
                        nextButton.text = getString(R.string.next_spanish)
                        selectText.text = getString(R.string.select_country_spanish)
                    }
                    "Brazil" -> {
                        nextButton.text = getString(R.string.next_portuguese)
                        selectText.text = getString(R.string.select_country_portuguese)
                    }
                    else -> {
                        nextButton.text = getString(R.string.next_english)
                        selectText.text = getString(R.string.select_country_english)
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        nextButton.setOnClickListener {
            val selectedCountry = countrySpinner.selectedItem.toString()
            val languageCode = when (selectedCountry) {
                "Mexico", "Argentina", "Spain" -> "es"
                "Brazil" -> "pt"
                else -> "en"
            }
            changeAppLanguage(languageCode)
            val welcomeMessage = when (languageCode) {
                "es" -> "¡Bienvenido!"
                "pt" -> "Bem-vindo!"
                else -> "Welcome!"
            }
            showAlert(welcomeMessage)
        }
    }


}



