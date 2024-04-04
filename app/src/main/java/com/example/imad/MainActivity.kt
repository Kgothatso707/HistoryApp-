package com.example.imad

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etAge = findViewById<EditText>(R.id.etAge).text

        val btnGenerateHistory = findViewById<Button>(R.id.btnGenerateHistory)
        val btnClear = findViewById<Button>(R.id.btnClear)

        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnClear.setOnClickListener{
            etAge.clear()
        }

        btnGenerateHistory.setOnClickListener {

            var HistoryPerson: String = ""
            val age = etAge.toString().toIntOrNull()
            var HistoryPersonInfo: String = ""


            if (age in 20..100) {
                when (age) {

                    20 -> HistoryPerson = "Stratten Dorothy died.Stratten Dorothy was an Canadian model and actress,primairly known for her appearances as a Playboy Playmate."
                    21 -> HistoryPerson = "Hampton  Fred died.Hampton  Fred was an American activist."
                    22 -> HistoryPerson = "Wadloww Robert died.Wadloww Robert was an aAmerican man who was the tallest person in recorded history."
                    23 -> HistoryPerson = "Phoenix River died.Phoenix River was a talented and charismatic actor who rose to fame in the 1980s with films like Standby Me and Running on Empty"
                    24 -> HistoryPerson = "Levy Chandra"
                    25 -> HistoryPerson = "Owen Wilfred"
                    26 -> HistoryPerson = "Taylor Breonna"
                    27 -> HistoryPerson = "Hernandez Aaron"
                    28 -> HistoryPerson = "Adams George washington"
                    29 -> HistoryPerson = "Williams Hank"
                    30 -> HistoryPerson = "Bronte Emily"
                    31 -> HistoryPerson = "Turner Nat"
                    32 -> HistoryPerson = "Kenny Diuglas"
                    33 -> HistoryPerson = "Lombard Carole"
                    34 -> HistoryPerson = "Smith Elliott"
                    35 -> HistoryPerson = "Mozart Wolfgang Amadeus  "
                    36 -> HistoryPerson = "Bob Marley"
                    37 -> HistoryPerson = "Marie Antoinette"
                    38 -> HistoryPerson = "Louis XVI"
                    39 -> HistoryPerson = "Malcolm X"
                    40 -> HistoryPerson = "Paul Walker"
                    41 -> HistoryPerson = "Jeff Healey"
                    42 -> HistoryPerson = "Kimbo Slice"
                    43 -> HistoryPerson = "Louid Braille"
                    44 -> HistoryPerson = "Pablo Escobar"
                    45 -> HistoryPerson = "Natasha Richardson"
                    46 -> HistoryPerson = "Andre the Giant"
                    47 -> HistoryPerson = "Ernest Shackleton"
                    48 -> HistoryPerson = "Whitney Houston"
                    49 -> HistoryPerson = "Keith Flint"
                    50 -> HistoryPerson = "Michael Jackson"
                    51 -> HistoryPerson = "Edouard Manet"
                    52 -> HistoryPerson = "William Shakespeare"
                    53 -> HistoryPerson = "George Michael"
                    54 -> HistoryPerson = "John RItter"
                    55 -> HistoryPerson = "Kate Spade"
                    56 -> HistoryPerson = "Steve Jobs"
                    57 -> HistoryPerson = "Vince Lombardi"
                    58 -> HistoryPerson = "Charles Dickens"
                    59 -> HistoryPerson = "William the Conqueror"
                    60 -> HistoryPerson = "Benedict Arnlod"
                    61 -> HistoryPerson = "John Gotti"
                    62 -> HistoryPerson = "Farrah Fawcett"
                    63 -> HistoryPerson = "Robin Williams"
                    64 -> HistoryPerson = "Malcolm Young "
                    65 -> HistoryPerson = "Walt Disney"
                    66 -> HistoryPerson = "Tom Clancy"
                    67 -> HistoryPerson = "George Washington"
                    68 -> HistoryPerson = "Johan Cruffy"
                    69 -> HistoryPerson = "David Bowie"
                    70 -> HistoryPerson = "Louis Vuttion"
                    71 -> HistoryPerson = "Bill Robinson"
                    72 -> HistoryPerson = "John Wayne"
                    73 -> HistoryPerson = "James Brown"
                    74 -> HistoryPerson = "Alan Shepard"
                    75 -> HistoryPerson = "J.P.Morgan"
                    76 -> HistoryPerson = "Danny Kaye"
                    77 -> HistoryPerson = "Galileo"
                    78 -> HistoryPerson = "Robert Forster"
                    79 -> HistoryPerson = "Charles de Gaulle"
                    80 -> HistoryPerson = "Marlon Brando"
                    81 -> HistoryPerson = "Queen Victoria"
                    82 -> HistoryPerson = "Burt Reynolds"
                    83 -> HistoryPerson = "Tina Turner"
                    84 -> HistoryPerson = "Issac Newton"
                    85 -> HistoryPerson = "Agatha Christie"
                    86 -> HistoryPerson = "Antony Armstrong-Jones"
                    87 -> HistoryPerson = "Mother Tersa"
                    88 -> HistoryPerson = "Charlie Chaplin"
                    89 -> HistoryPerson = "Roger Moore"
                    90 -> HistoryPerson = "Winston Churchill"
                    91 -> HistoryPerson = "Frank Lloyd"
                    92 -> HistoryPerson = "Harold Macmillana"
                    93 -> HistoryPerson = "Linus Pauling"
                    94 -> HistoryPerson = "George Bernard"
                    95 -> HistoryPerson = "Nelson Mandela"
                    96 -> HistoryPerson = "Joan Fontaine"
                    97 -> HistoryPerson = "Nsnette Fabray"
                    98 -> HistoryPerson = "Bob Dole"
                    99 -> HistoryPerson = "Michael Debakey"
                    100 -> HistoryPerson = "Strom Thurmond"

                    20-> HistoryPersonInfo="He is a famus actor"
                }

                tvResult.text = "Your are ${etAge} which is the same age as when ${HistoryPerson}"
            } else {tvResult.text = "Please re-enter any number between 20-100"}
            }




        }
   }
