package com.example.calculator1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.calculator1.databinding.ActivityMainBinding
import com.example.calculator1.databinding.Main2Binding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: Main2Binding

    var coolvar = 0.0

    var display = ""
    var register = mutableListOf<Double>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Main2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setButton()

    }

    private fun setButton() {
        binding.btnOne.setOnClickListener(this)
        binding.btnTwo.setOnClickListener(this)
        binding.btnThree.setOnClickListener(this)
        binding.btnFour.setOnClickListener(this)
        binding.btnFive.setOnClickListener(this)
        binding.btnSix.setOnClickListener(this)
        binding.btnSeven.setOnClickListener(this)
        binding.btnEight.setOnClickListener(this)
        binding.btnNine.setOnClickListener(this)
        binding.btnZero.setOnClickListener(this)

        binding.btnDecimal.setOnClickListener(this)

        binding.btnEnter.setOnClickListener(this)
        binding.btnDel.setOnClickListener(this)

        binding.btnPlus.setOnClickListener(this)
        binding.btnMinus.setOnClickListener(this)
        binding.btnTimes.setOnClickListener(this)
        binding.btnDiv.setOnClickListener(this)

        binding.btnPwr.setOnClickListener(this)
        binding.btnLn.setOnClickListener(this)
        binding.btnEnot.setOnClickListener(this)


    }

    @ExperimentalStdlibApi
    override fun onClick(v: View?) {

        when(v?.id){
            R.id.btn_one -> {
                display+= "1"
                binding.textView.text = display
            }

            R.id.btn_two -> {
                display+= "2"
                binding.textView.text = display
            }

            R.id.btn_three -> {
                display+= "3"
                binding.textView.text = display
            }

            R.id.btn_four -> {
                display+= "4"
                binding.textView.text = display
            }

            R.id.btn_five -> {
                display+= "5"
                binding.textView.text = display
            }

            R.id.btn_six -> {
                display+= "6"
                binding.textView.text = display
            }

            R.id.btn_seven -> {
                display+= "7"
                binding.textView.text = display
            }

            R.id.btn_eight -> {
                display+= "8"
                binding.textView.text = display
            }

            R.id.btn_nine -> {
                display+= "9"
                binding.textView.text = display
            }

            R.id.btn_zero -> {
                display+= "0"
                binding.textView.text = display
            }




            R.id.btn_enter -> {
                register.add(display.toDouble())
                display= ""
                binding.textView.text = "0"
            }

            R.id.btn_del -> {
                display = display.dropLast(1)
                binding.textView.text = display
            }



            R.id.btn_plus -> {
                coolvar = display.toDouble()
                if (register.isEmpty()){
                    binding.textView.text = "error: Register Empty"
                }
                else {
                    coolvar+= register.last()
                    register.removeLast()
                    display = coolvar.toString()
                    binding.textView.text = display
                }



            }

            R.id.btn_minus -> {
                coolvar = display.toDouble()
                coolvar= register.last() - coolvar
                register.removeLast()

                display = coolvar.toString()
                binding.textView.text = display
            }

            R.id.btn_times -> {
                coolvar = display.toDouble()
                coolvar*= register.last()
                register.removeLast()

                display = coolvar.toString()
                binding.textView.text = display
            }

            R.id.btn_div -> {
                coolvar = display.toDouble()
                coolvar= register.last() / coolvar
                register.removeLast()

                display = coolvar.toString()
                binding.textView.text = display
            }

        }





    }
}