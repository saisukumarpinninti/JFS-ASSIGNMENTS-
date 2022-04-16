import { ValidatorFn, AbstractControl } from '@angular/forms';
export function ForbiddenNameValidator(forbiddenName: RegExp): ValidatorFn {
    return (control: AbstractControl): { [key: string]: any } | null => {
        const forbidden = forbiddenName.test(control.value);
        return forbidden ? { 'forbiddenName': { value: control.value } } : null;
    };
}


export function PasswordValidator(control: AbstractControl): { [key: string]: boolean } | null {
    const password = control.get('password');
    const confirmPassword = control.get('confirmpassword');
    if (password.pristine || confirmPassword.pristine) {
      return null;
    }
    return password && confirmPassword && password.value !== confirmPassword.value ? { 'misMatch': true } : null;
  }