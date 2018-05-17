package android.hu.p92.com.beeradviser

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView

class FindBeerActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_beer)
    }

    fun findBeerOnClick(view: View) {//NOTE could be button
        val brands: TextView = findViewById(R.id.brands)
        val color: Spinner = findViewById(R.id.color)
        val beerType: String = color.selectedItem as String

        val beerExpert = BeerExpert()
        val brandsList = beerExpert.getBrands(beerType)
        brands.text=brandsList.joinToString("\n")
    }
}
