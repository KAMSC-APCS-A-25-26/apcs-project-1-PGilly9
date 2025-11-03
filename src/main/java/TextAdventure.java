import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class TextAdventure {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int dog = 0;
        Boolean run = true;

        System.out.print("What is your first name: ");
        String name = sc.nextLine();

        // Runs program multiple times
        while (run) {
            // What todo today?

            System.out.println("You are: Leaving the house");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Plan for today:");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("1. go to School");
            System.out.println("2. go to the mall to meet up with your friends");
            System.out.println("3. call up the rest of the boys and go cause trouble");
            System.out.println("4. go back home");
            System.out.println("5. play my instrument");
            System.out.println("6. go to bed");
            TimeUnit.SECONDS.sleep(4);

            // Scene 1, they go to school and by meeting Freddy enter scene 1
            System.out.println("\n\nOn your way to school you encounter a bulldog named Freddy.");
            System.out.println("  __      _\n" + "o'')}____//\n" + " `_/      )\n" + " (_(_/-(_/");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\nThis dog is known in your town as the most dangerous animal with the most dangerous family.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("What do you do?");
            System.out.println("\n1. stand up to the dog, but not hurt the dog, because hurting animals is a HUGE no-no.\nor\n2. run away and hide, hoping it did not see you.");
            System.out.print("Please enter a choice:  ");
            dog = sc.nextInt();

            // If they don't enter a valid number
            while (dog > 2 || dog < 1) {
                System.out.println("\nONE OR TWO, COMMON NOW");
                System.out.println("Please enter a choice:  ");
                dog = sc.nextInt();
            }
            // Standing your ground (If 1)
            if (dog == 1) {
                System.out.println("\nIt sees you across the alley, it runs at you, you don't fear. As it gets closer you see that it has something in its mouth but you can't see.");
                TimeUnit.SECONDS.sleep(2);
                System.out.print("As it gets closer you find out what it is, its a ");
                // Time for some luck
                int mouth = rand.nextInt(100 + 1);
                // If 2
                if (mouth % 2 == 0) {
                    // Good outcome
                    System.out.println("newspaper, no need to fear its trying to do its civil duty.");
                    System.out.println("You pet the dog and become friends, next time it won't be this scary.");
                } else {
                    // Bad outcome
                    System.out.println("Oh no, it's a horrible sight, it's got a foamy mouth. It must have rabies, get out!");
                    System.out.println("TURN THE CORNER, GO TO SCHOOL FAST FIND SAFETY");
                    TimeUnit.SECONDS.sleep(8);
                    System.out.println("Great Decision, I'm glad you decided to stay, that hospital might be calling your name!");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.print(".");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.print(".");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println(".");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("You narrowly avoid the dog and eventually he loses you.");
                }
            } else {
                // Running away
                System.out.println("\n\nYou run as fast as you can, afraid to look behind you.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("You make your way to the school because you now people will help you there");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("After 2 minutes of running you look behind you and realize, the dog never saw you, you wasted all your energy and now you are all sweaty before school even starts.");
            }
            TimeUnit.MILLISECONDS.sleep(2500);
            System.out.println("\nContinue heading to school");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("you make it to school, ready for a new day. Have Fun!");

            // Scene 2: Gym
            // For loop
            for (int i = 0; i < 3; i++) {
                TimeUnit.MILLISECONDS.sleep(2000);
                System.out.println(".");
            }
            System.out.println("Ahh first period, only the worst class to start, I mean who in their right mind thought gym was a good 1st hour?");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You enter the gym and realize, it's a free day; you can either play:");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("1. basketball");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("2. soccer");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("3. tennis");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("or");
            TimeUnit.MILLISECONDS.sleep(444);
            System.out.println("4. volleyball");

            System.out.print("Enter the number for the sport you want to play: ");
            int sport = sc.nextInt();

            // Dealing with a wrong number
            while (sport > 4 || sport < 1) {
                System.out.println("\n1-4, it's not that hard");
                System.out.print("Please enter a choice:  ");
                sport = sc.nextInt();
            }

            // If 3
            if (sport == 1) {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("You grab a ball and begin to play");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("You start to sweat and tell yourself to cool down, \nBilly then challenges you to a 1v1");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Billy is one of the best in the school so you challenge yourself and have to go for gold.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Right?\n1. compete\n2. be weak");
                System.out.print("Pick one:");

                int comp = sc.nextInt();
                // Wrong number, and not what we want
                do {
                    while (comp > 2 || comp < 1) {
                        System.out.println("\n1 or 2, it's not that hard");
                        System.out.print("Please enter a choice:  ");
                        comp = sc.nextInt();
                    }
                    while (comp == 2) {
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("No, you want to play, you got this!");
                        System.out.print("Please enter a choice:  ");
                        comp = sc.nextInt();
                    }
                }
                while (comp != 1);

                // if 4
                if (comp == 1) {
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("You grab a ball and begin to play, harder than before");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.print("You know you can win, and as the hour ends you");
                    int win = rand.nextInt(15) + 1;
                    // If 5
                    if (win % 2 == 1) {
                        System.out.println(" make the game winning shot!");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("WINNER WINNER CHICKEN DINNER!!!");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("This means the world to you, and your day is flying");
                    } else {
                        System.out.println(" brick the ball so hard, you lose by 1 lonesome point");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("Whatever, it's not the end of the day, but it stings");
                    }
                }
            } else if (sport == 2) {
                TimeUnit.MILLISECONDS.sleep(1500);
                System.out.println("You grab a ball and begin to play");
                TimeUnit.MILLISECONDS.sleep(1500);
                System.out.println("You start to sweat and tell yourself to cool down, \nBilly then challenges you to a 1v1");
                TimeUnit.MILLISECONDS.sleep(1500);
                System.out.println("Billy is one of the best in the school so you challenge yourself and have to go for gold.");
                TimeUnit.MILLISECONDS.sleep(1500);
                System.out.println("Right?\n1. compete\n2. be weak");
                System.out.print("Pick one:");

                int comp = sc.nextInt();
                // Wrong number, and not what we want
                do {
                    while (comp > 2 || comp < 1) {
                        System.out.println("\n1 or 2, it's not that hard");
                        System.out.print("Please enter a choice:  ");
                        comp = sc.nextInt();
                    }
                    while (comp == 2) {
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("No, you want to play, you got this!");
                        System.out.print("Please enter a choice:  ");
                        comp = sc.nextInt();
                    }
                }
                while (comp != 1);
                // If 6
                if (comp == 1) {
                    TimeUnit.MILLISECONDS.sleep(1500);
                    System.out.println("You grab a ball and begin to play, harder than before");
                    TimeUnit.MILLISECONDS.sleep(1500);
                    System.out.print("You know you can win, and as the hour ends you");
                    int win = rand.nextInt(15) + 1;
                    // If 7
                    if (win % 2 == 1) {
                        System.out.println(" make the game winning shot!");
                        TimeUnit.MILLISECONDS.sleep(1500);
                        System.out.println("WINNER WINNER CHICKEN DINNER!!!");
                        TimeUnit.MILLISECONDS.sleep(1500);
                        System.out.println("This means the world to you, and your day is flying");
                    } else {
                        System.out.println(" brick the ball so hard, you lose by 1 lonesome point");
                        TimeUnit.MILLISECONDS.sleep(1500);
                        System.out.println("Whatever, it's not the end of the day, but it stings");
                    }
                }
            } else if (sport == 3) {
                TimeUnit.MILLISECONDS.sleep(1500);
                System.out.println("Grab a racket and enjoy a peaceful time in the gym before school starts.");
            } else {
                TimeUnit.MILLISECONDS.sleep(1500);
                System.out.println("You grab a ball and begin to play");
                TimeUnit.MILLISECONDS.sleep(1500);
                System.out.println("You start to sweat and tell yourself to cool down, \nBilly then challenges you to a 1v1");
                TimeUnit.MILLISECONDS.sleep(1500);
                System.out.println("Billy is one of the best in the school so you challenge yourself and have to go for gold.");
                TimeUnit.MILLISECONDS.sleep(1500);
                System.out.println("Right?\n1. compete\n2. be weak");
                System.out.print("Pick one:");

                int comp = sc.nextInt();
                // Dealing with a wrong number
                do {
                    while (comp > 2 || comp < 1) {
                        System.out.println("\n1 or 2, it's not that hard");
                        System.out.print("Please enter a choice:  ");
                        comp = sc.nextInt();
                    }
                    while (comp == 2) {
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("No, you want to play, you got this!");
                        System.out.print("Please enter a choice:  ");
                        comp = sc.nextInt();
                    }
                }
                while (comp != 1);
                // If 8
                if (comp == 1) {
                    TimeUnit.MILLISECONDS.sleep(1500);
                    System.out.println("You grab a ball and begin to play, harder than before");
                    TimeUnit.MILLISECONDS.sleep(1500);
                    System.out.print("You know you can win, and as the hour ends you");
                    int win = rand.nextInt(15) + 1;
                    // If 9
                    if (win % 2 == 1) {
                        System.out.println(" make the game winning shot!");
                        TimeUnit.MILLISECONDS.sleep(1500);
                        System.out.println("WINNER WINNER CHICKEN DINNER!!!");
                        TimeUnit.MILLISECONDS.sleep(1500);
                        System.out.println("This means the world to you, and your day is flying");
                    } else {
                        System.out.println(" brick the ball so hard, you lose by 1 lonesome point");
                        TimeUnit.MILLISECONDS.sleep(1500);
                        System.out.println("Whatever, it's not the end of the day, but it stings");
                    }
                }
            }

            TimeUnit.MILLISECONDS.sleep(1500);
            System.out.print("\nSchool goes sl");
            for (int i = 0; i < 6; i++) {
                TimeUnit.SECONDS.sleep(4);
                System.out.print("l");
            }
            System.out.println("owly");
            TimeUnit.MILLISECONDS.sleep(1500);
            // Scene 3
            System.out.println("But now you finally made it to lunch");
            TimeUnit.MILLISECONDS.sleep(1500);
            System.out.print("You get some foods, and decide either to 1. food fight, or 2. eat peacefully: ");
            int food = sc.nextInt();
            // Dealing with a wrong number
            while (food > 2 || food < 1) {
                System.out.println("\n1 or 2, it's not that hard");
                System.out.print("Please enter a choice:  ");
                food = sc.nextInt();
            }

            // If 10
            if (food == 1) {
                TimeUnit.MILLISECONDS.sleep(1500);
                System.out.println("You grab a piece of bread and throw it yelling \"FOOD FIGHT\"");
                TimeUnit.MILLISECONDS.sleep(1500);
                System.out.println("You end up being the only one interested, an before you know it the staff have you in the main office, expecting a lunch detention for tomorrow.");
            } else {
                TimeUnit.MILLISECONDS.sleep(1500);
                System.out.println("You grab a piece of bread and eat it, it tastes just ok, but after a boring day, anything goes");
            }

            TimeUnit.MILLISECONDS.sleep(1500);
            System.out.println("School wraps up and you head back home to drop off your things before joining some palls at the mall");

            System.out.println("\n\nYou head to the mall, but on your way your way you get a call from a friend");
            System.out.println("They say they are going to Walmart instead of the mall, because a sketchy group threatened them to leave.");
            System.out.println("Do you\n1. go to Walmart and avoid trouble \n or \n2. stand up to them, they can't take your mall");
            TimeUnit.SECONDS.sleep(2);
            System.out.print("\nPlease your plan:  ");
            int idea = sc.nextInt();
            while (idea > 2 || idea < 1) {
                System.out.println("\nONE OR TWO, COMMON NOW");
                System.out.println("Please enter a choice:  ");
                idea = sc.nextInt();
            }

            // If 11
            if (idea == 1) {
                TimeUnit.SECONDS.sleep(3);
                System.out.println("\nWalmart, a new plan can't change your mood.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("You enter your car, all new and full of gas, except its less than what you remember");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("You shrug it off and exit your driveway as you enter the road.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("You then turn left onto the busy street by your house, you look left. \nAll clear \nThen right");
                int road = rand.nextInt(1000);
                do {
                    TimeUnit.SECONDS.sleep(4);
                    System.out.println("\nShoot, it's all busy, it's a good idea to keep waiting, looks like only one more car");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("We wouldn't want any crashes right?");
                    road = rand.nextInt();
                }
                while (road % 2 == 0 && road < 400);

                TimeUnit.SECONDS.sleep(2);
                System.out.println("\nAll clear\nYou turn but BOOM, smack by a car to your left, you forgot to check left again");
                TimeUnit.SECONDS.sleep(5);
                System.out.println("You Spiral and hit a tree\nYou black out");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("_|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_   \n" +
                        " |       |       |       |       |       |       |       |       |    \n" +
                        "    _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|\n" +
                        "     |       |       |       |       |       |       |       |       |\n" +
                        "_|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_   \n" +
                        " |       |       |       |       |       |       |       |       |    \n" +
                        "    _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|\n" +
                        "     |       |       |       |       |       |       |       |       |\n" +
                        "_|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_   \n" +
                        " |       |       |       |       |       |       |       |       |    \n" +
                        "    _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|\n" +
                        "     |       |       |       |       |       |       |       |       |\n" +
                        "_|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_   \n" +
                        " |       |       |       |       |       |       |       |       |    \n" +
                        "    _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|\n" +
                        "     |       |       |       |       |       |       |       |       |\n" +
                        "_|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_   \n" +
                        " |       |       |       |       |       |       |       |       |    \n" +
                        "    _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|\n" +
                        "     |       |       |       |       |       |       |       |       |\n" +
                        "_|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_   \n" +
                        " |       |       |       |       |       |       |       |       |");
                int health = rand.nextInt(10);
                TimeUnit.SECONDS.sleep(2);
                // Scene 4
                System.out.println("You end up in the hospital when you wake up.");

                // If 12
                if (health < 7) {
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("You are ok, you can up and leave, sorry about your wallet.");
                    System.out.println("You look around for a nurse\nYou find one and call her over to ask if you can go, after all you still got plans to attend to.");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("She acts impressed, she wants to know how you survived such a brutal crash.");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Are you invincible? Can you not die???");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("You get released in a matter of 30 minutes and head on your way, but that question remains, stuck in your head.");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.print(".");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.print(".");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println(".");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.print("At walmart you meet up with your friends, John, Paul, George, and ");
                    for (int i = 0; i < 3; i++) {
                        TimeUnit.MILLISECONDS.sleep(650);
                        System.out.print(".");
                    }
                    TimeUnit.MILLISECONDS.sleep(700);
                    System.out.println(" ehh whatever, names aren't important.");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Walmart is just as boring as you expected, I mean what do you do in a Walmart?");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("You remember your crash from earlier and get curious with fate\nYou have an IDEA");
                    TimeUnit.SECONDS.sleep(2);
                    // Major decision
                    System.out.println("What should you do\n1. stand on the highway in front of a semi to see if you live\nor\n2. call up the rest of your group");
                    System.out.print("Please enter a choice:  ");
                    int decision = sc.nextInt();
                    while (decision > 2 || decision < 1) {
                        System.out.println("\nONE OR TWO, COMMON NOW");
                        System.out.print("Please enter a choice:  ");
                        decision = sc.nextInt();
                    }
                    // If 13
                    if (decision == 1) {
                        // Ending 1
                        TimeUnit.MILLISECONDS.sleep(1500);
                        System.out.println("Well I don't want to spell it out for you but");
                        TimeUnit.MILLISECONDS.sleep(1500);
                        System.out.println("Goodbye World!");

                    } else {
                        TimeUnit.MILLISECONDS.sleep(1500);
                        System.out.println("\nTime to call them up\nThey answer and agree to join");
                        TimeUnit.MILLISECONDS.sleep(1500);
                        System.out.println("You wait for them to show up");
                        // Scene 5
                        System.out.println("As you all meet up, you decide that the park would be a better place to hang out. The Park!");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("\"" + name + "!\" \n\"We have trouble coming\" John says");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("You turn to see a tuck full of people 2 years older than you and they begin to chase you");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("\"OUR PARK, IT'S OURS\" they scream.");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("Do you:");
                        TimeUnit.SECONDS.sleep(2);
                        // Major decision
                        System.out.println("1. go home, it isn't worth it any more \nor \n2. turn and fight, get your friends, you are strong and know you can bee trouble");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.print("Enter your choice: ");
                        int chase = sc.nextInt();
                        // Dealing with a wrong number
                        while (chase > 2 || chase < 1) {
                            System.out.println("\nONE OR TWO, COMMON NOW");
                            System.out.print("Please enter a choice:  ");
                            chase = sc.nextInt();
                        }
                        // If 14
                        if (chase == 1) {
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("You run to your car as they continue to scream, but once you enter they fade away.");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("You just give up and go home, whats the point?");
                        } else {
                            // Scene 6
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("\"FIGHT\" you scream");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("\nLike clockwork all 8 of you turn an take on the face the 5 of them, and wipe them on their feet");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("None of you saw this coming so you cheer");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("All of a sudden you realise you have bigger problems: \"WOOP WOOP\", the police");
                            TimeUnit.SECONDS.sleep(2);
                            // Scene 7
                            System.out.println("1. run 2. hide or 3. turn yourself in");
                            System.out.print("Enter your choice: ");
                            int police = sc.nextInt();
                            // Dealing with a wrong number
                            while (police > 3 || police < 1) {
                                System.out.println("\nONE, TWO, OR THREE COMMON NOW");
                                System.out.print("Please enter a choice:  ");
                                police = sc.nextInt();
                            }
                            // If 15
                            if (police == 1) {
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("\nYou run, right to your car, then go all the way home, the police don't even have a lead because all your friends did the same.");
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("Safety");
                            } else if (police == 2) {
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("You hide in a bush, but you are easily spotted");
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("\"We saw the whole thing kid\" said a cop in a strong voice.");
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("\"We know it was self-defense, you are free to leave.\"");
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("You go home.");
                            } else {
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("You walk over with your hands on your head and calmy begin to explain");
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("\"We saw the whole thing kid\" said a cop in a strong voice.");
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("\"We know it was self-defense, you are free to leave\"");
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("You go home.");
                            }

                        }


                        // Finally Home, now onto the next task.
                        // Scene 8
                        System.out.println("Ahh home at last, whats there to do now.");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("\"What instrument should I play today?\" you ask yourself.");
                        TimeUnit.SECONDS.sleep(2);
                        // List of instruments.
                        System.out.println("Instruments:");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("1. saxophone");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("2. drum set");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("3. guitar");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("4. piano");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("5. clarinet");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("6. trombone");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("7. flute");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("8. trumpet");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("9. tuba");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.print("Please pick an instrument: ");
                        int instrument = sc.nextInt();


                        TimeUnit.SECONDS.sleep(1);


                        // Separates instruments by type, the into specific instrument
                        // Dealing with a wrong number
                        while (instrument < 1 || instrument > 9) {
                            System.out.print("Please pick a number 1-9: ");
                            instrument = sc.nextInt();
                        }
                        if (instrument == 1 || instrument == 5 || instrument == 7) {
                            System.out.println("This is a woodwind");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("You decide to play some jazz");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("After an hour of soloing and practice you decide to go to bed.");
                        } else if (instrument == 8 || instrument == 9 || instrument == 6) {
                            System.out.println("This is a brass instrument");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("You decide to play some jazz");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("After an hour of soloing and practice you decide to go to bed.");
                        } else {
                            System.out.println("This is a percussion instrument");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("You decide to play some jazz");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("After an hour of soloing and practice you decide to go to bed.");
                        }
                        //ending 3
                        TimeUnit.SECONDS.sleep(2);
                        System.out.print("Time for bed.");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("GoodNight!");

                    }
                } else {
                    // Ending 2
                    System.out.println("You are in critical condition, you might as well live here now.");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("It's peaceful isn't it");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("No more worrying, just sleeping");
                    TimeUnit.MILLISECONDS.sleep(3500);
                    System.out.println("\"And all this for what, a WALMART?\" you ask yourself");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("You will be missed");
                }
            } else {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("You go to the mall, but don't tell your friends because they will ruin it\nYou hope that these men aren't too scary, but at the end it's your mall, and your plan");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("You enter your car, all new and full of gas, except its less than what you remember");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("You shrug it off and exit your driveway as you enter the road.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("You then turn left onto the busy street by your house, you look left. \nAll clear \nThen right");
                int road = rand.nextInt(1000);
                do {
                    TimeUnit.SECONDS.sleep(4);
                    System.out.println("\nShoot, it's all busy, it's a good idea to keep waiting, looks like only one more car");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("We wouldn't want any crashes right?");
                    road = rand.nextInt();
                }
                while (road % 2 == 0 && road < 400);

                TimeUnit.SECONDS.sleep(2);
                System.out.println("\nAll clear\nYou turn but BOOM, smack by a car to your left, you forgot to check left again");
                TimeUnit.SECONDS.sleep(5);
                System.out.println("You Spiral and hit a tree\nYou black out");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("_|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_   \n" +
                        " |       |       |       |       |       |       |       |       |    \n" +
                        "    _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|\n" +
                        "     |       |       |       |       |       |       |       |       |\n" +
                        "_|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_   \n" +
                        " |       |       |       |       |       |       |       |       |    \n" +
                        "    _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|\n" +
                        "     |       |       |       |       |       |       |       |       |\n" +
                        "_|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_   \n" +
                        " |       |       |       |       |       |       |       |       |    \n" +
                        "    _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|\n" +
                        "     |       |       |       |       |       |       |       |       |\n" +
                        "_|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_   \n" +
                        " |       |       |       |       |       |       |       |       |    \n" +
                        "    _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|\n" +
                        "     |       |       |       |       |       |       |       |       |\n" +
                        "_|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_   \n" +
                        " |       |       |       |       |       |       |       |       |    \n" +
                        "    _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|\n" +
                        "     |       |       |       |       |       |       |       |       |\n" +
                        "_|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_   \n" +
                        " |       |       |       |       |       |       |       |       |");
                int health = rand.nextInt(10);
                TimeUnit.SECONDS.sleep(2);
                System.out.println("You end up in the hospital when you wake up.");
                if (health < 7) {
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("You are ok, you can up and leave, sorry about your wallet.");
                    System.out.println("You look around for a nurse\nYou find one and call her over to ask if you can go, after all you still got plans to attend to.");
                    TimeUnit.SECONDS.sleep(4);
                    System.out.println("She acts impressed, she wants to know how you survived such a brutal crash.");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Are you invincible? Can you not die???");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("You get released in a matter of 30 minutes and head on your way, but that question remains, stuck in your head.");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.print(".");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.print(".");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println(".");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("At the mall you see a group of 4-5 guys around your age");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("You tap one on the shoulder and ask wearily \"Are you the ones who kicked my friends away from here\"");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\"Maybe I did, what will you do about it?\" one responds in a familiar voice");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("They turn and you find out its your friends that you were planning to call up to join with");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\"" + name + "\" \nI haven't seen you in a bit, I was just going to call you!\"");
                    System.out.println("You decide to join up with your other friends at the Walmart ");
                    TimeUnit.SECONDS.sleep(4);
                    System.out.print("At walmart you meet up with your friends, John, Paul, George, and ");
                    for (int i = 0; i < 3; i++) {
                        TimeUnit.MILLISECONDS.sleep(650);
                        System.out.print(".");
                    }
                    TimeUnit.MILLISECONDS.sleep(700);
                    System.out.println(" ehh whatever, names aren't important.");
                    System.out.println("As you all meet up, you decide that the park would be a better place to hang out. The Park!");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\"" + name + "!\" \n\"We have trouble coming\" John says");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("You turn to see a tuck full of people 2 years older than you and they begin to chase you");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\"OUR PARK, IT'S OURS\" they scream.");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Do you:");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("1. go home, it isn't worth it any more \nor \n2. turn and fight, get your friends, you are strong and know you can bee trouble");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.print("Enter your choice: ");
                    int chase = sc.nextInt();
                    // Dealing with a wrong number
                    while (chase > 2 || chase < 1) {
                        System.out.println("\nONE OR TWO, COMMON NOW");
                        System.out.print("Please enter a choice:  ");
                        chase = sc.nextInt();
                    }
                    if (chase == 1) {
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("You run to your car as they continue to scream, but once you enter they fade away.");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("You just give up and go home, whats the point?");
                    } else {
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("\"FIGHT\" you scream");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("\nLike clockwork all 8 of you turn an take on the face the 5 of them, and wipe them on their feet");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("None of you saw this coming so you cheer");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("All of a sudden you realise you have bigger problems: \"WOOP WOOP\", the police");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("1. run 2. hide or 3. turn yourself in");
                        System.out.print("Enter your choice: ");
                        int police = sc.nextInt();
                        // Dealing with a wrong number
                        while (police > 3 || police < 1) {
                            System.out.println("\nONE, TWO, OR THREE COMMON NOW");
                            System.out.print("Please enter a choice:  ");
                            police = sc.nextInt();
                        }
                        if (police == 1) {
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("\nYou run, right to your car, then go all the way home, the police don't even have a lead because all your friends did the same.");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("Safety");
                        } else if (police == 2) {
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("You hide in a bush, but you are easily spotted");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("\"We saw the whole thing kid\" said a cop in a strong voice.");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("\"We know it was self-defense, you are free to leave.\"");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("You go home.");
                        } else {
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("You walk over with your hands on your head and calmy begin to explain");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("\"We saw the whole thing kid\" said a cop in a strong voice.");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("\"We know it was self-defense, you are free to leave\"");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("You go home.");
                        }

                    }


                    // Finally Home, now onto the next task.
                    System.out.println("Ahh home at last, whats there to do now.");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\"What instrument should I play today?\" you ask yourself.");
                    TimeUnit.SECONDS.sleep(2);
                    // List of instruments.
                    System.out.println("Instruments:");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("1. saxophone");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("2. drum set");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("3. guitar");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("4. piano");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("5. clarinet");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("6. trombone");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("7. flute");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("8. trumpet");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("9. tuba");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.print("Please pick an instrument: ");
                    int instrument = sc.nextInt();


                    TimeUnit.SECONDS.sleep(1);


                    // Separates instruments by type, the into specific instrument
                    // Dealing with a wrong number
                    while (instrument < 1 || instrument > 9) {
                        System.out.print("Please pick a number 1-9: ");
                        instrument = sc.nextInt();
                    }
                    if (instrument == 1 || instrument == 5 || instrument == 7) {
                        System.out.println("This is a woodwind");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("You decide to play some jazz");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("After an hour of soloing and practice you decide to go to bed.");
                    } else if (instrument == 8 || instrument == 9 || instrument == 6) {
                        System.out.println("This is a brass instrument");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("You decide to play some jazz");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("After an hour of soloing and practice you decide to go to bed.");
                    } else {
                        System.out.println("This is a percussion instrument");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("You decide to play some jazz");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("After an hour of soloing and practice you decide to go to bed.");
                    }
                    //ending 3
                    TimeUnit.SECONDS.sleep(2);
                    System.out.print("Time for bed.");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("GoodNight!");
                } else {
                    // Ending 2
                    System.out.println("You are in critical condition, you might as well live here now.");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("It's peaceful isn't it");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("No more worrying, just sleeping");
                    TimeUnit.MILLISECONDS.sleep(3500);
                    System.out.println("\"And all this for what, a MALL?\" you ask yourself");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("You will be missed");
                }
            }

            System.out.println("Play again?\n1. YES!\n2. No thanks");
            System.out.print("Please enter a choice:  ");
            int game  = sc.nextInt();
            while (game < 1 || game > 2) {
                    System.out.println("\nONE, OR TWO, COMMON NOW");
                    System.out.print("Please enter a choice:  ");
                    game = sc.nextInt();
            }
            if (game == 1) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("");
            }
            else{
                TimeUnit.SECONDS.sleep(1);
                System.out.println("GOODBYE!");
                run = false;
            }

        }
    }
}





