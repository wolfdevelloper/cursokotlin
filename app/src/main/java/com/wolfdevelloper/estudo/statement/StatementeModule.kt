package com.wolfdevelloper.estudo.statement

import com.wolfdevelloper.estudo.ineractor.remote.service.statement.IServiceStatement
import com.wolfdevelloper.estudo.ineractor.remote.service.statement.ServiceStatement
import dagger.Module
import dagger.Provides

@Module
class StatementeModule(
    val statementFragment: StatementFragment? = null,
    val statementPresenter: StatementPresenter? = null
) {


    @Provides
    fun providerIServiceStatement(): IServiceStatement {
        return ServiceStatement()
    }

    @Provides
    fun providerInteractorInput(iServiceStatement: IServiceStatement): StatementContract.StatementInteractorInput {
        return StatementInteractor(statementPresenter!!, iServiceStatement)
    }

    @Provides
    fun providerStatementPresenterInput(): StatementContract.StatementPresenterInput {
        return StatementPresenter(statementFragment!!)
    }

}