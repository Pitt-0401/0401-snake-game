/*
 * Created on 2025-11-21
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

import java.util.ArrayList;

public class Snake {
    private SnakeSegment head;
    private Direction direction; // TODO: Set the default direction to RIGHT

    private boolean shouldGrow = false;

    public Snake() {
        // You may change this code for extra credit (implement some fancy stuff!)
        // Feel free to make the starting position random
        Position startingPosition = new Position(10, 10);
        head = new SnakeSegment(startingPosition);
    }

    public void shouldGrow() {
        shouldGrow = true;
    }

    // TODO: Implement removeTail()
    // Removes the last node (tail) of the snake, leaves head untouched
    private void removeTail() {

    }

    // Returns true if the snake is colliding with itself
    public boolean isColliding() {
        if (isBodyPartAt(head.getPosition())) {
            return true;
        }
        return false;
    }

    // TODO: Implement isBodyPartAt()
    // Returns false if the specified position is inside the body of the snake
    public boolean isBodyPartAt(Position position) {
        return false;
    }

    // Sets the direction the snake will move in
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    // TODO: Implement getLength()
    // Gets the length of the snake
    public int getLength() {
        int count = 0;

        return count;
    }

    // Moves the snake by one in the next direction
    // TODO: Implement move()
    public void move() {
        Position newPosition = head.getPosition().add(direction.deltaPosition());

        // HINT: Check for collision with edges (SnakeGame.HEIGHT / SnakeGame.WIDTH)
        // HINT: Add and remove nodes here

        // TODO: Uncomment and use the following code snippet!
        // if (!shouldGrow) {
        // removeTail();
        // } else {
        // shouldGrow = false;
        // }

        // * OPTIONAL: also handle wrapping left and right
        // * Or check for a collision with the top and bottom of the frame
    }

    // Return the head of the snake
    public SnakeSegment getHead() {
        return this.head;
    }

    // TODO: Implement getBody()
    // Returns the start of the snake's body (NOT the head!)
    public SnakeSegment getBody() {
        return null;
    }

    // OPTIONAL: Implement an algorithm that moves the food for us
    public Direction findNextMove(ArrayList<Food> food) {
        return null;
    }
}

class SnakeSegment {
    private Position position;
    private SnakeSegment next;

    public SnakeSegment(Position pos) {
        this.position = pos;
    }

    public Position getPosition() {
        return this.position;
    }

    public SnakeSegment getNext() {
        return this.next;
    }

    public void setNext(SnakeSegment next) {
        this.next = next;
    }
}
