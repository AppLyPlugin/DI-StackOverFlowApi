package com.techyourchance.dagger2course.common.dependencyinjection.app

import dagger.hilt.migration.AliasOf
import javax.inject.Scope
import javax.inject.Singleton

@Scope
@AliasOf(Singleton::class)
annotation class AppScope {
}