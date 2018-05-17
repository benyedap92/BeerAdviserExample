package android.hu.p92.com.beeradviser

class BeerExpert {
    fun getBrands(color: String): ArrayList<String> {
        var brands = arrayListOf<String>()
        when (color) {
            "amber" -> {
                brands.add("Jack Amber")
                brands.add("Red Moose")
            }
            "blond" -> {
                brands.add("Trappist Westvleteren Blond")
                brands.add("Crouch Vale Brewers Gold Extra")
                brands.add("Corsendonk Blond")
                brands.add("Delirium Tremens")
            }
            "brown" -> {
                brands.add("Delirium Nocturnum")
                brands.add("Rodenbach")
                brands.add("Aecht Schlenkerla Rauchbier Urbock")
            }
            "dark" -> {
                brands.add("Rogue Farms Dirtoir Black Lager")
                brands.add("Beau's Dark Helmüt")
                brands.add("Moonlight Death and Taxes")
            }

        }
        return brands
    }
}