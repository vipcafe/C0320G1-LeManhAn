import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


let TimelinesComponent;
const routes: Routes = [
  {
    path: 'timelines',
    component: TimelinesComponent

  }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
