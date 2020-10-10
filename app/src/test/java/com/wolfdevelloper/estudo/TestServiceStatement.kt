package com.wolfdevelloper.estudo

import com.wolfdevelloper.estudo.entity.ListStatement
import com.wolfdevelloper.estudo.ineractor.remote.iapi.IStatementApi
import com.wolfdevelloper.estudo.ineractor.remote.service.statement.IServiceStatement
import org.junit.Test
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TestServiceStatement : IServiceStatement {
    @Test
    override fun getStatement(
        id: Int,
        sucess: (ListStatement: Response<ListStatement?>) -> Unit,
        failure: (throwable: Throwable) -> Unit
    ) {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(IStatementApi::class.java)
        val call = retrofit.statement(id).execute()

        if (call.isSuccessful)
            sucess.invoke(call)
        else
            failure.invoke(Throwable(call.message()))
    }
}