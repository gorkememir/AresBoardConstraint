package com.example.aresboard

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.os.Bundle
import android.os.Vibrator
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import com.example.aresboard.databinding.ActivityMainBinding
import com.example.aresboard.databinding.SpendPopupBinding
import java.util.*
import android.media.MediaPlayer


class MainActivity : AppCompatActivity() {
//    companion object{
//        const val SPEND = 0
//    }
    private lateinit var binding: ActivityMainBinding
    private lateinit var spBinding: SpendPopupBinding

    private var mcStock = 0
    private var mcIncome = 0
    private var heatStock = 0
    private var heatIncome = 0
    private var plantStock = 0
    private var plantIncome = 0
    private var cardIncome = 0
    private var steelIncome = 0
    private var titaniumIncome = 0
    private var tr = 5


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        spBinding = SpendPopupBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    @SuppressLint("SetTextI18n")
    fun mcOne(view: View) {
        val mcToggle: ToggleButton = binding.mcToggleBt
        val builder = AlertDialog.Builder(this)
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        if (mcToggle.isChecked) {
            mcStock++
            v.vibrate(50)
            binding.mcStockTv.setText("" + mcStock)
        }
        else {
            if (mcStock-1 < 0) {
                builder.setMessage("You cannot spend more than what you have!")
                builder.setCancelable(true)
                builder.setNegativeButton(
                    "Okay"
                ) { dialog, id -> dialog.cancel() }
                val alert11 = builder.create()
                alert11.show()
            }
            else {
                mcStock --
                binding.mcStockTv.setText(mcStock.toString())
            }
        }
    }
    fun mcFive(view: View) {
        val mcToggle: ToggleButton = binding.mcToggleBt
        val builder = AlertDialog.Builder(this)
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        if (mcToggle.isChecked) {
            mcStock = mcStock+5
            v.vibrate(50)
            binding.mcStockTv.setText("" + mcStock)
        }
        else {
            if (mcStock-5 < 0) {
                builder.setMessage("You cannot spend more than what you have!")
                builder.setCancelable(true)
                builder.setNegativeButton(
                    "Okay"
                ) { dialog, id -> dialog.cancel() }
                val alert11 = builder.create()
                alert11.show()
            }
            else {
                mcStock = mcStock-5
                binding.mcStockTv.setText(mcStock.toString())
            }
        }
    }
    fun mcTen(view: View) {
        val mcToggle: ToggleButton = binding.mcToggleBt
        val builder = AlertDialog.Builder(this)
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        if (mcToggle.isChecked) {
            mcStock = mcStock+10
            v.vibrate(50)
            binding.mcStockTv.setText("" + mcStock)
        }
        else {
            if (mcStock-10 < 0) {
                builder.setMessage("You cannot spend more than what you have!")
                builder.setCancelable(true)
                builder.setNegativeButton(
                    "Okay"
                ) { dialog, id -> dialog.cancel() }
                val alert11 = builder.create()
                alert11.show()
            }
            else {
                mcStock = mcStock-10
                binding.mcStockTv.setText(mcStock.toString())
            }
        }
    }
    fun heatOne(view: View) {
        val heatToggle: ToggleButton = binding.heatToggleBt
        val builder = AlertDialog.Builder(this)
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        if (heatToggle.isChecked) {
            heatStock++
            v.vibrate(50)
            binding.heatStockTv.setText("" + heatStock)
        }
        else {
            if (heatStock-1 < 0) {
                builder.setMessage("You cannot spend more than what you have!")
                builder.setCancelable(true)
                builder.setNegativeButton(
                    "Okay"
                ) { dialog, id -> dialog.cancel() }
                val alert11 = builder.create()
                alert11.show()
            }
            else {
                heatStock --
                binding.heatStockTv.setText(heatStock.toString())
            }
        }
    }
    fun heatFive(view: View) {
        val heatToggle: ToggleButton = binding.heatToggleBt
        val builder = AlertDialog.Builder(this)
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        if (heatToggle.isChecked) {
            heatStock = heatStock+5
            v.vibrate(50)
            binding.heatStockTv.setText("" + heatStock)
        }
        else {
            if (heatStock-5 < 0) {
                builder.setMessage("You cannot spend more than what you have!")
                builder.setCancelable(true)
                builder.setNegativeButton(
                    "Okay"
                ) { dialog, id -> dialog.cancel() }
                val alert11 = builder.create()
                alert11.show()
            }
            else {
                heatStock = heatStock-5
                binding.heatStockTv.setText(heatStock.toString())
            }
        }
    }
    fun heatTen(view: View) {
        val heatToggle: ToggleButton = binding.heatToggleBt
        val builder = AlertDialog.Builder(this)
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        if (heatToggle.isChecked) {
            heatStock = heatStock+10
            v.vibrate(50)
            binding.heatStockTv.setText("" + heatStock)
        }
        else {
            if (heatStock-10 < 0) {
                builder.setMessage("You cannot spend more than what you have!")
                builder.setCancelable(true)
                builder.setNegativeButton(
                    "Okay"
                ) { dialog, id -> dialog.cancel() }
                val alert11 = builder.create()
                alert11.show()
            }
            else {
                heatStock = heatStock-10
                binding.heatStockTv.setText(heatStock.toString())
            }
        }
    }
    fun plantOne(view: View) {
        val plantToggle: ToggleButton = binding.plantToggleBt
        val builder = AlertDialog.Builder(this)
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        if (plantToggle.isChecked) {
            plantStock++
            v.vibrate(50)
            binding.plantStockTv.setText("" + plantStock)
        }
        else {
            if (plantStock-1 < 0) {
                builder.setMessage("You cannot spend more than what you have!")
                builder.setCancelable(true)
                builder.setNegativeButton(
                    "Okay"
                ) { dialog, id -> dialog.cancel() }
                val alert11 = builder.create()
                alert11.show()
            }
            else {
                plantStock --
                binding.plantStockTv.setText(plantStock.toString())
            }
        }
    }
    fun plantFive(view: View) {
        val plantToggle: ToggleButton = binding.plantToggleBt
        val builder = AlertDialog.Builder(this)
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        if (plantToggle.isChecked) {
            plantStock = plantStock+5
            v.vibrate(50)
            binding.plantStockTv.setText("" + plantStock)
        }
        else {
            if (plantStock-5 < 0) {
                builder.setMessage("You cannot spend more than what you have!")
                builder.setCancelable(true)
                builder.setNegativeButton(
                    "Okay"
                ) { dialog, id -> dialog.cancel() }
                val alert11 = builder.create()
                alert11.show()
            }
            else {
                plantStock = plantStock-5
                binding.plantStockTv.setText(plantStock.toString())
            }
        }
    }
    fun plantTen(view: View) {
        val plantToggle: ToggleButton = binding.plantToggleBt
        val builder = AlertDialog.Builder(this)
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        v.vibrate(50)
        if (plantToggle.isChecked) {
            plantStock = plantStock+10
            binding.plantStockTv.setText("" + plantStock)
        }
        else {
            if (plantStock-10 < 0) {
                builder.setMessage("You cannot spend more than what you have!")
                builder.setCancelable(true)
                builder.setNegativeButton(
                    "Okay"
                ) { dialog, id -> dialog.cancel() }
                val alert11 = builder.create()
                alert11.show()
            }
            else {
                plantStock = plantStock-10
                binding.plantStockTv.setText(plantStock.toString())
            }
        }
    }
    fun mcIncome(view: View) {
        mcIncome++
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        v.vibrate(50)
        binding.mcIncomeTv.setText("" + mcIncome)
    }
    fun heatIncome(view: View) {
        heatIncome++
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        v.vibrate(50)
        binding.heatIncomeTv.setText("" + heatIncome)
    }
    fun plantIncome(view: View) {
        plantIncome++
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        v.vibrate(50)
        binding.plantIncomeTv.setText("" + plantIncome)
    }
    fun cardInc(view: View) {
        cardIncome++
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        v.vibrate(50)
        binding.cardIncomeTv.setText("" + cardIncome)
    }
    fun steelInc(view: View) {
        steelIncome++
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        v.vibrate(50)
        binding.steelIncomeTv.setText("" + steelIncome)
    }
    fun titaniumInc(view: View) {
        titaniumIncome++
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        v.vibrate(50)
        binding.titanIncomeTv.setText("" + titaniumIncome)
    }
    fun cardDec(view: View) {
        val builder = AlertDialog.Builder(this)
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        if (cardIncome > 0) {
            cardIncome--

            v.vibrate(50)
            binding.cardIncomeTv.setText("" + cardIncome)
        }
        else {
            builder.setMessage("Card income cannot be negative")
            builder.setCancelable(true)
            v.vibrate(50)
            builder.setNegativeButton(
                "Okay"
            ) { dialog, id -> dialog.cancel() }
            val alert11 = builder.create()
            alert11.show()
        }
    }
    fun steelDec(view: View) {
        val builder = AlertDialog.Builder(this)
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        if (steelIncome > 0) {
            steelIncome--
            v.vibrate(50)
            binding.steelIncomeTv.setText("" + steelIncome)
        }
        else {
            builder.setMessage("Steel income cannot be negative")
            builder.setCancelable(true)
            v.vibrate(50)
            builder.setNegativeButton(
                "Okay"
            ) { dialog, id -> dialog.cancel() }
            val alert11 = builder.create()
            alert11.show()
        }
    }

    fun titaniumDec(view: View) {
        val builder = AlertDialog.Builder(this)
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        if (titaniumIncome > 0) {
            titaniumIncome--
            v.vibrate(50)
            binding.titanIncomeTv.setText("" + titaniumIncome)
        }
        else {
            builder.setMessage("Titanium income cannot be negative")
            builder.setCancelable(true)
            v.vibrate(50)
            builder.setNegativeButton(
                "Okay"
            ) { dialog, id -> dialog.cancel() }
            val alert11 = builder.create()
            alert11.show()
        }
    }

    fun trInc(view: View) {
        tr++
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        v.vibrate(50)
        binding.trTv.setText("" + tr)
    }
    fun trDec(view: View) {
        val builder = AlertDialog.Builder(this)
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator

        if (tr > 0) {
            tr--
            v.vibrate(50)
            binding.trTv.setText("" + tr)
        }
        else {
            builder.setMessage("Terraform rating cannot be negative")
            builder.setCancelable(true)
            v.vibrate(50)
            builder.setNegativeButton(
                "Okay"
            ) { dialog, id -> dialog.cancel() }
            val alert11 = builder.create()
            alert11.show()
        }
    }

    fun produce(view: View) {
        val builder1 = AlertDialog.Builder(this)
        val prCheck = arrayOf("+4 MC")
        val isCheckedStatus = booleanArrayOf(false)
        var v = getSystemService(VIBRATOR_SERVICE) as Vibrator
        var card = MediaPlayer.create(this, R.raw.card)


        builder1.setTitle("Did you choose production?")
        builder1.setCancelable(true)
        builder1.setNegativeButton(
            "No"
        ) { dialog, id -> dialog.cancel() }
        builder1.setMultiChoiceItems(prCheck, isCheckedStatus) { dialog, which, isChecked ->
            // Update the current focused item's checked status
            isCheckedStatus[which] = isChecked
            // Notify the current action
            if (isChecked)
                Toast.makeText(applicationContext, "You'll be given +4 MC", Toast.LENGTH_SHORT).show()
        }
        builder1.setNegativeButton("Cancel", null)
        builder1.setPositiveButton(
            "Produce"
        ) { dialog, id ->

            if(cardIncome > 0) {
                card.start()
            }
            if(isCheckedStatus[0]) {
                mcStock += mcIncome + 4 + tr
                v.vibrate(50)
                binding.mcStockTv.setText("" + mcStock)
            }
            else {
                mcStock += mcIncome + tr
                v.vibrate(50)
                binding.mcStockTv.setText("" + mcStock)
            }
            heatStock += heatIncome
            binding.heatStockTv.setText("" + heatStock)
            plantStock += plantIncome
            binding.plantStockTv.setText("" + plantStock)}
        val alert1 = builder1.create()
        alert1.show()
    }

}

