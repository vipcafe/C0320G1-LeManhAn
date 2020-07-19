import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";

function comparePassword(c: AbstractControl) {
  const v = c.value;
  return (v.password === v.confirmPassword) ? null : {
    passwordnotmatch: true
  };
}
@Component({
  selector: 'app-form-test',
  templateUrl: './form-test.component.html',
  styleUrls: ['./form-test.component.css']
})
export class FormTestComponent implements OnInit {

  loginForm: FormGroup;

  constructor(private lg: FormBuilder) {
  }

  // @ts-ignore
  ngOnInit() {
    this.loginForm = this.lg.group ({
      userName: ['', [Validators.required, Validators.minLength(3)]],
      cfPW: this.lg.group({
        password: ['', [Validators.required, Validators.minLength(6)]],
        confirmPassword : ['',[Validators.required, Validators.minLength(6)]]}, {validator: comparePassword} )
    });
  }

  onSubmit() {
    console.log(this.loginForm.value);
    alert("Đăng Nhập thành công !!!");
  }

}
