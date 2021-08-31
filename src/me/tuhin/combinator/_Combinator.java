package me.tuhin.combinator;

import java.time.LocalDate;

public class _Combinator {
    public static void main(String[] args) {
        Customer customer = new Customer("A", "a@gma.com", "+013", LocalDate.of(2000, 1, 1));

//        CustomerValidatorService validatorService = new CustomerValidatorService();
//        validatorService.isValid(customer);

        CustomerRegistrationValidator.ValidationResult result = CustomerRegistrationValidator
                .isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result != CustomerRegistrationValidator.ValidationResult.SUCCESS) {
            System.err.println(result.name());

        }
    }
}
