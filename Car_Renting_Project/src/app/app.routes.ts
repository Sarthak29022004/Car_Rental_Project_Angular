import { Routes } from '@angular/router';
import { DataBindingComponent } from './component/data-binding/data-binding.component';
import { TemplateFormComponent } from './component/template-form/template-form.component';
import { ReactiveFormComponent } from './component/reactive-form/reactive-form.component';
import { GetApiComponent } from './component/API/get-api/get-api.component';
import { PostApiComponent } from './component/API/post-api/post-api.component';
import { CustomerComponent } from './component/API/customer/customer.component';
import { LifeCycleEventsComponent } from './component/life-cycle-events/life-cycle-events.component';
import { LoginComponent } from './component/login/login.component';
import { LayOutComponent } from './component/lay-out/lay-out.component';
import { authGuard } from './guard/auth.guard';
import { HomeComponent } from './component/home/home.component';
import { SignalComponent } from './component/signal/signal.component';
import { ServerSidePaginationComponent } from './component/server-side-pagination/server-side-pagination.component';
import { UserviceComponent } from './UIDHTML/uservice/uservice.component';
import { AMComponent } from './UIDHTML/am/am.component';

export const routes: Routes = [
    {
        path: '',
        redirectTo: 'login',
        pathMatch: 'full'
    },
    {
        path: 'login',
        component: LoginComponent
    },
    {
        path: '',
        component: LayOutComponent,
        canActivate: [authGuard],
        children: [
            {
                path: 'data-binding',
                component: DataBindingComponent
            },
            {
                path: 'template-form',
                component: TemplateFormComponent
            },
            {
                path: 'reactive-form',
                component: ReactiveFormComponent
            },
            {
                path: 'get-api',
                component: GetApiComponent
            },
            {
                path: 'post-api',
                component: PostApiComponent
            },
            {
                path: 'customer-component',
                component: CustomerComponent
            },
            {
                path: 'life-cycle',
                component: LifeCycleEventsComponent
            },
            {
                path: 'home',
                component: HomeComponent
            },
            {
                path: 'signal',
                component: SignalComponent
            },
            {
                path: 'server-side-pagination',
                component: ServerSidePaginationComponent
            },
            {
                path:'uservice',
                component:UserviceComponent
            },
            {
                path:'am',
                component:AMComponent
            }
        ]
    }

];
