package kr.ssu.dongyang.minn.kotlintest3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.CompoundButton.*
import android.widget.RadioGroup
import kr.ssu.dongyang.minn.kotlintest3.databinding.ActivitySwitchBinding

class SwitchActivity : AppCompatActivity() {
    val binding by lazy {
        ActivitySwitchBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.switchStart.setOnCheckedChangeListener(switchL)
        binding.rg.setOnCheckedChangeListener(rgL)
    }

    val switchL = OnCheckedChangeListener{ compoundButton: CompoundButton, b: Boolean ->
        if(b)
            binding.linear.visibility = VISIBLE
        else
            binding.linear.visibility = INVISIBLE
    }

    val rgL = RadioGroup.OnCheckedChangeListener { radioGroup: RadioGroup, id: Int ->
        when(id){
            R.id.rb1 -> binding.imgV.setImageResource(R.drawable.jang)
            R.id.rb2 -> binding.imgV.setImageResource(R.drawable.you)
            R.id.rb3 -> binding.imgV.setImageResource(R.drawable.kim)
        }
    }
}