# Simple-REST-CRUD

Simple REST API performing CRUD operations.

## User entity

FIELD | TYPE 
------------|------------
id | integer
first_name | varchar
last_name | varchar

## RESTful API methods

METHOD | PATH | DESCRIPTION 
------------|-----|------------
GET | /v1/api/users | gets list of all users
GET | /v1/api/users/{id} | gets user at specific id
POST | /v1/api/users | saves user into database
DELETE | /v1/api/users/{id} | deletes user at specific id
PUT | /v1/api/users/{id} | update user at specific id

## Used technologies

- Java
- Spring Boot
- H2 Database

## Licence

This application is shared under the [MIT License](http://opensource.org/licenses/MIT).
