package com.example.tipcalculator

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {
    @Test
    fun calculateTip_20PercentNotRoundup(){
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip =  NumberFormat.getCurrencyInstance().format(2)

        val actualTip = calculateTip(amount, tipPercent, false)
        assertEquals(expectedTip,actualTip)
    }
}