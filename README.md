# user_api
user data api

Methods
POST: localhost:8080/user
{
    "userName": "Jay",
    "password": "123654",
    "email": "jay@mail.com",
    "phoneNumber": "0909656727"
}

GET: localhost:8080/user/1

PUT: localhost:8080/user
{
    "userId": 3,
    "userName": "guest",
    "password": "66666666",
    "email": "guest@mail.com",
    "phoneNumber": "1234561234"
}

DELETE: localhost:8080/user/1
