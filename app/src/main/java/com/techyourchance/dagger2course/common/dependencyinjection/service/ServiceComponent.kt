package com.techyourchance.dagger2course.common.dependencyinjection.service

import com.techyourchance.dagger2course.common.dependencyinjection.presentation.PresentationComponent
import dagger.Subcomponent

@Subcomponent(modules = [ServiceModule::class])
interface ServiceComponent {

}