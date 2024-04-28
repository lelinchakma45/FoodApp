package com.example.examfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

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
        "Frinze Fry",
        "Chicken Soap",
        "Muffin"
    )

    val foodDesc = arrayOf<String>(
        "The hamburger is a quintessential American dish that has become popular worldwide.",
        "Khondaker Sakib Al-Hassan is a Bangladeshi cricketer and politician",
        "Tamim Iqbal Khan, more popularly known as Tamim Iqbal ",
        "Mohammad Mahmudullah, also known Silent Killer and Riyad",
        "Mashrafe Bin Mortaza, popularly known as the Narail Express ",
        "Mustafizur Rahman is a Bangladeshi international cricketer.",
        "Mustafizur Rahman is a Bangladeshi international cricketer.",
        "Khondaker Sakib Al-Hassan is a Bangladeshi cricketer and politician",
        "Tamim Iqbal Khan, more popularly known as Tamim Iqbal",
        "he hamburger is a quintessential American dish that has become popular worldwide.",
        "he hamburger is a quintessential American dish that has become popular worldwide."
    )

    val foodLongDes = arrayOf<String>(
        "The hamburger is a quintessential American dish that has become popular worldwide. It typically consists of a grilled or fried patty made from ground beef, placed between two slices of a bun. However, variations abound, with options for vegetarians and those preferring different types of meat.The origin of the hamburger is somewhat disputed, but it's widely believed to have originated in the United States in the late 19th or early 20th century. One popular theory traces its roots back to German immigrants who brought a similar dish called \"Hamburg steak\" to the US, which was essentially seasoned minced beef. Over time, this evolved into what we now recognize as the hamburger.The classic hamburger typically includes additional ingredients such as lettuce, tomato, onion, pickles, and condiments like ketchup, mustard, and mayonnaise. Cheeseburgers, which add a slice of cheese to the basic hamburger, are also extremely popular.Hamburgers have become a symbol of fast food culture, with numerous chains specializing in their production. However, they're also celebrated as gourmet fare in many restaurants, where chefs experiment with high-quality ingredients and creative toppings to elevate the humble hamburger into a culinary delight.Beyond beef, there are also countless variations, including turkey burgers, veggie burgers, and even seafood-based patties. This adaptability has contributed to the hamburger's enduring popularity, making it a staple of casual dining around the world.Over time, this evolved into what we now recognize as the hamburger.The classic hamburger typically includes additional ingredients such as lettuce, tomato, onion, pickles, and condiments like ketchup, mustard, and mayonnaise. Cheeseburgers, which add a slice of cheese to the basic hamburger, are also extremely popular.Hamburgers have become a symbol of fast food culture, with numerous chains specializing in their production. However, they're also celebrated as gourmet fare in many restaurants, where chefs experiment with high-quality ingredients and creative toppings to elevate the humble hamburger into a culinary delight.Beyond beef, there are also countless variations, including turkey burgers, veggie burgers, and even seafood-based patties. This adaptability has contributed to the hamburger's enduring popularity, making it a staple of casual dining around the world.",
        "lndia, South Africa, and England.Records and Achievements:He is Bangladesh's leading run-scorer and wicket-taker in Test matches, One Day Internationals (ODIs), and Twenty20 Internationals (T20Is).Shakib has numerous records to his name, including being the fastest cricketer to reach 5,000 runs and 200 wickets in ODIs.He has won several prestigious awards, including the ICC Player of the Year awards and numerous Bangladesh Cricket Board (BCB) awards.Controversies:Shakib has faced some controversies throughout his career, including disciplinary issues and conflicts with cricket authorities. In 2019, he was banned for a year (with one year suspended) for failing to report corrupt approaches.Off-field Activities:Apart from cricket, Shakib is involved in various philanthropic activities. He has supported numerous charitable causes in Bangladesh.He also actively engages with fans through social media platforms, providing insights into his personal life and cricketing journey.Overall, Shakib Al Hasan is regarded as one of the greatest cricketers to have emerged from Bangladesh and continues to be a key figure in the country's cricketing landscape.",
        "Tamim Iqbal Khan, more popularly known as Tamim Iqbal, is a Bangladeshi cricketer from Chittagong who was captain of the national team in ODI matches from 2020 to 2023.",
        "Mohammad Mahmudullah, also known Silent Killer and Riyad, is a Bangladeshi cricketer and former T20I captain. He plays for Dhaka Division and has represented national team in all formats. An all-rounder, he is a lower or middle-order batsman as well as an off spin bowler. He has almost 10,000 runs and 150+ wickets.",
        "Mashrafe Bin Mortaza, popularly known as the Narail Express, is a Bangladeshi politician and former international cricketer who captained in all three formats of the game for the Bangladesh national cricket team and currently serves as a Member of Parliament of Narail-2 district.",
        "Mustafizur Rahman is a Bangladeshi international cricketer. A left-arm medium pacer, he is recognized for his most profilic 'slower cutters' all over the world.",
        "Mustafizur Rahman is a Bangladeshi international cricketer. A left-arm medium pacer, he is recognized for his most profilic 'slower cutters' all over the world.",
        "Mustafizur Rahman is a Bangladeshi international cricketer. A left-arm medium pacer, he is recognized for his most profilic 'slower cutters' all over the world.",
        "Mustafizur Rahman is a Bangladeshi international cricketer. A left-arm medium pacer, he is recognized for his most profilic 'slower cutters' all over the world.",
        "Mustafizur Rahman is a Bangladeshi international cricketer. A left-arm medium pacer, he is recognized for his most profilic 'slower cutters' all over the world.",
        "Mustafizur Rahman is a Bangladeshi international cricketer. A left-arm medium pacer, he is recognized for his most profilic 'slower cutters' all over the world.",
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        listView = findViewById(R.id.listView)

        val foodListAdapter = ListAdapter(this,foodName, foodDesc, foodImage)

        listView.adapter = foodListAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicked At ${foodName[position]}", Toast.LENGTH_SHORT).show()

            val intent = Intent(this@HomeActivity, DetailsActivity::class.java)
            intent.putExtra("name", foodName[position])
            intent.putExtra("description", foodDesc[position])
            intent.putExtra("longdescription", foodLongDes[position])
            intent.putExtra("image", foodImage[position])
            startActivity(intent)
        }
    }
}