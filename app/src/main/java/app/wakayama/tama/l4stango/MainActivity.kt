package app.wakayama.tama.l4stango

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fluit = arrayOf<CustomWord>(
                CustomWord(R.drawable.apple_icon, "りんご"," apple"),
                CustomWord(R.drawable.banana_icon, "バナナ"," banana"),
                CustomWord(R.drawable.orange_icon, "オレンジ"," orange"),
                CustomWord(R.drawable.strawberry_icon, "イチゴ"," strawberry")
        )


        //val apple = CustomWord(R.drawable.apple_icon, "りんご"," apple")
        //val banana = CustomWord(R.drawable.banana_icon, "バナナ"," banana")
        //val orange = CustomWord(R.drawable.orange_icon, "オレンジ"," orange")
        //val strawberry = CustomWord(R.drawable.strawberry_icon, "イチゴ"," strawberry")

        for (i in 0..fluit.size-1){
            addCustomWord(fluit[i])
        }
        //addCustomWord(apple)
        // addCustomWord(banana)
        //addCustomWord(orange)
        //addCustomWord(strawberry)
    }

    private fun addWord(word: Word){

        val nameTextView = TextView(applicationContext)
        nameTextView.text = word.name

        // container.addView(nameTextView)

        val layout = LinearLayout(this.applicationContext)
        layout.orientation = LinearLayout.HORIZONTAL

        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)

        var layoutParams : LinearLayout.LayoutParams = LinearLayout.LayoutParams(280,280)

        imageView.layoutParams = layoutParams


        layout.addView(imageView)
        layout.addView(nameTextView)

        container.addView(layout)
    }


    private fun addCustomWord(word: CustomWord){

        val nameTextView = TextView(applicationContext)
        nameTextView.text = word.name

        val englishTextView = TextView(applicationContext)
        englishTextView.text = word.english

        // container.addView(nameTextView)

        val layout = LinearLayout(this.applicationContext)
        layout.orientation = LinearLayout.HORIZONTAL

        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)

        var layoutParams : LinearLayout.LayoutParams = LinearLayout.LayoutParams(280,280)

        imageView.layoutParams = layoutParams


        layout.addView(imageView)
        layout.addView(nameTextView)
        layout.addView(englishTextView)

        container.addView(layout)

    }
}