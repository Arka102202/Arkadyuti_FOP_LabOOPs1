package com.arkatech.service;

import com.arkatech.model.Employee;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CredService implements CredentialService{
    public String companyName = "arkatech.com";
    public String generatePassword(){

        String s = "";
        Stream<Character> chStream =  Stream.generate(() -> (char)(new Random().nextInt(9)+48))
                .limit(3);

        chStream = Stream.concat(chStream, Stream.generate(() -> (char)(new Random().nextInt(10)+33))
                .limit(1));

        chStream = Stream.concat(chStream, Stream.generate(() -> (char)(new Random().nextInt(25)+97))
                .limit(2));

        chStream = Stream.concat(chStream, Stream.generate(() -> (char)(new Random().nextInt(25)+65))
                .limit(1));

        chStream = Stream.concat(chStream, Stream.generate(() -> (char)(new Random().nextInt(6)+58))
                .limit(1));

        List<Character> list = chStream.collect(Collectors.toList());

        Collections.shuffle(list);
        for(char ch:list)s = s.concat(Character.toString(ch));

        return s;


    }
    public String generateEmailAddress(Employee e, String department){

        return e.getFirstName() + e.getLastName() + "@"+
                department + "." + companyName;
    }
    public void showCredentials(Employee e,String department){
        System.out.println("Showing the credentials for " + e.getFirstName());
        System.out.println("the password is ==> " + generatePassword());
        System.out.println("the Email is ==> " + generateEmailAddress(e,department));
    }
}
