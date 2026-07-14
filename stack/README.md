# Stack Data Structure

This folder contains a simple JavaScript implementation of a stack in [stack.js](./stack.js).

## What is a Stack?

A stack is a linear data structure that follows the Last In, First Out (LIFO) principle.

- The last element added is the first one removed.
- Common operations are `push`, `pop`, `peek`, `isEmpty`, and `size`.

## File Overview

- [stack.js](./stack.js): Implements a basic stack with common methods.

## Supported Operations

- `push(element)`: Add an element to the top of the stack.
- `pop()`: Remove and return the top element.
- `peek()`: Return the top element without removing it.
- `isEmpty()`: Check whether the stack has any elements.
- `size()`: Return the number of elements in the stack.
- `print()`: Display the stack contents in the console.
- `clear()`: Remove all elements from the stack.

## Example Usage

```javascript
const stack = new Stack();
stack.push(10);
stack.push(20);
stack.push(30);

console.log(stack.peek()); // 30
console.log(stack.pop());  // 30
console.log(stack.size()); // 2
```

## Time Complexity

- Push: $O(1)$
- Pop: $O(1)$
- Peek: $O(1)$
- Size: $O(1)$

## Notes

The implementation is beginner-friendly and is intended for learning and practicing stack concepts in JavaScript.
