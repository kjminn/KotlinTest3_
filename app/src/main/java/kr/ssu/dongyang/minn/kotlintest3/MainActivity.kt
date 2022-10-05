package kr.ssu.dongyang.minn.kotlintest3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.*
import android.widget.CompoundButton
import kr.ssu.dongyang.minn.kotlintest3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.checkStart.setOnCheckedChangeListener(checkL)
        binding.btnDone.setOnClickListener(btnL)
    }

    val checkL = CompoundButton.OnCheckedChangeListener { compoundButton: CompoundButton, b: Boolean ->
            if(b)
                binding.linear.visibility = VISIBLE
            else
                binding.linear.visibility = INVISIBLE

    }

    val btnL = OnClickListener{
        when(binding.rg.checkedRadioButtonId){
            R.id.rb1 -> binding.imgV.setImageResource(R.drawable.jang)
            R.id.rb2 -> binding.imgV.setImageResource(R.drawable.you)
            R.id.rb3 -> binding.imgV.setImageResource(R.drawable.kim)
        }
    }
}