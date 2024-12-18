package com.devatri.dependencyinjection.di

import com.devatri.dependencyinjection.domain.repository.UserRepository
import com.devatri.dependencyinjection.data.repository.UserRepositoryImpl
import com.devatri.dependencyinjection.data.repository.User2RepositoryImpl
import com.devatri.dependencyinjection.presentation.UserViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.viewModel

val appModule = module {
    singleOf(::UserRepositoryImpl) { bind<UserRepository>() }
    viewModel {
        UserViewModel(
            repository = get()
        )
    }
}


val app2Module = module {
    singleOf(::User2RepositoryImpl) { bind<UserRepository>() }
    viewModel {
        UserViewModel(
            repository = get()
        )
    }
}



















