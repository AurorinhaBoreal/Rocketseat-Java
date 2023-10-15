package com.aurora.javarocketseat.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Modifiers
 * Public
 * Private
 * Protect
*/

@RestController
@RequestMapping("/users")
public class UserController {
    
    /** Return Types
     * String (Text)
     * Integer (numbers that aren't decimals)
     * Double (decimal numbers)
     * Float (Also decimal numbers but with limitations)
     * Char (Unique characters)
     * Date (Dates LOL)
     * Void (Nothing returns)
     */

     @Autowired // Permite que o Spring gerencie e controle todo o ciclo de vida do repositório
     private IUserRepository userRepository;

    /** 
    * Receiving the Object UserModel in the createUser class
    * It's also necessary to inform the folder path to the UserModel, to do this we can use a component called @RequestBody
    * that automacally inform that the UserModel is in the "Body" of the class
    */

    // Will add the data from the class in the browser page
    @PostMapping("/")

    // Response ENtity type allow to return if the program suceeds with code 200 or if it fails with error codes 400 or 500
    public ResponseEntity createUser(@RequestBody UserModel UserModel) {

        // Now that we added it in the Controller, we can use it here.
        var user = this.userRepository.findByUsername(UserModel.getUsername());

        if (user != null) {
            // Error Message
            // Status Code - HttpStatus is a library that allow to see better what which code means what
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já Existe!");
        }

        // It's calling the userRepository who's linked to the JpaRepository, who's linked with the Database
        // It's saving the UserModel Class (that have the user attributes) in the database, and returning it's result
        var userCreated = this.userRepository.save(UserModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }
}
