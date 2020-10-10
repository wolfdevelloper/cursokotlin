package com.wolfdevelloper.estudo.statement

class StatementPresenter(iStatementPresenterOutput: StatementContract.StatementPresenterOutput) :
    StatementContract.StatementPresenterInput,
    StatementContract.StatementInteractorOutput {

    private val iStatementInteractorInput: StatementContract.StatementInteractorInput

    init {
        iStatementInteractorInput = StatementInteractor(this)
    }
}