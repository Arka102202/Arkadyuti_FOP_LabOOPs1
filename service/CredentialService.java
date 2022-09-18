package com.arkatech.service;

import com.arkatech.model.Employee;

public interface CredentialService {
    String generatePassword();
    String generateEmailAddress(Employee e,String department);
    void showCredentials(Employee e,String department);

}
