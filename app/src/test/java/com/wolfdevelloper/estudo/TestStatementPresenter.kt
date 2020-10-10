package com.wolfdevelloper.estudo


import com.wolfdevelloper.estudo.entity.ListStatement
import com.wolfdevelloper.estudo.statement.StatementContract
import com.wolfdevelloper.estudo.statement.StatementPresenter
import com.wolfdevelloper.estudo.viewmodel.Statement
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class TestStatementPresenter {

    lateinit var statementPresenter: StatementPresenter

    @Mock
    lateinit var iStatementPresenterOutput: StatementContract.StatementPresenterOutput

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        statementPresenter =
            StatementPresenter(iStatementPresenterOutput)
        Assert.assertNotNull(statementPresenter)
    }

    @Test
    fun resultStatement() {
        statementPresenter.resultStatement(ListStatement())
        Mockito.verify(iStatementPresenterOutput, Mockito.times(1))
            .resultStatement(Mockito.anyListOf(Statement::class.java))
    }
}