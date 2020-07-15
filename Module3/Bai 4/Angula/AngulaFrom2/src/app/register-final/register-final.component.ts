import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormBuilder, FormGroup, Validators } from '@angular/forms';
function comparePassword(c: AbstractControl) {
  const v = c.value;
  return (v.password === v.confirmPassword) ? null : {
    passwordnotmatch: true
  };
}
@Component({
  selector: 'app-register-final',
  templateUrl: './register-final.component.html',
  styleUrls: ['./register-final.component.css']
})
export class RegisterFinalComponent implements OnInit {
  isHiddenR : boolean = true ;
  registerForm: FormGroup;
  constructor(private fb: FormBuilder) { }
  showR(){
    if(this.isHiddenR==true){
      this.isHiddenR = false
    }
    else {
      this.isHiddenR= true
    }
  }
  ngOnInit() {
    this.registerForm = this.fb.group({
      email: ['', [Validators.required, Validators.email]],
      pwGroup: this.fb.group({
        password: ['', [Validators.required, Validators.minLength(6)]],
        confirmPassword: ['', [Validators.required, Validators.minLength(6)]]
      }, {validator: comparePassword}),
      country: ['', Validators.required],
      age: ['', [Validators.required, Validators.min(18)]],
      gender: ['', Validators.required],
      phone: ['', [Validators.required, Validators.pattern(/^\+84\d{9,10}$/)]]
    });

    // update form state
    this.registerForm.patchValue({
      email: 'info@example.com'
    });
  }
  onSubmit() {
    console.log(this.registerForm);
  }

}
