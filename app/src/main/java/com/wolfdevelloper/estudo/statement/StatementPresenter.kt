package com.wolfdevelloper.estudo.statement

import com.wolfdevelloper.estudo.entity.ListStatement
import com.wolfdevelloper.estudo.utils.DateTime
import com.wolfdevelloper.estudo.viewmodel.Statement

class StatementPresenter(
    val iStatementPresenterOutput: StatementContract.StatementPresenterOutput
) :
    StatementContract.StatementPresenterInput,
    StatementContract.StatementInteractorOutput {

    private val iStatementInteractorInput: StatementContract.StatementInteractorInput

    init {
        iStatementInteractorInput = StatementInteractor(this)
    }

    override fun loadStatement() {
        iStatementInteractorInput.loadStatement(1)
    }

    override fun resultStatement(listStatement: ListStatement?) {

        if (listStatement?.error?.code != 0) {
            return
        }

        val list = listStatement?.statementList?.map {
            Statement().mapper(it)
        }.sortedByDescending { DateTime.conversor(it.date) }.toMutableList()

        iStatementPresenterOutput.resultStatement(list)
    }
}