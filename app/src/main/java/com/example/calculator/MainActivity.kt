package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


       binding.btnAc.setOnClickListener {
           binding.intputText.text= " "
           binding.outputText.text= " "

       }

        binding.one.setOnClickListener {
            binding.intputText.append("1")
        }

        binding.two.setOnClickListener {
            binding.intputText.append("2")
        }

        binding.three.setOnClickListener {
            binding.intputText.append("3")
        }

        binding.four.setOnClickListener {
            binding.intputText.append("4")
        }

        binding.five.setOnClickListener {
            binding.intputText.append("5")
        }

        binding.six.setOnClickListener {
            binding.intputText.append("6")
        }

        binding.seven.setOnClickListener {
            binding.intputText.append("7")
        }

        binding.eight.setOnClickListener {
            binding.intputText.append("8")
        }

        binding.nine.setOnClickListener {
            binding.intputText.append("9")
        }


        binding.zero.setOnClickListener {
            binding.intputText.append("0")
        }


        binding.btnBack.setOnClickListener {
            val result = binding.intputText.text.dropLast(1)
            binding.intputText.text= result
        }

        binding.add.setOnClickListener {
            binding.intputText.append("+")
        }

        binding.minus.setOnClickListener {
            binding.intputText.append("-")
        }


        binding.multi.setOnClickListener {
            binding.intputText.append("*")
        }

        binding.divide.setOnClickListener {
            binding.intputText.append("/")
        }


        binding.pLeft.setOnClickListener {
            binding.intputText.append("(")
        }

        binding.pRight.setOnClickListener {
            binding.intputText.append(")")
        }

        binding.dot.setOnClickListener {
            binding.intputText.append(".")
        }



        binding.equal.setOnClickListener {

            //create expression using dependencies

            val expression = ExpressionBuilder(binding.intputText.text.toString()).build()

            val result = expression.evaluate()
            val longresult= result.toLong()



            if(result == longresult.toDouble())
            {
                binding.outputText.text= longresult.toString()
            }else
            {
                binding.outputText.text= result.toString()
            }


        }





    }
}