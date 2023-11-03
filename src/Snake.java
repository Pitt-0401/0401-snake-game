import java.util.ArrayList;

public class Snake {
    private SnakeSegment head;
    private Direction direction = Direction.RIGHT; // Default direction

    public Snake() {
        // You may change this code for extra credit (implement some fancy stuff!)
        Position startingPosition = new Position(10, 10); // Feel free to make this more random
        head = new SnakeSegment(startingPosition);
    }

    // TODO: The snake should grow whenever it "eats" some food
    public void grow() {

    }

    // TODO: Remove the last node in the snake's body, leave head untouched
    private void removeTail() {
        
    }

    // Returns true if the snake is colliding with itself
    public boolean isColliding() {
        if (isInSnake(head.getPosition())) {
            return true;
        }
        return false;
    }

    // TODO: Return false if the specified position is inside the BODY of the snake
    public boolean isInSnake(Position position) {
        return false;
    }

    // TODO: Set the direction the snake will move in
    public void setDirection(Direction direction) {

    }

    // TODO: Get the length of the snake either by counter or traversal
    public int getLength() {
        int count = 0;
     
        return count;
    }

    // Moves the snake by one in the next direction
    // TODO: Implement the move method
    public void move() {
        // HINT: You may add and remove nodes here
        Position newPosition = head.getPosition().add(direction.deltaPosition());

        // ...

        // if (!grow) {
        //     removeTail();
        // } else {
        //     grow = false;
        // }
    }

    // TODO: Return the head node
    public SnakeSegment getHead() {
        return null;
    }

    // TODO: Return the start of the body (NOT the head!)
    public SnakeSegment getBody() {
        return null;
    }

    public void pause() {
        // OPTIONAL: Pause/unpause the snake
    }

    public Direction getMove(ArrayList<Food> food) {
        // OPTIONAL: Implement an algorithm that moves the food for us!
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
        return position;
    }

    public SnakeSegment getNext() {
        return next;
    }

    public void setNext(SnakeSegment next) {
        this.next = next;
    }
}
