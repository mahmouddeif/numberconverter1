package com.example.numberconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    lateinit var resultHEX: AppCompatTextView
    lateinit var resultDecimal: AppCompatTextView
    lateinit var resultOctal: AppCompatTextView
    lateinit var resultBinary: AppCompatTextView
    lateinit var textNumber: AppCompatEditText
    lateinit var buttonCharA: AppCompatButton
    lateinit var buttonCharB: AppCompatButton
    lateinit var buttonCharF: AppCompatButton
    lateinit var buttonCharE: AppCompatButton
    lateinit var buttonCharC: AppCompatButton
    lateinit var buttonCharD: AppCompatButton
    lateinit var clear: AppCompatButton
    lateinit var buttonNumberOne: AppCompatButton
    lateinit var buttonNumberTwo: AppCompatButton
    lateinit var buttonNumberThree: AppCompatButton
    lateinit var buttonNumberFour: AppCompatButton
    lateinit var buttonNumberFive: AppCompatButton
    lateinit var buttonNumberSix: AppCompatButton
    lateinit var buttonNumberSeven: AppCompatButton
    lateinit var buttonNumberNine: AppCompatButton
    lateinit var buttonNumberEight: AppCompatButton
    lateinit var buttonNumberZero: AppCompatButton
    lateinit var buttonForResult: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        onClick()


    }

    fun onClick() {
        buttonNumberOne.setOnClickListener { textNumber.append("1") }
        buttonNumberTwo.setOnClickListener { textNumber.append("2") }
        buttonNumberThree.setOnClickListener { textNumber.append("3") }
        buttonNumberFour.setOnClickListener { textNumber.append("4") }
        buttonNumberFive.setOnClickListener { textNumber.append("5") }
        buttonNumberSix.setOnClickListener { textNumber.append("6") }
        buttonNumberSeven.setOnClickListener { textNumber.append("7") }
        buttonNumberEight.setOnClickListener { textNumber.append("8") }
        buttonNumberNine.setOnClickListener { textNumber.append("9") }
        buttonNumberZero.setOnClickListener { textNumber.append("0") }
        buttonCharA.setOnClickListener { textNumber.append("A") }
        buttonCharB.setOnClickListener { textNumber.append("B") }
        buttonCharF.setOnClickListener { textNumber.append("F") }
        buttonCharE.setOnClickListener { textNumber.append("E") }
        buttonCharC.setOnClickListener { textNumber.append("C") }
        buttonCharD.setOnClickListener { textNumber.append("D") }
        clear.setOnClickListener { textNumber.setText("") }
        val number = textNumber.text.toString().toIntOrNull()

        buttonForResult.setOnClickListener {
            if (number == null) {
                Toast.makeText(this, "Please enter a valid decimal number", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val binary = decimalToBinary(number)
                resultBinary.text = binary
            }

        }
    }

    fun initView() {
        resultHEX = findViewById(R.id.result_HEX)
        resultDecimal = findViewById(R.id.result_dec)
        resultOctal = findViewById(R.id.result_oct)
        resultBinary = findViewById(R.id.result_bin)
        textNumber = findViewById(R.id.text_number)
        buttonCharA = findViewById(R.id.A)
        buttonCharB = findViewById(R.id.B)
        buttonCharF = findViewById(R.id.F)
        buttonCharE = findViewById(R.id.E)
        buttonCharC = findViewById(R.id.SymbolC)
        buttonCharD = findViewById(R.id.D)
        clear = findViewById(R.id.clear)
        buttonNumberOne = findViewById(R.id.NumberOne)
        buttonNumberTwo = findViewById(R.id.NumberTwo)
        buttonNumberThree = findViewById(R.id.NumberThree)
        buttonNumberFour = findViewById(R.id.NumberFour)
        buttonNumberFive = findViewById(R.id.NumberFive)
        buttonNumberSix = findViewById(R.id.NumberSix)
        buttonNumberSeven = findViewById(R.id.NumberSeven)
        buttonNumberEight = findViewById(R.id.NumberEghit)
        buttonNumberNine = findViewById(R.id.NumberNine)
        buttonNumberZero = findViewById(R.id.NumberZero)
        buttonForResult = findViewById(R.id.Eqwal)
    }

    fun decimalToBinary(decimal: Int): String {
        var quotient = decimal
        var binary = ""

        while (quotient > 0) {
            val remainder = quotient % 2
            binary = "$remainder$binary"
            quotient /= 2
        }

        return binary
    }


}