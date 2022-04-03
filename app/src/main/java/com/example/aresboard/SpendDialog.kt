package com.example.aresboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.fragment.app.DialogFragment
import com.example.aresboard.databinding.SpendPopupBinding
import java.lang.Integer.parseInt

class SpendDialog : DialogFragment() {

    private lateinit var binding: SpendPopupBinding
    private lateinit var spendListener: SpendListener

    interface SpendListener{
        fun onSpend(amount: Int)
    }

    fun setupListener(spendListener: SpendListener) {
        this.spendListener = spendListener
    }



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SpendPopupBinding.inflate(layoutInflater)
        val view = binding.root

        binding.spendButton.setOnClickListener {
            val amount = if (binding.howMuch.text?.isEmpty() == true)
                0
            else
                parseInt(binding.howMuch.text.toString())
            spendListener.onSpend(amount)
            dismiss()
        }

        binding.howMuch.setOnEditorActionListener{v, actionId, event ->
            return@setOnEditorActionListener when (actionId) {
                EditorInfo.IME_ACTION_DONE -> {
                    val amount = if (binding.howMuch.text?.isEmpty() == true)
                        0
                    else
                        parseInt(binding.howMuch.text.toString())
                    spendListener.onSpend(amount)
                    dismiss()
                    true
                }
                else -> false
            }
        }

        return view
    }

}