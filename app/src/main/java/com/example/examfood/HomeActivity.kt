package com.example.examfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    val foodName = arrayOf<String>(
        "Hamburger",
        "Sandwich",
        "Milkshake",
        "Hot dog",
        "Fried Chicken",
        "Pizza",
        "Donuts",
        "Cheeseburger",
        "French fry",
        "Chicken Soap",
        "Muffin"
    )

    val foodDesc = arrayOf<String>(
        "The hamburger is a quintessential American dish that has become popular worldwide.",
        "A sandwich is a versatile and beloved food item consisting various fillings between them.",
        "A milkshake is a delightful indulgence, blending creamy ice cream with milk.",
        "A hot dog is a dish consisting of a grilled, steamed, or boiled sausage served.",
        "Fried chicken, also known as Southern fried chicken, is a dish consisting of chicken pieces.",
        "Pizza (/piːtsə/ PEET-sə, Italian: [pittsa]; Neapolitan: [pittsə]) is an Italian dish.",
        "A doughnut or donut (/doʊnət/) is a type of pastry made from leavened fried dough.",
        "A cheeseburger is a hamburger with a slice of melted cheese on top of the meat patty.",
        "French fries (North American English), chips (British English and other national varieties)",
        "This comfort food classic is just as flavorful and soul-satisfying as Grandma's chicken soup.",
        "A muffin is an individually portioned baked product."
    )

    val foodLongDes = arrayOf<String>(
        "The hamburger is a quintessential American dish that has become popular worldwide. It typically consists of a grilled or fried patty made from ground beef, placed between two slices of a bun. However, variations abound, with options for vegetarians and those preferring different types of meat.The origin of the hamburger is somewhat disputed, but it's widely believed to have originated in the United States in the late 19th or early 20th century. One popular theory traces its roots back to German immigrants who brought a similar dish called \"Hamburg steak\" to the US, which was essentially seasoned minced beef. Over time, this evolved into what we now recognize as the hamburger.The classic hamburger typically includes additional ingredients such as lettuce, tomato, onion, pickles, and condiments like ketchup, mustard, and mayonnaise. Cheeseburgers, which add a slice of cheese to the basic hamburger, are also extremely popular.Hamburgers have become a symbol of fast food culture, with numerous chains specializing in their production. However, they're also celebrated as gourmet fare in many restaurants, where chefs experiment with high-quality ingredients and creative toppings to elevate the humble hamburger into a culinary delight.Beyond beef, there are also countless variations, including turkey burgers, veggie burgers, and even seafood-based patties. This adaptability has contributed to the hamburger's enduring popularity, making it a staple of casual dining around the world.Over time, this evolved into what we now recognize as the hamburger.The classic hamburger typically includes additional ingredients such as lettuce, tomato, onion, pickles, and condiments like ketchup, mustard, and mayonnaise. Cheeseburgers, which add a slice of cheese to the basic hamburger, are also extremely popular.Hamburgers have become a symbol of fast food culture, with numerous chains specializing in their production. However, they're also celebrated as gourmet fare in many restaurants, where chefs experiment with high-quality ingredients and creative toppings to elevate the humble hamburger into a culinary delight.Beyond beef, there are also countless variations, including turkey burgers, veggie burgers, and even seafood-based patties. This adaptability has contributed to the hamburger's enduring popularity, making it a staple of casual dining around the world.",
        "A sandwich is a versatile and beloved food item consisting of two or more slices of bread with various fillings between them. It's a staple in many cuisines worldwide and comes in countless variations, ranging from simple and classic to elaborate and gourmet.The origin of the sandwich dates back to the 18th century in England, attributed to John Montagu, the 4th Earl of Sandwich. Legend has it that the Earl, a notorious gambler, requested his meat to be served between slices of bread so he could continue playing cards without getting his hands greasy or needing utensils. The concept caught on, and soon, others began ordering \"the same as Sandwich.\"The beauty of the sandwich lies in its versatility. You can fill it with almost anything you like, making it suitable for any meal of the day and catering to a wide range of tastes and dietary preferences. Common fillings include deli meats, cheeses, vegetables, spreads, and condiments, but the possibilities are endless.",
        "A milkshake is a delightful indulgence, blending creamy ice cream with milk and flavorings to create a smooth and satisfying treat. Its simplicity belies its versatility, as it can be customized with a variety of flavors and toppings to suit any palate. Whether it's a classic chocolate or strawberry milkshake, or a creative concoction featuring exotic ingredients, the result is always a creamy, refreshing delight. Served in tall glasses with a straw and topped with whipped cream or other garnishes, a milkshake is not just a beverage but a nostalgic experience that brings joy with every sip. Perfect for cooling down on a hot day or satisfying a sweet craving, the milkshake remains a timeless favorite enjoyed by people of all ages.",
        "A hot dog is a dish consisting of a grilled, steamed, or boiled sausage served in the slit of a partially sliced bun. The term hot dog can refer to the sausage itself. The sausage used is a wiener (Vienna sausage) or a frankfurter (Frankfurter Würstchen, also just called frank). The names of these sausages commonly refer to their assembled dish. Hot dog preparation and condiments vary worldwide. Typical condiments include mustard, ketchup, relish, onions in tomato sauce, and cheese sauce. Other toppings include sauerkraut, diced onions, jalapeños, chili, grated cheese, coleslaw, bacon and olives. Hot dog variants include the corn dog and pigs in a blanket. The hot dog's cultural traditions include the Nathan's Hot Dog Eating Contest and the Oscar Mayer Wienermobile.These types of sausages were culturally imported from Germany and became popular in the United States. It became a working-class street food in the U.S., sold at stands and carts. The hot dog became closely associated with baseball and American culture. Although particularly connected with New York City and its cuisine, the hot dog eventually became ubiquitous throughout the US during the 20th century. Its preparation varies regionally in the country, emerging as an important part of other regional cuisines, including Chicago street cuisine.",
        "Fried chicken, also known as Southern fried chicken, is a dish consisting of chicken pieces that have been coated with seasoned flour or batter and pan-fried, deep fried, pressure fried, or air fried. The breading adds a crisp coating or crust to the exterior of the chicken while retaining juices in the meat. Broiler chickens are most commonly used.The first dish known to have been deep fried was fritters, which were popular in the European Middle Ages. However, the Scottish were the first Europeans to deep fry their chicken in fat. There is an English cookbook from 1736 which mentions fried chicken, the “Dictionarium Domesticum”, by Nathan Bailey. Meanwhile, many West African peoples had traditions of seasoned fried chicken (though battering and cooking the chicken in palm oil).",
        "Pizza (/piːtsə/ PEET-sə, Italian: [pittsa]; Neapolitan: [pittsə]) is an Italian dish consisting of a flat base of leavened wheat-based dough topped with tomato, cheese, and other ingredients, baked at a high temperature, traditionally in a wood-fired oven.The term pizza was first recorded in the year 997 AD, in a Latin manuscript from the southern Italian town of Gaeta, in Lazio, on the border with Campania. Raffaele Esposito is often credited for creating modern pizza in Naples.In 2009, Neapolitan pizza was registered with the European Union as a traditional speciality guaranteed dish. In 2017, the art of making Neapolitan pizza was added to UNESCOs list of intangible cultural heritage.Pizza and its variants are among the most popular foods in the world. Pizza is sold at a variety of restaurants, including pizzerias (pizza specialty restaurants), Mediterranean restaurants, via delivery, and as street food.[8] In Italy, pizza served in a restaurant is presented unsliced, and is eaten with the use of a knife and fork. In casual settings, however, it is typically cut into slices to be eaten while held in the hand. Pizza is also sold in grocery stores in a variety of forms, including frozen or as kits for self-assembly. They are then cooked using a home oven.",
        "A doughnut or donut (/doʊnət/) is a type of pastry made from leavened fried dough. It is popular in many countries and is prepared in various forms as a sweet snack that can be homemade or purchased in bakeries, supermarkets, food stalls, and franchised specialty vendors. Doughnut is the traditional spelling, while donut is the simplified version; the terms are used interchangeably.Doughnuts are usually deep fried from a flour dough, but other types of batters can also be used. Various toppings and flavors are used for different types, such as sugar, chocolate or maple glazing. Doughnuts may also include water, leavening, eggs, milk, sugar, oil, shortening, and natural or artificial flavors.The two most common types are the ring doughnut and the filled doughnut, which is injected with fruit preserves (the jelly doughnut), cream, custard, or other sweet fillings. Small pieces of dough are sometimes cooked as doughnut holes. Once fried, doughnuts may be glazed with a sugar icing, spread with icing or chocolate, or topped with powdered sugar, cinnamon, sprinkles or fruit. Other shapes include balls, flattened spheres, twists, and other forms. Doughnut varieties are also divided into cake (including the old-fashioned) and yeast-risen doughnuts. Doughnuts are often accompanied by coffee or milk. They are sold at doughnut shops, convenience stores, petrol/gas stations, cafes or fast food restaurants.",
        "A cheeseburger is a hamburger with a slice of melted cheese on top of the meat patty, added near the end of the cooking time. Cheeseburgers can include variations in structure, ingredients and composition. As with other hamburgers, a cheeseburger may include various condiments and other toppings such as lettuce, tomato, onion, pickles, bacon, avocado, mushrooms, mayonnaise, ketchup, and mustard.In fast food restaurants across the United States, processed cheese is usually used, although other meltable cheeses are used, such as cheddar, Swiss, mozzarella, blue cheese, or pepper jack. Virtually all restaurants that sell hamburgers also offer cheeseburgers.",
        "French fries (North American English), chips (British English and other national varieties), finger chips (Indian English),[2] french-fried potatoes, or simply fries are batonnet or allumette-cut[3] deep-fried potatoes of disputed origin from Belgium or France. They are prepared by cutting potatoes into even strips, drying them, and frying them, usually in a deep fryer. Pre-cut, blanched, and frozen russet potatoes are widely used, and sometimes baked in a regular or convection oven; air fryers are small convection ovens marketed for frying potatoes.French fries are served hot, either soft or crispy, and are generally eaten as part of lunch or dinner or by themselves as a snack, and they commonly appear on the menus of diners, fast food restaurants, pubs, and bars. They are often salted and may be served with ketchup, vinegar, mayonnaise, tomato sauce, or other sauces. Fries can be topped more heavily, as in the dishes of poutine, loaded fries or chili cheese fries. French fries can be made from sweet potatoes instead of potatoes. A baked variant, oven fries, uses less or no oil.",
        "This comfort food classic is just as flavorful and soul-satisfying as Grandma's chicken soup, but where hers took several hours-or a day-to make, ours takes under an hour. Instead of long-simmered stock, we start with store-bought chicken broth and water but enrich them with stock vegetables and the carcass, bones and meat of a leftover roast chicken.",
        "A muffin is an individually portioned baked product; however, the term can refer to one of two distinct items: a part-raised flatbread (like a crumpet) that is baked and then cooked on a griddle (typically unsweetened), or a (often sweetened) quickbread that is chemically leavened and then baked in a mold. While quickbread \"American\" muffins are often sweetened, there are savory varieties made with ingredients such as corn and cheese, and less sweet varieties like traditional bran muffins. The flatbread \"English\" variety is of British or other European derivation, and dates from at least the early 18th century, while the quickbread originated in North America during the 19th century. Both types are common worldwide today.",
    )

    val foodImage = arrayOf(
        R.drawable.hamburgur,
        R.drawable.sandwise,
        R.drawable.milkshake,
        R.drawable.hotdog,
        R.drawable.chicken,
        R.drawable.pizza,
        R.drawable.donuts,
        R.drawable.chese,
        R.drawable.fry,
        R.drawable.soup,
        R.drawable.muffin,
    )

    lateinit var listView: ListView

    lateinit var profileBtn: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        listView = findViewById(R.id.listView)
        profileBtn = findViewById(R.id.profileBtn)

        val foodListAdapter = ListAdapter(this,foodName, foodDesc, foodImage)

        listView.adapter = foodListAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this@HomeActivity, DetailsActivity::class.java)
            intent.putExtra("name", foodName[position])
            intent.putExtra("description", foodDesc[position])
            intent.putExtra("longdescription", foodLongDes[position])
            intent.putExtra("image", foodImage[position])
            startActivity(intent)
        }
        profileBtn.setOnClickListener {
            startActivity(Intent(this@HomeActivity, ProfileActivity::class.java))
        }
    }
}