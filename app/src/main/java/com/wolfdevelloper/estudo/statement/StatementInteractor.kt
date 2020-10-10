package com.wolfdevelloper.estudo.statement

import com.wolfdevelloper.estudo.ineractor.remote.service.statement.IServiceStatement

class StatementInteractor(
    val iStatementInteractorOutput: StatementContract.StatementInteractorOutput,
    val iServiceStatement: IServiceStatement
) :
    StatementContract.StatementInteractorInput {

    override fun loadStatement(id: Int) {
        iServiceStatement.getStatement(id,
            sucess = {
                iStatementInteractorOutput.resultStatement(it.body()!!)
            }, failure = {})

    }
}