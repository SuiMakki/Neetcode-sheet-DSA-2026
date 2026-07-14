// Stack Data Structure Implementation
// LIFO (Last In First Out)

class Stack {
  constructor() {
    this.items = [];
  }

  // Push element to the stack
  push(element) {
    this.items.push(element);
  }

  // Pop element from the stack
  pop() {
    if (this.items.length === 0) {
      return "Stack is empty";
    }
    return this.items.pop();
  }

  // Peek at the top element
  peek() {
    if (this.items.length === 0) {
      return "Stack is empty";
    }
    return this.items[this.items.length - 1];
  }

  // Check if stack is empty
  isEmpty() {
    return this.items.length === 0;
  }

  // Get stack size
  size() {
    return this.items.length;
  }

  // Print the stack
  print() {
    console.log(this.items.toString());
  }

  // Clear the stack
  clear() {
    this.items = [];
  }
}

// Example usage
const stack = new Stack();
stack.push(10);
stack.push(20);
stack.push(30);
stack.print(); // Output: 10,20,30
console.log("Peek:", stack.peek()); // Output: 30
console.log("Pop:", stack.pop()); // Output: 30
console.log("Size:", stack.size()); // Output: 2
