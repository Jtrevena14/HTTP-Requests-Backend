package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {
    List<Person> DB = new ArrayList(); //"Database" that is used to store all emails and names.

    @PostMapping
    public void addPerson(@RequestBody Person person) {
        DB.add(person);
    } //Adding persons name and email as object to Database

    @GetMapping
    public List<Person> getPeople() {
        return DB;
    } //To return all names and emails in DB
    @GetMapping("/{email}")
    public List<Person> getNameofPerson(@PathVariable String email){ //Return a specific name and email inside of DB
        List<Person> emails = new ArrayList();
        for(Person person: DB){
            if(person.getEmail().equals(email)){
                emails.add(person);
            }
        }
        return emails;
    }
}
