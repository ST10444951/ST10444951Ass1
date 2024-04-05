package za.ac.iie.st1044951Ass1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_id)

        //get the button the id i set the user interface
        val compareButton = findViewById<Button>(R.id.compareButton)

        //get the button the id i set the user interface
        val clearButton = findViewById<Button>(R.id.clearButton)

        //get the button id i set the user interface
        val ageEditText = findViewById<EditText>(R.id.ageEditText)

       //get the button id i set the user interface
       val resultViewText = findViewById<TextView>(R.id.resultTextView)


        //add code to the button when it is clicked
        compareButton.setOnClickListener {

            //assign the text in the ageEditText to variable userInput
            val userInput = ageEditText.text.toString()

            //check if the user typed in an age
            if (userInput.isEmpty()) {
                resultViewText.text = ""
            }

            // store age is not a variable
            val userAge = userInput.toIntOrNull()

            // check if the age is not a valid integer
            if (userAge == null) {

                resultViewText.text = ""
            } else {
                if (userAge < 10 || userAge > 100) {
                    resultViewText.text = ""
                    ageEditText.text.clear()
                } else {

                    // to check when the user has entered an age
                    val result = when (userAge) {
                        26 -> "Sarah Baartman, She was viewed by Westerners as the Hottentot Venus, a representation of their repressed passions and fears, and as seductive and savage,26."
                        30 -> "Steve Biko,30 "
                        47 -> "Shona Ferguson,47"
                        50 -> "Micheal Jackson,50"
                        65 -> "Patrick Shai,65"
                        69 -> "Albert John Luthuli,69"
                        74 -> "Muhammad Ali,74"
                        81 -> "Winnie Mandela,81"
                        90 -> "Desmount Tuto,90"
                        96 -> "Queen Elizabeth,96"
                        else -> "Nobody known to me died at this age"



                    }

                    // show output to the user
                    resultViewText.text = result

                }
            }

        }

        //clear out the resultTextView and the ageEditText on the Clear button click
        clearButton.setOnClickListener {
            ageEditText.text.clear()
            resultViewText.text = ""
        }
    }
}