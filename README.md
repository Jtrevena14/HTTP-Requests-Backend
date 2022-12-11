# HTTP-Requests-Backend
This is a project that takes in a .JSON file from applications such as POSTMAN, .JSON should contain a email and a name, when sent program will assign a UUID specific to the object.

.JSON requests should be sent in this format:

POST to localhost:8080/api/v1/person/:  //Adds person John Smith and email to the database.
{

    "email":"johnsmith@gmail.com",
    
    "name":"John Smith"
}

POST again to localhost:8080/api/v1/person/:  //Adds person Jesse Trevena and email to the database.
{

    "email":"jtrevena@gmail.com",
    
    "name":"Jesse Trevena"
}

GET to localhost:8080/api/v1/person/:  //Gets all names and emails of people in that database along with the randomized UUID specific to each object.
[
    {

      "id": "4cf8caca-501f-4d54-b957-f55a8a2452b7",

      "email":"johnsmith@gmail.com",

      "name":"John Smith"

    }
]
[
    {

      "id": "57d80c13-2ecf-4087-96c6-590ccdb9a024",

      "email":"jtrevena@gmail.com",

      "name":"Jesse Trevena"
    }
]

GET to localhost:8080/api/v1/person/johnsmith@gmail.com/:  //Gets specific object based on email entered in URL in the database.
{
  "id": "4cf8caca-501f-4d54-b957-f55a8a2452b7",
  
  "email":"johnsmith@gmail.com",
  
  "name":"John Smith"
}

GET to localhost:8080/api/v1/person/johnsmith@gmail.com/4cf8caca-501f-4d54-b957-f55a8a2452b7/:  //If DB has more than one of the same email, ID can be entered at the end to get specific object.
{
  "id": "4cf8caca-501f-4d54-b957-f55a8a2452b7",
  
  "email":"johnsmith@gmail.com",
  
  "name":"John Smith"
}
