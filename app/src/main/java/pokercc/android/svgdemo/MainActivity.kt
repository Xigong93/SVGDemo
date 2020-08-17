package pokercc.android.svgdemo

import android.graphics.drawable.Animatable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            it.isSelected = it.isSelected.not()
            val bg = if (it.isSelected) {
                R.drawable.menu_on_anim
            } else {
                R.drawable.menu_off_anim
            }
            it.setBackgroundResource(bg)
            (it.background as? Animatable)?.start()
        }
    }
}