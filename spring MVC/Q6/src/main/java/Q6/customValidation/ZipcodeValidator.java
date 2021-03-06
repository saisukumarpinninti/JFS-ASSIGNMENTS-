package Q6.customValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import Q6.customer;

public  class ZipcodeValidator implements ConstraintValidator<isZipcodeValid, customer> {


    @Override
    public void initialize(isZipcodeValid isZipcodeValid) {

    }

    @Override
    public boolean isValid(customer customer, ConstraintValidatorContext context) {
        if((customer.getCity().equals("Pune")) && customer.getZipcode().matches("111045|411002|411006|411015|411022|411032|411040"))
            return  true;

        else if((customer.getCity().equals("Banglore")) && customer.getZipcode().matches("560068|560004|560012|560016|560020|560024|560028"))
            return true;
        else if((customer.getCity().equals("Chennai")) && customer.getZipcode().matches("600001|600005|600013|600017|600021|600029|600033"))
            return true;
        else if((customer.getCity().equals("Mumbai")) && customer.getZipcode().matches("400004|400008|400016|400020|400028|600032|600033"))
            return true;
        return  false;
    }


}
