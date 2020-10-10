package com.wolfdevelloper.estudo.statement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wolfdevelloper.estudo.R
import com.wolfdevelloper.estudo.viewmodel.Statement


class StatementFragment : Fragment(), StatementContract.StatementPresenterOutput {

    private val iStatementPresenterInput: StatementContract.StatementPresenterInput

    init {
        iStatementPresenterInput = StatementPresenter(this)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_statement, container, false)
    }

    override fun resultStatement(listStatement: MutableList<Statement>) {

    }
}

