**Projec Overview:**

The XindusECommerce System is built using the Spring Boot framework.
User Authentication:

I have implemented secure user login and signup using Spring Security, ensuring proper authentication and authorization.
Utilized Spring Security filter chain for comprehensive security measures, protecting against common vulnerabilities like CSRF and XSS.
Wishlist Management:

Designed and implemented RESTful API endpoints for wishlist management (/api/wishlists).
Endpoints include GET to retrieve the user's wishlist, POST to add a new wishlist item, and DELETE to remove an item by ID.
Authentication is required for wishlist operations to ensure only logged-in users can manage their wishlists

**Binary Search Algorithm:**

Implemented a binary search algorithm to efficiently delete wishlist items by ID, reducing time complexity from O(User Products) to O(log(User Products)).
Spring Data JPA Integration:

Utilized Spring Data JPA for seamless integration with relational databases, simplifying data storage and retrieval processes.
WishlistItem Entity:

Defined a database schema for users and wishlist items, ensuring structured data storage and retrieval.
Unit Tests:

Ensured robust functionality through comprehensive unit testing, covering different aspects of wishlist management.
Spring Boot Advantages:

**Project Initialization:**

**1** Initiated the project using Spring Initializr, selecting appropriate dependencies like Spring Web, Lombok, Spring JPA, MySQL Connector, and Spring Security.
Project Structure:

**2** Organized the project into different packages (Controller, Service, Models, Repository, DTOs, Transformers, Security, Exceptions) for better code organization and maintainability.


**3** Emphasized the importance of security in web applications, highlighting features like authentication, authorization, and protection against common security threats.
Spring Security Filter Chain:

**4** Explained the internal workings of Spring Security, focusing on the request interception, security filter chain, authentication processing, and AuthenticationManager.
Implementation of Spring Security Filter Chain:

**5** Described the initialization of the SecurityFilterChain bean, HttpSecurity configuration, authorization rules definition, and the role of UserDetailsService in the authentication process.
Endpoints in Rest Controller:

**6** Covered key REST endpoints, such as user registration (/register) and user login, providing details on the permissions and authorization requirements.

**WishlistItem Endpoints and Item Service Business Logic:**

Created the WishListItem endpoints, highlighting the need for user authentication.
Detailed the business logic in the Item Service, addressing multiple corner cases and actions like adding an item, retrieving all wishlist items, and deleting an item by ID.

**To implement the project do the following steps:**
step 1: clone this repository 
step 2: application.properties file provide the relational database name and password for configuring databse with spring boot
step 3: go to application file and click on the run button to start the springboot application
step 4 : to check the working of api use any api testing tools like postman first input URL(localhost:portnumber if running on standalone system) create user by post method in postman by passing json body use fields mentioned in user dto and follow the same for wishlist item creation but before that in postman click on basic auth present in authorisation section for login to perform add or remove wish list item
step 5 : run unit test of all the three class to check the performance of controller and service logic
