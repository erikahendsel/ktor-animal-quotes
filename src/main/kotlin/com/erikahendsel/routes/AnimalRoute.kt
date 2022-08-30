package com.erikahendsel.routes

import com.erikahendsel.data.model.Animal
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private  const val BASE_URL = "http://10.0.2.2:8080"
private val animals = listOf(
    Animal("Bunny", "Some bunny loves you.", "Anonymous bunny", "$BASE_URL/animal-pictures/bunny-easter.jpg"),
    Animal("Bunny", "Feeling simply ear-resistible.", "Anonymous bunny", "$BASE_URL/animal-pictures/bunny-flowers.jpg"),
    Animal("Bunny", "Everyone needs a friend who is all ears.", "Anonymous bunny", "$BASE_URL/animal-pictures/bunny-sitting-grass.jpg"),
    Animal("Bunny", "No bunny but you.", "Anonymous bunny", "$BASE_URL/animal-pictures/bunny-staring.jpg"),
    Animal("Cat", "Time spent with cats is never wasted.", "Sigmund Freud", "$BASE_URL/animal-pictures/cat-at-the-window.jpg"),
    Animal("Cat", "Cats rule the world", "Jim Davis", "$BASE_URL/animal-pictures/cat-king.jpg"),
    Animal("Cat", "Like all pure creatures, cats are practical.", "William S. Burroughs", "$BASE_URL/animal-pictures/cat-licking-paw.jpg"),
    Animal("Cat", "Cats have it all – admiration, an endless sleep, and company only when they want it.", "Rod McKuen", "$BASE_URL/animal-pictures/cat-snoozing.jpg"),
    Animal("Dog", "Scratch a dog and you’ll find a permanent job.", "Franklin P. Jones", "$BASE_URL/animal-pictures/dog-happy.jpg"),
    Animal("Dog", "Dogs’ lives are too short. Their only fault, really.", "Agnes Sligh Turnbull", "$BASE_URL/animal-pictures/dog-in-back-pack.jpg"),
    Animal("Dog", "Every dog must have his day.", "Jonathan Swift", "$BASE_URL/animal-pictures/dog-sitting.jpg"),
    Animal("Dog", "What does the dog eat at the movies? Pupcorn!", "Anonymous", "$BASE_URL/animal-pictures/dog-staring-at-camera.jpg"),
    Animal("Elephant", "Elephants are like humans. They are very smart, very logical.", "Peter Beard", "$BASE_URL/animal-pictures/elephant-head.jpg"),
    Animal("Elephant", "Nature's great masterpiece an elephant; the only harmless great thing.", "John Donne", "$BASE_URL/animal-pictures/elephant-magical.jpg"),
    Animal("Elephant", "Words are cheap. The biggest thing you can say is 'elephant.'", "Charlie Chaplin", "$BASE_URL/animal-pictures/elephant-mouth.jpg"),
    Animal("Elephant", "The world is not a burden… the world is as light as a feather on an elephant's back.", "Baba Hari Dass", "$BASE_URL/animal-pictures/elephant-with-baby.jpg"),
    Animal("Hamster", "Chubby cheeks and hamster squeaks.", "Anonymous hamster", "$BASE_URL/animal-pictures/hamster-eating.jpg"),
    Animal("Hamster", "You got lots of tail-lent.", "Anonymous hamster", "$BASE_URL/animal-pictures/hamster-flowers.jpg"),
    Animal("Hamster", "Will chew be mine?", "Anonymous hamster", "$BASE_URL/animal-pictures/hamster-nature-eating.jpg"),
    Animal("Pig", "'Oink' means 'I love you' in piggy language", "Anonymous pig", "$BASE_URL/animal-pictures/pig-kiss.jpg"),
    Animal("Pig", "Where do pigs keep their money? Why in the piggy bank, of course.", "Anonymous pig", "$BASE_URL/animal-pictures/pig-nature.jpg"),
    Animal("Pig", "Don't ever wrestle with a pig. You'll both get dirty, but the pig will enjoy it.", "Cale Yarborough", "$BASE_URL/animal-pictures/pig-staring-at-camera.jpg"),
)

fun Route.randomAnimal() {
    get("/randomanimal") {
        call.respond(
            HttpStatusCode.OK,
            animals.random()
        )
    }
}