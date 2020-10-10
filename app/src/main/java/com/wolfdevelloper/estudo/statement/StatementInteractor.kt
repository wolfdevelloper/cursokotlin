package com.wolfdevelloper.estudo.statement

import com.wolfdevelloper.estudo.ineractor.remote.service.statement.IServiceStatement
import com.wolfdevelloper.estudo.ineractor.remote.service.statement.ServiceStatement

class StatementInteractor(
    val iStatementInteractorOutput: StatementContract.StatementInteractorOutput
) :
    StatementContract.StatementInteractorInput {
     val iServiceStatement: IServiceStatement = ServiceStatement()
    override fun loadStatement(id: Int) {
        iServiceStatement.getStatement(id,
            sucess = {
                iStatementInteractorOutput.resultStatement(it.body()!!)
            }, failure = {})

    }
}