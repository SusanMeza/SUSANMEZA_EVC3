package pe.idat.ec3.susan.susanmeza_evc3.model

data class Product(
    val name: String,
    val price: Double,
    val priceSale: Double,
    val store: String,
    val isFavorite: Boolean,
    val brand: String,
    val imgUrl: String =""
)
fun getData(): List<Product> = listOf(
    Product("Polo cuello V", 59.99, 39.99, "Tommy", true, "Tommy","https://falabella.scene7.com/is/image/FalabellaPE/114098923_1?wid=800&hei=800&qlt=70"),
    Product("Polo camisero", 49.99, 29.99, "Tommy", true, "Tommy"),
    Product("Polo basico", 69.99, 45.99, "Tommy", false, "Tommy"),
    Product("Polo tortuga", 49.99, 23.99, "Tommy", false, "Tommy"),
    Product("Polo largo", 79.99, 29.99, "Tommy", false, "Tommy"),
    Product("Polo sin mangas", 19.99, 21.99, "Tommy", false, "Tommy"),
)
