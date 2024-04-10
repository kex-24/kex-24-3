# Design Your Own Traffic Light System

## Deadline
This task should be finished before the next class session.

## Instructions
For details on how to do and submit the assignment, please refer to the assignments section of the course instructions.

## Preparation
- Review Module 2: Exploring Classes in Java, focusing on class design, constructing objects, and using methods.
- Access the OLI material through either the course's Canvas page or directly via the provided webpage.

Note: The OLI material might not perfectly match up with this year's course, so feel free to read ahead if you can't find the specific material mentioned here.

## Learning Goals
You will practice:
- Designing Java classes.
- Implementing instance variables and methods.
- Understanding object-oriented programming concepts such as encapsulation and constructors.
- Using the `main` method to run your program.

## Troubleshooting Guide
If you encounter issues:
1. Check the weekly [posted issues](https://example.edu/inda-23/help/issues) to see if others have the same problem.
2. If not, post a question by creating a [New Issue](https://example.edu/inda-23/help/issues/new) with a detailed title.
3. Consult a TA during the weekly lab session. Check your schedule for the next available lab time.

Remember, you can discuss with peers, but do not share answers.

## Assignment

Construct a traffic light system simulation using Java. This system should include different states a traffic light can be in (red, yellow, green) and should perform transitions between these states in a typical traffic light cycle.

## Designing Your Traffic Light System

### Starter Guide
1. **Set Up Your Environment:**
   Create a Java file named `TrafficLight.java` in your `src` folder. This file will host your `TrafficLight` class.

2. **Define Your Properties:**
   A traffic light typically has three states: red, yellow, and green. Represent these states within your class using a String variable called `state`. 

3. **Initialization:**
   Define a constructor for your `TrafficLight` class that allows setting the initial state of the traffic light.

4. **State Management:**
   Implement methods to change the traffic light's state among red, yellow, and green in the sequence that real traffic lights operate.

### Implementing The Simulation

1. **Create the Main Method:**
   Within the `TrafficLight` class, add a `main` method. This method will be your entry point for the simulation.

2. **Instantiation:**
   In the `main` method, create an instance of `TrafficLight` representing a traffic light at an intersection.

3. **Running The Simulation:**
   Show the state transitions for a typical cycle (e.g., green to yellow, yellow to red, and red to green) by invoking the state-changing methods you created. Print the current state to the console each time it changes, so you can observe the sequence of states.

### Further Exploration

1. **Advanced Modeling:**
   Consider adding a timer to simulate the duration each light stays on before transitioning to the next state. This part can be implemented using basic looping and sleep methods.

2. **Multi-Light Simulation:**
   If time permits, try simulating a system with multiple traffic lights working in synchrony, such as those found at an intersection with pedestrian crossings.

## Quality Assurance

Make sure that your program:
- Compiles and runs without errors.
- Abides by standard Java naming conventions.
- Prints the expected state transitions for at least one complete cycle.

## Submission

Follow the course's standard submission process to submit your assignment.

## Extra Help

- Review the Java documentation for classes, objects, and methods if you get stuck.
- Don't hesitate to reach out for help through the course forum or during lab sessions.

---

By completing this task, you'll gain a deeper understanding of how classes and objects work in Java, and you'll get a taste of how object-oriented programming can be used to model real-world systems. Good luck!
