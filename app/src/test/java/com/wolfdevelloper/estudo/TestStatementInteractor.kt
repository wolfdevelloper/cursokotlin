package com.wolfdevelloper.estudo

import com.wolfdevelloper.estudo.entity.ListStatement
import com.wolfdevelloper.estudo.statement.StatementContract
import com.wolfdevelloper.estudo.statement.StatementInteractor
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class TestStatementInteractor {

    lateinit var statementInteractor: StatementInteractor

    @Mock
    lateinit var iStatementInteractorOutput: StatementContract.StatementInteractorOutput

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        statementInteractor = StatementInteractor(iStatementInteractorOutput, TestServiceStatement())
        Assert.assertNotNull(statementInteractor)
    }

    @Test
    fun loadStatement() {
        statementInteractor.loadStatement(1)
        Mockito.verify(iStatementInteractorOutput, Mockito.times(1))
            .resultStatement(Mockito.any(ListStatement::class.java))
    }

}